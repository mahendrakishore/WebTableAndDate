package com.tabledate;

public class GetDataFromPoiClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadExcelUsingPoi poi = new ReadExcelUsingPoi("./src/com/selenium/tution/testdata.xlsx");
		System.out.println(poi.getExcelData(0, 0, 0));
		
	}

}
