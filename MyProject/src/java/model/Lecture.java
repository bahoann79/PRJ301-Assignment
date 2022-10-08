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
public class Lecture {
    
    private int lectureId;
    
    Group group;
    Lecturer lecturer;
    Room room;
    DayOfWeek dayOfWeek;
    ArrayList<Attendance> attendances;

    public Lecture() {
    }

    public Lecture(int lectureId) {
        this.lectureId = lectureId;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public ArrayList<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(ArrayList<Attendance> attendances) {
        this.attendances = attendances;
    }
    
    
    
}
