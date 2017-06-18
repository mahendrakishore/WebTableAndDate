package com.testng;

import org.testng.annotations.Test;

public class Testngtest1 {

	@Test(groups={"g1","g2"})
	public void test1(){
		System.out.println("g1 and g2");
	}
}
