package com.javascript;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NotVisibleElement {
	WebDriver driver ;
	WebElement ele;
	@Test
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		String js = "arguments[0].style.visiblity='visible';";
		jse.executeScript(js, ele);
		ele.click();
		
	}

}
