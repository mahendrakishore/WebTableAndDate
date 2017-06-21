package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class AssertDemo {

	
	 WebDriver driver ;
	
@Test
public void asserd() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/");
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
		driver.findElement(By.xpath(".//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		//String wrongmsg = driver.findElement(By.xpath(".//div[contains(text(),'Enter an email or phone number')]")).getText();
		String wrongmsg = driver.findElement(By.xpath(".//div[contains(text(),'Enter an email or phone number')]")).getAttribute("innerHTML");
		System.out.println(wrongmsg);
		Assert.assertEquals("Enter an email or phone number", wrongmsg);
		//Assert.assertTrue(wrongmsg.contains("Enter an email or phone number"));
		}

}
