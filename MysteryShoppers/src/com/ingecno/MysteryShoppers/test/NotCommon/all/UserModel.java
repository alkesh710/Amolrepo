package com.ingecno.MysteryShoppers.test.NotCommon.all;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserModel {
	WebDriver driver;
	String url="http://localhost:9090/mystery/allusers.action";
	
	
	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}
	
	@Test
	public void userInterface() {
		
		
		
	}

}
