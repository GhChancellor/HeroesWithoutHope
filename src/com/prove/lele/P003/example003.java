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

import com.Heroes.lib.core.HeroicFeat;
import com.Heroes.lib.enumClass.AreaTypeENUM;
import com.Heroes.lib.enumClass.BodyLocationENUM;
import com.Heroes.lib.enumClass.CharacterFeatENUM;
import com.Heroes.lib.enumClass.DistanceTypeENUM;
import com.Heroes.lib.enumClass.DurationENUM;
import com.Heroes.lib.feat.BodyLocationFeat;
import com.Heroes.lib.feat.CharacterBonusFeat;
import com.Heroes.lib.feat.DurationFeat;
import com.Heroes.lib.feat.TargetFeat;
import com.Heroes.lib.interfaceClass.IFeatAttribute;
import com.Heroes.lib.model.AreaFeatModel;
import com.Heroes.lib.model.BodyLocationFeatModel;
import com.Heroes.lib.model.BonusFeatModel;
import com.Heroes.lib.model.DistanceFeatModel;
import com.Heroes.lib.model.DurationFeatModel;
import com.Heroes.lib.model.TargetFeatModel;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class example003 {
    List<IFeatAttribute> featAttributes = new ArrayList();    
    private String DBG_AGGIUNGERE_PARMETRO;
    
    private BodyLocationFeat bodyLocationFeat;
    private DurationFeat durationFeat;
    private TargetFeat targetFeat;
    
    public void main(){
        HeroicFeat heroicFeat = new HeroicFeat();
        
        String name = DBG_AGGIUNGERE_PARMETRO;

        String description = DBG_AGGIUNGERE_PARMETRO;
        heroicFeat.setName(name);
        heroicFeat.setDescription(description);    

        /* DBG >>>> Da colllegare a una GUI <<<<< */       
        initFear();
        
        featAttributes.add( getBodyLocation() );          
        featAttributes.add( getDuration());
        featAttributes.add( getTargets() );
    }    
    
    
    /**
     * DBG >>>> Da colllegare a una GUI <<<<<
     */
    private void initFear(){
        initBodyLocationFeat(BodyLocationENUM.BODY);
        initDurationFeat(DurationENUM.EXTENDED);
    }
    
    private void iniTargetFeat(boolean flag, int multiplier, 
            int excludedTargets, int meter, int numberOfTarget,
            AreaTypeENUM areaTypeENUM, DistanceTypeENUM distanceTypeENUM){
        
        boolean usaArea = flag;
        TargetFeatModel targetFeatModel = new TargetFeatModel();
        
        if (usaArea){
            AreaFeatModel areaFeatModel = new AreaFeatModel();
            areaFeatModel.setAreaType(areaTypeENUM);
            
            if (areaTypeENUM == AreaTypeENUM.DEFINED){
                areaFeatModel.setAreaMultiplier(multiplier);
                areaFeatModel.setExcludedTarget(excludedTargets);
            }
            
            targetFeatModel.setAreaFeat(areaFeatModel);
        }
        
        DistanceFeatModel distanceFeatModel = new DistanceFeatModel();
        distanceFeatModel.setDistanceTypeENUM(distanceTypeENUM);
        
        if (distanceTypeENUM == distanceTypeENUM.DEFINED){
            distanceFeatModel.setDistanceValue(meter);
            distanceFeatModel.setDistanceMultiplier(multiplier);
        }
        distanceFeatModel.setNumberOfTarget(numberOfTarget);
        targetFeatModel.setDistanceFeat(distanceFeatModel);
        
        targetFeat = new TargetFeat(targetFeatModel);
    }
    
    private IFeatAttribute getTargets(){
        return targetFeat;
    }
    
    private void initBodyLocationFeat(BodyLocationENUM bodyLocationENUM){
        BodyLocationFeatModel model = new BodyLocationFeatModel();
        
        List<BodyLocationENUM> locations = new ArrayList<BodyLocationENUM>();
        locations.add(bodyLocationENUM);
        
        model.setBodyLocationENUM(locations);  
        bodyLocationFeat = new BodyLocationFeat(model);
    }
    
    private IFeatAttribute getBodyLocation() {
        return bodyLocationFeat;  
    }    
    
    private void initDurationFeat(DurationENUM durationENUM){
        DurationFeatModel model = new DurationFeatModel();
//        DurationENUM duration = durationENUM;
        model.setDurationENUM(durationENUM);
        durationFeat = new DurationFeat(model);           
    }
            
    private IFeatAttribute getDuration() {
        return durationFeat;
    }
    
    /* faccio fatica con i parametri input, modfica lo pseudo codice */
    private void getBonus(boolean isBonus, CharacterFeatENUM characterFeat){
        boolean DBG_UNKNOW_VARIABLE = true;
        CharacterFeatENUM characterFeat_;
        
        if (isBonus){
            BonusFeatModel bonusFeatModel = new BonusFeatModel();
            List<CharacterBonusFeat> characterBonusFeats = new ArrayList<CharacterBonusFeat>();
            
            // L'utente deve selezionare quali caratteristiche riceveranno il bonus
            
            while (DBG_UNKNOW_VARIABLE) {                
                CharacterBonusFeat characterFeatBonus = new CharacterBonusFeat ();
                characterFeat_ = characterFeat;
            }
        }
        
    }
    
    
}
