package com.tabledate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll {


	WebDriver driver ;
	
	@Test
	public void scrollTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement we = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[4]"));
		jse.executeScript("arguments[0].scrollIntoView(true);",we);
		System.out.println(we.getText());
}
	}
