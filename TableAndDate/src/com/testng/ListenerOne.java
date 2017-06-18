package com.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value=CustomeListerner.class)
public class ListenerOne {
	
	@Test()
	public void test2(){
		Assert.assertTrue(true);
	}

}
