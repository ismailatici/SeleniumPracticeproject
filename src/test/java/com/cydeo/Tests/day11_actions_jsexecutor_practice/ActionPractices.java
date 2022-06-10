package com.cydeo.Tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {
    @Test
    public void task_4and_5_test(){
        Driver.getDriver().get("https:practice.cydeo.com/");

        Actions actions=new Actions(Driver.getDriver());

        WebElement cydeoLinkBtn=Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLinkBtn).pause(4000).perform();
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
        Driver.closeDriver();
    }



    @Test
    public void test2(){
        Driver.getDriver().get("https:practice.cydeo.com/");
        Driver.closeDriver();

    }
}
