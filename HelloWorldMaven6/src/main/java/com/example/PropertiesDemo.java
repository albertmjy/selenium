package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by albert on 05/03/2017.
 */
public class PropertiesDemo {

    private String propertiesPath = "";

    public void printAll(){
        Properties props = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream input = loader.getResourceAsStream("UIMap.properties");
//        this.getClass().getResource("");

        try {
            props.load(input);
            Enumeration enu = props.propertyNames();

            while (enu.hasMoreElements()) {
                String key = (String) enu.nextElement();
                String value = props.getProperty(key);

                System.out.println(key + "->\t\t " + value);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getProp(String key){
        Properties props = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream input = loader.getResourceAsStream("UIMap.properties");
//        this.getClass().getResource("");

        try {
            props.load(input);
            String value = props.getProperty(key);
            System.out.println(key + "->\t\t" + value);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
