/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

/**
 * implementare interface
 * @author lele
 */
public class TargetFeat {
    private AreaFeat areaFeat = new AreaFeat();
    private DistanceFeat distanceFeat = new DistanceFeat();
    private int numberOfTarget;

    public TargetFeat() {
    }

    /**
     * Get Area Feat
     * @return 
     */
    public AreaFeat getAreaFeat() {
        return areaFeat;
    }

    /**
     * Set Area Feat
     * @param areaFeat 
     */
    public void setAreaFeat(AreaFeat areaFeat) {
        this.areaFeat = areaFeat;
    }

    /**
     * Get Distance Feat
     * @return 
     */
    public DistanceFeat getDistanceFeat() {
        return distanceFeat;
    }

    /**
     * Set Distance Feat
     * @param distanceFeat 
     */
    public void setDistanceFeat(DistanceFeat distanceFeat) {
        this.distanceFeat = distanceFeat;
    }

    /**
     * Get Number Of Target
     * @return 
     */
    public int getNumberOfTarget() {
        return numberOfTarget;
    }

    /**
     * Set Number Of Target
     * @param numberOfTarget 
     */
    public void setNumberOfTarget(int numberOfTarget) {
        this.numberOfTarget = numberOfTarget;
    }
    
    
}
