package com.tabledate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TripAdvisor {
	
	WebDriver driver ;
	
	@Test
	public void selectDate() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tripadvisor.in/");
		driver.findElement(By.xpath(".//div[@class='prw_rup prw_search_typeahead ui_column is-3 search_typeahead wctx-tripsearch']/div/span/input")).sendKeys("pune");
	    driver.findElement(By.xpath(".//*[@id='taplc_trip_search_home_default_0']/div[2]/div[2]/div/span[1]/span[1]")).click();
	    Thread.sleep(5000);
	    
	     String selectdate = "2/Jul 2017";
	     String[] split = selectdate.split("/");
	     String date = split[0];
	     String year = split[1];
	     
	   List<WebElement> months = driver.findElements(By.xpath(".//div[@class='dsdc-months']/child::span[@class='dsdc-month']/span[@class='dsdc-month-title']"));
	 	   for(int i = 0;i<months.size();i++){
		   String monthnames = months.get(i).getText();
		   System.out.println(monthnames);
		   if(year.equals(monthnames)){
			   List<WebElement> dates = driver.findElements(By.xpath(".//div[@class='dsdc-months']/span[2]/span[@class='dsdc-cell dsdc-day']"));
			   for(WebElement we :dates ){
				      if(we.getText().equals(date)){
					   System.out.println(we.getText());
					   we.click(); }
			   }
		   }
	   }
	
	}

}
