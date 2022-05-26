package com.cydeo.Tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement hockeyRadioBtn=driver.findElement(By.xpath("//input[@id='hockey']"));
        Thread.sleep(3000);
        hockeyRadioBtn.click();

        if (hockeyRadioBtn.isSelected()){
            System.out.println("Button is selected. Verification Passed!");
        }else {
            System.out.println("Button is not selected.Verification FAILED !!!");
        }



    }
}
