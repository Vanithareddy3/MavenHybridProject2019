package com.qa.linkedin.testcases;

import org.testng.annotations.Test;

import com.qa.linkedin.base.TestBase;
import com.qa.linkedin.pages.LinkedinHomePage;
import com.qa.linkedin.pages.LinkedinLoggedInPage;
import com.qa.linkedin.pages.LinkedinLoginPage;
import com.qa.linkedin.pages.SearchResultsPage;
import com.qa.linkedin.util.TestUtil;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SearchDDTTest extends TestBase {
	LinkedinHomePage hmpg=null;
	LinkedinLoginPage lpg=null;
	LinkedinLoggedInPage lggpg=null;
	SearchResultsPage srpg=null;
	
	
  public SearchDDTTest() throws IOException {
		super();
		
	}

  @BeforeClass
  public void beforeClass() throws IOException {
	  initializeTheBrowser();
	  hmpg=new LinkedinHomePage();
	  lpg=new LinkedinLoginPage();
	  lggpg=new LinkedinLoggedInPage();
	 // srpg=new SearchResultsPage();
	  hmpg.clickOnSignInLink();
	  lpg.login(prop.getProperty("username"),prop.getProperty("pwd"));
	  
  }
/*
  @Test(dataProvider = "dp")
  public void searchTest(String s) throws InterruptedException, IOException {
	Assert.assertTrue(lggpg.verifyprofileCard());
	lggpg.searchPeople(s);
	int cnt=srpg.getResultsCount();
	System.out.println("results count for" +s+"is--->"+cnt);
	driver.navigate().back();
  }

  @DataProvider
  public Object[][] dp() throws IOException {
    Object[][] data=TestUtil.getTestData(TestUtil.TESTDATA_SHEET_PATH1, "Sheet1");
     
    return data;  
    
  }
*/
  @AfterClass
  public void afterClass() {
	  lggpg.logOut();
	  driver.close();
  }

}
