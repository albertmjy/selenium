package com.example;

//import org.apache.poi.hssf.


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by albert on 04/03/2017.
 */
public class POIDemo {

//    private String excelPath = "";

    public static void main(String[] args){
        POIDemo poiDemo = new POIDemo();
//        poiDemo.retriveAll();
//        poiDemo.frequentMethods();
//        poiDemo.readTestData();
//        poiDemo.readTestData(3);
        poiDemo.readTestData(3, "Email");
    }

//    public POIDemo(String path){
//        this.excelPath = path;
//    }

    public void readTestData(){
        try {
            FileInputStream excel = new FileInputStream(new File("/Users/albert/Documents/data.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(excel);

            Sheet datasheet = wb.getSheetAt(1);
            Row variableNames = datasheet.getRow(0);
            Row variableValues = datasheet.getRow(1);

            int cols = variableNames.getPhysicalNumberOfCells();
            for (int i = 0; i < cols; i++) {
                System.out.println("key: " + variableNames.getCell(i) + ", value: " + variableValues.getCell(i));
            }

            wb.close();
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTestData(int row){
        try {
            FileInputStream excel = new FileInputStream(new File("/Users/albert/Documents/data.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(excel);

            Sheet datasheet = wb.getSheetAt(1);
            Row variableNames = datasheet.getRow(0);
            Row variableValues = datasheet.getRow(row);

            int cols = variableNames.getPhysicalNumberOfCells();
            for (int i = 0; i < cols; i++) {
                System.out.println("key: " + variableNames.getCell(i) + ", value: " + variableValues.getCell(i));
            }

            wb.close();
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTestData(int row, String variableName){
        try {
            FileInputStream excel = new FileInputStream(new File("/Users/albert/Documents/data.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(excel);

            Sheet datasheet = wb.getSheetAt(1);
            Row variableNames = datasheet.getRow(0);
            Row variableValues = datasheet.getRow(row);

//            int cols = variableNames.getPhysicalNumberOfCells();
//            for (int i = 0; i < cols; i++) {
//                System.out.println("key: " + variableNames.getCell(i) + ", value: " + variableValues.getCell(i));
//            }
            for (Cell cell : variableNames) {
                if (variableName.equals(cell.getStringCellValue())) {
                    int idx = cell.getColumnIndex();
                    System.out.println(cell + ": " + variableValues.getCell(idx));
                }
            }

            wb.close();
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void frequentMethods(){
        try {

            FileInputStream excel = new FileInputStream(new File("/Users/albert/Documents/data.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(excel);


            Sheet sheet1 = wb.getSheetAt(0);
            Sheet sheet2 = wb.getSheet("Sheet2");

            int nOfRows = sheet1.getPhysicalNumberOfRows();
            int firstRowNum = sheet1.getFirstRowNum();
            int lastRowNum = sheet1.getLastRowNum();
            System.out.println("Num of rows: " + nOfRows + ", first row num: " + firstRowNum + ", last row num: " + lastRowNum);

            Row row1 = sheet2.getRow(1);
            int nOfCells = row1.getPhysicalNumberOfCells();
            Cell cell1 = row1.getCell(1);
            String cellValue = cell1.getStringCellValue();

            System.out.println("Num of cells: " + nOfCells + ", cell value: " + cellValue);

            wb.close();
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void retriveAll(){
        try {
            FileInputStream excel = new FileInputStream(new File("/Users/albert/Documents/data.xlsx"));
            XSSFWorkbook wb = new XSSFWorkbook(excel);
            Sheet sheet = wb.getSheetAt(1);

            int num = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Num: " + num);

            Cell cell = sheet.getRow(1).getCell(4);
            System.out.println(cell.getStringCellValue());


            Iterator<Row> iter = sheet.rowIterator();

            while (iter.hasNext()){
                Row row = iter.next();
                Iterator<Cell> cellIter = row.cellIterator();
                while (cellIter.hasNext()){
                    Cell c = cellIter.next();
                    c.setCellType(CellType.STRING);
                    System.out.print(c.getStringCellValue() + ",\t");
                }
                System.out.println();
            }


//            for (Row row : sheet) {
//                for (Cell c: row){
//                    // read string when string, num when num
//                    if(c.getCellTypeEnum() == CellType.STRING){
//                        System.out.print(c.getStringCellValue() + ", ");
//                    } else {
//                        System.out.print(c.getNumericCellValue() + ", ");
//                    }
//
//                    // set all to string
//                    //                c.setCellType(CellType.STRING);
//                    //                System.out.print(c.getStringCellValue() + ", ");
//                }
//                System.out.println();
//            }
            wb.close();
            excel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
