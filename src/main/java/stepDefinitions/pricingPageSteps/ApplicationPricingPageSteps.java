package stepDefinitions.pricingPageSteps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ApplicationPricingPageSteps extends DriverFactory {

	@Given("^User access the application \"([^\"]*)\" pricing page$")
	public void user_access_the_application_pricing_page(String pricingPage) throws Throwable {
		basePage.loadUrl(pricingPage);
	}

	@When("^User clicks on Get Started button in Starter package$")
	public void user_clicks_on_Get_Started_button_in_Starter_package() throws Throwable {
		pricingPage.clickOnStarterGetStartedButtonOnPricingPage();
	}

	@Then("^User should redirect on the \"([^\"]*)\" Starter signup page$")
	public void user_should_redirect_on_the_Starter_signup_page(String starterSignUpPage) throws Throwable {
		basePage.waitForSpecificPage(starterSignUpPage);
		Assert.assertEquals(starterSignUpPage, driver.getCurrentUrl());
	}

	@When("^User clicks on Get Started button in Professional package$")
	public void user_clicks_on_Get_Started_button_in_Professional_package() throws Throwable {
		pricingPage.clickOnProfessionalGetStartedButtonOnPricingPage();
	}

	@Then("^User should redirect on the \"([^\"]*)\" Professional signup page$")
	public void user_should_redirect_on_the_Professional_signup_page(String professionalSignUpPage) throws Throwable {
		basePage.waitForSpecificPage(professionalSignUpPage);
		Assert.assertEquals(professionalSignUpPage, driver.getCurrentUrl());
	}

	@When("^User clicks on Get Started button in Business package$")
	public void user_clicks_on_Get_Started_button_in_Business_package() throws Throwable {
		pricingPage.clickOnBusinessGetStartedButtonOnPricingPage();
	}

	@Then("^User should redirect on the \"([^\"]*)\" Business signup page$")
	public void user_should_redirect_on_the_Business_signup_page(String businessSignUpPage) throws Throwable {
		basePage.waitForSpecificPage(businessSignUpPage);
		Assert.assertEquals(businessSignUpPage, driver.getCurrentUrl());
	}

	@When("^User clicks on Get Started button in Enterprise package$")
	public void user_clicks_on_Get_Started_button_in_Enterprise_package() throws Throwable {
		pricingPage.clickOnEnterpriseGetStartedButtonOnPricingPage();
	}

	@Then("^User should redirect on the \"([^\"]*)\" Enterprise signup page$")
	public void user_should_redirect_on_the_Enterprise_signup_page(String enterpriseSignUpPage) throws Throwable {
		basePage.waitForSpecificPage(enterpriseSignUpPage);
		Assert.assertEquals(enterpriseSignUpPage, driver.getCurrentUrl());
	}
}
