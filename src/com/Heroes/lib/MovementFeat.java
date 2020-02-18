/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

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
