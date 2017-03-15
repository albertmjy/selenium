package com.example;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Created by albert on 15/03/2017.
 */
public class TestLog4j {
    private Logger logger = Logger.getLogger(TestLog4j.class.getName());

    @Test
    public void run(){
        logger.info("hehehe");

    }
}
