package library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.internal.Utils;

public class Utility {
	
	public static void screenshot(WebDriver driver ,String name){
		 try{  TakesScreenshot tss =   (TakesScreenshot)driver;
		   File file = tss.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshot/"+name+".png"));
		   System.out.println("Screenshot  taken");}
		 catch(Exception e){
			 System.out.println("Screenshot not captured");
		 }
	}

}
