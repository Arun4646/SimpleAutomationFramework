package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/featureTests",
		glue = {"stepDefinitions"},
		//Implement report later
		plugin = { "pretty", "html:target/cucumber-reports" },				// -- Enable this for HTML reports
		//plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" }, 	// -- Enable this for JSON reports
		//plugin = { "usage" },													// gives more info about step definition execution in the console
		monochrome = true,														// true -> Console output will be more readable
		tags = {"@RunBackground"}
		)

public class TestRunner {

	//Implement Later with Reports
	@AfterClass
	 public static void CompletionStatus() throws InterruptedException {
	 
		System.out.println("Execution complted");
	 }
}
