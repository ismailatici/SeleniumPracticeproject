package com.cydeo.Tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1 Setup the browser driver
        WebDriverManager.chromedriver().setup();
        //2 Create instance of the Selenium Webdriver
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        // 3 Go to--
        driver.get("https://www.tesla.com");
        // get title of the page
        String currentTitle=driver.getTitle();
        System.out.println("currentTitle="+currentTitle);

        String currentURL=driver.getCurrentUrl();
        System.out.println("currentURL="+currentURL);

        //Stop code execution for 3 second
        Thread.sleep(3000);
        // use selenium to navigate back
        driver.navigate().back();
        Thread.sleep(3000);
        // use selenium to navigate back
        driver.navigate().forward();
        Thread.sleep(3000);
        // use selenium to navigate back
        driver.navigate().refresh();
        currentTitle=driver.getTitle();
        Thread.sleep(3000);
        driver.navigate().to("https://google.com");
        // get titel
        System.out.println("driver.getTitle()"  +driver.getTitle());
        driver.close();
        driver.quit();




    }
}
