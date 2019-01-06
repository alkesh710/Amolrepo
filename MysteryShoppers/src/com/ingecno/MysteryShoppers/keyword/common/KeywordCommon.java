package com.ingecno.MysteryShoppers.keyword.common;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ingecno.MysteryShoppers.common.Constants;

public class KeywordCommon {

	public static WebDriver driver;
	public static Logger APP_LOGS;
	public static Properties CONFIG;

	public static Actions actions;

	public static String obj;
	public static Actions action;

	static {
		APP_LOGS = Logger.getLogger(KeywordCommon.class);
	}

	public static String openBrowser(String data) {

		APP_LOGS.debug("Opening browser");
		if (data.equals("Mozilla"))
			
			driver = new FirefoxDriver();
		
		else if (data.equals("IE"))
			
			driver = new InternetExplorerDriver();
		
		else if (data.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"ChromeDriver/chromedriver");
			driver = new ChromeDriver();
			
		}
		return Constants.KEYWORD_PASS;

	}
	
	 

	public static String navigate(String data) {
		APP_LOGS.debug("Navigating to URL");
		try {
			driver.get(data);  
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " -- Not able to navigate";
		}
		return Constants.KEYWORD_PASS;
	}

	public static String maximizeBowser() {
		APP_LOGS.debug("maximize browser");
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " -- maximize browser";
		}
		return Constants.KEYWORD_PASS;
	}

	public static String clickButton(String locatorType, String locatorValue) {
		APP_LOGS.debug("Clicking on Button");
		try {
			By locator = locatorValue(locatorType, locatorValue);
			driver.findElement(locator).click();
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " -- Not able to click on Button"
					+ e.getMessage();
		}

		return Constants.KEYWORD_PASS;
	}

	public static String enter_text(String locatorType, String locatorValue,
			String data) {
		APP_LOGS.debug("Going back one page");
		try {
			By locator = locatorValue(locatorType, locatorValue);
			driver.findElement(locator).sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();
			return Constants.KEYWORD_FAIL
					+ "Unable to go back, Check if its open" + e.getMessage();
		}
		return Constants.KEYWORD_PASS;

	}

	public static String mouseOver(String locatorType, String locatorValue) {
		APP_LOGS.debug("Mouse Over");
		try {

			actions = new Actions(driver);
			By locator = locatorValue(locatorType, locatorValue);
			WebElement mouseOver = driver.findElement(locator);
			actions.moveToElement(mouseOver).build().perform();
		} catch (Exception e) {
			return Constants.KEYWORD_FAIL + " -- Not able to mouse Over"
					+ e.getMessage();
		}

		return Constants.KEYWORD_PASS;

	}

	public static String getActualText(String locatorType, String locValue) {
		APP_LOGS.debug("Verifying the button text");
		String actual = null;
		try {
			By locator = locatorValue(locatorType, locValue);
			actual = driver.findElement(locator).getText();
		} catch (Exception e) {
			e.printStackTrace();
			return Constants.KEYWORD_FAIL + " Object not found "
					+ e.getMessage();
		}
		return actual;
	}

	public static By locatorValue(String locatorTpye, String value) {

		By by = null;

		if ("id".equals(locatorTpye)) {
			by = By.id(value);
		}
		if ("name".equals(locatorTpye)) {
			by = By.name(value);
		}
		if ("xpath".equals(locatorTpye)) {
			by = By.xpath(value);
		}
		if ("css".equals(locatorTpye)) {
			by = By.cssSelector(value);
		}
		if ("class".equals(locatorTpye)) {
			by = By.className(value);
		}
		if ("linkText".equals(locatorTpye)) {
			by = By.linkText(value);
		}
		if ("partialLinkText".equals(locatorTpye)) {
			by = By.partialLinkText(value);
		}

		return by;
	}

	public static void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public static void pause(int milliSec) {
		try {
			Thread.sleep(milliSec);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void drpDownList(String locatorType, String locatorValue,
			String data){
		APP_LOGS.debug("selecting element from dropdownlist");
		try {
			
			By locator = locatorValue(locatorType, locatorValue);
			
		    Select select = new Select(driver.findElement(locator));
		    select.selectByVisibleText(data);
		
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	
	
	}
	public void select(){
		
	}

	public static void closebrowser() {
		driver.close();
	}
}
