package com.ingecno.MysteryShoppers.test.client;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;

import com.ingecno.MysteryShoppers.utility.ScreenShotUtility;

public class ClientITestListner extends BaseTestCase implements ITestListener {
	
	String filePath = "D:\\JavaNewWorkspce\\MysteryShoppers\\Screenshot";

	@Override
	public void onFinish(ITestContext finish) {
		// TODO Auto-generated method stub
		Date endDate = finish.getEndDate();
		System.out.println("END DATE OF EXECUTION:-" + endDate);
	}

	@Override
	public void onStart(ITestContext start) {
		// TODO Auto-generated method stub
		Date startDate = start.getStartDate();
		System.out.println("START DATE OF EXECUTION:-" + startDate);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult failure) {

		String failureTest = failure.getName();
		System.out.println(failureTest);
		System.out.println(failureTest + "--->" + "Failed");
		String methodName = failure.getName().toString().trim();
		takeScreenShot(methodName);
	}
	public void takeScreenShot(String methodName) {
		// get the driver

		WebDriver driver = KeywordCommon.driver;
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
			System.out.println("***Placed screen shot in "+filePath+" ***");
		} catch (IOException e) {
			e.printStackTrace();
		}
}
		/*try {
			FileUtils.copyFile(scrFile,
					new File(CONFIG.getProperty("url") + methodName + ".png"));
			System.out.println("***Placed screen shot in "+filePath+" ***");
	//		System.out.println("***Placed screen shot in " + CONFIG.getProperty("url") + " ***");
		} catch (IOException e) {
			System.out.println("I am in catch");
			e.printStackTrace();
		}*/
	

	@Override
	public void onTestSkipped(ITestResult skipped) {
		// TODO Auto-generated method stub
		String skippedTest = skipped.getName();
		System.out.println(skippedTest + "--->" + "Skipped");

	}

	@Override
	public void onTestStart(ITestResult testStart) {
		// TODO Auto-generated method stub

		String nameTest = testStart.getName();
		System.out.println(nameTest);

	}

	@Override
	public void onTestSuccess(ITestResult testSuccess) {
		// TODO Auto-generated method stub

		String name = testSuccess.getName();
		System.out.println(name + "--->" + "passed");
		/*
		 * ITestNGMethod method = testSuccess.getMethod();
		 * System.out.println(method);
		 */

		System.out.println("******************************************");

	}

}
