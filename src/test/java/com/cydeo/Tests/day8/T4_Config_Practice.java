package com.cydeo.Tests.day8;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //We are getting the browser dynamically from configuration properties file
        String browserType= ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver("browserType");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    @Test
    public void google_search_test(){
        WebElement googleSearchBox=driver.findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedTitle=ConfigurationReader.getProperty("searchValue") + "-Google Search";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }
}
