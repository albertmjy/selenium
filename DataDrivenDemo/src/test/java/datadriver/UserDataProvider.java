package datadriver;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by albert on 17/03/2017.
 */
public class UserDataProvider {
    @DataProvider(name = "userdata")
    public static Object[][] createData(Method method){

        Object[][] dataobj = readExcelData("/Users/albert/Documents/data.xlsx", "UC_1");

        return dataobj;
    }

    private static Object[][] readExcelData(String datafile, String sheetName){
        Object[][] dataobject;

        try {
            // read file
            FileInputStream excel = new FileInputStream(new File(datafile));
            XSSFWorkbook wb = new XSSFWorkbook(excel);
            Sheet sheet = wb.getSheet(sheetName);

            // get col num & row num, create Object[][]
            int rowCount = sheet.getPhysicalNumberOfRows();
            int cCount = sheet.getRow(0).getPhysicalNumberOfCells();
            dataobject = new Object[rowCount][cCount];

            // store the data
            for (int i = 0; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                int colCount = row.getPhysicalNumberOfCells();

                // get cell data in each row
                Object[] obj = new Object[colCount];
                for (int j = 0; j < colCount; j++) {
                    row.getCell(j).setCellType(CellType.STRING);
                    obj[j] = row.getCell(j).getStringCellValue();

                    dataobject[i][j] = obj[j];
                }
            }

            wb.close();
            excel.close();

            return dataobject;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
