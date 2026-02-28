package com.Amazon.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage_PageObject {
	//create object of WebDriver;
	WebDriver driver;

	//Constructor
	public HomePage_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}




	@FindBy(id = "twotabsearchtextbox")
	WebElement searchBox;

	@FindBy(id = "nav-search-submit-button")
	WebElement searchBtn;
	
	
	
	
	public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchBtn.click();
    }
	
	
	
	// Validation
	public void checkUrlOfHomePage() 
	{
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Amazon"));
	}












}
