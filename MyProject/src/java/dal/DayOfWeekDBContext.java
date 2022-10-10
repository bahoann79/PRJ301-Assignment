/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DayOfWeek;

/**
 *
 * @author admin
 */
public class DayOfWeekDBContext extends DBContext {

    public ArrayList<DayOfWeek> getListDayOfWeek() {

        ArrayList<DayOfWeek> listDows = new ArrayList<>();
        try {
            String sql = "SELECT [day_of_week_id]\n"
                    + "      ,[day_start]\n"
                    + "      ,[day_end]\n"
                    + "  FROM [DayOfWeeks]";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                DayOfWeek dow = new DayOfWeek();
                dow.setDowId(rs.getInt("day_of_week_id"));
                dow.setDayStart(rs.getString("day_start"));
                dow.setDayEnd(rs.getString("day_end"));
                listDows.add(dow);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DayOfWeekDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDows;

    }

}
