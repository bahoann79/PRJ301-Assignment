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
public class Room {
    
    private int roomId;
    private String roomName;
    private String position;
    private int quantityDesk;
    private int quantitySeat;
    
    ArrayList<Lecture> lectures;

    public Room() {
    }

    public Room(int roomId, String roomName, String position, int quantityDesk, int quantitySeat) {
        this.roomId = roomId;
        this.roomName = roomName;
        this.position = position;
        this.quantityDesk = quantityDesk;
        this.quantitySeat = quantitySeat;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getQuantityDesk() {
        return quantityDesk;
    }

    public void setQuantityDesk(int quantityDesk) {
        this.quantityDesk = quantityDesk;
    }

    public int getQuantitySeat() {
        return quantitySeat;
    }

    public void setQuantitySeat(int quantitySeat) {
        this.quantitySeat = quantitySeat;
    }

    public ArrayList<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(ArrayList<Lecture> lectures) {
        this.lectures = lectures;
    }
    
    
    
    
}
