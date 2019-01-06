package com.ingecno.MysteryShoppers.test.NotCommon.all;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;
import com.ingecno.MysteryShoppers.test.util.DataRepository;

public class LoginTestCases extends BaseTestCase{
	

	@Test(dataProvider = "loginData")
	public void loginTestCase(String dataset_no, String username,
			String password) {
		
		System.out.println(dataset_no+""+username+""+password);
		KeywordCommon.enter_text("id", "login_users_uname",username );
		KeywordCommon.enter_text("id", "login_users_upass", password);
		KeywordCommon.clickButton("id", "login_label_login");		
		
		
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@DataProvider
	public Object[][] loginData() throws FileNotFoundException {
		
		return DataRepository.getExcelData(testDataFilePath, "user_name");
		
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void browserSetup() {
		KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
		KeywordCommon.maximizeBowser();
		KeywordCommon.navigate(CONFIG.getProperty("url"));
	}

	@AfterSuite
	public void afterSuite() {
	}

}
