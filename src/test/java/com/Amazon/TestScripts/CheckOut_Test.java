package com.Amazon.TestScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Amazon.Listener.Listener;
import com.Amazon.PageObjectClasses.CheckoutProcess_PageObject;
@Listeners(Listener.class)
public class CheckOut_Test extends BaseClass{
	
	CheckoutProcess_PageObject checkoutprocess;
	
	@Test
	public void checkOutProcess() throws InterruptedException 
	{
		checkoutprocess = new CheckoutProcess_PageObject(driver);
		driver.get(url);
		checkoutprocess.searchProduct();
		
	}
	
	
	
	
	
	
	

}
