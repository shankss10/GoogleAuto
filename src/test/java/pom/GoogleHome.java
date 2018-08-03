package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;


public class GoogleHome extends BasePage {
	@FindBy (xpath="//input[@id='lst-ib']")
	WebElement searchBox;
	@FindBy (xpath="//div[@class='sbqs_c']")
	List <WebElement> autoSuggestion;
	
	public GoogleHome(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void searchGoogle(String searchText)
	{
		searchBox.sendKeys(searchText);
	}
	
	

}
