/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib.core;

import com.Heroes.lib.interfaceClass.IFeatAttribute;
import com.Heroes.lib.fatherClasses.FatherClass001;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lele
 */
public class HeroicFeat extends FatherClass001{
    List < IFeatAttribute > iFeatAttributes = new ArrayList<IFeatAttribute>();
    
    public HeroicFeat() {        
    }

    public List<IFeatAttribute> getiFeatAttributes() {
        return iFeatAttributes;
    }

    public void setiFeatAttributes(List<IFeatAttribute> iFeatAttributes) {
        this.iFeatAttributes = iFeatAttributes;
    }

    
}
