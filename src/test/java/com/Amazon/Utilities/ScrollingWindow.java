package com.Amazon.Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollingWindow {
	
	//Create Object of WebDriver;
	WebDriver driver;
	//Constructor
	public ScrollingWindow(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	// Create all methods of windowScrolling 
	
	public void windowScroll_Down500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	
	public void windowScroll_Up500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	
	
	public void windowScroll_LeftSide500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500.0)");
	}
	
	
	public void windowScroll_RightSide500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(-500,0)");
	}
	
	
	
	public void windowScroll_BotomOfPage() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	public void windowScroll_TopOfPage() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	
	
	
	
	
	

}
