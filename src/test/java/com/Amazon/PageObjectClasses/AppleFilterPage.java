package com.Amazon.PageObjectClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AppleFilterPage {
	
	//create Object of WebDriver;
	WebDriver driver;
	
	//Constructor
	public AppleFilterPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//WebElements
	@FindBy (xpath = "//span[@class='a-size-base a-color-base'][normalize-space()='Apple']") 
	WebElement applyFilterOnBrand_Apple;
	
	@FindBy (css = ".s-title-instructions-style") 
	List<WebElement> products;
	
	
	
	//Action Methods
	public void selectBrandApple() throws InterruptedException {
		//Filter apply on Apple brand
		Thread.sleep(2000);
		applyFilterOnBrand_Apple.click();
		
	}
	
	public void validationForAppleBrand() {
		for(WebElement product : products){
	        Assert.assertTrue(product.getText().toLowerCase().contains("iPhone"));
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
