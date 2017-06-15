package com.Script;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log4jInvalidLogin2 extends Log4jBaseClass2{

	@Test(description="invalid login")
	public void invalidLogin(){
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("JaSmPYb2");
		driver.findElement(By.id("btnLogin")).click();
		//Reporter.log("@Test", true);
		logger.info("@Test valid login");
	}
	
	@Test(description="valid login")
	public void validLogin(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("[JaSmPYb2]");
		driver.findElement(By.id("btnLogin")).click();
		//Reporter.log("@Test", true);
		logger.info("@Test invalid login");
	}
}
