package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchMultipleTimeWebElement {

	public static void main(String[] args) {
	
		WebDriver driver =null ;
		WebElement we2 =null;
			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/login/");
			 we2 = driver.findElement(By.xpath(".//input[@id='email']"));
			for(int i=0;i<3;i++)
			{
			try{
				we2 =driver.findElement(By.xpath(".//input[@id='email']"));
			break;
			}
			catch(Exception e)
			{
			try 
			{
			Thread.sleep(1000);
			} catch (InterruptedException e1) 
			{
			System.out.println("Waiting for element to appear on DOM");
			}
			}

			}
System.out.println(we2.getText());
	}

}
