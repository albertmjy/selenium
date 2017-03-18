package com.example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import service.testdata.UserDataProvider;

/**
 * Created by albert on 09/03/2017.
 */
public class ParametersTest {

//    @Parameters({"username", "password"})
//    @Test
//    public void dbTest(String user, @Optional("admin") String pwd){
//        System.out.println("username: " + user + ", password: " + pwd);
//    }




    @DataProvider(name = "test1")
    public Object[][] createData(){
        return new Object[][]{
                {"Java", new Integer(13)},
                {"Selenium", new Integer(15)}
        };
    }

    @Test(dataProvider = "userdata", dataProviderClass = UserDataProvider.class)
    public void verifyData(String name, Integer age){
//        System.setProperty("org.uncommons.reportng.escape-output", "false");
        Reporter.log("<a href='http://www.google.com'>google</>");

        System.out.println(name + ": " + age);
        Assert.fail("Life is not easy");
        assert 3==1;
    }
}
