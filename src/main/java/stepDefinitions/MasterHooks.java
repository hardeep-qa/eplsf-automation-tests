package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pageObjects.BasePage;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class MasterHooks extends DriverFactory {

	@Before
	public void setup() {
		driver = getDriver();
	}

	@After
	public void tearDownAndScreenshotOnFailure(Scenario scenario) {

		try {
			if (driver != null && scenario.isFailed()) {
//				 BasePage.captureScreenshot();
//				 Reporter.addStepLog("Taking a Screenshot!");
//				 Reporter.addStepLog("<br>");
//				 Reporter.addStepLog("<a target=\"_blank\" href=" +
//				 BasePage.returnScreenshotName() + "><img src=" + BasePage.returnScreenshotName() + " height=200 width=200></img></a>");
				scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
			}
			if (driver != null) {
				driver.manage().deleteAllCookies();
				driver.quit();
				driver = null;
			}

		} catch (Exception e) {
			System.out.println("Methods failed: tearDownAndScreenshotOnFailure: " + e.getMessage());
		}
	}
}
