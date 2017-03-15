package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by albert on 11/03/2017.
 */
public class TestScriptBase {

    private WebDriver driver;

    @BeforeTest
    public void config(){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");
    }

    @AfterTest
    public void teardown(){
//        Reerpoting...
        if (driver != null){
            driver.quit();
        }
    }

    protected void reportLog(String s){
        Reporter.log(s);
    }
    protected void reportWarning(String s){
        Reporter.log(s);
    }

    protected void screenShot(){
        //...
    }
}
