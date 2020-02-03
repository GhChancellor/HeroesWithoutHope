/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.AreaTypeENUM;
import com.Heroes.lib.interfaceClass.IFeatAttribute;

/**
 * Aggiungi interfacccia IFeatAttribute
 * @author lele
 */
public class AreaFeat implements IFeatAttribute{
    private int areaMultiplier;
    private int excludedTarget;
    private AreaTypeENUM areaType;

    public AreaFeat() {
    }

    /**
     * Get Area Multiplier
     * @return 
     */
    public int getAreaMultiplier() {
        return areaMultiplier;
    }

    /**
     * Set Area Multiplier
     * @param areaMultiplier 
     */
    public void setAreaMultiplier(int areaMultiplier) {
        this.areaMultiplier = areaMultiplier;
    }

    /**
     * Get Excluded Target
     * @return 
     */
    public int getExcludedTarget() {
        return excludedTarget;
    }

    /**
     * Set Excluded Target
     * @param excludedTarget 
     */
    public void setExcludedTarget(int excludedTarget) {
        this.excludedTarget = excludedTarget;
    }

    /**
     * Get Area Type
     * @return 
     */
    public AreaTypeENUM getAreaType() {
        return areaType;
    }

    /**
     * Set Area Type
     * @param areaType 
     */
    public void setAreaType(AreaTypeENUM areaType) {
        this.areaType = areaType;
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
