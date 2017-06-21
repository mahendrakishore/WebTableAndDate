package com.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");       	
		driver = new ChromeDriver();
		driver.get("https://wordpress.com/wp-login.php");
        driver.findElement(By.cssSelector("input[id='user_login'][class='input']")).sendKeys("xyz");
        driver.findElement(By.cssSelector("#user_pass")).sendKeys("abc");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#wp-submit")).click();
        
	}

}
