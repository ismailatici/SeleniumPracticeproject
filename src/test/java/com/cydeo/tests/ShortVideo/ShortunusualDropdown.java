package com.cydeo.tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ShortunusualDropdown {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("http://practice.cyberktekscholl.com/dropdown");

        WebElement dropdownLink=driver.findElement(By.linkText("Dropdown link"));
        dropdownLink.click();
        WebElement itemGoogle= driver.findElement(By.linkText("Google"));
        itemGoogle.click();




        driver.quit();

    }
}
