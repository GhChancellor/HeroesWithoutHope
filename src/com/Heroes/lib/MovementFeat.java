/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

/**
 *
 * @author lele
 */
public class MovementFeat {
    private boolean follow;
    private int multiplier;
    private int value;

    public MovementFeat() {
    }

    /**
     * Get Follow
     * @return 
     */
    public boolean isFollow() {
        return follow;
    }

    /**
     * Set Follow
     * @param follow 
     */
    public void setFollow(boolean follow) {
        this.follow = follow;
    }

    /**
     * Get Multiplier
     * @return 
     */
    public int getMultiplier() {
        return multiplier;
    }

    /**
     * Set Multiplier
     * @param multiplier 
     */
    public void setMultiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    /**
     * Get Value
     * @return 
     */
    public int getValue() {
        return value;
    }

    /**
     * Set Value
     * @param value 
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    
}
