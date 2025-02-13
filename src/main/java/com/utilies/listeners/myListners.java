package com.utilies.listeners;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.utilities.reuasble.MyextentReports;
import com.utilities.reuasble.reuasable;

//in pom.xml change from test to compile
//ITESTLISTENER is Interface
//class will override the methods of Itestlistner
//The ITestListener listens to the desired events and executes the methods accordingly.
//onStart(): invoked after test class is instantiated and before execution of any testNG method.
//onTestSuccess(): invoked on the success of a test
//onTestFailure(): invoked on the failure of a test
//onTestSkipped(): invoked when a test is skipped
//onTestFailedButWithinSuccessPercentage(): invoked whenever a method fails but within the defined success percentage
//onFinish(): invoked after all tests of a class are executedThe above-mentioned methods use the parameters ITestContext and ITestResult. 
//The ITestContext is a class that contains information about the test run. 
//The ITestResult is an interface that defines the result of the test.

public class myListners implements ITestListener{
	
	ExtentReports extentReport;
	ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		 extentReport = MyextentReports.generateExtentReports();
	}
	
	public void onTestStart(ITestResult result)
	{
		 test = extentReport.createTest(result.getName());
		test.log(Status.INFO,result.getName()+"Started the excution");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		 test = extentReport.createTest(result.getName());
		test.log(Status.PASS,result.getName()+"excution Successful");
	}
	
	public void onTestFailure(ITestResult result)
	{
		
		test = extentReport.createTest(result.getName());
		WebDriver driver=null;
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		File srcScreenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String desscreenshotpath=System.getProperty("user.dir")+"\\screenshot\\+result.getName()+.png";
//		try {
//			FileHandler.copy(srcScreenshot, new File(desscreenshotpath));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		String desscreenshotpath=reuasable.capturescrenshot(driver,result.getName());
		test.addScreenCaptureFromPath(desscreenshotpath);
		test.log(Status.INFO,result.getThrowable());
		test.log(Status.FAIL,result.getName()+"excution Fail");
		
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test = extentReport.createTest(result.getName());
		test.log(Status.SKIP, result.getName()+"excution skip");
	}
	
	public void onFinish(ITestContext context)
	{
		extentReport.flush();
		
		//automatically open the extentreport without clicking
		String pathofextentreport= System.getProperty("user.dir")+"\\test-output\\extent-report\\extentreporter.html";
		File extentreport = new File(pathofextentreport);
		try {
			Desktop.getDesktop().browse(extentreport.toURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
