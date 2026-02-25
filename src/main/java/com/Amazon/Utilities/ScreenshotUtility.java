package com.Amazon.Utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	// Create Object Of WebDriver.
	WebDriver driver;
	public ScreenshotUtility(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	
	
	public void screenshot() throws IOException 
	{
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHss").format(new Date());
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\InfoEge Automation Project\\OmniProject_ArtifactID\\Screenshot\\screnshot"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
