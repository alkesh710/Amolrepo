package com.ingecno.MysteryShoppers.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ingecno.MysteryShoppers.common.BaseTestCase;
import com.ingecno.MysteryShoppers.keyword.common.KeywordCommon;

public class LoginpageTestClass extends BaseTestCase{
  
	@BeforeSuite
  public void setUp() {
	 KeywordCommon.openBrowser(CONFIG.getProperty("browser"));
	 KeywordCommon.maximizeBowser();
	 KeywordCommon.navigate(CONFIG.getProperty("url"));
	}

   @Test(priority= 1)
   public void Blank(){
	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[1]/td/input", "");
	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[2]/td/input","");
     KeywordCommon.clickButton("xpath", "html/body/div[1]/form/table/tbody/tr[4]/td/div[1]/input[1]");
  
    String s= KeywordCommon.getActualText("xpath", "html/body/div[1]/div/ul/li/span");
    
    Assert.assertEquals(s, "Invalid Username or Password. Please try again.");
   
   }
      
   @Test(priority= 2)
   public void blankName() throws InterruptedException{
	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[1]/td/input", "");
	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[2]/td/input","dipak");
     KeywordCommon.clickButton("xpath", "html/body/div[1]/form/table/tbody/tr[4]/td/div[1]/input[1]");
  
    String s= KeywordCommon.getActualText("xpath", "html/body/div[1]/div/ul/li/span");
    Thread.sleep(2000);
    Assert.assertEquals(s, "Invalid Username or Password. Please try again.");
    
   }

   @Test(priority= 3)
   public void blankPwd() throws Exception{
	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[1]/td/input", "dipak");
	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[2]/td/input","");
     KeywordCommon.clickButton("xpath", "html/body/div[1]/form/table/tbody/tr[4]/td/div[1]/input[1]");
  
    String s= KeywordCommon.getActualText("xpath", "html/body/div[1]/div/ul/li/span");
    Thread.sleep(2000);
    Assert.assertEquals(s, "Invalid Username or Password. Please try again.");
   }  
    @Test(priority= 4)
    public void validCredential(){
 	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[1]/td/input", "dipak");
 	 KeywordCommon.enter_text("xpath", "html/body/div[1]/form/table/tbody/tr[2]/td/input","dipak");
     KeywordCommon.clickButton("xpath", "html/body/div[1]/form/table/tbody/tr[4]/td/div[1]/input[1]");
   
   
     
    }

    
   }


