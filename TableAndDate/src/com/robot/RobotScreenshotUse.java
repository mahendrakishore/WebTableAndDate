package com.robot;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RobotScreenshotUse {
	
	WebDriver driver;
	@Test
	public void robot() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		 driver.get("http://www.facebook.com");
		 String title = driver.getTitle();
	 Assert.assertTrue(title.contains("abc"));		
	}
@AfterMethod()
public void robotSceenshot(ITestResult result){
	if(ITestResult.FAILURE==result.getStatus()){
		try {
			RobotScreenshot.robotScreenshot("test1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	
}
