package com.cydeo.Tests.ShortVideo;

import com.cydeo.Tests.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class P25_JavaScriptAlertTest extends TestBase {

    @Test
    public void testAlert(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[1]")).click();
         driver.switchTo().alert().accept();
       //alertObj.accept();

        WebElement confirmBtn =driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[2]"));
        confirmBtn.click();
        driver.switchTo().alert().accept();
        confirmBtn.click();
        driver.switchTo().alert().dismiss();

        WebElement promtbtn=driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[3]"));
        promtbtn.click();

        Alert alertObj=driver.switchTo().alert();
        System.out.println("popup text is :"+alertObj.getText());
        driver.switchTo().alert().sendKeys("Hello there");
        alertObj.accept();

        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/button[3]"));



        System.out.println("End");



//
    }

}
