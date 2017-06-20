package com.sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SimpleSikuli {
	
	static WebDriver driver ;
	public static void main(String[] args) throws Exception  {
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");		
		driver = new ChromeDriver();
		
		Screen screen = new Screen();
		//Pattern pattern1 = new Pattern("C:\\Users\\mahen\\Desktop\\sikuli\\gmailbutton.PNG");
		Pattern pattern1 = new Pattern("C:\\Users\\mahen\\Desktop\\sikuli\\signin.PNG");
		Pattern pattern2 = new Pattern("C:\\Users\\mahen\\Desktop\\sikuli\\emailoruser.PNG");
		Pattern pattern3 = new Pattern("C:\\Users\\mahen\\Desktop\\sikuli\\next.PNG");
		Pattern pattern4 = new Pattern("C:\\Users\\mahen\\Desktop\\sikuli\\pass.PNG");
		Pattern pattern5 = new Pattern("C:\\Users\\mahen\\Desktop\\sikuli\\next.PNG");
		
		driver.get("https://www.google.com/gmail/about/#");
		screen.wait(pattern1,5);
		screen.click(pattern1);
		screen.type(pattern2, "kismahen");
		screen.click(pattern3);
		screen.type( pattern4,"password");
		screen.click(pattern5);
		
		
		
		
		
		
	}

}
