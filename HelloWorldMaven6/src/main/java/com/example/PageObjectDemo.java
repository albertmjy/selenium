package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import service.pageobject.ComplexPageObject;
import service.pageobject.GooglePage;

/**
 * Created by albert on 13/03/2017.
 */
public class PageObjectDemo {


    public void googlePageSearch(){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");



        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);

        googlePage.searchGoogle("life is not easy");

    }

    public void complexPage(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        ComplexPageObject complexPageObject = new ComplexPageObject("sometext", driver);
        PageFactory.initElements(driver, complexPageObject);

    }

    public void googleSearchWithAnnotation(){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);

        googlePage.searchGoogle2("Ha li Lu Ya");
    }

    public  void googleSearchWithShort(){
        System.setProperty("webdriver.chrome.driver", "/Users/albert/Lib/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);

        googlePage.searchGoogle2("谁是世界上最美的人？");
    }
}
