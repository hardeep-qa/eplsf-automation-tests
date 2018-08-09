package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Hardeep Aujla
 *
 */
public class FeaturesPage_Page extends BasePage {

	public FeaturesPage_Page() throws IOException {
		super();
	}

	// ...................APPLICATION FEATURES PAGE
	// LOCATORS....................//
	public @FindBy(xpath = "//div[@class = 'large-4 columns']/a[@href = 'https://go.easypeasyforms.com/SignUpNow?pid=1']") WebElement link_signup_features_page;

	// ...................APPLICATION FEATURES PAGE
	// ACTIONS....................//
	public void clickOnSignupButtonOnFeaturesPage() throws Exception {
		super.waitAndClickElement(link_signup_features_page);
	}
}
