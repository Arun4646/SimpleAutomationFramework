package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helper.ContextHelper;
import pageObjects.GooglePage;

public class GooglePageSteps {

	ContextHelper contextHelper;
	GooglePage googlePage;
	WebDriver driver;
	
	public GooglePageSteps(ContextHelper context) {
		
		contextHelper = context;
		googlePage = contextHelper.getPageObjectManager().getGooglePage();
	}
	
	@Given("^I choose configurations from config file$")
	public void i_choose_configurations_from_config_file() throws Throwable {

		System.out.println("Starting execution");
	}

	@When("^I open Google page$")
	public void i_open_Google_page() throws Throwable {

		googlePage.navigateToGoogle();
	}

	@Then("^I verify page title$")
	public void i_verify_page_title() throws Throwable {

		Assert.assertEquals(googlePage.verifyPageTitle(), true);
		contextHelper.getScreenshotUtility().takeScreenshot();
		//System.out.println("Title verified");			//use this when explaining background
	}

	@Then("^I verify page url$")
	public void i_verify_page_url() throws Throwable {

		Assert.assertEquals(googlePage.verifyPageUrl(), true);
		contextHelper.getScreenshotUtility().takeScreenshot();
		//System.out.println("URL verified");		//use this when explaining background
	}

	@When("^I enter value in the search field$")
	public void i_enter_value_in_the_search_field() throws Throwable {

		googlePage.enterValueInSearchField("Computer");
	}

	@When("^I click search button$")
	public void i_click_search_button() throws Throwable {

		googlePage.clickEnter();
	}

	@Then("^I verify whether search results should are displayed$")
	public void I_verify_whether_search_results_should_are_displayed() throws Throwable {

		Assert.assertEquals(googlePage.verifyResultsDisplayed(), true);
	}
	
	//Parameterization from the feature file
	@When("^I enter \"([^\"]*)\" in the search field$")
	public void i_enter_in_the_search_field(String value) throws Throwable {

		googlePage.enterValueInSearchField(value);
	}

}
