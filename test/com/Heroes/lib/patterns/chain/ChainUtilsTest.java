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

import unstable.patterns.chain.ChainUtils;
import unstable.patterns.chain.IChainStep;
import unstable.patterns.chain.ChainStepBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
public class ChainUtilsTest {
    
    public ChainUtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * HAVE A null list
     * WHEN create chains through createChain method
     * THEN null to be returned
     */
    @Test
    public void testCreateChainNull() {
        System.out.println("createChainNull");
        IChainStep expResult = null;
        IChainStep result = ChainUtils.createChain(null);
        assertEquals(expResult, result);
    }

    /**
     * HAVE An empty step list
     * WHEN create chains through createChain method
     * THEN null to be returned
     */
    @Test
    public void testCreateChainEmpty() {
        System.out.println("createChainEmpty");
        List<IChainStep<MyModel>> steps = new ArrayList();
        IChainStep<MyModel> expResult = null;
        IChainStep<MyModel> result = ChainUtils.createChain(steps);
        assertEquals(expResult, result);
    }
    
    /**
     * HAVE A list with one element
     * WHEN create chains through createChain method
     * THEN that element without any next is returned
     */
    @Test
    public void testCreateChainOne() {
        System.out.println("testCreateChainOne");
        IChainStep<MyModel> instance = new ChainStepBaseImpl();
        List steps = new ArrayList(
            Arrays.asList(instance)
        );
        IChainStep<MyModel> result = ChainUtils.createChain(steps);
        assertEquals(result, instance);
        assertEquals(instance.getNext(), null);
    }

    /**
     * HAVE A list with one element that contains a next element
     * WHEN create chains through createChain method
     * THEN that element without any next is returned
     */
    @Test
    public void testCreateChainOneWithNext() {
        System.out.println("testCreateChainOneWithNext");
        IChainStep<MyModel> instance1 = new ChainStepBaseImpl();
        IChainStep<MyModel> instance2 = new ChainStepBaseImpl();
        List steps = new ArrayList(
            Arrays.asList(instance1)
        );
        instance1.setNext(instance2);
        IChainStep<MyModel> result = ChainUtils.createChain(steps);
        assertEquals(result, instance1);
        assertEquals(instance1.getNext(), null);
    }
    
    /**
     * HAVE A list with two elements without next element
     * WHEN create chains through createChain method
     * THEN first element to be returned and its next is second element.
     */
    @Test
    public void testCreateChainTwoWithoutNext() {
        System.out.println("testCreateChainTwoWithoutNext");
        IChainStep<MyModel> instance1 = new ChainStepBaseImpl();
        IChainStep<MyModel> instance2 = new ChainStepBaseImpl();
        List steps = new ArrayList(
            Arrays.asList(instance1, instance2)
        );
        IChainStep<MyModel> result = ChainUtils.createChain(steps);
        assertEquals(result, instance1);
        assertEquals(instance1.getNext(), instance2);
        assertEquals(instance2.getNext(), null);
    }
    
    /**
     * HAVE A list with two elements where second one has a next
     * WHEN create chains through createChain method
     * THEN second next element is null.
     */
    @Test
    public void testCreateChainTwoWithNext() {
        System.out.println("testCreateChainTwoWithNext");
        IChainStep<MyModel> instance1 = new ChainStepBaseImpl();
        IChainStep<MyModel> instance2 = new ChainStepBaseImpl();
          IChainStep<MyModel> instance3 = new ChainStepBaseImpl();
        List steps = new ArrayList(
            Arrays.asList(instance1, instance2)
        );
        instance2.setNext(instance3);
        IChainStep<MyModel> result = ChainUtils.createChain(steps);
        assertEquals(instance2.getNext(), null);
    }
    
    public class MyModel {}
    public class ChainStepBaseImpl extends ChainStepBase<MyModel> {
      
        @Override
        protected void onPerformOverride(MyModel model) {
           
        }
      
    }
}
