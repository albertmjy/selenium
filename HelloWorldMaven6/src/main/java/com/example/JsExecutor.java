package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;

/**
 * Created by albert on 05/03/2017.
 */
public class JsExecutor {

    public void basicExec(){
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();
        ((JavascriptExecutor)driver).executeScript("alert('life is not easy!')");
    }

    public void returnDom(){
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");


        WebElement element = driver.findElement(By.id("id_of_element"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

//        WebElement element = driver.findElement(By.id("my-id"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element);
//        actions.perform();

        // dom
//        ((JavascriptExecutor)driver).executeScript("" +
//                "var el = document.getElementById('js_flight_domestic_searchbox');" +
//                "var html = el.innerHTML;" +
//                "document.write(html)");

//        WebElement element = (WebElement) ((JavascriptExecutor)driver).executeScript("return document.getElementById('js_flight_domestic_searchbox')");
//        String tagName = element.getTagName();
//        System.out.println(tagName);

//        WebElement el = driver.findElement(By.id("js_flight_domestic_searchbox"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", el);

        // dom list
        java.util.List<WebElement> labels = driver.findElements(By.tagName("label"));
        java.util.List<WebElement> inputs = (java.util.List<WebElement>) ((JavascriptExecutor)driver).executeScript(
                "var labels = arguments[0], inputs = []; for (var i=0; i < labels.length; i++){" +
                        "inputs.push(document.getElementById(labels[i].getAttribute('for'))); } return inputs;", labels);

    }

    public void scroll(){
        System.setProperty("webdriver.gecko.driver", "/Users/albert/Lib/geckodriver");
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.qunar.com");


        WebElement element = driver.findElement(By.id("js_b_piao_recommend"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();


        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.mouseMove(1, 2);
            robot.mouseWheel(1);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        // js scroll

    }

    public void execAsync(){

    }

    public void bindEventHandler(){

    }
}
