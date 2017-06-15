package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPF {
 WebDriver  driver;

	@FindBy(how=How.ID,using="user_login")
	@CacheLookup
			WebElement username;
	
	@FindBy(id="user_pass")
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.ID,using="wp-submit" )
	@CacheLookup
	WebElement login;
	
	@FindBy(how=How.LINK_TEXT,using="https://wordpress.com/wp-login.php?action=lostpassword")
	@CacheLookup
	WebElement forget;
	
	public LoginPF(WebDriver driver){
		this.driver = driver;
	}
	
	public void login(String userid , String pass){
		username.sendKeys(userid);
		password.sendKeys(pass);
		login.click();
		forget.click();
	}
}
