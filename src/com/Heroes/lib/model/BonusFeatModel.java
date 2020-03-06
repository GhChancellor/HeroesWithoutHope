/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

/**
 * Aggiungi interface IFeatAttribute
 * @author lele
 */
public class BonusFeatModel {
    private int value;

    public BonusFeatModel(int value) {
        this.value = value;
    }

    public BonusFeatModel() {
    }
        
    /**
     * Get Value
     * @return 
     */
    public int getValue() {
        return value;
    }

    /**
     * Set Value
     * @param value 
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    
}
