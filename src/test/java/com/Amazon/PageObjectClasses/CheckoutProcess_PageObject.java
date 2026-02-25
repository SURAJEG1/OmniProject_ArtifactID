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
	
	
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']") 
	WebElement searchBox;
	
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
	
	
	
	
	public void searchProduct() throws InterruptedException 
	{
		//Search Mobile and Enter
		scrollingWindow = new ScrollingWindow(driver);
		searchBox.sendKeys("mobile");
		searchBox.sendKeys(Keys.ENTER);
		//page scroll down
		scrollingWindow.windowScroll_Down300();
		//Filter and click on POCO brand
		Thread.sleep(2000);
		selectBrand_POCO.click();
		//page scroll down
		scrollingWindow.windowScroll_Down400();
		//Click on select phone
		clickOnProductPrice.click();
		System.out.println(clickOnProductPrice.getText());
		//switch to child window
		windowHandles = new WindowHandles(driver);
		windowHandles.getWindowHandles_Child();
		//page scroll down
		scrollingWindow.windowScroll_Down400();
		//Click on AddToCart
		addToCartButton.click();
		//Click on update location and enter location pin code 462043 and clickOnApply 
		clickOnUpdateLocation.click();
		enterAnIndianPincode.sendKeys("462023");
		clickOnApply.click();
		Thread.sleep(4000);
		//Click on Proceed To Buy
		proceedToBuy.click();
		//Click on Sign or create account
		signInOrCreateAccount.sendKeys("1010101010");
		//Click on continue
		clickOnContinue.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
