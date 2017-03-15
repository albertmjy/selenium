package com.example;

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

    @Test
    public void run(){

//        open("http://");
//        textbox("gfdgdsf").edit("dsfdsf");
//        selectbox("dfsdf").select("dfsdf");
//        tab("fdfsdf").select("dfdfs");


    }

    private void open(String url){
        driver = new ChromeDriver();
        driver.get(url);
    }
}
