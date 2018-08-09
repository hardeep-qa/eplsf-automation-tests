package stepDefinitions.homePageSteps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class ApplicationHeaderSteps extends DriverFactory {

	@Given("^User access the application \"([^\"]*)\" homepage$")
	public void user_access_the_application_homepage(String homePage) throws Throwable {
		basePage.loadUrl(homePage);
	}

	@When("^User clicks on the easypeasyforms logo$")
	public void user_clicks_on_the_easypeasyforms_logo() throws Throwable {
		homePage.clickOnLogoOnHeader();
	}

	@Then("^User should redirect on the \"([^\"]*)\" homepage$")
	public void user_should_redirect_on_the_homepage(String homePage) throws Throwable {
		basePage.waitForSpecificPage(homePage);
		Assert.assertEquals(homePage, driver.getCurrentUrl());
	}

	@When("^User clicks on the FEATURES link$")
	public void user_clicks_on_the_FEATURES_link() throws Throwable {
		homePage.clickOnFeaturesLinkOnHeader();
	}

	@Then("^User should redirect to the \"([^\"]*)\" features page$")
	public void user_should_redirect_to_the_features_page(String featuresPage) throws Throwable {
		basePage.waitForSpecificPage(featuresPage);
		Assert.assertEquals(featuresPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the PRICING link$")
	public void user_clicks_on_the_PRICING_link() throws Throwable {
		homePage.clickOnPricingLinkOnHeader();
	}

	@Then("^User should redirect to the \"([^\"]*)\" pricing page$")
	public void user_should_redirect_to_the_pricing_page(String pricingPage) throws Throwable {
		basePage.waitForSpecificPage(pricingPage);
		Assert.assertEquals(pricingPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the SUPPORT link$")
	public void user_clicks_on_the_SUPPORT_link() throws Throwable {
		homePage.clickOnSupportLinkOnHeader();
	}

	@Then("^User should redirect to the \"([^\"]*)\" support page$")
	public void user_should_redirect_to_the_support_page(String supportPage) throws Throwable {
		basePage.waitForSpecificPage(supportPage);
		Assert.assertEquals(supportPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button() throws Throwable {
		homePage.clickOnLoginButtonOnHeader();
	}

	@Then("^User should redirect to the \"([^\"]*)\" login/signin page$")
	public void user_should_redirect_to_the_login_signin_page(String signInPage) throws Throwable {
		basePage.waitForSpecificPage(signInPage);
		Assert.assertEquals(signInPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the Register button$")
	public void user_clicks_on_the_Register_button() throws Throwable {
		homePage.clickOnRegisterButtonOnHeader();
	}

	@Then("^User should redirect to the \"([^\"]*)\" signup page$")
	public void user_should_redirect_to_the_signup_page(String signUpPage) throws Throwable {
		basePage.waitForSpecificPage(signUpPage);
		Assert.assertEquals(signUpPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the Read our Blog link$")
	public void user_clicks_on_the_Read_our_Blog_link() throws Throwable {
		homePage.clickOnBlogLinkOnHeader();
	}

	@Then("^User should redirect to the \"([^\"]*)\" blog page$")
	public void user_should_redirect_to_blog_page(String blogPage) throws Throwable {
		basePage.waitForSpecificPage(blogPage);
		Assert.assertEquals(blogPage, driver.getCurrentUrl());
	}

	@Then("^User should see text \"([^\"]*)\" Call Us$")
	public void user_should_see_Call_Us_text(String callUs) throws Throwable {
		Assert.assertEquals(callUs, homePage.getTextFromCallUsOnHeader());
	}

	@Then("^User should see the contact number \"([^\"]*)\"$")
	public void user_should_see_the_contact_number(String contactNumber) throws Throwable {
		Assert.assertEquals(contactNumber, homePage.getTextFromContactNumberOnHeader());
	}
}
