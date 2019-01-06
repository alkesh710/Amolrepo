package com.ingecno.MysteryShoppers.TNglistener;


import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import com.ingecno.MysteryShoppers.utility.ScreenShotUtility;

public class ExtentReportsClass {
public static	ExtentReports extent;
public static ExtentTest logger;
public static	 WebDriver driver;
	 

static{
	//System.out.println(System.getProperty("user.dir"));
	extent = new ExtentReports("./test-output/STMExtentReport.html",true);
	 
	 extent.loadConfig(new File("D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\config\\extent-config.xml"));
	   
}
	 //@BeforeTest
	 /*public void startReport(){
	
	 extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
	 
	 extent.loadConfig(new File("D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\config\\extent-config.xml"));
	             
	 }*/
	 
	 /*@Test
	 public void passTest(){
		 logger = extent.startTest("passTest");
		 Assert.assertTrue(true);
		 logger.log(LogStatus.PASS, "Test Case Passed is passTest");
		 
	 }
	 @Test
	 public void failTest(){
	 logger = extent.startTest("failTest");
	 Assert.assertTrue(false);
	 logger.log(LogStatus.PASS, "Test Case (failTest) Status is passed");
	 
	 }
	 
	 @Test
	 public void skipTest(){
	 logger = extent.startTest("skipTest");
	 throw new SkipException("Skipping - This is not ready for testing ");
	 }*/
/*	 @AfterMethod
	 public void getResult(ITestResult result){
	 if(result.getStatus() == ITestResult.FAILURE){
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	 
	 String methodName = result.getName().toString().trim();
		try {
			ScreenShotUtility.screenshot(methodName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }else if(result.getStatus() == ITestResult.SKIP){
	 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
	 extent.endTest(logger);
	 }
	 else if(result.getStatus() == ITestResult.SUCCESS){
		 logger.log(LogStatus.PASS, "Test Case PASSED is "+result.getName());
		 extent.endTest(logger);
		 }
	 }
	 
	 @AfterTest
	 public void endReport(){
		 extent.flush();
		 extent.close();
	 }*/
	 
	
	

}
