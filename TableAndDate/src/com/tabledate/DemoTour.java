package com.tabledate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoTour {
	
	WebDriver driver;
	@Test()
	public void Login(){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.navigate().refresh();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("batman1");
		driver.findElement(By.name("password")).sendKeys("batman1");
		driver.findElement(By.name("login")).click();
		
		List<WebElement> radios = driver.findElements(By.name("tripType"));
		int rs = radios.size();
		for(int i=0;i<rs;i++){
			if(radios.get(i).getAttribute("value").equals("oneway")){
				radios.get(i).click();	}		}	}

	@Test
	public void test(){
		Actions actions = new Actions(driver);
		WebElement we1 = driver.findElement(By.xpath(""));
		WebElement we2 = driver.findElement(By.xpath(""));
		actions.dragAndDrop(we1, we2);
		actions.moveToElement(we2);
	}
	
}
