package com.testng;

import org.testng.annotations.Test;

public class Testngtest2 {

	@Test(groups={"g1","g2"})
	public void test2 (){
		System.out.println("g1.2 and g2.2");
	}
}