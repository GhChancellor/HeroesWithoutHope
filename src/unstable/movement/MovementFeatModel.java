/*
 * Copyright (C) 2020 guybrush
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
package unstable.movement;

import com.Heroes.lib.*;

/**
 *
 * @author guybrush
 */
public class MovementFeatModel {
    private boolean isFollow;
    private int multiplier;
    private int value;
    
    /**
     * Get Follow
     * @return 
     */
    public boolean isFollow() {
        return isFollow;
    }

    /**
     * Set Follow
     * @param follow 
     */
    public void setFollow(boolean follow) {
        this.isFollow = follow;
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
