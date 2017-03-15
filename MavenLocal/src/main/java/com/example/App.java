package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {

        logger.debug("debug message");
        logger.info("start my test");
        logger.error("error error?????");
        logger.trace("trttttttt");
        logger.fatal("fafaf");
        logger.warn("fffff");

    }
}
