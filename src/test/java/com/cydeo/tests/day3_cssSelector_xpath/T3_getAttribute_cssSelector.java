package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement signInButton= driver.findElement(By.cssSelector(" [class=\"login-inp\"]  "));

        String expectedButtonText="Login In";
        String actualButtonText=signInButton.getAttribute("value");
        System.out.println("actualButtonText="+actualButtonText);

        if (actualButtonText.equals(expectedButtonText)){
            System.out.println("Log in button text verification passed");
        }else {
            System.out.println("Login in button text verification failed");
        }


    }
}
