package com.cydeo.Tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //Write apple in search box
        WebElement googleSearchBox=driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String expectedInTitle="apple";
        String actualTitle=driver.getTitle();
        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification Passed!!!");
        }else {
            System.out.println("Title verification Faild!!!");
        }





    }
}
