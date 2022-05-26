package com.cydeo.Tests.day8;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadinProperties {
    @Test
    public void reading_from_properties_test() throws IOException {
        // create the object off Properties
        Properties properties=new Properties();

        // we need to open the file in java memory:File input
        FileInputStream file=new FileInputStream("configuration.properties");

        // Load the properties object using FileInputObject
        properties.load(file);

        //Use properties object to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));

    }
}
