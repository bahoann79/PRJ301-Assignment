/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.student;

import controller.auth.BaseRoleAuthenticationController;
import dal.SessionDBContext;
import dal.StudentDBContext;
import jakarta.servlet.ServletException;
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
public class StudentViewAttController extends BaseRoleAuthenticationController {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        int groupId = Integer.parseInt(request.getParameter("groupId"));

        SessionDBContext sesDB = new SessionDBContext();
        ArrayList<Session> sessions = sesDB.filterStViewAttendance(studentId, groupId);
        request.setAttribute("sessions", sessions);
        float count = 0;
        float size = sessions.size();
        for (Session session : sessions) {
            for (Attendance att : session.getAttendances()) {
                if (att.isStatus()) {
                    count++;
                }
            }
        }
        float result = count / size * 100;
        request.setAttribute("count", count);
        request.setAttribute("size", size);
        request.setAttribute("result", result);

        StudentDBContext stDB = new StudentDBContext();
        Student student = stDB.get(studentId);
        request.setAttribute("student", student);

        Session session = sessions.get(0);
        request.setAttribute("session", session);

        request.getRequestDispatcher("../view/student/viewAttendance.jsp").forward(request, response);
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
