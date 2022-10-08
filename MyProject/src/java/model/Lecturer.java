/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Lecturer {
    
    private int lecturerId;
    private String lecturerCode;
    private String lecturerName;
    private boolean gender;
    private Date dob;
    private String address;
    private String email;
    private String lecturerImage;
    
    ArrayList<Group> groups;
    ArrayList<Lecture> lectures;

    public Lecturer() {
    }

    public Lecturer(int lecturerId, String lecturerCode, String lecturerName, boolean gender, Date dob, String address, String email, String lecturerImage) {
        this.lecturerId = lecturerId;
        this.lecturerCode = lecturerCode;
        this.lecturerName = lecturerName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.email = email;
        this.lecturerImage = lecturerImage;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(int lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerCode() {
        return lecturerCode;
    }

    public void setLecturerCode(String lecturerCode) {
        this.lecturerCode = lecturerCode;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLecturerImage() {
        return lecturerImage;
    }

    public void setLecturerImage(String lecturerImage) {
        this.lecturerImage = lecturerImage;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }
    
    
            
    
}
