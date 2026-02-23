package com.Amazon.TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Amazon.PageObjectClasses.AddToCart_PageObject;


public class AddToCart_TestScript extends BaseClass {

	
	@Test(priority=1)
	public void Tc001_SearchProduct() 
	{
		driver.get(url);
		AddToCart_PageObject atc = new AddToCart_PageObject(driver);
		atc.searchProduct("mobile");
	}
	
	
	
	@Test(priority=2)
	public void Tc002_AddToCart() throws IOException 
	{
		AddToCart_PageObject atc = new AddToCart_PageObject(driver);
		atc.addToCart();
		//atc.screenshot();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
