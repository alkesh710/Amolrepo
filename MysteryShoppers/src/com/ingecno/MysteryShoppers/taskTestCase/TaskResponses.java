package com.ingecno.MysteryShoppers.taskTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;

public class TaskResponses extends BaseTestCase {

	static WebDriver driver;

	// static WebElement element;

	@Test(priority = 1)
	public void credential() {
		KeywordCommon.enter_text("id", "login_users_uname", "dipak");
		KeywordCommon.enter_text("id", "login_users_upass", "dipak");
		KeywordCommon.clickButton("id", "login_label_login");
	}

	@Test(priority = 2)
	public void clientMenu() {
		KeywordCommon.switchToDefaultContent();
		String client = KeywordCommon.getActualText("class", "ImgtxtUp");
		String expclient = "CLIENTS";
		Assert.assertEquals(client, expclient);
	}

	@Test(priority = 3)
	public void userMenu() {

		String user = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[2]/a");
		String expuser = "USER";
		System.out.println(user);
		Assert.assertEquals(user, expuser);

	}

	@Test(priority = 4)
	public void manageMenu() {

		String manage = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[4]/a");
		String expmanage = "MANAGE";
		System.out.println(manage);
		Assert.assertEquals(manage, expmanage);

	}

	@Test(priority = 5)
	public void taskMenu() {

		String task = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/a");
		String exptask = "TASK";
		System.out.println(task);
		Assert.assertEquals(task, exptask);
	}

	@Test(priority = 6)
	public void feebackMenu() {

		String feedback = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[6]/a");
		System.out.println(feedback);
		Assert.assertEquals(feedback, "FEEDBACK");
	}

	@Test(priority = 7)
	public void profileMenu() {

		String profile = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[7]/a");
		System.out.println(profile);
		Assert.assertEquals(profile, "PROFILE");
	}

	@Test(priority = 8)
	public void rewardpointsMenu() {

		String rewardpoints = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[8]/a");
		System.out.println(rewardpoints);
		Assert.assertEquals(rewardpoints, "REWARD POINTS");
	}

	@Test(priority = 9)
	public void reportsMenu() {

		String reports = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[9]/a");
		System.out.println(reports);
		Assert.assertEquals(reports, "REPORTS");
	}

	@Test(priority = 10)
	public void logoutMenu() {

		String logout = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[2]/li/a");
		System.out.println(logout);
		Assert.assertEquals(logout, "LOGOUT");
	}

	@Test(priority = 11)
	public void taskresponses() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/a");
		String taskresponses = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/ul/li/a[1]");
		
		System.out.println(taskresponses);
		Assert.assertEquals(taskresponses, "TASK RESPONSES");
	}

	@Test(priority = 12)
	public void managetask() {
		KeywordCommon.mouseOver("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/a");
		String managetask = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/ul/li/a[2]");
		System.out.println(managetask);
		Assert.assertEquals(managetask, "MANAGE TASK");

	}

	@Test(priority = 13, groups = "taskResponses", alwaysRun = true)
	public void clickontaskResponses() {
		KeywordCommon.pause(300);
		KeywordCommon.mouseOver("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/a");
		KeywordCommon.clickButton("xpath",
				"/html/body/div/div[2]/div/ul[1]/li[5]/ul/li/a[1]");

	}

	@Test(priority = 14, groups = "clickontaskResponses", alwaysRun = true)
	public void Pagetitle_taskresponses() {

		KeywordCommon.pause(500);
		String lbltaskresponses = KeywordCommon.driver.findElement(
				By.xpath("/html/body/div/div[3]/h3")).getText();
		System.out.println(lbltaskresponses);
		Assert.assertEquals(
				lbltaskresponses,
				"Task Responses.(you will not see task which already accepted by users and waiting for feedback submission. )");

	}

	@Test(priority = 15, groups = "clickontaskResponses", alwaysRun = true)
	public void firstPageDisabled() {
		KeywordCommon.pause(300);
		String firstpage = KeywordCommon.driver
				.findElement(
						By.cssSelector("html body div#wrap div#inner-wrap form#taskNamesForResponses div.jmesa table#tag.table thead tr.toolbar td table tbody tr td img"))
				.getAttribute("alt");
		System.out.println(firstpage);
		Assert.assertEquals(firstpage, "First");
	}

	@Test(priority = 16, groups = "clickontaskResponses", alwaysRun = true)
	public void prevPageDisabled() throws InterruptedException {
		KeywordCommon.pause(300);
		String prevpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[2]/img"))
				.getAttribute("alt");
		System.out.println(prevpage);
		Assert.assertEquals(prevpage, "Prev");
	}

	@Test(priority = 17, groups = "clickontaskResponses", alwaysRun = true)
	public void nextPageDisabled() {
		KeywordCommon.pause(300);
		String nextpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[3]/img"))
				.getAttribute("alt");
		System.out.println(nextpage);
		Assert.assertEquals(nextpage, "Next");
	}

	@Test(priority = 18, groups = "clickontaskResponses", alwaysRun = true)
	public void lastPageDisabled() {
		KeywordCommon.pause(300);
		String lastpage = KeywordCommon.driver
				.findElement(
						By.xpath("/html/body/div/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[4]/img"))
				.getAttribute("alt");
		System.out.println(lastpage);
		Assert.assertEquals(lastpage, "Last");
	}

	@Test(priority = 19, groups = "clickontaskResponses", alwaysRun = true)
	public void selectRows() {
		KeywordCommon.pause(300);
		String selectrows = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[6]/select"))
				.getAttribute("name");
		System.out.println(selectrows);
		Assert.assertEquals(selectrows, "maxRows");
	}

	@Test(priority = 20, groups = "clickontaskResponses", alwaysRun = true)
	public void cvsexport() {
		KeywordCommon.pause(300);
		String cvsexport = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[8]/a/img"))
				.getAttribute("title");
		System.out.println(cvsexport);
		Assert.assertEquals(cvsexport, "CSV Export");
	}

	@Test(priority = 21, groups = "clickontaskResponses", alwaysRun = true)
	public void xlsexport() {
		KeywordCommon.pause(300);
		String xlsexport = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[9]/a/img"))
				.getAttribute("title");
		System.out.println(xlsexport);
		Assert.assertEquals(xlsexport, "XLS Export");
	}

	@Test(priority = 22, groups = "clickontaskResponses", alwaysRun = true)
	public void pdfexport() {
		KeywordCommon.pause(300);
		String pdfexport = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[10]/a/img"))
				.getAttribute("title");
		System.out.println(pdfexport);
		Assert.assertEquals(pdfexport, "PDF Export");
	}

	@Test(priority = 23, groups = "clickontaskResponses", alwaysRun = true)
	public void filter() {
		KeywordCommon.pause(300);
		String filter = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[12]/a/img"))
				.getAttribute("alt");
		System.out.println(filter);
		Assert.assertEquals(filter, "Filter");
	}

	@Test(priority = 24, groups = "clickontaskResponses", alwaysRun = true)
	public void clear() {
		KeywordCommon.pause(300);
		String clear = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[1]/td/table/tbody/tr/td[13]/a/img"))
				.getAttribute("alt");
		System.out.println(clear);
		Assert.assertEquals(clear, "Clear");
	}

	@Test(priority = 25, groups = "clickontaskResponses", alwaysRun = true)
	public void taskIdFilter() {
		KeywordCommon.pause(300);
		String taskidfilter = KeywordCommon.driver
				.findElement(
						By.xpath("html/body/div[1]/div[3]/form/div/table/thead/tr[2]/td/div"))
				.getAttribute("onclick");
		System.out.println(taskidfilter);
		Assert.assertEquals(taskidfilter,
				"jQuery.jmesa.createDynFilter(this, 'tag','taskUniqueName')");
	}

	@Test(priority = 26, groups = "clickontaskResponses", alwaysRun = true)
	public void clickonbelowtask_taskResponses() {
		KeywordCommon.pause(300);
		String clickonbelowtask = KeywordCommon.getActualText("xpath",
				"html/body/div[1]/div[3]/form/div/table/thead/tr[3]/td/div");
		System.out.println(clickonbelowtask);
		Assert.assertEquals(clickonbelowtask,
				"Click on below task to see responces.");
	}

	@Test(priority = 27, groups = "clickontaskresponses", alwaysRun = true)
	public void storedetails_TaskrRsponses() {

		KeywordCommon.pause(300);
		String storedetails = KeywordCommon.getActualText("xpath",
				"/html/body/div/div[3]/form/div/table/tbody[1]/tr/td/a");
		System.out.println(storedetails);
		Assert.assertEquals(storedetails, "Store Details");
	}

	@Test(priority = 28, groups = "clickontaskresponses", alwaysRun = true)
	public void Facebook_Logo() {
		KeywordCommon.pause(300);
		String facebooklogo = KeywordCommon.driver.findElement(
				By.xpath("/html/body/div/div[4]/div/div/a[1]/img"))
				.getAttribute("src");
		System.out.println(facebooklogo);
		Assert.assertEquals(facebooklogo,
				"http://localhost:8090/Dmall/images/icon-fb.png");
	}

	@Test(priority = 29, groups = "clickontaskresponses", alwaysRun = true)
	public void twitter_logo() throws InterruptedException {

		KeywordCommon.pause(300);
		String tw = KeywordCommon.driver.findElement(
				By.xpath("/html/body/div/div[4]/div/div/a[2]/img"))
				.getAttribute("src");
		System.out.println(tw);
		Assert.assertEquals(tw,
				"http://localhost:8090/Dmall/images/icon-tw.png");
	}

	@Test(priority = 30, groups = "clickontaskresponses", alwaysRun = true)
	public void in_logo() throws InterruptedException {

		KeywordCommon.pause(300);
		String in = KeywordCommon.driver.findElement(
				By.xpath("/html/body/div/div[4]/div/div/a[3]/img"))
				.getAttribute("src");
		System.out.println(in);
		Assert.assertEquals(in,
				"http://localhost:8090/Dmall/images/icon-in.png");
	}

	/*
	 * @Test(priority=15,groups="clickontaskresponses",alwaysRun=true) public
	 * 
	 * void clickonstoredetails_TaskResponses() { KeywordCommon.pause(300);
	 * String storedetails = KeywordCommon.clickButton("xpath"
	 * ,"/html/body/div/div[3]/form/div/table/tbody[1]/tr/td/a"); }
	 */
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
