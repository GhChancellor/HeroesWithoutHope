/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.DamageTypeENUM;
import com.Heroes.lib.enumClass.InfluenceTypeENUM;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class AttackFeat {
    private List<DamageTypeENUM> damageTypeENUMs = new ArrayList<DamageTypeENUM>();
    private InfluenceTypeENUM influenceTypeENUM;

    public AttackFeat() {
    }

    /**
     * Get Damage Type ENUMs
     * @return 
     */
    public List<DamageTypeENUM> getDamageTypeENUMs() {
        return damageTypeENUMs;
    }

    /**
     * Set Damage Type ENUMs
     * @param damageTypeENUMs 
     */
    public void setDamageTypeENUMs(List<DamageTypeENUM> damageTypeENUMs) {
        this.damageTypeENUMs = damageTypeENUMs;
    }

    /**
     * Add Damage Type ENUMs
     * @param damageTypeENUM 
     */
    public void addDamageTypeENUMs(DamageTypeENUM damageTypeENUM) {
        this.damageTypeENUMs.add(damageTypeENUM);
    }    
    
    /**
     * Get Influence Type ENUM
     * @return 
     */
    public InfluenceTypeENUM getInfluenceTypeENUM() {
        return influenceTypeENUM;
    }

    /**
     * Set Influence Type ENUM
     * @param influenceTypeENUM 
     */
    public void setInfluenceTypeENUM(InfluenceTypeENUM influenceTypeENUM) {
        this.influenceTypeENUM = influenceTypeENUM;
    }
    
    
}
