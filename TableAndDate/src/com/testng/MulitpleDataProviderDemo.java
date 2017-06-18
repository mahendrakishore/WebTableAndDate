package com.testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MulitpleDataProviderDemo {

	@DataProvider(name="data")
	public Object[] dataprovider(Method method){
		Object[] obj = null;
		
		if(method.getName()=="test1"){
			obj = new Object[3];
		obj[0] = "a";
		obj[1] = "b";
		obj[2] = "c";}
		
		if(method.getName()=="test2"){
			obj = new Object[3];
		obj[0] = 1;
		obj[1] = 2;
		obj[2] = 3;}		
		return obj;
		
	}
	@Test(dataProvider="data")
	public void test1(String name){
		
		System.out.println(name);
	}
	
	@Test(dataProvider="data")
	public void test2(int num){
		
		System.out.println(num);
	}
		
}
