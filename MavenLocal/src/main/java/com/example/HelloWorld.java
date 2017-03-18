package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by albert on 16/03/2017.
 */
public class HelloWorld {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.qunar.com");
    }
}
