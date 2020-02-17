/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.CharacterFeatENUM;

/**
 *
 * @author lele
 */
public class SuccessBonusFeatModel {
    private CharacterFeatENUM characterFeatENUM;

    public SuccessBonusFeatModel() {
    }

    public SuccessBonusFeatModel(CharacterFeatENUM characterFeatENUM) {
        this.characterFeatENUM = characterFeatENUM;
    }
    
    /**
     * Get Character Feat
     * @return 
     */
    public CharacterFeatENUM getCharacterFeatENUM() {
        return characterFeatENUM;
    }

    /**
     * Set Character Feat
     * @param characterFeat 
     */
    public void setCharacterFeatENUM(CharacterFeatENUM characterFeat) {
        this.characterFeatENUM = characterFeat;
    }
    
    
}
