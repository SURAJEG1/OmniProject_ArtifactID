package com.Amazon.TestScripts;

import org.testng.annotations.Test;

import com.Amazon.PageObjectClasses.AppleFilterPage;
import com.Amazon.PageObjectClasses.HomePage_PageObject;

public class VerifyFilterFunctionality_TC_AMZ_006 extends BaseClass{
	
	
	@Test
	public void filterByBrandTest() throws InterruptedException 
	{
		driver.get(amazonUrl);
		
		HomePage_PageObject homePage = new HomePage_PageObject(driver);
		logger.info("Browser and Url Open ");
		homePage.searchProduct("Apple Phone");
		logger.info("Enter Apple mobile on search box");
		
		//Applied Apple brand filter
		AppleFilterPage checkOut = new AppleFilterPage(driver);
		checkOut.selectBrandApple();
		logger.info("Applied filter on brand Apple");
//		checkOut.validationForAppleBrand();
//		logger.info("Validate varify brand Apple");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
