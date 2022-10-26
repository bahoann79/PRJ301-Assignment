/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.lecturer;

import controller.auth.BaseRoleAuthenticationController;
import dal.LecturerDBContext;
import dal.SessionDBContext;
import dal.TimeSlotDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import model.Account;
import model.Lecturer;
import model.Session;
import model.TimeSlot;
import util.DateTimeHelper;

/**
 *
 * @author admin
 */
public class ScheduleController extends BaseRoleAuthenticationController {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int lecturerId = Integer.parseInt(request.getParameter("lecturerId"));
        String rawFrom = request.getParameter("from");
        String rawTo = request.getParameter("to");
        Date dateFrom = null;
        Date dateTo = null;

        if (rawFrom == null || rawFrom.length() == 0) {
            java.util.Date currentDate = new java.util.Date();
            int dayOfWeek = DateTimeHelper.getDayofWeek(currentDate);
            java.util.Date tmpFrom = DateTimeHelper.addDays(currentDate, 2 - dayOfWeek);
            java.util.Date tmpTo = DateTimeHelper.addDays(currentDate, 8 - dayOfWeek);
            dateFrom = DateTimeHelper.toDateSql(tmpFrom);
            dateTo = DateTimeHelper.toDateSql(tmpTo);

        } else {
            dateFrom = Date.valueOf(rawFrom);
            dateTo = Date.valueOf(rawTo);
        }

        request.setAttribute("from", dateFrom);
        request.setAttribute("to", dateTo);
        request.setAttribute("dates", DateTimeHelper.getDateList(dateFrom, dateTo));

        TimeSlotDBContext tlDB = new TimeSlotDBContext();
        ArrayList<TimeSlot> timeSlots = tlDB.list();
        request.setAttribute("timeSlots", timeSlots);

        SessionDBContext sesDB = new SessionDBContext();
        ArrayList<Session> sessions = sesDB.filterSchedule(lecturerId, dateFrom, dateTo);
        request.setAttribute("sessions", sessions);

        LecturerDBContext lecDB = new LecturerDBContext();
        Lecturer lecturer = lecDB.get(lecturerId);
        request.setAttribute("lecturer", lecturer);

        request.getRequestDispatcher("../view/lecturer/lecSchedule.jsp").forward(request, response);
    }

    @Override
    protected void processPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void processGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
