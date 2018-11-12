package runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import java.io.File;

/**
 * @author Hardeep Aujla
 *
 */
@RunWith(Cucumber.class)

@CucumberOptions(features = { "src/test/java/cucumberFramework/featureFiles/" },
		glue = {"stepDefinitions" },
		monochrome = true,
	//	dryRun = false,
		tags = {"@login"},
		plugin = { "pretty","html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html" })

public class MainRunner extends AbstractTestNGCucumberTests {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(
				new File(System.getProperty("user.dir") + "\\src\\main\\java\\utils\\ReportsConfig.xml"));
	}

}
