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
public class Account {

    private String user;
    private String password;

    private ArrayList<Role> roles = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Lecturer> lecturers = new ArrayList<>();

    public Account() {
    }

    public Account(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Role> getRoles() {
        return roles;
    }

    public void setRoles(ArrayList<Role> roles) {
        this.roles = roles;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Lecturer> getLecturers() {
        return lecturers;
    }

    public void setLecturers(ArrayList<Lecturer> lecturers) {
        this.lecturers = lecturers;
    }

}
