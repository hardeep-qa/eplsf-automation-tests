package stepDefinitions.homePageSteps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class ApplicationFooterSteps extends DriverFactory {

	@When("^User clicks on the Home link$")
	public void user_clicks_on_the_Home_link() throws Exception {
		homePage.clickOnHomelinkOnFooter();
	}

	@When("^User clicks on the Features link$")
	public void user_clicks_on_the_Features_link() throws Exception {
		homePage.clickOnFeaturesLinkOnFooter();
	}

	@When("^User clicks on the Pricing link$")
	public void user_clicks_on_the_Pricing_link() throws Exception {
		homePage.clickOnPricingLinkOnFooter();
	}

	@When("^User clicks on the Support link$")
	public void user_clicks_on_the_Support_link() throws Exception {
		homePage.clickOnSupportLinkOnFooter();
	}

	@When("^User clicks on the Blog link$")
	public void user_clicks_on_the_Blog_link() throws Exception {
		homePage.clickOnBlogLinkOnFooter();
	}

	@When("^User clicks on the Login link$")
	public void user_clicks_on_the_Login_link() throws Exception {
		homePage.clickOnLoginLinkOnFooter();
	}

	@When("^User clicks on the Register link$")
	public void user_clicks_on_the_Register_link() throws Exception {
		homePage.clickOnRegisterLinkOnFooter();
	}

	@When("^User clicks on the About link$")
	public void user_clicks_on_the_About_link() throws Exception {
		homePage.clickOnAboutLinkOnFooter();
	}

	@Then("^User should redirect to the \"([^\"]*)\" about page$")
	public void user_should_redirect_to_the_about_page(String aboutPage) throws Exception {
		basePage.waitForSpecificPage(aboutPage);
		Assert.assertEquals(aboutPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the Terms of use link$")
	public void user_clicks_on_the_Terms_of_use_link() throws Exception {
		homePage.clickOnTermsOfUseLinkOnFooter();
	}

	@Then("^User should redirect to the \"([^\"]*)\" terms page$")
	public void user_should_redirect_to_the_terms_page(String termsPage) throws Exception {
		basePage.waitForSpecificPage(termsPage);
		Assert.assertEquals(termsPage, driver.getCurrentUrl());
	}

	@When("^User clicks on the Privacy link$")
	public void user_clicks_on_the_Privacy_link() throws Exception {
		homePage.clickOnPrivacyLinkOnFooter();
	}

	@Then("^User should redirect to the \"([^\"]*)\" privacy page$")
	public void user_should_redirect_to_the_privacy_page(String privacyPage) throws Exception {
		basePage.waitForSpecificPage(privacyPage);
		Assert.assertEquals(privacyPage, driver.getCurrentUrl());
	}

	@Then("^User should see \"([^\"]*)\" text$")
	public void user_should_see_Copyright_Easy_Peasy_Lemon_Squeezy_Forms_text(String copyrightText) throws Exception {
		Assert.assertEquals(copyrightText, homePage.getTextFromCopyrightTrademarkOnFooter());
	}

}
