/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class DayOfWeek {
    
    private int dowId;
    private String dayStart;
    private String dayEnd;
    
    ArrayList<Lecture> lectures;
    ArrayList<SlotTimeActive> slotTimeActives;

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

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

    public ArrayList<SlotTimeActive> getSlotTimeActives() {
        return slotTimeActives;
    }

    public void setSlotTimeActives(ArrayList<SlotTimeActive> slotTimeActives) {
        this.slotTimeActives = slotTimeActives;
    }

 
    
    
    
}
