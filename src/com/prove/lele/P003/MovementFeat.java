/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prove.lele.P003;

import com.Heroes.lib.interfaceClass.IFeatAttribute;
import unstable.movement.MovementFeatModel;


/**
 * 
 * @author lele
 */
public class MovementFeat implements IFeatAttribute {
    private MovementFeatModel movementFeatModel;

    public MovementFeat(MovementFeatModel movementFeatModel) {
        this.movementFeatModel = movementFeatModel;
    }

    /**
     * 
     * La magnitudo dei poteri di movimento, se definito si calcola 2*valore + 3*moltiplicatore
     * Se si imposta follow si aggiunge 1.
     * @param powerOfMovement
     * @param follow
     * @param meters
     * @param multiplier 
     */
    public MovementFeat(boolean powerOfMovement, boolean follow, 
            int meters, int multiplier) {
        
        if(powerOfMovement){
            movementFeatModel = new MovementFeatModel();
            movementFeatModel.setFollow(follow);
            movementFeatModel.setValue(meters);
            movementFeatModel.setMultiplier(multiplier);
            return;
        }
        movementFeatModel = null;
    }

    public MovementFeatModel getMovement(){
        return movementFeatModel;
    }
    
    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMagnitude() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
