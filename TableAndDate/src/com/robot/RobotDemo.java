package com.robot;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotDemo {
	WebDriver driver;
	@Test
	public void robot() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		 driver.get("http://www.facebook.com");
		 driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("abc");
		 driver.findElement(By.xpath(".//input[@id='pass']")).sendKeys("abc");
		 //driver.findElement(By.xpath(".//input[@id='u_0_r']")).click();
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		
	}

}
