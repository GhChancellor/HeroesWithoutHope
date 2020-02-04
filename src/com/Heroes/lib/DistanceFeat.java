/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.DistanceTypeENUM;

/**
 *
 * @author lele
 */
public class DistanceFeat {
    private int distanceMultiplier;
    private DistanceTypeENUM distanceTypeENUM;
    private int distanceValue;

    public DistanceFeat() {
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
