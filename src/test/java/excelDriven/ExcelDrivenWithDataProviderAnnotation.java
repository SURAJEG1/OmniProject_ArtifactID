package excelDriven;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import com.Amazon.Utilities.ExcelFileUtility;
import com.Amazon.Utilities.ScreenshotUtility;

public class ExcelDrivenWithDataProviderAnnotation {

	//Create Object of WebDriver
	WebDriver driver;

	@BeforeMethod
	public void setup() 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}


	@Test(dataProvider = "DataProvider")
	public void loginCredentils(String un, String pwd) 
	{
		WebElement userName=driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement password=driver.findElement(By.cssSelector("input[placeholder='Password']"));
		WebElement loginBtn=driver.findElement(By.cssSelector("button[type='submit']"));

		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.submit();
	}




	@DataProvider(name = "DataProvider")
	public String[][] lognDataProvider() throws IOException
	{
		/*
		String[][] data=new String[3][2];
        // valid username and valid password		
		data [0][0] = "Admin";
		data [0][1] = "admin123";

		// K sensitive username and valid password		
		data [1][0] = "admin";
		data [1][1] = "admin123";
		
		// invalid username and invalid password
		data [2][0] = "admin";
		data [2][1] = "admin1234";      */
		
		
		//Example-2 Using Excel File for login data.
		String fileName = "E:\\InfoEge Automation Project\\OmniProject_ArtifactID\\Excelfolder\\Logindetails.xlsx";
		String sheetName = "Credentials";
				
		return ExcelFileUtility.readExcelData(fileName,sheetName);
	}



	
	
	@AfterMethod
	public void tearDown() throws InterruptedException, IOException 
	{
		Thread.sleep(3000);
		/*
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHss").format(new Date());
		File source=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\InfoEge Automation Project\\OmniProject_ArtifactID\\Screenshot\\loginPage"+timestamp+".png");
		FileUtils.copyFile(source, destination);
		*/
		ScreenshotUtility screenShot = new ScreenshotUtility(driver);
		screenShot.screenshot();
		driver.quit();
	}





}
