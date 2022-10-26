/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.auth;

import dal.AccountDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;

/**
 *
 * @author admin
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("view/auth/login.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String password = request.getParameter("password");
        AccountDBContext accDB = new AccountDBContext();
        Account account = accDB.getAccount(user, password);
        if (account != null) {
            request.getSession().setAttribute("account", account);

            if (account.getRoles().get(0).getRoleId() == 1) {
                response.sendRedirect("student/timetable?studentId=" + account.getStudents().get(0).getStudentId());
            } else {
                response.sendRedirect("lecturer/home?lecturerId=" + account.getLecturers().get(0).getLecturerId());
            }

        } else {
            response.getWriter().println("login failed !");
        }

    }

}
