package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.awt.*;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public  class Reports {

	public static void jvm(String jsonFile) {
	
		
	
		File reportDirectory = new File("C:\\Users\\user\\Desktop\\June batch\\Cucumber\\src\\test\\resources\\Reports"); 
		
		Configuration config = new Configuration (reportDirectory,"Adactin Automation");
		
		config.addClassifications("OS", "windows10");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Version", "93");
		config.addClassifications("Sprint", "25");
		
		List<String> jsonFiles =new ArrayList<String>();
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		builder.generateReports();
			
		

	}
}
