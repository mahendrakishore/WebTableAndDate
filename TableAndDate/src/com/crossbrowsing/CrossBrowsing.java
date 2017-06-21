package com.crossbrowsing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
WebDriver driver;
	
	@Test
	@Parameters("bname")
	public void multipleBrowser(String newbname ) throws Exception{
		if(newbname.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");       	
			driver = new ChromeDriver();
		}
		else if(newbname.equalsIgnoreCase("firefox")){
        	System.setProperty("webdriver.gecko.driver", "C:\\selenium drivers\\geckodriver.exe");       		
        	driver = new FirefoxDriver();
		}
		else if(newbname.equalsIgnoreCase("ie")){
	 System.setProperty("webdriver.ie.driver", "C:\\selenium drivers\\IEDriverServer.exe");       	
        	driver = new InternetExplorerDriver();
        }
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
