package com.ingecno.MysteryShoppers.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;

public class BaseTestCase {
	//public static void main(String[] args) {
		
	

	//public String testDataFilePath = System.getProperty("user.dir")+"src\\com\\ingecno\\MysteryShoppers\\data\\";
	
	public String testDataFilePath ="D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\data\\logindata.xls";
	
	public String registDataFilePath = "D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\data\\registration.xls";
	
	//public String propertyfilePath=System.getProperty("user.dir")+"src\\com\\ingecno\\MysteryShoppers\\config\\";
	
	public static Logger APP_LOGS;
 
	// all keywords implementation
	public static KeywordCommon keywords;
	
	// properties
	public static Properties CONFIG;

	@BeforeSuite
	public void loadConfigFiles() {
		FileInputStream fs = null;
		CONFIG = new Properties();
		try {
			//System.out.println("loading >> "+propertyfilePath + "config.properties");
			//fs = new FileInputStream(propertyfilePath + "config.properties");
			
			fs = new FileInputStream("D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\config\\config.properties");
			
			CONFIG.load(fs);
			//System.out.println("loaded >> "+propertyfilePath + "config.properties");
			//PropertyConfigurator.configure(propertyfilePath + "log4j.properties");

			PropertyConfigurator.configure("D:\\JavaNewWorkspce\\MysteryShoppers\\src\\com\\ingecno\\MysteryShoppers\\config\\log4j.properties");

			System.out.println(111);
			/*KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
			System.out.println(222);
			KeywordCommon.maximizeBowser();
			KeywordCommon.navigate(CONFIG.getProperty("url"));
		
			*/
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@AfterSuite
	public void browserSetup() {
		KeywordCommon.closebrowser();
	}
}
//}
	
