package service.testdata;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.Iterator;

/**
 * Created by albert on 09/03/2017.
 */
public class UserDataProvider {
    @DataProvider(name = "userdata")
    public static Object[][] createData(Method method){
        System.out.println(method.getName() + "->");

        return new Object[][]{
                {"Java", new Integer(13)},
                {"Selenium", new Integer(15)},
                {"Selenium", new Integer(15)},
                {"Selenium", new Integer(15)},
                {"Selenium", new Integer(15)},
                {"Selenium", new Integer(15)}
        };
    }

//    @DataProvider(name = "excel")
//    public static Iterator<Object[]> createData2() {
//        return new MyIterator(DATA);
//    }

}
