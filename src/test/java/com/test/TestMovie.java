/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sel.learnselenium.Movie;
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
public class TestMovie {
    Movie homeAlone;
    
    public TestMovie() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        homeAlone= new Movie();
    }
    
    @After
    public void tearDown() {
        
        
        
        
    }
    @Test
    public void movieTest(){
        homeAlone.setName("Home Alone");
        homeAlone.setActor("Keven");
        homeAlone.setYear("1995");
        assertEquals("Home Alone", homeAlone.getName());
        assertEquals("Keven",homeAlone.getActor());
        assertEquals("1995",homeAlone.getYear());
        
        
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
