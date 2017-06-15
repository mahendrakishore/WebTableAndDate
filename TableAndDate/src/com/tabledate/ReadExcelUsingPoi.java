package com.tabledate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class ReadExcelUsingPoi {
	XSSFWorkbook wb ;

	  
	ReadExcelUsingPoi(String path) { //./src/com/selenium/tution/testdata.xlsx
				try{File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		 wb = new XSSFWorkbook(fis);
				}catch(Exception e){
			System.out.println("excel file Exception");
		}}
			
			public String getExcelData(int s,int r,int c){
		String data = wb.getSheetAt(s).getRow(r).getCell(c).getStringCellValue();
	return data;}
			
			public int getRowNumber(int s){
				int num = wb.getSheetAt(s).getLastRowNum();
				num = num+1;
				return num;
			}
	}


