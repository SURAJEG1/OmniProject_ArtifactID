package com.Amazon.TestScripts;

import org.testng.annotations.Test;

import com.Amazon.PageObjectClasses.HomePage_PageObject;
import com.Amazon.PageObjectClasses.SignInPage_PageObject;

public class login_TC_AMZ_001 extends BaseClass{
	
	
	@Test
	public void AmazonLoginTest() 
	{
		driver.get(amazonUrl);
		logger.info("Url Open");
		
		//Create HomePage Object
		HomePage_PageObject homePage = new HomePage_PageObject(driver);
		homePage.clickOnAccountAndLists();
		logger.info("Clicked on Accoount & List");
		
		
		//Create SignInPage Object
		SignInPage_PageObject signIn = new SignInPage_PageObject(driver);
		signIn.enterMobileNumberOrEmail("111111111");
		logger.info("Enter Mobile no or Email id");
		signIn.clickOnContinueBtn();
		logger.info("Clicked on ContinueBtn");
//		signIn.enterPassword("welcome@123");
//		logger.info("Enter vallid password");
//		signIn.clickOnSignInSubmit();
//		logger.info("Clicked on SignInSubmit");
		titleValidation("Amazon");
		logger.info("Validate SignIn page title");
	}
	
	
	
	
	
	
	
	

}
