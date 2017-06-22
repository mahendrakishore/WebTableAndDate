package com.robot;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MonsterFileUpload {

	WebDriver driver ;
	@Test
	public void login() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://my.monsterindia.com/create_account.html?ru=1");
	    Thread.sleep(5000);
	    String parent = driver.getWindowHandle();
	    Set<String> wins  = driver.getWindowHandles();
	    Iterator<String> itr = wins.iterator();
	    while(itr.hasNext()){
	    	String child = itr.next();
	    	if(!parent.equalsIgnoreCase(child)){
	    		driver.switchTo().window(child);
	    	driver.close();
	    	}
	    	}
	    driver.switchTo().window(parent);
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("scroll(0,400)");
	    driver.findElement(By.xpath(".//input[@id='wordresume']")).click();
	    MosterRobotFileUploadCode.robotFileUpload("C:\\Users\\mahen\\Desktop\\JavaExercise.docx");
	    driver.findElement(By.xpath(".//input[@id='wordresume']")).click();
	    MosterRobotFileUploadCode.robotFileUpload("");
	    
	    }
	    
	
}
