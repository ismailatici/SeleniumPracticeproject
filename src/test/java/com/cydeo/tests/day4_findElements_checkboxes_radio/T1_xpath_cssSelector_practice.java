package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink_ex1=driver.findElement(By.cssSelector("a[class='nav-link']"));

        WebElement homeLink_ex2=driver.findElement(By.cssSelector("a.nav-link"));

        WebElement homeLink_ex3=driver.findElement(By.cssSelector("a[href='/']"));

        WebElement header_ex1=driver.findElement(By.cssSelector("div.example>h2"));

        WebElement header_ex2= driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

        WebElement emailLabel=driver.findElement(By.xpath("//input[@for='email']"));

        WebElement inputBox_ex1=driver.findElement(By.xpath("//input[@name='email']"));

        WebElement inputBox_ex2=driver.findElement(By.xpath("//input[@name='email']"));

        WebElement retrievePasswordBtn=driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeoText= driver.findElement(By.xpath("//div[@style='text_align:center']"));

        System.out.println("homeLink_ex1.isDisplayed()"+homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed()" +header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());


    }
}
