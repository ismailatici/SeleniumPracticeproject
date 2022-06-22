package com.cydeo.tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ShortDrop2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekscholl.com/dropdown");
        WebElement mutiItemDropdown=driver.findElement(By.id("Languages"));

        Select multiItemSelect=new Select(mutiItemDropdown);
        System.out.println("multiItemSelect.isMultiple() = " + multiItemSelect.isMultiple());

        multiItemSelect.selectByIndex(3);
        multiItemSelect.selectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");

        multiItemSelect.deselectByIndex(3);
        multiItemSelect.deselectByValue("c#");
        multiItemSelect.selectByVisibleText("Java");
        multiItemSelect.deselectAll();

        driver.quit();











    }
}
