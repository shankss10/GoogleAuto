package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	public static void getScreenshot (WebDriver driver, String screenShotName)
	{
		try
		{
			TakesScreenshot ts =(TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File("./Screenshots/" + screenShotName +".jpg");
			
			FileUtils.copyFile(source, destination);
			
			
		}
		catch (Exception e)
		{
			System.out.println("error taking screenshot"+ e.getMessage());
		}
	}

}
