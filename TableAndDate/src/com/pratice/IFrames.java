package com.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrames {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com/");
		Thread.sleep(5000);
		//int iframesize = driver.findElements(By.tagName("iframe")).size();
		driver.switchTo().defaultContent();
		//driver.findElement(By.xpath(".//*[contains(@id,'webklipper-publisher-widget-container-notification-close-div')]/span")).click();
	driver.findElement(By.xpath(".//*[contains(@class,'_pop_close _pop_reg_bg')][@onclick='closelogin();']")).click();
	}
}
