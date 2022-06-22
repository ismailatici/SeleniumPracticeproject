package com.cydeo.tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ShortDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement=driver.findElement(By.id("dropdown"));

        Select selectObj=new Select(dropdownElement);
        selectObj.selectByIndex(2);
        selectObj.selectByValue("1");
        selectObj.selectByVisibleText("Option 2");









        driver.quit();








    }
}
