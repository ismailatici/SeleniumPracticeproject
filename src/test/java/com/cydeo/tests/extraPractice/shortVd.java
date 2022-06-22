package com.cydeo.tests.extraPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class shortVd {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }
    @Test
    public void yahootest(){
        driver.get("https://yahoo.com");

        WebElement stimme=driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/form/div[2]/div[2]/button"));
        stimme.click();

        WebElement inputBox=driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]"));
        inputBox.sendKeys("hello");
        WebElement searchBtn=driver.findElement(By.xpath("//*[@id=\"ybar-search\"]"));
        searchBtn.click();
    }
}
