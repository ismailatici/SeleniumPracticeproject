package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) {
        // 1 setting up the web driver manager
        WebDriverManager.chromedriver().setup();
        // 2 setting
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");
        //3 Test if  driver is working as expected
        driver.get("http://www.facebook.com");



    }
}
