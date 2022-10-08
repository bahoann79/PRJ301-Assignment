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
public class SlotTimeActive {
    
    private int slotId;
    private String hoursDuring;
    
    ArrayList<SlotQuantityADay> slotQuantityADays;

    public SlotTimeActive() {
    }

    public SlotTimeActive(int slotId, String hoursDuring) {
        this.slotId = slotId;
        this.hoursDuring = hoursDuring;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getHoursDuring() {
        return hoursDuring;
    }

    public void setHoursDuring(String hoursDuring) {
        this.hoursDuring = hoursDuring;
    }

    public ArrayList<SlotQuantityADay> getSlotQuantityADays() {
        return slotQuantityADays;
    }

    public void setSlotQuantityADays(ArrayList<SlotQuantityADay> slotQuantityADays) {
        this.slotQuantityADays = slotQuantityADays;
    }
    
    
    
    
}
