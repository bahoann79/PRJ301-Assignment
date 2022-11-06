/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Attendance {

    private Session session;
    private Student student;

    private boolean status;
    private String description;
    private Date recordTime;

    private String quantityPresent;
    private float result;

    public Attendance() {
    }

    public Attendance(Session session, Student student, boolean status, String description, Date recordTime) {
        this.session = session;
        this.student = student;
        this.status = status;
        this.description = description;
        this.recordTime = recordTime;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getQuantityPresent() {
        return quantityPresent;
    }

    public void setQuantityPresent(String quantityPresent) {
        this.quantityPresent = quantityPresent;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

}
