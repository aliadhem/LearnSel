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
public class BlueShieldTest {
    private WebDriver fireFoxDriver;
    
    public BlueShieldTest() {
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
    public void testLogin (){
        fireFoxDriver.get("https://www.blueshieldca.com/");
        WebElement loginBtn = fireFoxDriver.findElement(By.id("loginAccountButton"));
        loginBtn.click();
        WebElement userName = fireFoxDriver.findElement(By.name("username"));
        userName.sendKeys("Akjfg20");
        WebElement passWord = fireFoxDriver.findElement(By.name("password"));
        passWord.sendKeys("Alikutreww20");
        WebElement login = fireFoxDriver.findElement(By.id("loginSubmit"));
        login.click();
    }

 // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
