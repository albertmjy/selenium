package com.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by albert on 06/03/2017.
 */
public class ScreenshotDemo {

    public void captureScreen(){
        // pre-config
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        // start
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");

        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        System.out.println(srcFile.getPath());
        try {
            FileUtils.copyFile(srcFile, new File("/Users/albert/Documents/screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void captureElement(){
        // pre-config
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        // start
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");
        driver.manage().window().fullscreen();

        WebElement element = driver.findElement(By.id("js_flight_domestic_searchbox"));
        File srcFile = element.getScreenshotAs(OutputType.FILE);
        System.out.println(srcFile.getPath());
        try {
            FileUtils.copyFile(srcFile, new File("/Users/albert/Documents/elementScreenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void captureFullPage(){

    }
}
