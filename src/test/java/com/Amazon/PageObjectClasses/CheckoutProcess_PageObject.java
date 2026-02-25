package com.Amazon.PageObjectClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Amazon.Utilities.ScrollingWindow;
import com.Amazon.Utilities.WindowHandles;

public class CheckoutProcess_PageObject {

	//Create Objects
	WindowHandles windowHandles;
	ScrollingWindow scrollingWindow;
	WebDriver driver;

	//Constructor
	public CheckoutProcess_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Elements
	@FindBy (xpath = "//a[@aria-label='See more, Brands']//i[@class='a-icon a-icon-extender-expand']")
	WebElement BrandsSeeMore;

	@FindBy (xpath = "//a[@aria-label='Apply the filter POCO to narrow results']//i[@class='a-icon a-icon-checkbox']") 
	WebElement selectBrand_POCO;

	@FindBy (linkText = "POCO C75 5G, Silver Stardust (4GB, 64GB)") 
	WebElement clickOnProductPrice;

	@FindBy (xpath = "(//input[@name='submit.add-to-cart']) [2]") 
	WebElement addToCartButton;

	@FindBy (xpath = "//div[@id='glow-ingress-block']") 
	WebElement clickOnUpdateLocation;

	@FindBy (xpath = "//input[@id='GLUXZipUpdateInput']") 
	WebElement enterAnIndianPincode;

	@FindBy (xpath = "//input[@aria-labelledby='GLUXZipUpdate-announce']")
	WebElement clickOnApply;

	@FindBy (xpath = "//span[@id='sc-buy-box-ptc-button']") 
	WebElement proceedToBuy;

	@FindBy (xpath = "//input[@id='ap_email_login']") 
	WebElement signInOrCreateAccount;

	@FindBy (xpath = "//input[@type='submit']") 
	WebElement clickOnContinue;


	//Action Methods
	public void clickOnBrandsSeeMore() throws InterruptedException {
		//page scroll down
		scrollingWindow = new ScrollingWindow(driver);
		scrollingWindow.windowScroll_Down300();
		Thread.sleep(1000);
		BrandsSeeMore.click();
	}

	public void selectBrandPoco() throws InterruptedException {
		//Filter and click on POCO brand
		Thread.sleep(2000);
		selectBrand_POCO.click();
	}

	public void clickOnProductPrice() {
		//page scroll down
		scrollingWindow.windowScroll_Down400();
		//Click on select phone
		clickOnProductPrice.click();
		System.out.println(clickOnProductPrice.getText());
	}


	public void clickOnAddToCart() throws InterruptedException {
		//switch to child window
		windowHandles = new WindowHandles(driver);
		windowHandles.getWindowHandles_Child();
		//page scroll down
		scrollingWindow.windowScroll_Down400();
		//Click on AddToCart
		addToCartButton.click();
	}

	public void clickOnUpdateLocation() {
		//Click on update location and enter location pin code 462043 and clickOnApply 
		clickOnUpdateLocation.click();
	}

	public void enterAnIndianPincode() {
		enterAnIndianPincode.sendKeys("462023");
	}

	public void clickOnApply() {
		clickOnApply.click();
	}

	public void clickOnProceedToBuy() throws InterruptedException {
		Thread.sleep(4000);
		//Click on Proceed To Buy
		proceedToBuy.click();
	}

	public void clickOnSignInOrCreateAccount() {
		//Click on Sign or create account
		signInOrCreateAccount.sendKeys("1010101010");
	}

	public void clickOnContinue() {
		//Click on continue
		clickOnContinue.click();
	}



















}
