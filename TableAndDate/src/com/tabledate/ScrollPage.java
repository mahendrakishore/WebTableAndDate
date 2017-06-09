package com.tabledate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPage {

	WebDriver driver ;
	
	@Test
	public void scroll(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1200)");
	}
}
