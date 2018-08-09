package stepDefinitions.homePageSteps;

import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class ApplicationHomepageBodySteps extends DriverFactory {

	@When("^User clicks on the first Sign up - it's FREE button$")
	public void user_clicks_on_the_first_Sign_up_it_s_FREE_button() throws Throwable {
		homePage.clickOnFirstSignupButton();
	}

	@When("^User clicks on the second Sign up - it's FREE button$")
	public void user_clicks_on_the_second_Sign_up_it_s_FREE_button() throws Throwable {
		homePage.clickOnSecondSignupButton();
	}

	@When("^User clicks on the third Sign up - it's FREE button$")
	public void user_clicks_on_the_third_Sign_up_it_s_FREE_button() throws Throwable {
		homePage.clickOnThirdSignupButton();
	}

	@When("^User clicks on the fourth Sign up - it's FREE button$")
	public void user_clicks_on_the_fourth_Sign_up_it_s_FREE_button() throws Throwable {
		homePage.clickOnFourthSignupButton();
	}

}
