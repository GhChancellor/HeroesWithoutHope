/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.DistanceTypeENUM;

/**
 *
 * @author lele
 */
public class DistanceFeatModel {
    private DistanceTypeENUM distanceTypeENUM;    
    private int distanceMultiplier;
    private int distanceValue;

    public DistanceFeatModel() {
    }

    public DistanceFeatModel(DistanceTypeENUM distanceTypeENUM, int distanceMultiplier, int distanceValue) {
        this.distanceTypeENUM = distanceTypeENUM;
        this.distanceMultiplier = distanceMultiplier;
        this.distanceValue = distanceValue;
    }
    
    /**
     * Get Distance Multiplier
     * @return 
     */
    public int getDistanceMultiplier() {
        return distanceMultiplier;
    }

    /**
     * Set Distance Multiplier
     * @param distanceMultiplier 
     */
    public void setDistanceMultiplier(int distanceMultiplier) {
        this.distanceMultiplier = distanceMultiplier;
    }

    /**
     * Get Distance Type
     * @return 
     */
    public DistanceTypeENUM getDistanceTypeENUM() {
        return distanceTypeENUM;
    }

    /**
     * Set Distance Type
     * @param distanceType 
     */
    public void setDistanceTypeENUM(DistanceTypeENUM distanceType) {
        this.distanceTypeENUM = distanceType;
    }

    /**
     * Get Distance Value
     * @return 
     */
    public int getDistanceValue() {
        return distanceValue;
    }

    /**
     * Set Distance Value
     * @param distanceValue 
     */
    public void setDistanceValue(int distanceValue) {
        this.distanceValue = distanceValue;
    }
    
    
}
