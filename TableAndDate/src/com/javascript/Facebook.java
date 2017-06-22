package com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
	    driver.get("https://www.facebook.com/login/");	
	  
		//WebElement we2 = driver.findElement(By.xpath(".//input[@id='email']"));
		jse.executeScript("document.getElementById('email').value='mahenn';");
        
		//WebElement we3 = driver.findElement(By.xpath(".//input[@id='pass']"));
	    jse.executeScript("document.getElementById('pass').value='xyz123';");
	    
		WebElement we4 = driver.findElement(By.xpath(".//button[@id='loginbutton']"));
		jse.executeScript("arguments[0].click();",we4);
		//jse.executeScript("document.getElementById('loginbutton').click();");
		  
		
	}

}
