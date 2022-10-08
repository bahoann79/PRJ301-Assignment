/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class DayOfWeek {
    
    private int dowId;
    private String dayStart;
    private String dayEnd;

    public DayOfWeek() {
    }

    public DayOfWeek(int dowId, String dayStart, String dayEnd) {
        this.dowId = dowId;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
    }

    public int getDowId() {
        return dowId;
    }

    public void setDowId(int dowId) {
        this.dowId = dowId;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }
    
    
    
}
