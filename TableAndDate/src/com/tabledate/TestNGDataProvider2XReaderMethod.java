package com.tabledate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import junit.framework.Assert;

public class TestNGDataProvider2XReaderMethod {

	WebDriver driver ;
	
	@Test(dataProvider ="data")
	public void login(String user, String pass) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS); 
		driver.get("https://wordpress.com/wp-login.php?");
		driver.findElement(By.xpath(".//*[@id='user_login']")).sendKeys(user);
		driver.findElement(By.xpath(".//*[@id='user_pass']")).sendKeys(pass);
		driver.findElement(By.xpath(".//*[@id='wp-submit']")).click();
		driver.getCurrentUrl();
		driver.getTitle();
        Thread.sleep(5000);
        Assert.assertTrue("not able to verify title", driver.getTitle().contains("Dashboard"));
        //Assert.assertTrue(driver.getTitle().contains("Dashboard"));
	}
	
	@DataProvider(name="data" )
	public Object[][] data(){
		ReadExcelUsingPoi poi = new ReadExcelUsingPoi("./src/com/selenium/tution/testdata.xlsx");
		int rnum = poi.getRowNumber(0);
		Object[][] data2d = new Object[rnum][2];
		for(int i=0;i<rnum;i++){
		data2d[i][0] = poi.getExcelData(0, i, 0);
		data2d[i][1] = poi.getExcelData(0, i, 1);
		}
		return data2d;
	}
}
