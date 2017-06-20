package com.AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeAuthenticationAutoITDemo {

	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
				
		driver.get("http://www.engprod-charter.net/");
		Runtime.getRuntime().exec("C:\\Users\\mahen\\Desktop\\AutoIT\\chromeauth3.exe");


	}

}
