package com.Amazon.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage_PageObject {

	//Create object of WebDriver;
	WebDriver driver;

	//Constructor
	public ProductPage_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement firstProduct;

	@FindBy(id = "add-to-cart-button")
	WebElement addToCart;

	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceedToCheckout;
	
	
	
	
	public void selectProduct() {
        firstProduct.click();
    }

    public void addToCart() {
        addToCart.click();
    }

    public void proceedToCheckout() {
        proceedToCheckout.click();
    }














}
