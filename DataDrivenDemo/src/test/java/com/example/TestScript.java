package com.example;

import datadriver.UserDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by albert on 12/03/2017.
 */
public class TestScript {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");
    }

    @Test(dataProvider = "userdata", dataProviderClass = UserDataProvider.class)
    public void run(String id, String name, String phone, String email, String comment){
        System.out.println(id + ", " + name + ", " + phone + ", " + email + ", " + comment) ;
    }


    private void open(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }
}
