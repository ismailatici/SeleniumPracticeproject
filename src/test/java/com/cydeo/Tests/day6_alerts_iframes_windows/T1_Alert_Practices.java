package com.cydeo.Tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrom");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/javascript.alerts");

    }
    @Test
    public void alert_test1() throws InterruptedException {
        WebElement informationAlertButton= driver.findElement(By.xpath("//button[.='Clickfor JS Alert']"));
        informationAlertButton.click();
        Thread.sleep(1000);

        Alert alert=driver.switchTo().alert();

        alert.accept();
        WebElement resultText=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed(),"Result text is NOT displayed");

        String expectedText="You successfully clicked an alert";
        String actualText=resultText.getText();

        Assert.assertEquals(actualText,expectedText,"Actuel result text is NOT displayed");

    }






}
