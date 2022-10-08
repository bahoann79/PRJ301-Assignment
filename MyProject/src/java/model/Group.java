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
public class Group {

    private int groupId;
    private String groupCode;

    Subject subject;
    ArrayList<StudentGroup> studentGroups;
    Lecturer lecturer;
    ArrayList<Lecture> lectures;

    public Group() {
    }

    public Group(int groupId, String groupCode) {
        this.groupId = groupId;
        this.groupCode = groupCode;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public ArrayList<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(ArrayList<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }

}
