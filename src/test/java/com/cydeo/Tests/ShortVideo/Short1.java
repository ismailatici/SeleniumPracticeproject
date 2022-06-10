package com.cydeo.Tests.ShortVideo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Short1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        String title=driver.getTitle();
        System.out.println("title = " + title);

        WebElement usernameBox=driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        usernameBox.sendKeys("standard_user");

        WebElement passwordBox=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        passwordBox.sendKeys("secret_sauce");

        WebElement LoginBtn=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        LoginBtn.submit();

        WebElement firstProductLnk=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        System.out.println("firstProductLnk.getAttribute() = " + firstProductLnk.getAttribute("id"));

        WebElement firstProductLnk1=driver.findElement(By.className("inventory_item_name"));
        System.out.println("firstProductLnk1.getText() = " + firstProductLnk1.getText());

        WebElement firstProductLnk2=driver.findElement(By.id("item_4_title_link"));
        System.out.println("firstProductLnk2.getText() = " + firstProductLnk2.getText());

        List<WebElement>allProductTitle=driver.findElements(By.className("inventory_item_name"));
        System.out.println("product count is = " + allProductTitle.size());

        for (WebElement eachProductTitle:allProductTitle){
            String productTitleText=eachProductTitle.getText();
            System.out.println("productTitleText = " + productTitleText);
        }

        WebElement cartContainerElm=driver.findElement(By.id("shopping_cart_container"));
        cartContainerElm.click();

        WebElement continueShoppingBtn=driver.findElement(By.xpath("//*[@id=\"continue-shopping\"]"));
        continueShoppingBtn.click();
        Thread.sleep(2000);





        driver.quit();


    }
}
