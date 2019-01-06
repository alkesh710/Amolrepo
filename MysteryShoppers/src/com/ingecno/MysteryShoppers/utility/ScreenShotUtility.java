package com.ingecno.MysteryShoppers.utility;

import java.io.File;

//ScreenShotUtility.screenshot("Login");

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;


public class ScreenShotUtility {
	
	public static void screenshot(String screenshotname) throws Exception {


		WebDriver driver = KeywordCommon.driver;

		System.out.println("NAme screen" + screenshotname);
		//System.out.println("screenshot");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("D:\\JavaNewWorkspce\\MysteryShoppers\\Screenshot" + screenshotname
				+ ".png"));
		System.out.println("ScreenShot Taken");
	}

}
