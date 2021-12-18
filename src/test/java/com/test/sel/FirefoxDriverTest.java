/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author HP
 */
public class FirefoxDriverTest {
    
    private WebDriver fireFoxDriver;
    
    public FirefoxDriverTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver","c:\\qa\\drivers\\geckodriver.exe" );  
        fireFoxDriver = new FirefoxDriver();
        
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testFireFox(){
        assertNotNull(fireFoxDriver);
        fireFoxDriver.get("https://www.google.com/");
       WebElement google =  fireFoxDriver.findElement(By.name("q"));
       google.sendKeys("Java");
       WebElement btnSearch =  fireFoxDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"));
       btnSearch.click();
    }

  
}
