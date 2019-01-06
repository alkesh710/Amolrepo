package com.accounting.test;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.accounting.base.Base;
import com.accounting.pages.HomePage;
import com.accounting.pages.LoginPagee;
import com.accounting.pages.SalePage;

public class HomePageTest extends Base{
	HomePage hPage;
	LoginPagee lPage;
	SalePage salePage;
	
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 hPage=new HomePage();
		 lPage=new LoginPagee();
		
		 lPage.validateLogin(prop.getProperty("userName"), prop.getProperty("password"));
	}
	@Test(priority=1)
	public void VerifySalesLink()
	{
		String saleLink=hPage.areWeOnHomePageOrNOt();
		Assert.assertEquals("Sales Types", saleLink);
		
	}
	@Test(priority=2)
	public SalePage clickOnSalesLink()
	{
hPage.clickinOnSaleLink();

	
	return new SalePage();

}
}
