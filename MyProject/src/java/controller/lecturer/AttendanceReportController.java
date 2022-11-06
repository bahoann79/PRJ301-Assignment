/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.lecturer;

import controller.auth.BaseRoleAuthenticationController;
import dal.LecturerDBContext;
import dal.SessionDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Account;
import model.Attendance;
import model.Lecturer;
import model.Session;

/**
 *
 * @author admin
 */
public class AttendanceReportController extends BaseRoleAuthenticationController {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int lecturerId = Integer.parseInt(request.getParameter("lecturerId"));
        int groupId = Integer.parseInt(request.getParameter("groupId"));

        SessionDBContext sesDB = new SessionDBContext();
        ArrayList<Session> sessions = sesDB.filterLecAttReport(lecturerId, groupId);
        Session session = sessions.get(0);
        request.setAttribute("session", session);
        request.setAttribute("sessions", sessions);
        Integer duration = sessions.size();
        request.setAttribute("duration", duration);
        for (Attendance attendance : session.getAttendances()) {
            ArrayList<Session> tmpSes = sesDB.filterStViewAttendance(attendance.getStudent().getStudentId(), groupId);
            float count = 0;
            float size = tmpSes.size();
            for (Session session1 : tmpSes) {
                for (Attendance att : session1.getAttendances()) {
                    if (att.isStatus()) {
                        count++;
                    }
                }
            }
            String present = String.valueOf(count) + "/" + String.valueOf(size);
            float result = count / size * 100;
            result = (int) Math.ceil(result);
            attendance.setQuantityPresent(present);
            attendance.setResult(result);

        }

        LecturerDBContext lecDB = new LecturerDBContext();
        Lecturer lecturer = lecDB.get(lecturerId);
        request.setAttribute("lecturer", lecturer);

        request.getRequestDispatcher("../view/lecturer/attendanceReport.jsp").forward(request, response);

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
