package com.ingecno.MysteryShoppers.test.NotCommon.all;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

//import com.ingecno.MysteryShoppers.test.client.usertest;
import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.SignupDataModel.SignUpData;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;
import com.ingecno.MysteryShoppers.test.util.DataRepository;

public class RegistrationTestCases extends BaseTestCase {
	//RegistrationTestCases(){}
	
	

	@Test(dataProvider = "regdata",priority = 1)
	public void verify_reg(String dataset_no, String fname, String lname,
			String contno, String email, String gender, String location,
			String area) throws Exception {

		System.out.println(dataset_no + "" + fname + "" + lname + "" + ""
				+ contno + "" + email);

		KeywordCommon.navigate(CONFIG.getProperty("url"));

		KeywordCommon.clickButton("xpath",
				"/html/body/div[1]/form/table/tbody/tr[4]/td/div[1]/input[2]");
		//KeywordCommon.pause(3000);

		KeywordCommon.enter_text("id", "add_user_userDetail_firstName", fname);

		KeywordCommon.enter_text("id", "add_user_userDetail_lastName", lname);

		KeywordCommon.enter_text("id", "add_user_userDetail_contactNo", contno);

		KeywordCommon.enter_text("id", "add_user_userDetail_emailId", email);

		KeywordCommon.pause(3000);

		KeywordCommon.enter_text("xpath",
				".//*[@id='add_user_userDetail_gender']", gender);
		
		//Scroll page
		((JavascriptExecutor)KeywordCommon.driver).executeScript("scroll(0, 400)");
		
		KeywordCommon.enter_text("xpath", ".//*[@id='locationDropdown']",
				location);

		KeywordCommon.pause(3000);

		KeywordCommon.clickButton("xpath", ".//*[@id='locationAreaDropdown']");

		KeywordCommon.pause(1000);

		KeywordCommon.enter_text("xpath", ".//*[@id='locationAreaDropdown']",
				area);

		KeywordCommon.pause(1000);

		/*KeywordCommon.clickButton("xpath", ".//*[@id='add_user_adharCard']");

		Runtime.getRuntime()
				.exec("C:\\Users\\My\\Desktop\\FOOD.pdf");

		KeywordCommon.pause(5000);*/
		
		//Robot class
		StringSelection str =new StringSelection("C:\\Users\\My\\Desktop\\FOOD.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		KeywordCommon.clickButton("xpath", ".//*[@id='add_user_adharCard']");
		Robot robot = new Robot();
		Thread.sleep(1000);

		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		//press CTRL+V
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
	
		//Press Enter 
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		/*KeywordCommon.pause(5000);
	
		

		KeywordCommon.clickButton("xpath", ".//*[@id='add_user_panCard']");

		Runtime.getRuntime()
				.exec("C:\\Users\\My\\Desktop\\FOOD.pdf");

		KeywordCommon.pause(5000);

		KeywordCommon.clickButton("xpath",
				".//*[@id='add_user_DrivingLicence']");

		Runtime.getRuntime()
				.exec("C:\\Users\\My\\Desktop\\FOOD.pdf");

		KeywordCommon.pause(5000);

		KeywordCommon.clickButton("xpath", ".//*[@id='add_user_otherDoc']");

		Runtime.getRuntime()
				.exec("C:\\Users\\My\\Desktop\\FOOD.pdf");

		KeywordCommon.pause(5000);

		KeywordCommon
				.clickButton("xpath", ".//*[@id='add_user_otherDocIfAny']");

		Runtime.getRuntime()
				.exec("C:\\Users\\My\\Desktop\\FOOD.pdf");*/

		KeywordCommon.clickButton("xpath",
				".//*[@id='add_user']/table[2]/tbody/tr[14]/td[1]/input");

		KeywordCommon.pause(5000);

		// assert for login page whether data is inserted
		

	}

	@DataProvider(name = "regdata")
	public Object[][] loginData() throws FileNotFoundException {
		
		return DataRepository.getExcelData(registDataFilePath, "registrationTestCases");
	}

	@BeforeSuite
	public void browserSetup() {
		KeywordCommon.openBrowser(CONFIG.getProperty("browser"));

		KeywordCommon.maximizeBowser();

	}

	/*@AfterSuite
	public void browserSetup1() {
		KeywordCommon.closebrowser();

		

	}

	*/
	
	
	@Test(priority = 2)
	public void compareDataFromUsers() {
		// list from excel
		ArrayList<SignUpData> list = DataRepository.getDataFromExcelSheet(
				registDataFilePath, "registrationTestCases");
		System.out.println("UserList data"+list);
		for (SignUpData signUpData : list) {
			System.out.println(signUpData.getFirstname()+""+signUpData.getLastname()+""+signUpData.getDataset_no());
			
		}
		// list from UI
		
		
		
		
		// automate till users page
		KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
		KeywordCommon.maximizeBowser();
		KeywordCommon.navigate(CONFIG.getProperty("url"));
		KeywordCommon.enter_text("id", "login_users_uname", "dipak");
		KeywordCommon.enter_text("id", "login_users_upass", "dipak");
		KeywordCommon.clickButton("id", "login_label_login");
		//user click
		KeywordCommon.clickButton("xpath","/html/body/div[1]/div[2]/div/ul[1]/li[2]/a"); 
	}

}
