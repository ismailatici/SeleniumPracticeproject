package com.cydeo.Tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Short2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://practice.cybertekschool.com/checkboxes");

        WebElement checkbox1=driver.findElement(By.id("box1"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        
    }
}
