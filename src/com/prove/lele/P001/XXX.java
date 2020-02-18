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
package com.prove.lele.P001;

/**
 *
 * @author lele
 */
public class XXX {
    private enum MagnitudoENUM {
        MAGNITUDO_MENO_UNO(-1),
        MAGNITUDO_UNO(1),
        MAGNITUDO_DUE(2),
        MAGNITUDO_TRE(3),
        MAGNITUDO_QUATTRO(4),
        MAGNITUDO_CINQUE(5),
        MAGNITUDO_SEI(6);

        private int value;

        private MagnitudoENUM(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    private final int moltiplicatore = 10;
    private int value;
    
    /**
     * NON CONOSCO LA FORMULA >>>> ESEMPIO <<<<<
     * @return 
     */    
    private int caluclateAreaMagnitudo(int distanza){
        return distanza * MagnitudoENUM.MAGNITUDO_DUE.getValue();
    }
    
    private int calculateMoltiplicatoreArea () {
        return MagnitudoENUM.MAGNITUDO_TRE.getValue() * moltiplicatore;
    }    

    public XXX(int distanza) {
        value = caluclateAreaMagnitudo(distanza) * calculateMoltiplicatoreArea();
    }
 
    public int getValue(){
        return value;
    }
}
