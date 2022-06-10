package com.cydeo.Tests.day10_upload_action_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {
    @Test
    public void  upload_test(){
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        String path="/Users/administrator/Desktop/Bildschirmfoto 2022-05-29 um 21.29.59.png";

        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-Upload"));
        BrowserUtils.sleep(2);
        fileUpload.sendKeys(path);

        WebElement uploadBtn=Driver.getDriver().findElement(By.id("file_submit"));
        uploadBtn.click();

        WebElement fileUploadedHeader=Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedHeader.isDisplayed());
    }
}
