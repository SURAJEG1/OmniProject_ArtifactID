package ReusableComponents;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableMethods {
	WebDriver driver;
	
	//Constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void incognito() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito --start-Maximized");
	}
	
	public void maximize() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void implisitliWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	public void scrollDown_TillBotom() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void scrollDown_500() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
