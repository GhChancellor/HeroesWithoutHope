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
package com.prove.lele.p004;

import com.Heroes.lib.enumClass.DistanceTypeENUM;
import com.Heroes.lib.model.DistanceFeatModel;

/**
 *
 * @author lele
 */
public class DistanceFeatController {
    private DistanceFeatModel distanceFeatModel;

    public DistanceFeatController(DistanceFeatModel distanceFeatModel) {
        this.distanceFeatModel = distanceFeatModel;
    }

    public DistanceFeatController(int multiplier, int meter, 
            int numberOfTarget, DistanceTypeENUM distanceTypeENUM) {
        
        distanceFeatModel = new DistanceFeatModel();
        distanceFeatModel.setDistanceTypeENUM(distanceTypeENUM);
        
        if (distanceTypeENUM == distanceTypeENUM.DEFINED){
            distanceFeatModel.setDistanceValue(meter);
            distanceFeatModel.setDistanceMultiplier(multiplier);
        }
        distanceFeatModel.setNumberOfTarget(numberOfTarget);        
    }
    
    public DistanceFeatModel getDistanceFeatModel(){
        return distanceFeatModel;
    }
}
