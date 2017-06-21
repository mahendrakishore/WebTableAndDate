package com.pratice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowSwitch {
	
	 WebDriver driver;
	
	@Test
	public void switchwin() throws Exception {	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
	WebElement we =	driver.findElement(By.xpath("//*[contains(text(),'Learn more')]"));
	we.click();
	String parwin = driver.getWindowHandle();
	Set<String> wins = driver.getWindowHandles();
	Iterator<String> itr = wins.iterator();
	while(itr.hasNext()){
		String childwin = itr.next();
		if(!parwin.equalsIgnoreCase(childwin)){
			System.out.println(childwin);
			driver.switchTo().window(childwin);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	driver.switchTo().window(parwin);
	
	}
}
