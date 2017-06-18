package com.testng;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomeListerner implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("method name :"+method.getTestMethod().getMethodName()+" class name:"+testResult.getTestClass());
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("method name:"+method.getTestMethod().getMethodName()+" class name:"+testResult.getTestClass().getName());
			}

}
