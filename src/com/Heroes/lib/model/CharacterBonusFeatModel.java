/*
 * Copyright (C) 2020 lele
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.Heroes.lib.model;

import com.Heroes.lib.enumClass.CharacterFeatENUM;

/**
 *
 * @author lele
 */
public class CharacterBonusFeatModel {
    private CharacterFeatENUM characterFeatENUM;
    private int value;

    public CharacterBonusFeatModel() {
    }

    /**
     * Unused
     * @param characterFeatENUM 
     */
    public CharacterBonusFeatModel(CharacterFeatENUM characterFeatENUM) {
        this.characterFeatENUM = characterFeatENUM;
    }

    /**
     * Get Character Feat ENUM
     * @return CharacterFeatENUM
     */
    public CharacterFeatENUM getCharacterFeatENUM() {
        return characterFeatENUM;
    }

    /**
     * Set Character Feat ENUM
     * @param characterFeatENUM 
     */
    public void setCharacterFeatENUM(CharacterFeatENUM characterFeatENUM) {
        this.characterFeatENUM = characterFeatENUM;
    }

    /**
     * Get Value
     * @return value
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
