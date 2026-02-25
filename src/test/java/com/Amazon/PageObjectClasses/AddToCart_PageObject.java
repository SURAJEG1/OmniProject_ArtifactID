package com.Amazon.PageObjectClasses;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.Utilities.ScreenshotUtility;

public class AddToCart_PageObject {
	
	//Create object of local WebDriver
	WebDriver driver;
	
	
	//Constructor
	public AddToCart_PageObject(WebDriver rdriver) 
	{
		this.driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	//WebElement
	@FindBy(xpath = "//input[contains(@id,'twotabsearchtextbox')]") 
	WebElement searchBox;
	
	@FindBy(xpath ="//button[contains(@id,'a-autoid-3-announce')]") 
	WebElement addToCart;
	
	
	
	//Perform Action on WebElement
	public void searchProduct(String prod) 
	{
		searchBox.sendKeys(prod);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	public void addToCart() 
	{
		addToCart.click();
	}
	
	
	
	public void screenshot() throws IOException 
	{
		ScreenshotUtility screenshot = new ScreenshotUtility(driver);
		screenshot.screenshot();
	}
	
	
	

}
