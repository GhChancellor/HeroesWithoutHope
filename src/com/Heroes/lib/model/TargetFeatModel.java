/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

/**
 * implementare interface
 * @author lele
 */
public class TargetFeatModel {
    private AreaFeatModel areaFeatModel;
    private DistanceFeatModel distanceFeatModel;
    private int numberOfTarget;

    public TargetFeatModel() {
    }

    public TargetFeatModel(AreaFeatModel areaFeatModel, 
            DistanceFeatModel distanceFeatModel, int numberOfTarget) {
        
        this.areaFeatModel = areaFeatModel;
        this.distanceFeatModel = distanceFeatModel;
        this.numberOfTarget = numberOfTarget;
    }
    
    /**
     * Get Area Feat
     * @return 
     */
    public AreaFeatModel getAreaFeat() {
        return areaFeatModel;
    }

    /**
     * Set Area Feat
     * @param areaFeat 
     */
    public void setAreaFeat(AreaFeatModel areaFeat) {
        this.areaFeatModel = areaFeat;
    }

    /**
     * Get Distance Feat
     * @return 
     */
    public DistanceFeatModel getDistanceFeat() {
        return distanceFeatModel;
    }

    /**
     * Set Distance Feat
     * @param distanceFeat 
     */
    public void setDistanceFeat(DistanceFeatModel distanceFeat) {
        this.distanceFeatModel = distanceFeat;
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
