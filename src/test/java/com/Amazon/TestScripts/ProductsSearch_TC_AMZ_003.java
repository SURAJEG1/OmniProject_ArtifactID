package com.Amazon.TestScripts;

import org.testng.annotations.Test;

import com.Amazon.PageObjectClasses.AddToCart_PageObject;

public class ProductsSearch_TC_AMZ_003 extends BaseClass{
	
	//Create object of AddToCart_PageObject;
	AddToCart_PageObject addToCart;
	
	
	@Test
	public void checkOut_TestCase() 
	{
		driver.get(url);
		logger.info("Url Open");
		addToCart = new AddToCart_PageObject(driver);
		addToCart.searchProduct("laptop");
		logger.info("Enter 'laptop' on searchBox");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
