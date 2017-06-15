package com.tabledate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {

	WebDriver driver ;
	
	@Test(dataProvider ="data")
	public void login(String user, String pass){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wordpress.com/wp-login.php?");
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(user);
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
	}
	
	@DataProvider(name="data" )
	public Object data(){
		Object[][] data2d = new Object[2][2];
		data2d[0][0] = "user1";
		data2d[0][1] = "pass1";
		data2d[1][0] = "mahendrakblog";
		data2d[1][1] = "wordpress";
		return data2d;
	}
}
