package com.wordpress.script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.Login;
import com.wordpress.pages.LoginPF;

public class TestLogin {
	
	WebDriver driver ;
	
	@Test
	public void loginTest(){		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wordpress.com/wp-login.php");
		Login login = new Login(driver);
		login.login("mahendrakblog", "wordpress");
		
	}

}
