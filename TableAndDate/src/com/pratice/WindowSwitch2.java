package com.pratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowSwitch2 {
	
	 WebDriver driver;
	
	@Test
	public void switchwin() throws Exception {	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
	String parentwin = driver.getWindowHandle();
	driver.findElement(By.xpath("//*[contains(text(),'Learn more')]")).click();
	Set<String> wins = driver.getWindowHandles();
	Iterator<String> itr = wins.iterator();
	while(itr.hasNext()){
		String childwin = itr.next();
		if(!parentwin.equalsIgnoreCase(childwin)){
			driver.switchTo().window(childwin);
			Thread.sleep(5000);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	
	driver.switchTo().window(parentwin);
	}
}
