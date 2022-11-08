/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class DateTimeHelper {

    public static int getDayofWeek(java.util.Date d) {
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek;
    }

    public static Date addDays(java.util.Date d, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.DATE, days);
        return cal.getTime();
    }

    public static String getDayNameofWeek(java.sql.Date s) {
        java.util.Date d = toDateUtil(s);
        Calendar c = Calendar.getInstance();
        c.setTime(d);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1:
                return "Sun";
            case 2:
                return "Mon";
            case 3:
                return "Tue";
            case 4:
                return "Wed";
            case 5:
                return "Thu";
            case 6:
                return "Fri";
            case 7:
                return "Sat";
        }
        return "Error";
    }

    public static String getDayNameofWeek2(String s) {
        try {
            int currentYear = LocalDate.now().getYear();
            String stCurrentYear = Integer.toString(currentYear);
            s += "/";
            s += stCurrentYear;
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date date = toDateSql(formatter.parse(s));
            java.util.Date d = toDateUtil(date);
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            switch (dayOfWeek) {
                case 1:
                    return "Sun";
                case 2:
                    return "Mon";
                case 3:
                    return "Tue";
                case 4:
                    return "Wed";
                case 5:
                    return "Thu";
                case 6:
                    return "Fri";
                case 7:
                    return "Sat";
            }
            return "Error";
        } catch (ParseException ex) {
            Logger.getLogger(DateTimeHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static java.util.Date toDateUtil(java.sql.Date d) {
        java.util.Date x = new java.util.Date(d.getTime());
        x = removeTime(x);
        return x;
    }

    public static ArrayList<java.sql.Date>
            getDateList(java.sql.Date from, java.sql.Date to) {
        ArrayList<java.sql.Date> dates = new ArrayList<>();

        int days = 0;
        java.util.Date e_from = toDateUtil(from);
        java.util.Date e_to = toDateUtil(to);

        while (true) {

            java.util.Date d = DateTimeHelper.addDays(e_from, days);
            dates.add(toDateSql(d));

            days++;
            if (d.compareTo(e_to) >= 0) {
                break;
            }
        }
        return dates;
    }

    public static ArrayList<String>
            getDateList2(java.sql.Date from, java.sql.Date to) {
        ArrayList<String> dates = new ArrayList<>();

        int days = 0;
        java.util.Date e_from = toDateUtil(from);
        java.util.Date e_to = toDateUtil(to);

        while (true) {

            java.util.Date d = DateTimeHelper.addDays(e_from, days);

            dates.add(dateFormat(toDateSql(d)));

            days++;
            if (d.compareTo(e_to) >= 0) {
                break;
            }
        }
        return dates;
    }

    public static String dateFormat(java.sql.Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM");
        String afterFormat = formatter.format(date);
        return afterFormat;
    }

    public static Date removeTime(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static java.sql.Date toDateSql(java.util.Date d) {
        d = removeTime(d);
        return new java.sql.Date(d.getTime());
    }

    public static int compare(java.sql.Date a, java.sql.Date b) {

        Date e_a = toDateUtil(a);
        Date e_b = toDateUtil(b);
        System.out.println(a + " " + b + " " + e_a.compareTo(e_b));
        return e_a.compareTo(e_b);
    }

}
