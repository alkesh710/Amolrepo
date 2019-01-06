package com.ingecno.MysteryShoppers.TNglistener;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;
import com.ingecno.MysteryShoppers.utility.ScreenShotUtility;
import com.relevantcodes.extentreports.LogStatus;
import com.ingecno.MysteryShoppers.TNglistener.ExtentReportsClass;

public class ReportsITestListener extends BaseTestCase implements ITestListener{

	public void onFinish(ITestContext finish) {
		// TODO Auto-generated method stub
		Date endDate =finish.getEndDate();
		System.out.println("END DATE OF EXECUTION-"  + endDate);
	}

	public void onStart(ITestContext start) {
		// TODO Auto-generated method stub
		Date startDate =start.getStartDate();
		System.out.println("START DATE OF EXECUTION-"  +startDate);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult failure) {
		// TODO Auto-generated method stub
		String failureTest = failure.getName();
		System.out.println("FAILED"  +failureTest);
		String methodName = failure.getName().toString().trim();
		
	}
	/*public void takeScreenShot(String methodName) {
		// get the driver

		WebDriver driver = KeywordCommon.driver;
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
	        Date now = new Date();
	        String datetimeStr = now.toString();
	        SimpleDateFormat format = new SimpleDateFormat(
	                   "EEE MMM dd HH:mm:ss zzz yyyy");
	        try {
	            Date parseDate = format.parse(datetimeStr);
	            System.out.println(parseDate.toString().replaceAll(" " , "_").replaceAll(":", "__"));
	        		
			
			FileUtils.copyFile(scrFile,
					new File(System.getProperty("user.dir")+"\\screenshot\\"+parseDate.toString().replaceAll(" " , "_").replaceAll(":", "__")+"\\"+ methodName + ".png"));
			System.out.println("***Placed screen shot in " + CONFIG.getProperty("url") + " ***");
	        } 
	        catch (ParseException e) {
	            ;
	        }	
		} catch (IOException e) {
			System.out.println("I am in catch");
			e.printStackTrace();
		}
	}*/
		
	

	public void onTestSkipped(ITestResult skipped) {
		// TODO Auto-generated method stub
		String skippedTest = skipped.getName();
		System.out.println(skippedTest + "--->" + "Skipped");
	}

	public void onTestStart(ITestResult testStart) {
		// TODO Auto-generated method stub
		String nameTest = testStart.getName();
		System.out.println(nameTest);
	}

	public void onTestSuccess(ITestResult testSuccess) {
		// TODO Auto-generated method stub
		String name = testSuccess.getName();
		System.out.println(name + "--->" + "passed");
	}
	
	/*public void getResult(ITestResult result){
		 if(result.getStatus() == ITestResult.FAILURE){
			 ExtentReportsClass.logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
			 ExtentReportsClass.logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		 
		 String methodName = result.getName().toString().trim();
			try {
				ScreenShotUtility.screenshot(methodName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }else if(result.getStatus() == ITestResult.SKIP){
			 ExtentReportsClass.logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
			 ExtentReportsClass.extent.endTest(ExtentReportsClass.logger);
		 }
	}*/

}
