package com.cydeo.Tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T5_Windows_Practice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void multiple_Window_test(){
        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

        WebElement clickHereLink=driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        actualTitle=driver.getTitle();

        Set<String>allWindowHandles=driver.getWindowHandles();

        System.out.println("actualTitle = " + actualTitle);

        for (String each:driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching windows:"+driver.getTitle());
        }
        String expectedTitleAfterClick="New Window";
        actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitleAfterClick);
        System.out.println("Title after click= " + actualTitle);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
