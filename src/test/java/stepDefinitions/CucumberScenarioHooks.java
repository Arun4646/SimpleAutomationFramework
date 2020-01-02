package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.ContextHelper;

public class CucumberScenarioHooks {

	ContextHelper contextHelper;
	String ExecutingFolderName;
	
	public CucumberScenarioHooks (ContextHelper context) {
		System.out.println("Inside hooks constructor");
		contextHelper = context;
	}
	
	// These will work if we run as cucumber feature only
	
	@Before
	public void BeforeSteps(Scenario scenario) {

		System.out.println("From Before");
		String ExecutingFolderName = scenario.getName()+"_" + contextHelper.getWebDriverManager().getDriverConfigName();
		contextHelper.getScreenshotUtility().createExecutingFolder(ExecutingFolderName);
	}
	
	@After
	public void CloseBrowser() {
		
		contextHelper.getWebDriverManager().closeDriver();
	}
}
