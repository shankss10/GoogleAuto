package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import generic.TestBase;
import pom.GoogleHome;
import utility.ReadExcel;
import utility.ScreenShot;
import utility.WriteExcel;

public class GoogleStart extends TestBase {
   @Test
   public void startGoogle() throws Exception
   {
	   System.out.println("hiiiiiiiiiiii");
	   GoogleHome gh= new GoogleHome(driver);
	   gh.searchGoogle(ReadExcel.getCellValue(PATH, "GoogleStart", 0, 0));
	   
	   Thread.sleep(3000);
	   ScreenShot.getScreenshot(driver, "screen1");
	   
	   List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@class='sbqs_c']"));
	   
			int count= autoSuggestion.size();
			System.out.println(count);
			for (int i=0; i<count; i++)
			{
				WebElement we = autoSuggestion.get(i);
				String options= we.getText();
				System.out.println(options);
				WriteExcel.writeInExcel(PATH, "Sheet2", i, 0, options);
			}
		
	
   }
}
