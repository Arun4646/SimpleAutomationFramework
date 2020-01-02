package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

	WebDriver _driver;
	public GooglePage (WebDriver driver) {
		
		_driver = driver;
		PageFactory.initElements(_driver, this);
	}
	
	@FindBy(how= How.NAME, using = "q")
	private WebElement _searchField;
	
	@FindBy(how= How.ID, using = "resultStats")
	private WebElement _resultStats;
		
	
	public boolean verifyPageTitle() {
		
		return _driver.getTitle().contains("Google");
	}
	
	public boolean verifyPageUrl() {
		
		return _driver.getCurrentUrl().contains("google");
	}
	
	public void navigateToGoogle() {
		
		_driver.navigate().to("https://www.google.com");
		
	}
	
	public void enterValueInSearchField(String value) {
		
		_searchField.sendKeys(value);
	}
	
	public void clickEnter() {
		
		_searchField.sendKeys(Keys.RETURN);
	}
	
	public boolean verifyResultsDisplayed() {
		
		return _resultStats.isDisplayed();
	}
}
