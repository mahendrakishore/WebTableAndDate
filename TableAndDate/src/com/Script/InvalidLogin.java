package com.Script;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvalidLogin extends BaseClass{

	@Test(description="invalid login")
	public void invalidLogin(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("JaSmPYb2");
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("@Test", true);
	}
	
	@Test(description="valid login")
	public void validLogin(){
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("[JaSmPYb2]");
		driver.findElement(By.id("btnLogin")).click();
		Reporter.log("@Test", true);
	}
}
