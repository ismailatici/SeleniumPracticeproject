package com.cydeo.tests.ShortVideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ShortGoogle {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    }


    @Test
    public void  testHomepage() throws InterruptedException {

        driver.get("https://google.com");
        Thread.sleep(3000);
        assertEquals(driver.getTitle(),"Google");
        Thread.sleep(2000);
    }
    @Test
    public void  testSearch() throws InterruptedException{
        driver.get("https://google.com");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("selenium"+ Keys.ENTER);

        assertEquals(driver.getTitle(),"selenium-Google search");
        Thread.sleep(1000);
    }

    @AfterMethod
    public void cleanup(){
        driver.quit();
    }


}

