package com.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationAutoITDemo {

	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium drivers\\geckodriver.exe");		
		driver = new FirefoxDriver();		
		driver.get("http://www.engprod-charter.net/");
		Runtime.getRuntime().exec("C:\\Users\\mahen\\Desktop\\AutoIT\\Auth1.exe");


	}

}
