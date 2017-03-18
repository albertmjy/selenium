package com.example;

import org.testng.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;
import org.testng.reporters.TestHTMLReporter;

/**
 * Created by albert on 09/03/2017.
 */
public class DependencyTest {

    SoftAssert softAssert = new SoftAssert();

    @BeforeTest
    public void setup(ITestContext ctx) {
        TestRunner runner = (TestRunner) ctx;
        runner.setOutputDirectory("tstoutput");
    }

    @Test(groups = "setup", alwaysRun = true)
    public void configTest() throws Exception {
        softAssert.fail("life is not easy");
        softAssert.assertTrue(false, "ooooooooooooooookoooo");
//        softAssert.assertAll();
//        Assert.assertTrue(true, "Goal!");
//        throw new Exception("life is not easy");
        Reporter.log("Soft Assert");
        softAssert.assertAll();

    }

    @Test(groups = "setup")
    public void connectionTest(){
        Reporter.log("Report log++++++++++++++++++++++++++<br />");
        Reporter.log("Report log++++++++++++++++++++++++++");
        Reporter.log("level0", 0);
        Reporter.log("level1", 1);
        Reporter.log("level2", 2);
        Reporter.log("level3", 3);

        try {
            Assert.assertTrue(false, "Missed!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        Reporter.log("Report log=============================");

    }

    @Test(dependsOnGroups = "setup", alwaysRun = true)
    public  void query(){
        System.out.println("select * from xxxtable");

        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("<a href='http://www.google.com'>google</a>", 0);
//        Reporter.getCurrentTestResult().setAttribute("warn", "My warning message");
        Logger.getLogger(DependencyTest.class).error("~~~~~~~~~~~~~~~~~~~~~~");
        Logger.getLogger(DependencyTest.class).warn(">>>>>>>>>>>>>>>>>>>>>>");
        Logger.getLogger(DependencyTest.class).info("<<<<<<<<<<<<<<<<<<<<<<");
    }

    @AfterTest
    public void teatdown(){

    }
}
