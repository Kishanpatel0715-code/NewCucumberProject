package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="C:\\Selenium_workspace\\FreeAmazonBddFreamwork\\src\\main\\java\\features\\login.feature",
				glue = {"stepDefinition"},
				format = {"pretty","html:test-output","json:json_output/cucumber.json"},
				dryRun = false
			)


public class TestRunner {

}
