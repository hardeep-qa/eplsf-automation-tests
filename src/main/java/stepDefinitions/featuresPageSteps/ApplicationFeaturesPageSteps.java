package stepDefinitions.featuresPageSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ApplicationFeaturesPageSteps extends DriverFactory {

	@Given("^User access the application \"([^\"]*)\" features page$")
	public void user_access_the_application_features_page(String featuresPageUrl) throws Throwable {
		basePage.loadUrl(featuresPageUrl);
	}

	@When("^User clicks on Sign up - it's FREE button on the features page$")
	public void user_clicks_on_Sign_up_it_s_FREE_button_on_the_features_page() throws Throwable {
		featuresPage.clickOnSignupButtonOnFeaturesPage();
	}
}
