package com.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by albert on 14/03/2017.
 */
public class RemoteDemo {

    public void runRemote(){
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        try {
            WebDriver driver = new RemoteWebDriver(
                    new URL("http://localhost:4444/wd/hub"),
                    DesiredCapabilities.chrome()
            );
            driver.get("http://www.google.com");

            WebDriver augmentedDriver = new Augmenter().augment(driver);
            File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(screenshot, new File("screen.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
