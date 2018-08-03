package generic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase implements AutoConstant{
	public WebDriver driver;
	
	@BeforeMethod
	public void openGoogle() throws MalformedURLException
	{
       if (browser.equalsIgnoreCase("firefox"))
       {
    	   System.setProperty(GECKO_KEY, GECKO_VALUE);
       }
       else if(browser.equalsIgnoreCase("chrome"))
       {
    	   System.setProperty(CHROME_KEY, CHROME_VALUE);
       }
       driver= new FirefoxDriver();
       driver.get("https://www.google.co.in");
	
//		System.setProperty(GECKO_KEY, GECKO_VALUE);
//		URL u = new URL("https://192.168.43.201:4444/wd/hub");
//		DesiredCapabilities d = new DesiredCapabilities();
//		d.setBrowserName("firefox");
//	  driver= new RemoteWebDriver(u, d);
//	  driver.get("https://www.google.co.in");
	
	}
	
	
	@AfterMethod
	public void takeScreenshotOnFailure(ITestResult result)
	{
		if (ITestResult.FAILURE==result.getStatus())
		{
			utility.ScreenShot.getScreenshot(driver, result.getName());
		}
		driver.quit();
	}

}
