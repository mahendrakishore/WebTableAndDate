package com.autorunfailedtc;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Test5 {

	
	@Test
	public void test1() {
		System.out.println(" before flase test5");
		Assert.assertTrue(false);
		System.out.println(" flase test5");
	}

}
