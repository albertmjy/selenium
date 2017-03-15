package service.util;

import org.testng.Reporter;

/**
 * Created by albert on 12/03/2017.
 */
public class MyReporter {

    public void pass(String s){
        log("Pass: " + s);
    }

    public void warning(String s){
        log("Warning: " + s);
    }

    public void fail(String s){
        log("Fail: " + s);
    }

    public void log(String s){
        Reporter.log(s);
    }
}
