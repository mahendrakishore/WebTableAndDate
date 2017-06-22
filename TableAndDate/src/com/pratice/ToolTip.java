package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTip {

	public static void main(String[] args) {

		WebDriver driver ;
		
			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
			driver = new ChromeDriver();
			driver.manage().window().maximize();			
		    driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		  driver.findElement(By.xpath(".//*[@id='GmailAddress']")).click();
		   WebElement we = driver.findElement(By.xpath("html/body/div[3]"));
		    Actions actions = new Actions(driver);
		    actions.moveToElement(we).perform();
		    System.out.println(we.getText());
	}

}
