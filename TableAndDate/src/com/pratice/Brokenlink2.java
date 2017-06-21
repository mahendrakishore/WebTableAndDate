package com.pratice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Brokenlink2 {
static WebDriver driver;
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.co.in/");
            List<WebElement> links = driver.findElements(By.tagName("a"));
			for(int i = 0;i<links.size();i++){
				WebElement linkele = links.get(i);
				String link = linkele.getAttribute("href");
				System.out.println(link);
				verifyLink(link);
			}
	}
			
			
			public static void verifyLink(String urllink){
				
				try{
					URL url = new URL(urllink);
				HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
				httpURLConnection.setConnectTimeout(300);
				httpURLConnection.connect();
				if(httpURLConnection.getResponseCode()==200){
					System.out.println(httpURLConnection.getResponseMessage());
				}
				if(httpURLConnection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
					System.out.println(httpURLConnection.getResponseMessage());
				}
				}
				catch(Exception e){
					System.out.println("broken link");
				}
				
			}
	
}
