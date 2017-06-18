package com.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomeRetry implements IRetryAnalyzer{

	private int retrycount =1;
	private final int maxcount = 5;
	@Override
	public boolean retry(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE && retrycount<=maxcount){
			try{
				Thread.sleep(3000);
				System.out.println(String.format("result : %s method name: %s count %d",result.getStatus(),result.getMethod().getMethodName(),retrycount));
				retrycount++;
				return true; 
				
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		return false;
	}

}
