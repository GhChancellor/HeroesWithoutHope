/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.BodyLocationENUM;

/**
 * 
 * @author lele
 */
public class BodyLocationFeatModel{
    private BodyLocationENUM bodyLocation;

    public BodyLocationFeatModel() {
    }

    public BodyLocationFeatModel(BodyLocationENUM bodyLocation) {
        this.bodyLocation = bodyLocation;
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
    
}
