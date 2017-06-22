package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdOnlyForSendKey {
	WebDriver driver ;
	@Test
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("http://seleniumpractise.blogspot.in/2016/09/how-to-work-with-disable-textbox-or.html");
		//driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("abc");
		jse.executeScript("document.getElementByName('lname').value='123456';");
		
	}

}
