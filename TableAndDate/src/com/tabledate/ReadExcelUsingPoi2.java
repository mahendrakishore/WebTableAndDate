package com.tabledate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class ReadExcelUsingPoi2 {
	
public static void main(String[] args) throws Exception {
	
			File file = new File("./src/com/selenium/tution/testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);	
		int rowsize = ws.getLastRowNum();
		for(int i = 0 ;i<=rowsize;i++){
			String username = ws.getRow(i).getCell(0).getStringCellValue();
	        String password = ws.getRow(i).getCell(1).getStringCellValue();
	        System.out.println(username+"\t"+password);
	
			}}
	}


