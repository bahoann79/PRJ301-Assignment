/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.lecturer;

import controller.auth.BaseRoleAuthenticationController;
import dal.SessionDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import model.Account;
import model.Attendance;
import model.Session;
import model.Student;

/**
 *
 * @author admin
 */
public class TakeAttController extends BaseRoleAuthenticationController {

    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response, Account account) throws ServletException, IOException {
        int lecturerId = Integer.parseInt(request.getParameter("lecturerId"));
        int sessionId = Integer.parseInt(request.getParameter("sessionId"));
        SessionDBContext sesDB = new SessionDBContext();
        ArrayList<Session> listSession = sesDB.listSessionWithLecturerId(lecturerId);
        boolean check = false;
        System.out.println("LecturerId: " + lecturerId);
        System.out.println("SessionId Required: " + sessionId);

        for (Session session : listSession) {
            System.out.println("Session ID in list :  " + session.getSessionId());
        }

        for (Session session : listSession) {
            if (session.getSessionId() == sessionId) {
                check = true;
            }
        }

        if (check) {

            Session session = new Session();
            session.setSessionId(sessionId);
            String[] listStId = request.getParameterValues("listStId");
            for (String stId : listStId) {
                Attendance attendance = new Attendance();
                Student student = new Student();
                attendance.setStudent(student);
                attendance.setDescription(request.getParameter("description" + stId));
                attendance.setStatus(request.getParameter("status" + stId).equals("present"));

                student.setStudentId(Integer.parseInt(stId));
                session.getAttendances().add(attendance);
            }
            sesDB.update(session);
            response.sendRedirect("takeAttendance?sessionId=" + session.getSessionId() + "&lecturerId=" + lecturerId);

        } else {
            response.getWriter().println("You don't have access to save this session !");
        }
    }

    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response, Account account) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("sessionId"));
        SessionDBContext sesDB = new SessionDBContext();
        Session session = sesDB.get(id);
        request.setAttribute("session", session);
        request.getRequestDispatcher("../view/lecturer/takeAttendance.jsp").forward(request, response);
    }

}
