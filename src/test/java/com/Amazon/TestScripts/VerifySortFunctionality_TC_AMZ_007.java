package com.Amazon.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.PageObjectClasses.CheckoutProcess_PageObject;
import com.Amazon.PageObjectClasses.HomePage_PageObject;

public class VerifySortFunctionality_TC_AMZ_007 extends BaseClass{
	
	
	@Test
	public void shorPrisetLowToHighTest() 
	{
		driver.get(amazonUrl);
		logger.info("Url Open");
		HomePage_PageObject homePage = new HomePage_PageObject(driver);
		homePage.searchProduct("laptop");
		logger.info("Enter 'laptop' to serchBox");
		CheckoutProcess_PageObject sort = new CheckoutProcess_PageObject(driver);
		sort.sortLowToHighTest();
		logger.info("sort: Low to high price");
		Assert.assertTrue(driver.getPageSource().contains("Price"));
		pageScourceValication("Price");
		logger.info("Assertion Pass");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
