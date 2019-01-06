package com.ingecno.MysteryShoppers.test.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;

public class MyProfileTestCases extends BaseTestCase {
	/*static WebDriver driver = new FirefoxDriver();
	String UrlLink = "http://localhost:9090/mystery/allusers.action";
*/
	// By Welcome= By.className("nav1");
	@FindBy(id = "login_users_uname")
	WebElement username;

	@FindBy(id = "login_users_upass")
	WebElement password;

	@FindBy(id = "login_label_login")
	WebElement loginbtn;

	@FindBy(xpath = ".//*[@id='nav']/li[7]/a")
	WebElement profileMenu;
	
	@FindBy(xpath = ".//*[@id='nav']/li[2]/a")
	WebElement usermenu;

	@FindBy(className = "content")
	WebElement profileHeading;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[1]/td[1]")
	WebElement unameLabel;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[2]/td[1]")
	WebElement pwdLabel;

	
	@FindBy(xpath = "html/body/div[1]/div[3]/div/table[3]/tbody/tr[3]/td[1]")
	WebElement Fname;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[4]/td[1]")
	WebElement Lname;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[5]/td[1]")
	WebElement CityLabel;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[6]/td[1]")
	WebElement AddLabel;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[7]/td[1]")
	WebElement number;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/table[3]/tbody/tr[8]/td[1]")
	WebElement emailid;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/input[1]")
	WebElement EditButton;

	@FindBy(xpath = ".//*[@id='inner-wrap']/div/input[2]")
	WebElement ChangePwdBtn;

	/*@Test(priority = 1) 
	public void EnterCredential() {
		PageFactory.initElements(KeywordCommon.driver, this);
		username.sendKeys("dipak");
		password.sendKeys("dipak");
		loginbtn.click();
		
	}*/


	/*
	@Test(priority = 2) 
	public void clickOnProfile() {
		KeywordCommon.driver.switchTo().defaultContent();
		PageFactory.initElements(KeywordCommon.driver, this);
		profileMenu.click();
	}*/

	/*@Test(priority = 3) 
	public void profileHeading() throws Exception {

		KeywordCommon.pause(3000);
		String actualHeading = KeywordCommon.getActualText("xpath", ".//*[@id='inner-wrap']/div/h3");
		Assert.assertEquals(actualHeading, "My Profile");
		
		
			
	}*/

	/*@Test(priority = 4) 
	public void userNameText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		WebElement we11=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/table[3]/tbody/tr[6]/td[2]"));
		we11.getText();
		System.out.println("asdsad   >>  "   + we11.getText());
		WebElement we112=driver.findElement(By.xpath("html/body/div[1]/div[3]/div/table[3]/tbody/tr[6]/td[1]"));
		we112.getText();
		String actualUname = unameLabel.getText();
		String expectedUname = "Username";
		Assert.assertEquals(actualUname, expectedUname);
		//System.out.println("we112we112we112we112   >>  "   + Fname.getText());
	}
	*/
	
	@Test(priority = 5) 
	public void passwordText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		String actualpwdText = pwdLabel.getText();
		String expectedpwdText = "Password";
		Assert.assertEquals(actualpwdText, expectedpwdText);
	}
	
	@Test(priority = 6) 
	public void FNText() throws InterruptedException {
		KeywordCommon.driver.switchTo().defaultContent();
		Thread.sleep(2000);
		PageFactory.initElements(KeywordCommon.driver, this);
		/*String actualFNText = Fname.getText();
		String expectedFNText = "First Name";*/
		WebElement we11=KeywordCommon.driver.findElement(By.xpath("html/body/div[1]/div[3]/div/table[3]/tbody/tr[3]/td[1]"));
		we11.getText();
		System.out.println("asdsad   >>  "   + we11.getText());
		
		//System.out.println("First Name label is" +actualFNText );
		//String expectedFNText = "First Name";
		//Assert.assertEquals(actualFNText, expectedFNText);
	}
	
   @Test(priority = 7) 
	public void LNText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		String actualLNText = Lname.getText();
		String expectedLNText = "Last Name";
		Assert.assertEquals(actualLNText, expectedLNText);
	}
	
	@Test(priority = 8)
	public void CityText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		String actualCityText = CityLabel.getText();
		String expectedCityText = "City";
		Assert.assertEquals(actualCityText, expectedCityText);
	}
	
	@Test(priority = 9)
	public void AddressText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		String actualAddressText = AddLabel.getText();
		String expectedAddressText = "Address";
		Assert.assertEquals(actualAddressText, expectedAddressText);
	}
	
	@Test(priority = 10)
	public void ContactNoText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		String actualContactNoText = number.getText();
		Assert.assertEquals(actualContactNoText, "Contact No");
	}
	
	@Test(priority = 11)
	public void EmailText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		String actualEmailText = emailid.getText();
		String expectedEmailText = "Email ID";
		Assert.assertEquals(actualEmailText, expectedEmailText);
	}
	
	@Test(priority = 12)
	public void EditBtnText() {
		PageFactory.initElements(KeywordCommon.driver, this);
	System.out.println("value of button is " +EditButton.getAttribute("value"));
	   String actualEditBtnText = EditButton.getAttribute("value");	
		Assert.assertTrue(actualEditBtnText.equalsIgnoreCase("EDIT"));
	}
	
	@Test(priority = 13) 
	public void ChangePwdBtnText() {
		PageFactory.initElements(KeywordCommon.driver, this);
		System.out.println("value of change password button is " +ChangePwdBtn.getAttribute("value"));
		String actualChangePwdBtnText = ChangePwdBtn.getAttribute("value");
	  //actualGoBtnText.getAttribute("value");
		//String expectedChangePwdBtnText = "CHANGE PASSWORD";
		Assert.assertTrue(actualChangePwdBtnText.equalsIgnoreCase("CHANGE PASSWORD"));
	}
	
	/*@BeforeSuite
	public void browserSetup() {
		KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
		KeywordCommon.maximizeBowser();
		KeywordCommon.navigate(CONFIG.getProperty("url"));
	}*/

	public static WebDriver openBrowser() {
		return KeywordCommon.driver;
	}

	/*@AfterSuite
	public void afterSuite() {
		driver.close();
	}*/
}
