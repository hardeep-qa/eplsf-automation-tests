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

	@When("^User fill keywords \\(text\\) in search textbox$")
	public void user_fill_keywords_text_in_search_textbox() throws Throwable {
	    
	}

	@Then("^User should be able to see available forms filtered on the basis of keyword provided$")
	public void user_should_be_able_to_see_available_forms_filtered_on_the_basis_of_keyword_provided() throws Throwable {
	    
	}

	@When("^User clicks the notification Icon$")
	public void user_clicks_the_notification_Icon() throws Throwable {
	    
	}

	@Then("^User should see the list of notifications \\(if available\\)$")
	public void user_should_see_the_list_of_notifications_if_available() throws Throwable {
	    
	}

	@When("^User clicks the user Icon$")
	public void user_clicks_the_user_Icon() throws Throwable {
	    
	}

	@Then("^User should be able to see Users \"([^\"]*)\" name$")
	public void user_should_be_able_to_see_Users_name(String name) throws Throwable {
	    
	}

	@When("^User clicks on My Account link$")
	public void user_clicks_on_My_Account_link() throws Throwable {
	    
	}

	@Then("^User should reach the user settings page$")
	public void user_should_reach_the_user_settings_page() throws Throwable {
	    
	}

	@When("^User clicks on Logout link$")
	public void user_clicks_on_Logout_link() throws Throwable {
	    
	}

	@Then("^User should Logout from the account$")
	public void user_should_Logout_from_the_account() throws Throwable {
	    
	}

}
