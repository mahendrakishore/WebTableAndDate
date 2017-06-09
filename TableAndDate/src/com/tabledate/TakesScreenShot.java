package com.tabledate;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import library.Utility;

public class TakesScreenShot {

	WebDriver driver = null;
	@Test
	public void screenShot() throws Exception{
		
		 System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='emailss']")).sendKeys("testscreenshot");
		// Utility.screenshot(driver, "fb2");
	
	}
	
	@AfterMethod	
public void takeScree(ITestResult result){
				if(ITestResult.FAILURE==result.getStatus()){
			Utility.screenshot(driver, "fail");
		}
				driver.quit();
	}
	
	 
}
