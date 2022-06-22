package com.cydeo.tests.Turkce;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class v2 {
    @Test
    public void v2(){

        Driver.getDriver().get("https://demoga.com/text-box");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement nameElement=Driver.getDriver().findElement(By.id("userName"));
        nameElement.click();
    }
}
