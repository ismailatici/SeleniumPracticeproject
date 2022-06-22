package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test
    public void selenium_test(){
        driver.get("https://google.com");

        //Assert.assertEquals(driver.getTitle(),"google");
        String actualTitle=driver.getTitle();
        String expectedTitle="Google";
        Assert.assertEquals(actualTitle,expectedTitle,"Title is not matching here");


    }
}