package com.testng;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=2)
	public void test1(){
		System.out.println(this.getClass().getName());
	}
	
	@Test(priority=1)
	public void test11(){
		System.out.println(this.getClass().getName());
	}

	@Test
	public void test3(){
		System.out.println(this.getClass().getName());
	}
	
	@Test(dependsOnMethods="test3")
	public void test4(){
		System.out.println(this.getClass().getName());
	}

}
