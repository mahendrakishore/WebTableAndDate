package com.Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;
	@BeforeMethod
	public void init(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://mahendrakishore.trials621.orangehrmlive.com");
		Reporter.log("@BeforeMethod", true);
			}
	
	
	@AfterMethod
	public void close(){
		driver.quit();
		Reporter.log("@AfterMethod", true);
	}
}
