package com.example;

import lib.keyword.HomePage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by albert on 11/03/2017.
 */
public class TestScript extends TestScriptBase{

    @Parameters({"keyword-file"})
    @Test(alwaysRun = true)
    public void runTestCase(@Optional("keywords.xlsx") String keywordFile){

        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = loader.getResourceAsStream("keywords.xlsx");
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            Sheet uc1Sheet = workbook.getSheet("UC1");
//            for (Row row: uc1Sheet ) {
//                Cell cell = row.getCell(0);
//                System.out.println(cell);
//            }

            int nOfRows = uc1Sheet.getPhysicalNumberOfRows();
            for (int i = 1; i < nOfRows; i++) {
                Row row = uc1Sheet.getRow(i);
                Cell keyword = row.getCell(0);
                Cell locator = row.getCell(1);
                Cell path = row.getCell(2);
                Cell param = row.getCell(3);


                HomePage homePage = new HomePage();
                String p1 = locator==null?"":locator.getStringCellValue();
                String p2 = path==null?"":path.getStringCellValue();
                String p3 = param==null?"":param.toString();

                String[] params = {p1, p2, p3};

                try {
                    Class pClassTypes[] = {String.class, String.class, String.class};
                    Method m = HomePage.class.getDeclaredMethod(keyword.getStringCellValue(), pClassTypes);
                    //... report log here
                    m.invoke(homePage, params);

                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
