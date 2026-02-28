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


public class AddToCart_TC_AMZ_004 extends BaseClass {
	
	@Test
	public void AddToCart() throws IOException 
	{
		//Open Url
		driver.get(url);
		logger.info("Url Open");
		AddToCart_PageObject atc = new AddToCart_PageObject(driver);
		atc.searchProduct("mobile");
		logger.info("Enter 'mobile' on searchBox");
		atc.addToCart();
		logger.info("Clicked on AddToCart link");
		//atc.screenshot();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
