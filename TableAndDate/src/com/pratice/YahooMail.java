package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class YahooMail {

	WebDriver driver ;
	@Test
	public void login() throws Exception{
/*		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver", "C:\\selenium drivers\\geckodriver.exe");		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/beta/");
		Actions actions = new Actions(driver);
		WebElement we = driver.findElement(By.xpath(".//input[@id='persistent']"));
		actions.moveToElement(we).click().build().perform();
	
	}
}
