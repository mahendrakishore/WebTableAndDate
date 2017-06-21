package com.assertd;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void softAssert(){
		
		SoftAssert assertion = new SoftAssert();
		
		assertion.assertEquals(10, 20);
		System.out.println("flase condition");
		assertion.assertTrue(true);
		System.out.println("true condition");
		assertion.assertAll();
	}
	
	@Test
	public void hardAssert(){
		
	    Assert.assertEquals(10, 20);
		System.out.println("hard flase condition");
		Assert.assertTrue(true);
		System.out.println("hard true condition");
		
	}

}
