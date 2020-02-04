/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.CharacterAbilityENUM;

/**
 *
 * @author lele
 */
public class PotentialBonusFeat {
    private CharacterAbilityENUM characterAbilityENUM;

    public PotentialBonusFeat() {
    }

    /**
     * Get Character Ability
     * @return 
     */
    public CharacterAbilityENUM getCharacterAbilityENUM() {
        return characterAbilityENUM;
    }

    /**
     * Set Character Ability
     * @param characterAbility
     */
    public void setCharacterAbilityENUM(CharacterAbilityENUM characterAbility) {
        this.characterAbilityENUM = characterAbilityENUM;
    }
    
}
