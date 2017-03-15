package listener.testng;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.TestListenerAdapter;

/**
 * Created by albert on 09/03/2017.
 */
public class MyListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr){
        System.out.println("____________________________");
        Reporter.log("<br />onTestFail<hr />");
        tr.setStatus(2);

    }

    @Override
    public void onTestSkipped(ITestResult tr){
        System.out.println("____________________________");
        Reporter.log("***************************");
    }

    @Override
    public void onTestSuccess(ITestResult tr){
        System.out.println("____________________________");

        Reporter.log("<br />onTestSuccess<hr /");
    }
}
