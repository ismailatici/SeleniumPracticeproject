package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro {
    @BeforeClass
    public void setupMethod(){
        System.out.println(".....kosuyor");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Befor method running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
    }
    @Test(priority = 2)
    public void test1(){
        System.out.println("Test 1 is running");
        String actual="apple";
        String expected="apple";
        Assert.assertEquals(actual,expected);
        //Assert.assertEquals("actual","actual");
    }
    @Test(priority = 1)
    public void  test2(){
        System.out.println("Test 2 is runnig");
    }

}
