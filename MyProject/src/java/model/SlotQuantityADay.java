/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class SlotQuantityADay {
    
    DayOfWeek dayOfWeek;
    SlotTimeActive slotTimeActive;

    public SlotQuantityADay() {
    }

    public SlotQuantityADay(DayOfWeek dayOfWeek, SlotTimeActive slotTimeActive) {
        this.dayOfWeek = dayOfWeek;
        this.slotTimeActive = slotTimeActive;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public SlotTimeActive getSlotTimeActive() {
        return slotTimeActive;
    }

    public void setSlotTimeActive(SlotTimeActive slotTimeActive) {
        this.slotTimeActive = slotTimeActive;
    }
    
    
    
}
