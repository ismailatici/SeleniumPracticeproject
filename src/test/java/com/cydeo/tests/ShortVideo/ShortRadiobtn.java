package com.cydeo.tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ShortRadiobtn {

    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioBtn=driver.findElement(By.id("blue"));
        System.out.println("blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());
        blueRadioBtn.click();
        System.out.println(" after blueRadioBtn.isSelected() = " + blueRadioBtn.isSelected());

        WebElement redRadioBtn=driver.findElement(By.id("red"));
        System.out.println("redRadioBtn.isSelected() = " + redRadioBtn.isSelected());
        redRadioBtn.click();
        System.out.println("after redRadioBtn.isSelected() = " + redRadioBtn.isSelected());

        WebElement yellowBtn=driver.findElement(By.id("yellow"));
        System.out.println("yellowBtn.isSelected() = " + yellowBtn.isSelected());
        System.out.println("yellowBtn.isEnabled() = " + yellowBtn.isEnabled());
        yellowBtn.click();
        System.out.println("after yellowBtn.isSelected() = " + yellowBtn.isSelected());

        List<WebElement>allColorRadios=driver.findElements(By.name("color"));
        System.out.println("allColorRadios.size() = " + allColorRadios.size());



    }
}
