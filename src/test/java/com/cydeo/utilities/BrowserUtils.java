package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {
    public static void sleep(int second){
        second*=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver,String expectedInUrl,String expectedInTitle){
        Set<String> allWindowsHandels=driver.getWindowHandles();
        for (String each : allWindowsHandels) {
            driver.switchTo().window(each);
            System.out.println("Current URL = " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }
        String actualTitle=driver.getTitle();


        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }

    //this  method accept a String expectedtitle and Asserts if it is true
    public static void verifyTitle(WebDriver driver,String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }
}
