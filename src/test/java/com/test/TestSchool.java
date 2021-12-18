/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.sel.learnselenium.School;
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
public class TestSchool {
    School lakeView;
    
    
    public TestSchool() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        lakeView = new School("123","Ali","123 w wall st.");
        
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testSchool (){
        
        assertEquals("Ali", lakeView.getName());
        assertEquals("123", lakeView.getId());
        assertEquals("123 w wall st.",lakeView.getAddress());
        lakeView.setName("Ahmed");
        lakeView.setId("654");
        lakeView.setAddress("111 n pulaski rd");
        
        assertEquals("Ahmed", lakeView.getName());
        assertEquals("654", lakeView.getId());
        assertEquals("111 n pulaski rd",lakeView.getAddress());
        
        
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
