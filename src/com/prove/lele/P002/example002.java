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
package com.prove.lele.P002;


import com.Heroes.lib.feat.BodyLocationFeat;
import com.Heroes.lib.feat.DurationFeat;
import com.Heroes.lib.feat.TargetFeat;
import com.Heroes.lib.core.HeroicFeat;
import com.Heroes.lib.enumClass.BodyLocationENUM;
import com.Heroes.lib.interfaceClass.IFeatAttribute;
import com.Heroes.lib.model.BodyLocationFeatModel;
import com.prove.lele.P002.varanti.BodyLocationFeatV2;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class example002 {
    List<IFeatAttribute> featAttributes = new ArrayList();    
    private String DBG_AGGIUNGERE_PARMETRO;
    private BodyLocationFeat bodyLocationFeat;
    
    private BodyLocationFeatV2 bodyLocationFeatV2 = new BodyLocationFeatV2();
    
    
    public void main(){
        HeroicFeat heroicFeat = new HeroicFeat();
        
        String name = DBG_AGGIUNGERE_PARMETRO;

        String description = DBG_AGGIUNGERE_PARMETRO;
        heroicFeat.setName(name);
        heroicFeat.setDescription(description);        
    
        
//        DurationFeat durationFeat = new DurationFeat();
//        TargetFeat targetFeat = new TargetFeat();
        
        featAttributes.add( getBodyLocation() );
        
//        featAttributes.add(durationFeat);
//        featAttributes.add(targetFeat);    
//        
//        // oggetto vuoto
//        BonusFeat bonusFeat = new BonusFeat();
//        if ( bonusFeat == null ){
//            featAttributes.add(bonusFeat);
//        }
//        
//        // oggetto vuoto
//        MovementFeat movementFeat = new MovementFeat();
//        if ( movementFeat != null)
//            featAttributes.add(movementFeat);
//        
//        // oggetto vuoto
//        CombatFeat combatFeat = new CombatFeat();
//        if ( combatFeat != null)
//            featAttributes.add(combatFeat);        
//        
//        // oggetto vuoto        
//        EditorFeat editorFeat = new EditorFeat();
//        if ( movementFeat != null)
//            featAttributes.add(movementFeat);

    }
    
    /*
    
        Ho fatto la V1 e V2. Entrambi hanno pro è contro. Le classi ....feat dipende da cosa hai in mente. 
        Se sono classi da "Lavoro" allora si può usare la V2 mentre se sono classi che verrano collegate alle GUI
        allora meglio la V1. Dipende da cosa hai in mente te.
  
        Quale preferisci? 
    
        la lista List<BodyLocationENUM> in quella posizione è inutile verrà distrutta
        alla fine del metodo
    */
    
    /**
     * con versione BodyLocationFeat normale creata in base al tuo psudocodice 
     * più adatta a essere usata come ponte per la gui
     **/
    
    private void initBodyLocationFeatV1(BodyLocationENUM bodyLocationENUM){
        BodyLocationFeatModel model = new BodyLocationFeatModel();
        
        // ????? verrà distrutta ogni volta devo renderla permanente ????
        List<BodyLocationENUM> locations = new ArrayList<BodyLocationENUM>();
        locations.add(bodyLocationENUM);
        
        model.setBodyLocation(bodyLocationENUM);
        bodyLocationFeat = new BodyLocationFeat(model);
    } 
    
    /**
     * BodyLocationFeatV2 eredita direttamente BodyLocationFeatModel
     * più adatta a essere usata come classe da lavoro
     **/
    private void initBodyLocationFeatV2(BodyLocationENUM bodyLocationENUM){
        bodyLocationFeatV2 = new BodyLocationFeatV2();
        
        // ????? verrà distrutta ogni volta devo renderla permanente ????
        List<BodyLocationENUM> locations = new ArrayList<BodyLocationENUM>();
        
        locations.add(bodyLocationENUM);
        bodyLocationFeatV2.setBodyLocation(bodyLocationENUM);
    }
        
    private BodyLocationFeatV2 getBodyLocation(){
        return bodyLocationFeatV2;
    }
    
     
    
}
