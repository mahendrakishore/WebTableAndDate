package com.tabledate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import library.Utility;

public class ScreenshotTest {

	WebDriver driver ;
	
	@Test
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("testscreenshot");
		Utility.screenshot(driver, "test");
		 driver.quit();
		 driver.close();
	}
	
	
	
}
