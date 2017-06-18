package com.testng;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Testngtest5 {

	@Test()
	public void testFail(){
		Assert.assertTrue(false);
	}
	
	@Test()
	public void testPass(){
		Assert.assertTrue(true);
	}

	
	public void testResult(ITestResult result){
		if(result.getStatus()==ITestResult.SUCCESS){
			//System.out.println("test pass");
			System.out.println(String.format("rs: %s mn: %d ",result.getStatus() , result.getMethod().getMethodName()));
			//System.out.println("result status:"+result.getStatus()+" method name:"+result.getMethod().getMethodName());
		}
		 if(result.getStatus()==ITestResult.FAILURE){
			//System.out.println("test fail");
			//System.out.println("result status:"+result.getStatus()+" method name:"+result.getMethod().getMethodName());
			System.out.println(String.format("rs: %s mn: %d ",result.getStatus() , result.getMethod().getMethodName()));
		}
	}

}
