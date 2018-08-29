/**
 * 
 */
package stepDefinitions.signUpPageSteps;


import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class ApplicationSignUpPageSteps extends DriverFactory {

	@Given("^User access the application \"([^\"]*)\" signup page$")
	public void user_access_the_application_signup_page(String signup) throws Throwable {
		basePage.loadUrl(signup);
	}

	@When("^User enter the \"([^\"]*)\" Name on signup page$")
	public void user_enter_the_Name_on_signup_page(String name) throws Throwable {
		signUpPage.enterNameOnSignUpPage(name);
	}

	@And("^User enter the \"([^\"]*)\" Email Address on signup page$")
	public void user_enter_the_Email_Address_on_signup_page(String email) throws Throwable {
		signUpPage.enterEmailAddressOnSignUpPage(email);
	}

	@And("^User enter the \"([^\"]*)\" Password on signup page$")
	public void user_enter_the_Password_on_signup_page(String password) throws Throwable {
		signUpPage.enterPasswordOnSignUpPage(password);
	}

	@And("^User enter the \"([^\"]*)\" Confirm Password on signup page$")
	public void user_enter_the_Confirm_Password_on_signup_page(String confirmPassword) throws Throwable {
		signUpPage.enterConfirmPasswordOnSignUpPage(confirmPassword);
	}

	@And("^User select the \"([^\"]*)\" location from the dropdown on signup page$")
	public void user_select_the_location_from_the_dropdown_on_signup_page(String location) throws Throwable {
		signUpPage.selectLocationFromDropdownOnSignUpPage(location);
	}

	@When("^User clicks the Sign Up button on signup page$")
	public void user_clicks_the_Sign_Up_button_on_signup_page() throws Throwable {
		signUpPage.clickOnSignUpButtonOnSignUpPage();
	}

	@Then("^User should be presented the following alert \"([^\"]*)\"$")
	public void user_should_be_presented_the_following_alert(String errorMessage) throws Throwable {
		Assert.assertEquals(errorMessage, signUpPage.getErrorMessageTextOnSignUpPage());
	}
	
	@Then("^User should be presented the following warning \"([^\"]*)\"$")
	public void user_should_be_presented_the_following_warning(String errorMessage) throws Throwable {
		Assert.assertEquals(errorMessage, signUpPage.getAlreadyExistingAccountWarningMessageTextOnSignUpPage());
	}

	@When("^User clicks on the login link on signup page$")
	public void user_clicks_on_the_login_link_on_signup_page() throws Throwable {
		signUpPage.clickOnLoginLinkOnSignUpPage();
	}
	
	@When("^User clicks on the link on the error message on signup page$")
	public void user_clicks_on_the_link_on_the_error_message_on_signup_page() throws Throwable {
	    signUpPage.clickOnTheLinkOnErrorMessageOnSignInPage();
	}
}
