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



//WebElements 
	@FindBy (id = "twotabsearchtextbox")
	WebElement searchBox;

	@FindBy (id = "nav-search-submit-button")
	WebElement searchBtn;
	
	@FindBy (id = "nav-link-accountList-nav-line-1") 
	WebElement AccountAndLists;
	
	
	
	
	
	//Action Methods
	public void searchProduct(String product) {
        searchBox.sendKeys(product);
        searchBtn.click();
    }
	
	
	public void clickOnAccountAndLists() 
	{
		AccountAndLists.click();
	}












}
