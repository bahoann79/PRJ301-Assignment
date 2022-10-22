/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.lecturer;

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
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Lecturer;
import model.Session;
import model.TimeSlot;


/**
 *
 * @author admin
 */
public class LecturerViewHome extends HttpServlet {

 
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int lecturerId = Integer.parseInt(request.getParameter("lecturerId"));

        Date today = Date.valueOf(LocalDate.now());
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String stToday = formatter.format(today);
        request.setAttribute("today", stToday);

        TimeSlotDBContext tlDB = new TimeSlotDBContext();
        ArrayList<TimeSlot> timeSlots = tlDB.list();
        request.setAttribute("timeSlots", timeSlots);

        SessionDBContext sesDB = new SessionDBContext();
        ArrayList<Session> sessions = sesDB.filterHome(lecturerId, today);
        Integer size = sessions.size();
        request.setAttribute("sessions", sessions);
        request.setAttribute("size", size);

        LecturerDBContext lecDB = new LecturerDBContext();
        Lecturer lecturer = lecDB.get(lecturerId);
        request.setAttribute("lecturer", lecturer);

        request.getRequestDispatcher("../view/lecturer/home.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  

}
