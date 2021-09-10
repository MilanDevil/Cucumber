package org.Login;

import org.checkerframework.common.util.report.qual.ReportInherit;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reports;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue={"org.StepDefinition"},plugin= {"C:\\Users\\user\\Desktop\\June batch\\Cucumber\\src\\test\\resources\\Reports\\output.json"})


public class TestRunner {
	
	@AfterClass
public void afterclass() {
	String property = System.getProperty("user.dir");
	System.out.println(property);
	
		Reports.jvm(property+"src\\test\\resources\\Reports\\output.json");
		
	}

}
