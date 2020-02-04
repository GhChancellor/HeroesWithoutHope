/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.CombatTypeENUM;

/**
 *
 * @author lele
 */
public class CombatFeat {
    private CombatTypeENUM combatTypeENUM;

    public CombatFeat() {
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
