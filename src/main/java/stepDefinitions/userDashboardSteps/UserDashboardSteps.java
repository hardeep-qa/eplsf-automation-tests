/**
 * 
 */
package stepDefinitions.userDashboardSteps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class UserDashboardSteps extends DriverFactory {
	
	@When("^User clicks on EASY PEASY LEAMON SQUEEZY FORMS logo$")
	public void user_clicks_on_EASY_PEASY_LEAMON_SQUEEZY_FORMS_logo() throws Throwable {
	    userDashboardPage.clickOnEasyPeasyFormsLogoOnUserDashboard();
	}

	@Then("^User should navigate to the \"([^\"]*)\" dashboard$")
	public void user_should_navigate_to_the_dashboard(String dashboard) throws Throwable {
	    Assert.assertEquals(dashboard, driver.getCurrentUrl());
	}

	@When("^User fill keywords \"([^\"]*)\" text in search textbox$")
	public void user_fill_keywords_text_in_search_textbox(String text) throws Throwable {
	    userDashboardPage.enterTextInSearchboxOnUserDashboard(text);
	}

	@Then("^User should be able to see requested \"([^\"]*)\" form filtered on the basis of keyword provided$")
	public void user_should_be_able_to_see_available_forms_filtered_on_the_basis_of_keyword_provided(String form) throws Throwable {
	    Assert.assertEquals(form, userDashboardPage.verifySearchedFormIsAvailableInMyForms());
	}

	@When("^User clicks the notification Icon$")
	public void user_clicks_the_notification_Icon() throws Throwable {
	    userDashboardPage.clickOnNotificationIconOnHeaderOfUserDashboard();
	}

	@Then("^User should see the list of notifications \\(if available\\)$")
	public void user_should_see_the_list_of_notifications_if_available() throws Throwable {
	    Assert.assertTrue(userDashboardPage.verifyDroplistIsDisplayedWhenClickOnNotificationIconOnHeaderOfUserDashboard());
	}

	@When("^User clicks the user Icon$")
	public void user_clicks_the_user_Icon() throws Throwable {
	    userDashboardPage.clickOnUserIconOnHeaderOfUserDashboard();
	}

	@Then("^User should be able to see Users \"([^\"]*)\" name$")
	public void user_should_be_able_to_see_Users_name(String name) throws Throwable {
	    Assert.assertEquals(name, userDashboardPage.usernameShouldDisplayedWhenClickOnUserIconOnHeaderOfUserDashboard());
	}

	@When("^User clicks on My Account link$")
	public void user_clicks_on_My_Account_link() throws Throwable {
	    userDashboardPage.clickOnMyAccountLinkOnHeaderOfUserDashboard();
	}

	@Then("^User should reach the user settings \"([^\"]*)\" page$")
	public void user_should_reach_the_user_settings_page(String page) throws Throwable {
		basePage.waitForSpecificPage(page);
	    Assert.assertEquals(page, driver.getCurrentUrl());
	}

	@When("^User clicks on Logout link$")
	public void user_clicks_on_Logout_link() throws Throwable {
	    userDashboardPage.clickOnLogoutLinkOnHeaderOfUserDashboard();
	}

	@Then("^User should Logged out from the account and reached to URL: \"([^\"]*)\"$")
	public void user_should_Logged_out_from_the_account_and_reached_to_URL(String logout) throws Throwable {
	    Assert.assertEquals(logout, driver.getCurrentUrl());
	}
	
	@When("^User press the back button of the browser$")
	public void user_press_the_back_button_of_the_browser() throws Throwable {
		basePage.waitForSpecificPage("https://go.easypeasyforms.com/Logout/");
	    driver.navigate().back();
	}

	@Then("^User should get the following alert \"([^\"]*)\"$")
	public void user_should_get_the_following_alert(String alert) throws Throwable {
	    Assert.assertEquals(alert, signInPage.getErrorMessageTextOnSignInPage());
	}

}
