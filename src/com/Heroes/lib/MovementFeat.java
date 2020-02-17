/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.interfaceClass.IFeatAttribute;

/**
 * 
 * @author lele
 */
public class MovementFeat implements IFeatAttribute {
    private MovementFeatModel movementFeatModel;
    private static final int MULTIPLIER_VALUE = 10;

    public MovementFeat(MovementFeatModel movementFeatModel) {
        this.movementFeatModel = movementFeatModel;
    }

    /**
     * TODO: Utilizzare un dizionario delle lingue.
     * @return 
     */
    @Override
    public String getDescription() {
        String description = "";
        if (this.movementFeatModel != null) {
            if(this.movementFeatModel.isFollow()) {
                description = "segue";
            } else {
                int movement = this.movementFeatModel.getValue() * this.movementFeatModel.getMultiplier() * MULTIPLIER_VALUE; 
                description = movement + " m/V";
            }
        }
        
        return description;
    }

    @Override
    public int getMagnitude() {
        if (movementFeatModel.isFollow()) {
            return 1;
        } else {
            return 3 * movementFeatModel.getMultiplier() + 2 * movementFeatModel.getValue();
        }
    }

    /**
     * TODO: Utilizzare un dizionario delle lingue.
     * @return 
     */
    @Override
    public String getName() {
        return "Spostamento";    
    }
}
