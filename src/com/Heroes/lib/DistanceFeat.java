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
    private DistanceTypeENUM distanceTypeE;
    private int distanceValue;

    public DistanceFeat() {
    }

    public int getDistanceMultiplier() {
        return distanceMultiplier;
    }

    public void setDistanceMultiplier(int distanceMultiplier) {
        this.distanceMultiplier = distanceMultiplier;
    }

    public DistanceTypeENUM getDistanceTypeE() {
        return distanceTypeE;
    }

    public void setDistanceTypeE(DistanceTypeENUM distanceType) {
        this.distanceTypeE = distanceType;
    }

    public int getDistanceValue() {
        return distanceValue;
    }

    public void setDistanceValue(int distanceValue) {
        this.distanceValue = distanceValue;
    }
    
    
}
