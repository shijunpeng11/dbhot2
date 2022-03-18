package com.example;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WorkXmlsfo {


    public static void main(String[] args) throws IOException {

        String path ="C:\\Users\\lenovo\\Desktop\\demo";
   //创建工作普
        HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
//创建工作表
        HSSFSheet sheet = hssfWorkbook.createSheet("循环");
        for (int i = 0; i < 6536; i++) {
            HSSFRow row = sheet.createRow(i);
            for (int j = 0; j < 10; j++) {
                HSSFCell cell = row.createCell(j);
                cell.setCellValue(j);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(path + "05.xlsx");
        hssfWorkbook.write(fileOutputStream);
        fileOutputStream.close();



    }
}
