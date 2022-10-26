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
        Session session = new Session();
        session.setSessionId(Integer.parseInt(request.getParameter("sessionId")));
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
        SessionDBContext sesDB = new SessionDBContext();
        sesDB.update(session);
        response.sendRedirect("takeAttendance?sessionId=" + session.getSessionId());
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
