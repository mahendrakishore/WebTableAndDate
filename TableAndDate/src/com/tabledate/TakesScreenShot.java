package com.tabledate;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class TakesScreenShot {

	WebDriver driver ;
	@Test
	public void screenShot() throws Exception{
		
		 System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("testscreenshot");
		 Utility.screenshot(driver, "fb1");
		 driver.quit();
		 driver.close();
	}
}
