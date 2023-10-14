package generic_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.Authentication.Failure;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch implements Framework_constants
{
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(gk,gv);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod 
	public void closeApp(ITestResult res) throws Exception
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
		Photo.capture(driver);
		}
		driver.quit();
	}
}
