/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Heroes.lib;

import com.Heroes.lib.model.AreaFeatModel;
import com.Heroes.lib.interfaceClass.IFeatAttribute;

/**
 *
 * @author lele
 */
public class AreaFeat implements IFeatAttribute{
    private AreaFeatModel areaFeatModel;

    public AreaFeat(AreaFeatModel areaFeatModel) {
        this.areaFeatModel = areaFeatModel;
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
