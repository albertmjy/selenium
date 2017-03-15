package lib.unit;

import org.testng.Reporter;

/**
 * Created by albert on 11/03/2017.
 */
public class TestLog {
    public void log(String s){
        System.out.println(s);
        Reporter.log(s);
    }
}
