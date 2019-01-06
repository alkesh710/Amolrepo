package com.ingecno.MysteryShoppers.TNglistener;

import com.ingecno.MysteryShoppers.TNglistener.ExtentReportsClass;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;
import com.ingecno.MysteryShoppers.utility.ScreenShotUtility;
import com.relevantcodes.extentreports.LogStatus;


public class ReportsTestCases extends ReportsITestListener {

	@Test(priority = 1)
	public void EnterCredential() {
		KeywordCommon.enter_text("id", "login_users_uname", "dipak");
		KeywordCommon.enter_text("id", "login_users_upass", "dipak");
		KeywordCommon.clickButton("id", "login_label_login");

	}

	@Test(priority = 2)
	public void ReportsMenu() {
		String ActualReportText = KeywordCommon.getActualText("xpath",
				".//*[@id='nav']/li[9]/a");
		Assert.assertEquals(ActualReportText, "REPORTS");

	}

	@Test(priority = 3)
	public void ReportsMenuMouseOver() {
		KeywordCommon.mouseOver("xpath", ".//*[@id='nav']/li[9]/a");
		String actualFeedbackSubMenu = KeywordCommon.getActualText("xpath",
				".//*[@id='nav']/li[9]/ul/li/a[1]");
		Assert.assertEquals(actualFeedbackSubMenu, "FEEDBACKSSS");
	}

	/*@Test(priority = 4)
	public void ClickOnFeedbackLink() {
		KeywordCommon.mouseOver("xpath", ".//*[@id='nav']/li[9]/a");
		KeywordCommon.clickButton("xpath", ".//*[@id='nav']/li[9]/ul/li/a[1]");
	}

	@Test(priority = 5)
	public void SelectClientNameText() throws InterruptedException {
		KeywordCommon.switchToDefaultContent();
		Thread.sleep(3000);
		String ActualSelectClientNameText = KeywordCommon.getActualText(
				"xpath", ".//*[@id='inner-wrap']/form/font");

		Assert.assertEquals(ActualSelectClientNameText, "Select Client Name");

	}

	@Test(priority = 6)
	public void selectClientDropdown() throws InterruptedException {
		KeywordCommon.switchToDefaultContent();
		Thread.sleep(3000);
		String selectrow = KeywordCommon.driver.findElement(
				By.xpath(".//*[@id='clientDropdown']")).getAttribute("name");
		Assert.assertEquals(selectrow, "frmClientsId");

	}
	@Test(priority = 7)
	public void goButton() throws InterruptedException {
		// KeywordCommon.switchToDefaultContent();
		Thread.sleep(3000);S
		// String actualGoText = KeywordCommon.getActualText("xpath",
		// ".//*[@id='inner-wrap']/form/input[1]");
		String actualGoBtnTxt = KeywordCommon.driver.findElement(
				By.xpath(".//*[@id='inner-wrap']/form/input[1]")).getAttribute(
		 		"value");
		AssertJUnit.assertEquals(actualGoBtnTxt, "Goo");
	}}*/


	
	
	 @AfterMethod
	 public void getResult(ITestResult result){
		 ExtentReportsClass.logger=ExtentReportsClass.extent.startTest(result.getTestName());
		 
	 if(result.getStatus() == ITestResult.FAILURE){
		 ExtentReportsClass.logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 ExtentReportsClass.logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
	 
	 String methodName = result.getName().toString().trim();
		try {
			ScreenShotUtility.screenshot(methodName);
			ExtentReportsClass.logger.log(LogStatus.FAIL, ExtentReportsClass.logger.addScreencast(methodName));//add screenshot to extend report
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }else if(result.getStatus() == ITestResult.SKIP){
		 ExtentReportsClass.logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		 ExtentReportsClass. extent.endTest(ExtentReportsClass.logger);
	 }
	 else if(result.getStatus() == ITestResult.SUCCESS){
		 ExtentReportsClass.logger.log(LogStatus.PASS, "Test Case PASSED is "+result.getName());
		 ExtentReportsClass.extent.endTest(ExtentReportsClass.logger);
		 }
	 ExtentReportsClass.extent.endTest(ExtentReportsClass.logger);
	 }
	 

	@BeforeTest
	public void browsersetup() {
		KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
		KeywordCommon.maximizeBowser();
		KeywordCommon.navigate(CONFIG.getProperty("url"));
	}
	@AfterTest
	 public void endReport(){
		ExtentReportsClass. extent.flush();
		ExtentReportsClass.extent.close();
	 }

	/*@AfterSuite
	public void browserclose() {
		KeywordCommon.driver.close();
	}*/

}
