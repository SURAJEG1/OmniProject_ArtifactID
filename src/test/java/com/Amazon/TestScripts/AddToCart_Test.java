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


public class AddToCart_Test extends BaseClass {
	
	@Test
	public void AddToCart() throws IOException 
	{
		driver.get(url);
		AddToCart_PageObject atc = new AddToCart_PageObject(driver);
		atc.searchProduct("mobile");
		atc.addToCart();
		//atc.screenshot();
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	

}
