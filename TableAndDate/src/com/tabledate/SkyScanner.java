package com.tabledate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SkyScanner {
	
	WebDriver driver ;
	
	@Test
	public void selectDate() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.skyscanner.co.in/");
        driver.findElement(By.xpath(".//*[@id='js-depart-input']")).click();
		Thread.sleep(5000);
		
		String date = "1/July 2017";
		String[] split = date.split("/");
		String selectdate = split[0];
		String selectmonth = split[1];
		
		//==-=code for month select
		WebElement calmonth = driver.findElement(By.xpath(".//div[@class='calendar-info-bar datepicker_clearfix']/span[@class='current']"));
		String currentmonth = calmonth.getText();
	    
	    	if(currentmonth.equals(selectmonth)){
	    		driver.findElement(By.linkText(selectdate)).click();
	    	}
	    	else{
	    		System.out.println("month not found");
	    		for(int i = 0 ;i<11;i++){
	    			driver.findElement(By.xpath(".//div[@class='calendar-info-bar datepicker_clearfix']/button[@class='next']")).click();
	    			Thread.sleep(1000 );
	    			calmonth = driver.findElement(By.xpath(".//div[@class='calendar-info-bar datepicker_clearfix']/span[@class='current']"));
	    			currentmonth = calmonth.getText();
	    			if(currentmonth.equals(selectmonth)){
	    				System.out.println("selected month"+currentmonth);
	    	    		   break; 	    		
	    	    	}
	    		}
	    	}
	    
	    	//=======code for date 
	    	 List<WebElement> dates = driver.findElements(By.xpath(".//div[@class='dsdc-months']/span[2]/span[@class='dsdc-cell dsdc-day']"));
			   for(WebElement we :dates ){
				      if(we.getText().equals(selectdate)){
					   System.out.println(we.getText());
					   we.click(); }}
	    }
	}
	  

