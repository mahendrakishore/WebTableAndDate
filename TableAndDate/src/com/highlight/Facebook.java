package com.highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver ;
	@Test
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");	    
		WebElement we2 = driver.findElement(By.xpath(".//input[@id='email']"));
		HighLight.highLightElement(driver, we2);
		we2.sendKeys("abd@gmail.com");
		WebElement we3 = driver.findElement(By.xpath(".//input[@id='pass']"));
		HighLight.highLightElement(driver, we3);
		we3.sendKeys("1234");
		WebElement we4 = driver.findElement(By.xpath(".//button[@id='loginbutton']"));
		HighLight.highLightElement(driver, we4);
		we4.click();
		
		
	}

}
