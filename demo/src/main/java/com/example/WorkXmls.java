package com.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkXmls {


    public static void main(String[] args) throws IOException {

        String path ="C:\\Users\\lenovo\\Desktop\\demo";
        //创建工作薄
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
        //创建一个工作表
        HSSFSheet sheet = hssfWorkbook.createSheet("工作1");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(1);
        cell.setCellValue("哈哈哈");
        FileOutputStream fileOutputStream = new FileOutputStream(path + "03.xlsx");
        hssfWorkbook.write(fileOutputStream);

        fileOutputStream.close();
        System.out.println("==============");

    }
}
