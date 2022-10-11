/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DateTimeHelper {

    public static String getDayTomorrow(String day) {

        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(formatter.parse(day));
            calendar.add(Calendar.DATE, 1);
            String result = formatter.format(calendar.getTime());
            return result;

        } catch (ParseException ex) {
            Logger.getLogger(DateTimeHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static boolean currentDateInRange(String startDate, String endDate) {
        startDate += "/2022";
        endDate += "/2022";
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date currentDate = new Date();
            Date dateFrom = formatter.parse(startDate);
            Date dateTo = formatter.parse(endDate);
            if (currentDate.after(dateFrom) && currentDate.before(dateTo)) {
                return true;
            }
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }
}
