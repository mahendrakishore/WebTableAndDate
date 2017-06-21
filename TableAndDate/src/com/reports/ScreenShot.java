package com.reports;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class ScreenShot {
	
	public static String takesScreenshot(WebDriver driver ,String name){
	
		try{TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
	 String	path = "C:\\Screenshot\\FailedTest\\"+name+".png";
		File dest = new File(path);
	   FileUtils.copyFile(file, dest);
	   return 	path;
		}
		catch(Exception e){
			return "saving screenshot exception";
		}		
			
	}

}
