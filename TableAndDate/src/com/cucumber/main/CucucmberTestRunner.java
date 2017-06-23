package com.cucumber.main;

import org.junit.runner.RunWith;

import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(features="feature",glue="com.cucumber.stepdefination")
public class CucucmberTestRunner {
	

}
