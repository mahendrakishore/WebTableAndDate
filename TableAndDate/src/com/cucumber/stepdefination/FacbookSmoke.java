package com.cucumber.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.highlight.HighLight;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FacbookSmoke {
	
	WebDriver driver;
	
	@Given("^start chorme and go to facebook login page$")
	public void start_chorme_and_go_to_facebook_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/login/");
	    driver.manage().window().maximize();
	}

/*	@When("^user enter usename and password$")
	public void user_enter_usename_and_password()*/ 
	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws Throwable {
		WebElement we2 = driver.findElement(By.xpath(".//input[@id='email']"));
			we2.sendKeys(arg1);
			WebElement we3 = driver.findElement(By.xpath(".//input[@id='pass']"));
			we3.sendKeys(arg2);
			
	}

	@Then("^facebook home page displayed$")
	public void facebook_home_page_displayed() throws Throwable {
		String title = driver.getTitle();
		WebElement we4 = driver.findElement(By.xpath(".//button[@id='loginbutton']"));
		we4.click();
		//Assert.assertEquals(title,"Log in to Facebook | Facebook");
        //Assert.assertTrue(title.contains("Facebook"));
	}

}
