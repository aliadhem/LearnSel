/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.sel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author HP
 */
public class GoogleTest {
    
    public GoogleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
       
    }
     WebDriver driver;
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "c:\\qa\\drivers\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }
    
    @After
    public void tearDown() {
        //close the browser 
        //driver.quit();
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testSearch() throws InterruptedException{
        driver.get("http://www.google.com");
        //fing element with a name property which has a value "q"
        Thread.sleep(5000);
       WebElement e = driver.findElement(By.name("q"));
                e.sendKeys("selenium jobs");
                e.submit();
               File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
               src.renameTo(new File ("c:\\qa\\searchimage.png"));
               
               
                //Verify the result page displayed
            //assertTrue(driver.getTitle().contains("selenium jobs"));
            
            
            
        
    }
    @Test
    public void testNavigation(){
        driver.navigate().to("http://www.google.com");
        driver.navigate().to("http://www.ibm.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
    }
    @Test
    public void testLocators(){
        driver.get("https://nlilaramani.github.io/");
        driver.findElement(By.partialLinkText("User Registration")).click();
        driver.findElement(By.id("fname")).sendKeys("Robert");
        driver.findElement(By.name("lname")).sendKeys("Daley");
        driver.findElement(By.cssSelector("#username")).sendKeys("test");
        driver.findElement(By.className("pwd")).sendKeys("testpwd");
        driver.findElements(By.name("g")).get(1).click();
        
        //driver.findElement(By.xpath("/html/body/center/form/input[8]")).click();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        WebElement e= driver.findElement(By.tagName("select"));
        Select dropdown =new Select(e);
        dropdown.selectByIndex(1);
        //driver.findElement(By.tagName("select")).sendKeys("Bachelors");
        //driver.findElement(By.xpath("//input[@type='submit']")).click();
        
    }
    @Test
    public void testUserprofileDataDriven() throws FileNotFoundException, IOException, InterruptedException{
        FileInputStream fs=new FileInputStream(new File("c:\\qa\\testdata.xlsx"));
        Workbook wb=new XSSFWorkbook(fs);
       
        Sheet sh=wb.getSheetAt(0);
        String fname=sh.getRow(1).getCell(0).getStringCellValue();
        String lname=sh.getRow(1).getCell(1).getStringCellValue();
        String uname=sh.getRow(1).getCell(2).getStringCellValue();
        String pwd=sh.getRow(1).getCell(3).getStringCellValue();
        String gender=sh.getRow(1).getCell(4).getStringCellValue();
        String qual=sh.getRow(1).getCell(5).getStringCellValue();
        driver.get("https://nlilaramani.github.io/");
        driver.findElement(By.partialLinkText("User Registration")).click();
        driver.findElement(By.id("fname")).sendKeys(fname);
        driver.findElement(By.id("fname")).sendKeys(fname);
        driver.findElement(By.name("lname")).sendKeys(lname);
        //driver.findElement(By.id("username")).sendKeys("test");
        driver.findElement(By.cssSelector("#username")).sendKeys(uname);
        //driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.className("pwd")).sendKeys(pwd);
        if(gender.equalsIgnoreCase("M"))
            driver.findElements(By.name("g")).get(0).click();
        else
            driver.findElements(By.name("g")).get(1).click();
        driver.findElement(By.tagName("select")).sendKeys(qual);
       
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
       
        fs.close();
    }
    @Test
     
           public void testAlert() throws InterruptedException{
                driver.get("https://nlilaramani.github.io/frame.html");
                driver.findElement(By.tagName("button")).click();
                Thread.sleep(5000);
                driver.switchTo().alert().accept();
            }
            
}

