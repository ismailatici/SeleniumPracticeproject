package com.cydeo.tests.day8;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }
    @Test
    public void order_name_verify_test(){
        WebElement bobMartinCell=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[7]/td[2]"));
        System.out.println("bobMartinCell.getText = " + bobMartinCell.getText());

        String expectedBobName="Bob Martin";
        String actualBobName=bobMartinCell.getText();

        Assert.assertEquals(actualBobName,expectedBobName);

        WebElement bobMartinDateCell=driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[7]/td[5]"));
        String expectedBobMartinDate="12/31/2021";
        String actualBobMartinDate=bobMartinDateCell.getText();

        Assert.assertEquals(actualBobMartinDate,expectedBobMartinDate);


    }
    //We use the utility method we created
    @Test
    public void test2(){
        String costumerOrderDate1= WebTableUtils.returnOrderDate(driver,"Alexandra Gray");
        System.out.println("costumerOrderDate1 = " + costumerOrderDate1);

        String costumerOrderDate2= WebTableUtils.returnOrderDate(driver,"John Doe");
        System.out.println("costumerOrderDate2 = " + costumerOrderDate2);
    }

    //Using WebTableUtils.orderVerify(); method
    @Test
    public void test3(){
        WebTableUtils.orderVerify(driver,"bart Fisher","01/16/2022");

    }



}
