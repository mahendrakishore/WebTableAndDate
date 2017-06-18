package com.testng;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(value=CustomeListerner.class)
public class ListenerTwo {

	@Test()
	public void test1(){
		Assert.assertTrue(true);
	}


}


