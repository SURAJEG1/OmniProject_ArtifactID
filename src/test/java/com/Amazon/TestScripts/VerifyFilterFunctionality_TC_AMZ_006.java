package com.Amazon.TestScripts;

import org.testng.annotations.Test;

import com.Amazon.PageObjectClasses.CheckoutProcess_PageObject;
import com.Amazon.PageObjectClasses.HomePage_PageObject;

public class VerifyFilterFunctionality_TC_AMZ_006 extends BaseClass{
	
	
	@Test
	public void filterByBrandTest() throws InterruptedException 
	{
		driver.get(amazonUrl);
		
		HomePage_PageObject homePage = new HomePage_PageObject(driver);
		logger.info("Browser and Url Open ");
		homePage.searchProduct("Samsung Mobile");
		logger.info("Enter Apple mobile on search box");
		
		//Applied Apple brand filter
		CheckoutProcess_PageObject checkOut = new CheckoutProcess_PageObject(driver);
		checkOut.selectBrandApple();
		logger.info("Applied filter on brand samsung");
		checkOut.validationForAppleBrand();
		logger.info("Validate varify brand samsung");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
