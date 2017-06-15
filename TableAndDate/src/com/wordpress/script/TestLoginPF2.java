package com.wordpress.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.helper.BrowserFactory;
import com.wordpress.pages.Login;
import com.wordpress.pages.LoginPF;
import com.wordpress.pages.LoginPF2;

public class TestLoginPF2 {
	
	WebDriver driver ;
	
	@Test
	public void loginTest(){		
		
		driver = BrowserFactory.selectBrowser("chrome", "https://wordpress.com/wp-login.php");		
		//LoginPF loginpf  =   PageFactory.initElements(driver, LoginPF.class); initilized in the loginpf2 class
		LoginPF2 loginpf2  = new LoginPF2(driver);
		loginpf2.login("mahendrakblog", "wrong");
	}

}
