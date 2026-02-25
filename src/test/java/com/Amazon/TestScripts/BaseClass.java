package com.Amazon.TestScripts;

import java.time.Duration;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.Amazon.Utilities.ReadConfig;


public class BaseClass {
	
	//Create Object of ReadConfig Class
	
	ReadConfig readConfig = new ReadConfig();
	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();
	
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup() 
	{
		switch (browser.toLowerCase()) 
		{
		case "chrome":
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--incognito");
			co.addArguments("--start-maximized");
			driver = new ChromeDriver(co);
			//driver.manage().window().maximize();
			break;
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Logging initialize 
		logger = LogManager.getLogger("OmniProject_ArtifactID");
	}
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
