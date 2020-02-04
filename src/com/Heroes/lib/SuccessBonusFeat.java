/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.enumClass.CharacterFeatENUM;

/**
 *
 * @author lele
 */
public class SuccessBonusFeat {
    private CharacterFeatENUM characterFeatENUM;

    public SuccessBonusFeat() {
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
