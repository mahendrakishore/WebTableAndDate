package com.runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 TestNG runner = new TestNG();
		 
		 List<String> list = new ArrayList<>();
		 
		 list.add("C:\\Users\\mahen\\git\\tablendate\\TableAndDate\\test-output\\Failed Suite\\testng-failed.xml");
		 
		 runner.setTestSuites(list);
		 
		 runner.run();
	}

}
