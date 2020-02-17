/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.DurationENUM;

/**
 * da aggiungere IFeatAttribute
 * @author lele
 */
public class DurationFeatModel{
    private DurationENUM duration;

    public DurationFeatModel() {
    }

    public DurationFeatModel(DurationENUM duration) {
        this.duration = duration;
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
