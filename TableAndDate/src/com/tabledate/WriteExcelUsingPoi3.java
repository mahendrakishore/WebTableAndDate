package com.tabledate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jxl.Workbook;

public class WriteExcelUsingPoi3 {
	
public static void main(String[] args) throws Exception {
	
			File file = new File("./src/com/selenium/tution/testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheetAt(0);	
		/*int rowsize = ws.getLastRowNum();
		for(int i = 0 ;i<=rowsize;i++){
			String username = ws.getRow(i).getCell(0).getStringCellValue();
	        String password = ws.getRow(i).getCell(1).getStringCellValue();
	        System.out.println(username+"\t"+password);
			}*/
		ws.getRow(0).createCell(2).setCellValue("colum3");
		ws.getRow(0).createCell(3).setCellValue("colum4");
		
		FileOutputStream fos = new FileOutputStream(file);
		 
	    wb.write(fos);
	    ws.getRow(0).createCell(4).setCellValue("colum5");
		ws.getRow(0).createCell(5).setCellValue("colum6");
		wb.close();
		
		System.out.println(ws.getRow(0).getCell(4).getStringCellValue());
		System.out.println(ws.getRow(0).getCell(5).getStringCellValue());
}

	}


