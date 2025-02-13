package com.utilities.reuasble;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyextentReports implements ITestListener {
	
	public static ExtentReports generateExtentReports()
	{
		//extentreports is class 
		//need extentsreporters in pom
		//Extentsparkreporter is class 
		// generates HTML reports from test results. It is part of the Extent Reports open-source reporting library. 
		//What it does(esr) 
//		Creates HTML files that contain test results
//		Allows users to customize the report
//		Can generate custom logs and snapshots
		ExtentReports extentReport = new ExtentReports();
		
		File f3 = new File(System.getProperty("user.dir")+"\\test-output\\extent-report\\extentreporter.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(f3);
		
		sparkreporter.config().setTheme(Theme.DARK);
		sparkreporter.config().setDocumentTitle("Prasanth automtion");
		sparkreporter.config().setReportName("Automation test results");
		sparkreporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentReport.attachReporter(sparkreporter);
		
		Properties confprop = new Properties();
		File conff = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\config\\config.properties");
		try {
		FileInputStream fisconf = new FileInputStream(conff);
		confprop.load(fisconf);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		extentReport.setSystemInfo("Application url", confprop.getProperty("url"));
		extentReport.setSystemInfo("BrowserNmae", confprop.getProperty("browserName"));
		extentReport.setSystemInfo("email", confprop.getProperty("email"));
		
		//System.getProperties().list(System.out); -->will get all properties
		extentReport.setSystemInfo("osname", System.getProperty("os.name"));
		extentReport.setSystemInfo("javaversion", System.getProperty("java.version"));
		extentReport.setSystemInfo("username", System.getProperty("user.name"));
		
		return extentReport;
		
		
		
		
		
	}

}
