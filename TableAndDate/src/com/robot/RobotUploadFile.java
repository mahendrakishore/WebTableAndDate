package com.robot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RobotUploadFile {

	WebDriver driver;
	@Test
	public void robot() throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		 //file location to be uploaded
		 StringSelection sel = new StringSelection("C:\\Users\\mahen\\Desktop\\websitetoautomate.txt");
		 
		 //copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		 System.out.println(sel.toString());
		
		 driver.get("file:///C:/Users/mahen/Desktop/uploadfile.html");
		 driver.findElement(By.xpath(".//*[@name='resumeupload']")).click();
		
		 Robot r = new Robot();
		 
		 // press and release vitual key ENTER
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 //press ctrl+v
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 //release ctrl+v
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 
		 // press and release vitual key ENTER
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
	}
}
