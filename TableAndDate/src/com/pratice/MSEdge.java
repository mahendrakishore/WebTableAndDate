package com.pratice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class MSEdge {

	
	static WebDriver driver ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver", "C:\\selenium drivers\\edgedriver.exe");		
		driver = new EdgeDriver();
	}

}
