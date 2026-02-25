package com.Amazon.TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazon.Listener.Listener;
import com.Amazon.PageObjectClasses.AddToCart_PageObject;
import com.Amazon.PageObjectClasses.CheckoutProcess_PageObject;
@Listeners(Listener.class)
public class CheckOut_Test extends BaseClass{
	
	CheckoutProcess_PageObject checkoutprocess;
	AddToCart_PageObject addToCart;
	
	@Test
	public void checkOutProcess() throws InterruptedException 
	{
		checkoutprocess = new CheckoutProcess_PageObject(driver);
		driver.get(url);
		logger.info("Url Open");
		addToCart = new AddToCart_PageObject(driver);
		addToCart.searchProduct("mobile");
		logger.info("Enter mobile on searchBox and enter");
		
		checkoutprocess.clickOnBrandsSeeMore();
		logger.info("Clicked on Brands See more Option");
		checkoutprocess.selectBrandPoco();
		logger.info("Selected Brand as POCO");
		checkoutprocess.clickOnProductPrice();
		logger.info("Clicked on Product Price link");
		checkoutprocess.clickOnAddToCart();
		logger.info("Clicked on AddToCart link");
		checkoutprocess.clickOnUpdateLocation();
		logger.info("Clicked on Update Location link");
		checkoutprocess.enterAnIndianPincode();
		logger.info("Enter pincode in 'Enter An Indian Pincode box' ");
		checkoutprocess.clickOnApply();
		logger.info("Clicked on Apply link");
		checkoutprocess.clickOnProceedToBuy();
		logger.info("Clicked on Proceed To Buy link");
		checkoutprocess.clickOnSignInOrCreateAccount();
		logger.info("Clicked on Sign In Or Crate Account Link");
		checkoutprocess.clickOnContinue();
		logger.info("Clicked on Continue link");
	}
	
	
	
	
	
	
	

}
