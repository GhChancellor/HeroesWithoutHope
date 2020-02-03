/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.BodyLocationENUM;
import com.Heroes.lib.interfaceClass.IFeatAttribute;

/**
 * ????? è quello che indendevi?
 * @author lele
 */
public class BodyLocationFeat implements IFeatAttribute{
    private BodyLocationENUM bodyLocation;

    public BodyLocationFeat() {
    }

    /**
     * Get Body Location
     * @return 
     */
    public BodyLocationENUM getBodyLocation() {
        return bodyLocation;
    }

    /**
     * Set Body Location
     * @param bodyLocation 
     */
    public void setBodyLocation(BodyLocationENUM bodyLocation) {
        this.bodyLocation = bodyLocation;
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
