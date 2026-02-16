package com.Amazon.TestScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Amazon.Utilities.ReadConfig;

public class BaseClass {
	
	//Create Object of ReadConfig Class
	public static WebDriver driver;
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	
	@BeforeClass
	public void setup() 
	{
		switch (browser.toLowerCase()) 
		{
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--incognito");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
