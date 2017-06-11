package com.tabledate;

public class NestedClass {
	
	private int i = 10;
	
	
	
	public class NestedSubClass{
		
		public void msg(){
			System.out.println("inside innerclass class");
		}
		
			}
	void show(){
		NestedSubClass nsc = new NestedSubClass();
		nsc.msg();
	}

}
