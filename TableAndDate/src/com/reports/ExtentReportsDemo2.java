package com.reports;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsDemo2 {

	static ExtentReports reports ;
	ExtentTest test;
	WebDriver driver;
	static Calendar calendar;
	static SimpleDateFormat format;
	
	static{
		 calendar = Calendar.getInstance(); 
		 format = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		//reports = new ExtentReports("C:\\Screenshot\\ExtentReports\\fail.html",false);
		reports = new ExtentReports(System.getProperty("user.dir")+"/report/test"+format.format(calendar.getTime())+".html",false);
	}
	
	@BeforeMethod
	public void beforeMethod(){
		test = reports.startTest("verify test");	
		test.log(LogStatus.INFO, "before each method");
	}
	
	@Test
	public void verify(){		
			
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "browser started");
		
		driver.get("http://learn-automation.com/");
		test.log(LogStatus.INFO, "goign to website");
		String title = driver.getTitle();
		
		Assert.assertTrue(title.contains("learn"));
		test.log(LogStatus.INFO,"title verified");
	}
	
	@AfterMethod
	public void teaDown(ITestResult result) throws Exception{
		if(result.getStatus()==ITestResult.FAILURE)
		    {
			String sspath = ScreenShot.takesScreenshot(driver, result.getName());
			//test.log(LogStatus.FAIL, "test cases fail", test.addScreenCapture(sspath));
			test.log(LogStatus.FAIL, "test cases fail", sspath);
			Thread.sleep(5000);
			}
			//test.addScreenCapture(sspath);
			reports.endTest(test);
			reports.flush();
			//driver.get("C:\\Screenshot\\ExtentReports\\fail.html");
			driver.get(System.getProperty("user.dir")+"/report/test"+format.format(calendar.getTime())+".html");
			}
		
	

}
