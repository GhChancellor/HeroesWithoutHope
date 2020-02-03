/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.DurationENUM;
import com.Heroes.lib.interfaceClass.IFeatAttribute;

/**
 * da aggiungere IFeatAttribute
 * @author lele
 */
public class DurationFeat{
    private DurationENUM duration;

    public DurationFeat() {
    }

    /**
     * Get Duration
     * @return 
     */
    public DurationENUM getDurationENUM() {
        return duration;
    }

    /**
     * Set Duration
     * @param duration 
     */
    public void setDurationENUM(DurationENUM duration) {
        this.duration = duration;
    }
    
    
}
