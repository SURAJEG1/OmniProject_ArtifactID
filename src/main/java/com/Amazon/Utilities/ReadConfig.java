package com.Amazon.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	//Create object of "Properties"
	Properties properties;
	String path = "E:\\InfoEge Automation Project\\OmniProject_ArtifactID\\src\\main\\java\\ConfigurationResource\\Config.properties";
	
	public ReadConfig() 
	{
		try {
			
		properties = new Properties();
		FileInputStream fis = new FileInputStream(path);
		properties.load(fis);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//Method for URL Key
	public String getBaseUrl() 
	{
		String value = properties.getProperty("baseUrl");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Url is not spacified in config file");
	}
	
	
	
	//Method for Browser Key
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("Broser is not spacified in config file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
