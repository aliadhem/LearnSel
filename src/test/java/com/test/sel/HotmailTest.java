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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author HP
 */
public class HotmailTest {

    private FirefoxDriver fireFoxDriver;
    
    public HotmailTest() {
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
    public void hotmailLoginTest(){
        fireFoxDriver.get("https://www.hotmail.com");
        WebElement signIn = fireFoxDriver.findElement(By.partialLinkText("Sign in"));
        signIn.click();
        WebElement userName = fireFoxDriver.findElement(By.name("loginfmt"));
        userName.sendKeys("ali.adhem89@gmail.com");
         WebElement next = fireFoxDriver.findElement(By.id("idSIButton9"));
         next.click();
        
    
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
