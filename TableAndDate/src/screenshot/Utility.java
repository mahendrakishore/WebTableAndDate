package screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	
	public static void screenshot(WebDriver driver , String name){
		try{TakesScreenshot tss = (TakesScreenshot)driver;
		File file = tss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(file, new File("./Pic/"+name+".png"));
		}
		catch(Exception e){
			System.out.println("Screenshot not taken");
		}
	}
}
