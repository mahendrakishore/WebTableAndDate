package com.testng;

import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryTestng {

	@Test(retryAnalyzer=CustomeRetry.class)
	public void fail(){
		//Assert.assertTrue(false);
		Assert.assertEquals("test1", "test2");
	}

}
