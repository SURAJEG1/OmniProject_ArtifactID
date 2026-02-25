package com.Amazon.PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageObject {
	
	//create object of WebDriver;
	WebDriver driver;
	
	//Constructor
	public LoginPage_PageObject(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "nav-link-accountList")
    WebElement signInBtn;

    @FindBy(id = "ap_email")
    WebElement email;

    @FindBy(id = "continue")
    WebElement continueBtn;

    @FindBy(id = "ap_password")
    WebElement password;

    @FindBy(id = "signInSubmit")
    WebElement loginBtn;
	
	
	
    public void login(String user, String pass) {
        signInBtn.click();
        email.sendKeys(user);
        continueBtn.click();
        password.sendKeys(pass);
        loginBtn.click();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
