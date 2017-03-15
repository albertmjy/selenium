package com.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import uimap.UIHomePage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
//        System.out.println(UIHomePage.radioRoundTrip);

//        FirstWebDriver first = new FirstWebDriver();
//        first.basicDemo();

//        PropertiesDemo propertiesDemo = new PropertiesDemo();
////        propertiesDemo.printAll();
//        propertiesDemo.getProp("home.btn.submit");

//        JsExecutor jsExecutor = new JsExecutor();
//        jsExecutor.basicExec();
//        jsExecutor.returnDom();
//        jsExecutor.scroll();
        // todo: binding event
//         DatabaseDemo db = new DatabaseDemo();
//         db.query();
//         db.modify();
//        db.preparedStmt();


        // todo: selenium server
        // todo: selenium grid

        // todo: TestNG, reportNG
        // todo: Maven
        // todo: keyword-driven, data-driven
        // todo: my own framework
        // todo: selenid plugin framework

//        first.withCookies();
//        first.syncDemo();

//        ScreenshotDemo screen = new ScreenshotDemo();
//        screen.captureScreen();
//        screen.captureElement();

//        PageObjectDemo pageObjectDemo = new PageObjectDemo();

//        pageObjectDemo.googlePageSearch();
//        pageObjectDemo.googleSearchWithAnnotation();

        RemoteDemo remoteDemo = new RemoteDemo();

        remoteDemo.runRemote();

    }
}
