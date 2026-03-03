package com.Amazon.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignInPage_PageObject {
	//Create Object of WebDriver;
	WebDriver driver;
	
	public SignInPage_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Enter Email
	@FindBy (id = "ap_email_login") 
	WebElement enterMobileNumberOrEmail;
	
	@FindBy (id = "continue") 
	WebElement Continue;
	
	//Enter Password
	@FindBy (id = "ap_password")
	WebElement enterPassword;
	
	@FindBy (id = "signInSubmit") 
	WebElement signInSubmit;
	
	
	
	//Action method for Enter mobile or Email id and submit
	public void enterMobileNumberOrEmail(String mobOrEmail) 
	{
		enterMobileNumberOrEmail.sendKeys(mobOrEmail);
	}
	
	
	public void clickOnContinueBtn() 
	{
		Continue.click();
	}
	
	
	
	//Action method for Enter password and submit
	public void enterPassword(String pwd) 
	{
		enterPassword.sendKeys(pwd);
	}
	
	public void clickOnSignInSubmit() 
	{
		signInSubmit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
