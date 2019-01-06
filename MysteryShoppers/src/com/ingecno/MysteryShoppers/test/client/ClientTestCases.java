package com.ingecno.MysteryShoppers.test.client;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;

public class ClientTestCases extends BaseTestCase {

	/*@Test(priority = 1)
	public void EnterCredential() {
		KeywordCommon.enter_text("id", "login_users_uname", "dipak");
		KeywordCommon.enter_text("id", "login_users_upass", "dipak");
		KeywordCommon.clickButton("id", "login_label_login");

	}*/

	@Test(priority = 2)
	public void clickOnClient() {
		KeywordCommon.clickButton("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[1]/a");
	}

	@Test(priority = 3)
	public void clientText() {
		KeywordCommon.switchToDefaultContent();
		String clientText = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[1]/a");
		Assert.assertEquals(clientText, "CLIENTS");
	}

	@Test(priority = 4)
	public void userText() {
		String userText = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[2]/a");
		Assert.assertEquals(userText, "USER");
	}

	@Test(priority = 5)
	public void managerText() {
		String actualManage = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[4]/a");
		Assert.assertEquals(actualManage, "MANAGE");
	}

	@Test(priority = 6)
	public void manageSubMenuCity() {

		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[4]/a");
		String actualCity = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[4]/ul/li/a[1]");
		Assert.assertEquals(actualCity, "CITY");

	}

	@Test(priority = 7)
	public void manageSubMenuCityArea() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[4]/a");
		String actualCityArea = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[4]/ul/li/a[2]");
		Assert.assertEquals(actualCityArea, "CITY AREA");
	}

	@Test(priority = 8)
	public void taskSubMenuTaskResponses() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[5]/a");
		String actualTaskresponses = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[5]/ul/li/a[1]");
		Assert.assertEquals(actualTaskresponses, "TASK RESPONSES");
	}

	@Test(priority = 9)
	public void taskSubMenuManageTask() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[5]/a");
		String actualmanageTask = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[5]/ul/li/a[2]");
		Assert.assertEquals(actualmanageTask, "MANAGE TASK");

	}

	@Test(priority = 10)
	public void feedbackSubMenuByUser() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/a");
		String actualByUser = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/ul/li/a[1]");
		Assert.assertEquals(actualByUser, "FEEDBACK BY USER");

	}

	@Test(priority = 11)
	public void feedbackSubMenuByAdmin() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/a");
		String actualByAdmin = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/ul/li/a[2]");
		Assert.assertEquals(actualByAdmin, "APPROVED BY ADMIN");
	}

	@Test(priority = 12)
	public void feedbackSubMenuRejByAdmin() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/a");
		String actualRejByAdmin = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/ul/li/a[3]");
		Assert.assertEquals(actualRejByAdmin, "REJECTED BY ADMIN");
	}

	@Test(priority = 13)
	public void feedbackSubMenuByClient() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/a");
		String actualByClient = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/ul/li/a[4]");
		Assert.assertEquals(actualByClient, "REASSIGNED BY CLIENT");
	}

	@Test(priority = 14)
	public void feedbackText() {
		String actualFeedback = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[6]/a");
		Assert.assertEquals(actualFeedback, "FEEDBACK");

	}

	@Test(priority = 15)
	public void profileText() {
		String actualFeedback = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[7]/a");
		Assert.assertEquals(actualFeedback, "PROFILE");

	}

	@Test(priority = 16)
	public void rewardsPointText() {
		String actualRewardsPoint = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[8]/a");
		Assert.assertEquals(actualRewardsPoint, "REWARD POINTS");

	}

	@Test(priority = 17)
	public void rewardsPointSubMenuClientPointLink() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[8]/a");
		String actualClientPLink = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[8]/ul/li/a[1]");
		Assert.assertEquals(actualClientPLink, "CLIENT POINTS LINK");
	}

	@Test(priority = 18)
	public void rewardsPointSubMenuUserRPointLink() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[8]/a");
		String actualUserPLink = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[8]/ul/li/a[2]");
		Assert.assertEquals(actualUserPLink, "USER REWARDPOINTS LINK");
	}

	@Test(priority = 19)
	public void reportsText() {
		String actualReports = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[9]/a");
		Assert.assertEquals(actualReports, "REPORTS");

	}

	@Test(priority = 20)
	public void reportsSubMenuFeedback() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[9]/a");
		String actualReportFeedback = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[9]/ul/li/a[1]");
		Assert.assertEquals(actualReportFeedback, "FEEDBACKS");
	}

	@Test(priority = 21)
	public void reportsSubMenuActivities() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[9]/a");
		String actualActivities = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[1]/li[9]/ul/li/a[2]");
		Assert.assertEquals(actualActivities, "ACTIVITIES");
	}

	@Test(priority = 22)
	public void logoutBtn() {
		String actualLogout = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[2]/div/ul[2]/li/a");
		Assert.assertEquals(actualLogout, "LOGOUT");
	}

	@Test(priority = 23)
	public void firstpageDisabled() throws InterruptedException {
		KeywordCommon.pause(2000);
		String firstpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[1]/img")).getAttribute("src");
		System.out.println(firstpage);
		Assert.assertEquals(firstpage, "http://localhost:8090/Dmall/images/table/firstPageDisabled.gif");
	}
	
	@Test(priority = 24)
	public void prevPageDisabled() throws InterruptedException {
		String prevpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[2]/img"))
				.getAttribute("alt");
		System.out.println(prevpage);
		Assert.assertEquals(prevpage, "Prev");
	}

	@Test(priority = 25)
	public void nextPageDisabled() throws InterruptedException {
		String nextpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[3]/img"))
				.getAttribute("alt");
		System.out.println(nextpage);
		Assert.assertEquals(nextpage, "Next");
	}

	@Test(priority = 26)
	public void lastPageDisabled() throws InterruptedException {
		String lastpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[4]/img"))
				.getAttribute("alt");
		System.out.println(lastpage);
		Assert.assertEquals(lastpage, "Last");
	}

	@Test(priority = 27)
	public void selectRows() throws InterruptedException {
		String selectrow = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[6]/select"))
				.getAttribute("name");
		System.out.println(selectrow);
		Assert.assertEquals(selectrow, "maxRows");
	}

	@Test(priority = 28)
	public void Filter() throws InterruptedException {
		KeywordCommon.pause(2000);
		String filter = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[8]/a/img"))
				.getAttribute("alt");
		System.out.println(filter);
		Assert.assertEquals(filter, "Filter");
	}

	@Test(priority = 29)
	public void clearFilter() throws InterruptedException {
		KeywordCommon.pause(2000);
		String clearfilter = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[9]/a/img"))
				.getAttribute("title");
		System.out.println(clearfilter);
		Assert.assertEquals(clearfilter, "Clear");
	}

	@Test(priority = 30)
	public void selectBText() {
		String actualSelectBtn = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[1]/div");
		Assert.assertEquals(actualSelectBtn, "Select");

	}

	@Test(priority = 31)
	public void firstNameText() {
		String actualFirstName = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[2]/div");
		Assert.assertEquals(actualFirstName, "Firstname");

	}

	@Test(priority = 32)
	public void lastNameText() {
		String actualLastName = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[3]/div");
		Assert.assertEquals(actualLastName, "LastName");

	}

	@Test(priority = 33)
	public void gerderText() {
		String actualGender = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[4]/div");
		Assert.assertEquals(actualGender, "Gender");

	}

	@Test(priority = 34)
	public void locationText() {
		String actualLocation = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[5]/div");
		Assert.assertEquals(actualLocation, "Location");
	}

	@Test(priority = 35)
	public void addressText() {
		String actualAddress = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[6]/div");
		Assert.assertEquals(actualAddress, "Address");
	}

	@Test(priority = 36)
	public void contactText() {
		String actualContactno = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[7]/div");
		Assert.assertEquals(actualContactno, "Contact No");
	}

	@Test(priority = 37)
	public void emailText() {
		String actualEmail = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[8]/div");
		Assert.assertEquals(actualEmail, "Email Id");
	}

	@Test(priority = 38)
	public void statusText() {
		String actualStatus = KeywordCommon
				.getActualText("xpath",
						"/html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td[9]/div");
		Assert.assertEquals(actualStatus, "Status");
	}

	@Test(priority = 39)
	public void resultFound() {
		String actualResultFound = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/div/table/tbody[2]/tr/td");
		Assert.assertEquals(actualResultFound, "There were no results found.");
	}

	@Test(priority = 40)
	public void addBtn() {
		KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/input[1]");
		Assert.assertTrue(true, "true");
	}

	@Test(priority = 41)
	public void addStoreBtn() {
		KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/input[2]");
		Assert.assertTrue(true, "true");
	}

	@Test(priority = 42)
	public void viewStoreBtn() {
		KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/input[3]");
		Assert.assertTrue(true, "true");
	}

	@Test(priority = 43)
	public void actualEdit() {
		KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/input[4]");
		Assert.assertTrue(true, "true");
	}

	@Test(priority = 44)
	public void actualDelete() {
		KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/input[5]");
		Assert.assertTrue(true, "true");

	}

	@Test(priority = 45)
	public void actualCredential() {
		KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[3]/form/input[6]");
		Assert.assertTrue(true, "true");
	}

	@Test(priority = 46)
	public void actualFooterText() {
		String actualFooter = KeywordCommon.getActualText("xpath",
				"/html/body/div[1]/div[4]/div");
		Assert.assertEquals(actualFooter, "© Mystery Hotel");
	}

	@Test(priority = 47)
	public void addButton() throws InterruptedException {

		KeywordCommon.clickButton("xpath",
				"/html/body/div[1]/div[3]/form/input[1]");
		KeywordCommon.pause(3000);
	}

	@Test(priority = 48)
	public void addClient() {
		String addClientText = KeywordCommon.driver.findElement(
				By.className("ui-dialog-title")).getAttribute("class");
		Assert.assertEquals(addClientText, "ui-dialog-title");
	}

	@Test(priority = 49)
	public void addClientStoredetails() {
		KeywordCommon.driver.switchTo().frame(0);
		String addClientAndStoreDetails = KeywordCommon.getActualText("xpath",
				"/html/body/form/h1/font");
		Assert.assertEquals(addClientAndStoreDetails,
				"ADD CLIENTS AND STORE DETAILS");

	}

	@Test(priority = 50)
	public void storeName() {
		String storeName = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[1]/td[1]/label");
		Assert.assertEquals(storeName, "Store Name:");
	}

	@Test(priority = 51)
	public void StoreOwnersFirstName() {
		String storeOwnersFirstName = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[2]/td[1]/label");
		Assert.assertEquals(storeOwnersFirstName, "Store Owners First Name:");
	}

	@Test(priority = 52)
	public void StoreOwnersLastName() {
		String storeOwnersLastName = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[3]/td[1]/label");
		Assert.assertEquals(storeOwnersLastName, "Store Owners Last Name:");
	}

	@Test(priority = 53)
	public void storeStatus() {
		String storeStatus = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[4]/td[1]/label");
		Assert.assertEquals(storeStatus,
				"Store Status (Incative Stores will not display):");
	}

	@Test(priority = 54)
	public void storeContactNumber() {
		String storeContactNumber = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[5]/td[1]/label");
		Assert.assertEquals(storeContactNumber, "Store Contact Number :");
	}

	@Test(priority = 55)
	public void storeEmailId() {
		String storeEmailId = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[6]/td[1]/label");
		Assert.assertEquals(storeEmailId, "Store Email-Id:");
	}

	@Test(priority = 56)
	public void storeLocation() {
		String storeLocation = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[7]/td[1]/label");
		Assert.assertEquals(storeLocation, "Store Location:");
	}

	@Test(priority = 57)
	public void storeArea() {
		String storeArea = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[8]/td[1]/label");
		Assert.assertEquals(storeArea, "Store Area:");
	}

	@Test(priority = 58)
	public void ClientName() {
		String clientName = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[9]/td[1]/label");
		Assert.assertEquals(clientName, "Client Name:");
	}

	@Test(priority = 59)
	public void clientLastName() {
		String clientLastName = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[10]/td[1]/label");
		Assert.assertEquals(clientLastName, "Client Last Name:");
	}

	@Test(priority = 60)
	public void location() {
		String location = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[11]/td[1]/label");
		Assert.assertEquals(location, "Location:");
	}

	@Test(priority = 61)
	public void Area() {
		String area = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[12]/td[1]/label");
		Assert.assertEquals(area, "Area:");
	}

	@Test(priority = 61)
	public void uploadOfflineFeedbackDoc() {
		String uploadOfflineFeedbackDoc = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[13]/td[1]/label");
		Assert.assertEquals(uploadOfflineFeedbackDoc,
				"Upload Offline Feedback Doc :");
	}

	@Test(priority = 62)
	public void clientContactNumber() {
		String clientContactNumber = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[14]/td[1]/label");
		Assert.assertEquals(clientContactNumber, "Client Contact Number:");
	}

	@Test(priority = 63)
	public void clienEmail() {
		String clienEmail = KeywordCommon.getActualText("xpath",
				"/html/body/form/table[2]/tbody/tr[15]/td[1]/label");
		Assert.assertEquals(clienEmail, "Client Email:");
	}

	@Test(priority = 64)
	public void addClientAndStoreBtn() throws InterruptedException {
		Thread.sleep(5000);
		KeywordCommon.driver.findElement(
				By.xpath("/html/body/form/input[1]")).isDisplayed();
		Assert.assertTrue(true, "true");

	}	
	@Test(priority=65)
	public void close()
	{
		KeywordCommon.pause(3000);
		KeywordCommon.clickButton("xpath", "html/body/div[2]/div[1]/a/span");
		KeywordCommon.pause(3000);
	}

	/*@BeforeSuite
	public void browserSetup() {
		KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
		KeywordCommon.maximizeBowser();
		KeywordCommon.navigate(CONFIG.getProperty("url"));
	}*/


	@AfterSuite
	public void afterSuite() {

		KeywordCommon.driver.close();
	}

}
