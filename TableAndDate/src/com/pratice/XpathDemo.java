package com.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class XpathDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
     //System.setProperty("webdriver.gecko.driver", "C:\\selenium drivers\\geckodriver.exe");
     System.setProperty("webdriver.ie.driver", "C:\\selenium drivers\\IEDriverServer.exe");
		
		//driver.get("https://www.ultimateqa.com/complicated-page/");
		//driver.findElement(By.xpath("//*[@class='et_pb_button  et_pb_button_0 et_pb_module et_pb_bg_layout_light'][text()='Button']")).click();
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	  //driver = new ChromeDriver(capabilities);
	  //driver = new FirefoxDriver(capabilities);
	  driver = new InternetExplorerDriver(capabilities);
	  driver.get("https://www.cacert.org/");
	}

}
