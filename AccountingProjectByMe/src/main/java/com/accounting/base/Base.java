package com.accounting.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.accounting.pages.LoginPagee;
import com.accounting.test.LoginPageTesingClass;
import com.accounting.util.PageLoadingTime;

public class Base {

	public static WebDriver driver;

	public static Properties prop;

	public Base() {
		try {

			prop = new Properties();

			FileInputStream fis = new FileInputStream(
					"F:\\WORKSPACE_DECEMBER_MONTH\\AccountingProjectByMe\\src\\main\\java\\com\\accounting\\config\\config.properties");

			prop.load(fis);

		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(PageLoadingTime.page_load_time, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(PageLoadingTime.implicit_wait, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}
}
