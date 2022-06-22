package com.cydeo.tests.day8;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
    WebDriver driver;

   /* @BeforeMethod
    public void setupMethod(){
        //We are getting the browser dynamically from configuration properties file
        String browserType= ConfigurationReader.getProperty("browser");
        driver= WebDriverFactory.getDriver("browserType");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

    */

    @Test
    public void google_search_test(){
        Driver.getDriver().get("https://www.google.com");
        WebElement googleSearchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedTitle=ConfigurationReader.getProperty("searchValue") + "-Google Search";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

    }
}