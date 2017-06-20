package com.autorunfailedtc;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Test4 {

	
	@Test
	public void test1() {
		System.out.println(" before flase test4");
		Assert.assertTrue(false);
		System.out.println(" flase test4");
	}

}
