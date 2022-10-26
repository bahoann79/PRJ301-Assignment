/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.auth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import model.Account;
import model.Feature;
import model.Role;

/**
 *
 * @author admin
 */
public abstract class BaseRoleAuthenticationController extends BaseAuthenticationController {

    private boolean checkRole(HttpServletRequest req, Account account) {
        String currentURL = req.getServletPath();
        for (Role role : account.getRoles()) {
            for (Feature feature : role.getFeatures()) {
                if (feature.getUrl().equalsIgnoreCase(currentURL)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract void processPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException;

    protected abstract void processGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        if (checkRole(req, account)) {
            processPost(req, resp, account);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp, Account account) throws ServletException, IOException {
        if (checkRole(req, account)) {
            processGet(req, resp, account);
        } else {
            resp.getWriter().println("access denied!");
        }
    }

}
