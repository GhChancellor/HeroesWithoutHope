/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.CombatTypeENUM;

/**
 *
 * @author lele
 */
public class CombatFeatModel {
    private CombatTypeENUM combatTypeENUM;

    public CombatFeatModel() {
    }

    public CombatFeatModel(CombatTypeENUM combatTypeENUM) {
        this.combatTypeENUM = combatTypeENUM;
    }
        
    /**
     * Get CombatType 
     * @return 
     */
    public CombatTypeENUM getCombatTypeENUM() {
        return combatTypeENUM;
    }

    /**
     * Set CombatType 
     * @param combatTypeENUM 
     */
    public void setCombatTypeENUM(CombatTypeENUM combatTypeENUM) {
        this.combatTypeENUM = combatTypeENUM;
    }
    
    
}
