package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

static WebDriver driver;

public static WebDriver selectBrowser(String browesrname,String url){
	
	if(browesrname.toLowerCase().equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browesrname.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium drivers\\geckodriver-v0.15.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browesrname.equalsIgnoreCase("ie")){
		System.setProperty("webdriver.ie.driver", "C:\\selenium drivers\\IEDriverServer_Win32_3.3.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	else{
		System.out.println("worng browser choice");
	}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
}

}
