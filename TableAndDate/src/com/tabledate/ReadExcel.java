package com.tabledate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import jxl.Workbook;

public class ReadExcel {
	
	public static void main(String[] args) throws Exception {
		File file = new File("./src/com/selenium/tution/xlsexample.xls");
		Workbook wb = Workbook.getWorkbook(file);
		/*	String[] sheetName = wb.getSheetNames();
		int flag=0;
				for(String s :sheetName){
					if(s.equals("Data")){
					System.out.println(s);
					flag++;}
					if(flag==0) {
						System.out.println("no sheet");
					}
				}*/
		String data00	=wb.getSheet("Data").getCell(0, 0).getContents();
		System.out.println(data00);
		String data10= wb.getSheet(0).getCell(1, 0).getContents();
		System.out.println(data10);
		int rows = wb.getSheet(0).getRows();
		System.out.println(rows);
				
		
	}
}
