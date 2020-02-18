/*
 * Copyright (C) 2020 labitag@vesenda.local
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
package com.Heroes.lib.patterns.chain;

import unstable.patterns.chain.IChainStep;
import unstable.patterns.chain.ChainStepBase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Guybrush aka Gabriele L.
 */
public class ChainStepBaseTest {
   

    /**
     * HAVE A new chain step
     * WHEN get next step
     * THEN null to be returned.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        ChainStepBase instance = new ChainStepBaseImpl();
        IChainStep expResult = null;
        IChainStep result = instance.getNext();
        assertEquals(expResult, result);
    }

    /**
     * HAVE A new chain step
     * WHEN set the next step
     * THEN that step to be next.
     */
    @Test
    public void testSetNext() {
        System.out.println("setNext");
        ChainStepBase instance1 = new ChainStepBaseImpl();
        ChainStepBase instance2 = new ChainStepBaseImpl();
        instance1.setNext(instance2);
        assertEquals(instance2, instance1.getNext());
    }

    /**
     * HAVE A chain of a single test
     * WHEN perform step operation 
     * THEN onPerformOverride to be called.
     */
    @Test
    public void testPerformStep() {
        System.out.println("performStep");
        Object model = null;
        ChainStepBaseImpl instance = new ChainStepBaseImpl();
        instance.performStep(model);
        assertEquals(instance.called(), 1);
    }

   /**
     * HAVE A chain with two steps
     * WHEN perform step operation on first one 
     * THEN both steps to be performed.
     */
    @Test
    public void testPerformStep2() {
        System.out.println("performStep");
        Object model = null;
        ChainStepBaseImpl instance1 = new ChainStepBaseImpl();
        ChainStepBaseImpl instance2 = new ChainStepBaseImpl();
        instance1.setNext(instance2);
        instance1.performStep(model);
        assertEquals(instance1.called(), 1);
        assertEquals(instance2.called(), 1);
    }


    public class ChainStepBaseImpl extends ChainStepBase {
        private int _called = 0;
        
        public int called() {
            return this._called;
        }
        @Override
        protected void onPerformOverride(Object model) {
            ++this._called;
        }
    }
    
}
