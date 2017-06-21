package com.listener;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=TestngListener.class)
public class ListenerTest {
	
	WebDriver driver;
	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com/");
		System.out.println(driver.getTitle());
	}

	@Test
	public void test2(){
		Assert.assertTrue(false);
	}
}
