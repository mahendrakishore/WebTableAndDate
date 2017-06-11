package com.tabledate;

import org.junit.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("@BeforeMethod");
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("@BeforeTest");
	}

	@BeforeClass(alwaysRun=true)
	public void beforeClass(){
		System.out.println("@BeforeClass");
	}

	@BeforeGroups
	public void beforeGroups(){
		System.out.println("@BeforeGroups");
	}

	 
	@Test
	public void test(){
		System.out.println("@Test");
	}
	@Test(groups={"test"})
	public void test1(){
		System.out.println("@Test2");
	}
	@Test(groups={"test"})
	public void test2(){
		System.out.println("@Test2");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("@AfterMethod");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("@AfterSuite");
	}

	@AfterTest
	public void afterTest(){
		System.out.println("@AfterTest");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("@AfterClass");
	}

	@AfterGroups
	public void afterGroups(){
		System.out.println("@AfterGroups");
	}


}
