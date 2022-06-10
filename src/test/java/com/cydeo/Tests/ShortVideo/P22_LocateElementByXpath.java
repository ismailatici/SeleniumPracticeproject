package com.cydeo.Tests.ShortVideo;

import com.cydeo.utilities.HandleWait;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class P22_LocateElementByXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/registration_form");

        WebElement header=driver.findElement(By.xpath("//h2[.='Registration form']"));
        System.out.println("header.isDisplayed() = " + header.isDisplayed());
        HandleWait.staticWait(2);
        //header.sendKeys("");
        WebElement firstNameField=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameField.sendKeys("Adam");
        HandleWait.staticWait(2);

        WebElement lastNameField=driver.findElement(By.xpath("//input[@data-bv-field='lastname']"));
        lastNameField.sendKeys("John");
        HandleWait.staticWait(2);

        WebElement userNameField=driver.findElement(By.xpath("//input[@data-bv-field='username']"));
        userNameField.sendKeys("coouser");
        HandleWait.staticWait(3);

        WebElement emailField=driver.findElement(By.xpath("//input[@data-bv-field='email']"));
        emailField.sendKeys("coouser@cool.com");
        HandleWait.staticWait(2);

        WebElement passwordField=driver.findElement(By.xpath("//input[@name='password'and @data-bv-field='password']"));
        passwordField.sendKeys("topsecretgoeshere");
        HandleWait.staticWait(2);

        WebElement phoneField=driver.findElement(By.xpath("//input[@name='phone'and @data-bv-field='phone']"));
        phoneField.sendKeys("123-123-1233");
        Thread.sleep(2);

        WebElement femaleRadioBtn=driver.findElement(By.xpath("//input[@type='radio'and @value='female']"));
        femaleRadioBtn.click();

        WebElement birthField=driver.findElement(By.xpath("//input[@name='birthday']"));
        birthField.sendKeys("01/01/1980");
        HandleWait.staticWait(2);

        WebElement depDropdown=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select"));
        Select depSelectObj=new Select(depDropdown);
        depSelectObj.selectByIndex(1);

        WebElement titleDropdown=driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select"));
        Select titleSelectObj=new Select(depDropdown);
        depSelectObj.selectByIndex(1);

        WebElement cplusCheckbox=driver.findElement(By.xpath("//*[@id=\"inlineCheckbox1\"]"));
        System.out.println("cplusCheckbox.isSelected() = " + cplusCheckbox.isSelected());
        cplusCheckbox.click();

        WebElement signupBtn=driver.findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
        signupBtn.click();

        WebElement successMsg=driver.findElement(By.xpath("//h4[@class='alert_heading' and text()='Well done']"));
        System.out.println("successMsg.isDisplayed() = " + successMsg.isDisplayed());
        //*[@id="wooden_spoon"]


        driver.quit();

    }
}
