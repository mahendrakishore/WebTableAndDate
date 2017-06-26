package com.AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	static WebDriver driver ;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("C:\\Users\\mahen\\Desktop\\uploadfile.html");
		driver.findElement(By.name("resumeupload")).sendKeys("C:\\Users\\mahen\\Desktop\\uploadfile.html");
	}
}
