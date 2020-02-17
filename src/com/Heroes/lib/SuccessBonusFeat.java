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
package com.Heroes.lib;

import com.Heroes.lib.interfaceClass.IFeatAttribute;
import com.Heroes.lib.model.SuccessBonusFeatModel;

/**
 *
 * @author lele
 */
public class SuccessBonusFeat implements IFeatAttribute{

    private SuccessBonusFeatModel successBonusFeatModel;

    public SuccessBonusFeat(SuccessBonusFeatModel successBonusFeatModel) {
        this.successBonusFeatModel = successBonusFeatModel;
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
