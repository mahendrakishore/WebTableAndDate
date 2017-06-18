package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngtest4 {
	
	@Parameters({"name","pass"})
	@Test()
	public void test4(String name,String pass){
		System.out.println(name);
		System.out.println(pass);
	}
}
