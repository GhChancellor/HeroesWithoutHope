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
package com.prove.lele.P003;

import com.Heroes.lib.enumClass.AreaTypeENUM;
import com.Heroes.lib.enumClass.DistanceTypeENUM;
import com.Heroes.lib.interfaceClass.IFeatAttribute;
import com.Heroes.lib.model.AreaFeatModel;
import com.Heroes.lib.model.TargetFeatModel;

/**
 *
 * @author lele
 */
public class TargetFeat implements IFeatAttribute {

    private TargetFeatModel targetFeatModel;

    /**
     * UNUSED
     * @param targetFeatModel 
     */
    public TargetFeat(TargetFeatModel targetFeatModel) {
        this.targetFeatModel = targetFeatModel;
    }

    public TargetFeat(boolean usaArea, int multiplier, 
            int excludedTargets, AreaTypeENUM areaTypeENUM) {        

        targetFeatModel = new TargetFeatModel();
        
        if (usaArea){
            AreaFeatModel areaFeatModel = new AreaFeatModel();
            areaFeatModel.setAreaType(areaTypeENUM);
            
            if (areaTypeENUM == AreaTypeENUM.DEFINED){
                areaFeatModel.setAreaMultiplier(multiplier);
                areaFeatModel.setExcludedTarget(excludedTargets);
            }
            
            targetFeatModel.setAreaFeat(areaFeatModel);
        }
    }
    
    /* DBG - >>> SOLUZIONE TEMPORANEA ORA SONO STANCO POI LO SPOSTERÒ ALTROVE <<<< */
    public void calculateDistanceFeat(int multiplier, int meter, 
            int numberOfTarget, DistanceTypeENUM distanceTypeENUM){
        
        DistanceFeat distanceFeat = new DistanceFeat(multiplier, meter, numberOfTarget, distanceTypeENUM);
        targetFeatModel.setDistanceFeat(distanceFeat.getDistanceFeatModel());            
    }
        
    public TargetFeatModel getTargetFeatModel(){
        return targetFeatModel;
    }
    
    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMagnitude() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
