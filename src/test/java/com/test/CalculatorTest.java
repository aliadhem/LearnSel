/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sel.learnselenium.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CalculatorTest {
    Calculator calc;
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("Befor method executed.");
        calc = new Calculator();
    }
    
    @After
    public void tearDown() {
        System.out.println("After method executed.");
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAdd(){
        Calculator c=new Calculator();
        double result=c.add(10,20);
        assertEquals(30,result,0.0);
        
    }
    
    @Test
    public void testSub(){
        double result = calc.sub(10, 5);
        assertEquals(5, result, 0.0);
    }
}
