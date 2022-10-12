/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.student;

import dal.DayOfWeekDBContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.DayOfWeek;
import util.DateTimeHelper;

/**
 *
 * @author admin
 */
public class StudentViewSchedule extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DayOfWeekDBContext dowDB = new DayOfWeekDBContext();
        ArrayList<DayOfWeek> listDow = dowDB.getListDayOfWeek();
        request.setAttribute("listDow", listDow);
        ArrayList<String> listSubDow = new ArrayList<>();
        String dayStart = "";

        if (request.getParameter("dowId") != null) {
            int index = Integer.parseInt(request.getParameter("dowId"));
            for (int i = 0; i < listDow.size(); i++) {
                if (listDow.get(i).getDowId() == index) {
                    dayStart = listDow.get(i).getDayStart();
                }
            }
            listSubDow.add(dayStart);
            for (int i = 0; i < 6; i++) {
                dayStart = DateTimeHelper.getDayTomorrow(dayStart);
                listSubDow.add(dayStart);
            }
            request.setAttribute("listSubDow", listSubDow);
            request.setAttribute("selectId", index);
        } else {
            int index = 0;
            for (int i = 0; i < listDow.size(); i++) {
                if (DateTimeHelper.currentDateInRange(listDow.get(i).getDayStart(), listDow.get(i).getDayEnd())) {
                    dayStart = listDow.get(i).getDayStart();
                    index = listDow.get(i).getDowId();
                    break;
                }
            }
            listSubDow.add(dayStart);
            for (int i = 0; i < 6; i++) {
                dayStart = DateTimeHelper.getDayTomorrow(dayStart);
                listSubDow.add(dayStart);
            }

            request.setAttribute("listSubDow", listSubDow);
            request.setAttribute("selectId", index);
        }

        request.getRequestDispatcher("../view/student/schedule.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
