package com.Amazon.Utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandles {
	
	//Create object of WebDriver;
	WebDriver driver;
	
	public WindowHandles(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	
	public void getWindowHandles_Child() throws InterruptedException 
	{
		Thread.sleep(1000);
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String patent = it.next();
		String child = it.next();
		
		//driver.switchTo().window(patent);
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	public void getWindowHandles_Patent() throws InterruptedException 
	{
		Thread.sleep(1000);
		Set<String> wd = driver.getWindowHandles();
		Iterator<String> it = wd.iterator();
		String patent = it.next();
		String child = it.next();
		
		driver.switchTo().window(patent);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
