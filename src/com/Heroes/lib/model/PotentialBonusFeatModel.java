/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.CharacterAbilityENUM;

/**
 *
 * @author lele
 */
public class PotentialBonusFeatModel {
    private CharacterAbilityENUM characterAbilityENUM;

    public PotentialBonusFeatModel() {
    }

    public PotentialBonusFeatModel(CharacterAbilityENUM characterAbilityENUM) {
        this.characterAbilityENUM = characterAbilityENUM;
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
