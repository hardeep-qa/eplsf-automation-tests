package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * @author Hardeep Aujla
 *
 */
@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/cucumberFramework/featureFiles/"},
		glue = {"stepDefinitions"},
		monochrome = true,
		dryRun = false,
		tags = {},
		plugin = {"pretty", "html:target/cucumber",
				 "json:target/cucumber.json",
				 "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
		)


public class MainRunner extends AbstractTestNGCucumberTests {
	
	}
