package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
 WebDriver  driver;
	
	By username = By.id("user_login");
	By password = By.id("user_pass");
	By login = By.id("wp-submit");
	
	public Login(WebDriver driver){
		this.driver = driver;
	}
	
	public void login(String userid , String pass){
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
	}
}
