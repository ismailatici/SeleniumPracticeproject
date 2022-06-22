package com.cydeo.tests.ShortVideo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePageTest {
    @Test
    public void  test1(){
        Assert.assertEquals(2,3);
        Assert.assertEquals(2,3,"my number dint match");
        Assert.assertEquals("selenium","java","problem var");
        Assert.assertNotEquals(3,2);
        Assert.assertFalse(3>21);
        String str1=null;

        Assert.assertNull(str1);
        String str2="testNG";
        Assert.assertNull(str2);


    }
}
