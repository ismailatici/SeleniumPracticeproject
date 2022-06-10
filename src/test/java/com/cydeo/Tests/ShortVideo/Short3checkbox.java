package com.cydeo.Tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Short3checkbox {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cybertekschool.com/checkbox");

        WebElement checkbox1=driver.findElement(By.id("box1"));
        System.out.println("before click checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();

        System.out.println("after click checkbox1.isSelected() = " + checkbox1.isSelected());

        WebElement checkbox2=driver.findElement(By.id("box2"));
        System.out.println("before click checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));
        checkbox2.click();
        System.out.println("after click checkbox2.getAttribute(\"checked\") = " + checkbox2.getAttribute("checked"));

        if (! checkbox1.isSelected()){
            checkbox1.click();
        }else {
            System.out.println("checkbox 1 is already selected");
        }



    }

}
