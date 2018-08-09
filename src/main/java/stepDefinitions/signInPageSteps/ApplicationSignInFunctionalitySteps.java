package stepDefinitions.signInPageSteps;

import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class ApplicationSignInFunctionalitySteps extends DriverFactory {

	@Given("^User access the application \"([^\"]*)\" signin page$")
	public void user_access_the_application_signin_page(String signInPage) throws Throwable {
		basePage.loadUrl(signInPage);
	}

	@When("^User clicks on the easypeasyforms logo on signin page$")
	public void user_clicks_on_the_easypeasyforms_logo_on_signin_page() throws Throwable {
		signInPage.clickOnEasyPeasyFormsLogoOnSignInPage();
	}

	@When("^User clicks on the Login button on signin page$")
	public void user_clicks_on_the_Login_button_on_signin_page() throws Throwable {
		signInPage.clickOnLoginButtonOnSignInPage();
	}

	@Then("^The user should be presented the following \"([^\"]*)\" alert$")
	public void the_user_should_be_presented_the_following_alert(String errorMessage) throws Throwable {
		Assert.assertEquals(signInPage.getErrorMessageTextOnSignInPage(), errorMessage);
	}

	@When("^User enter the \"([^\"]*)\" Email Address$")
	public void user_enter_the_Email_Address(String emailAddress) throws Throwable {
		signInPage.enterEmailAddressOnSignInPage(emailAddress);
	}

	@When("^User enter the \"([^\"]*)\" Password$")
	public void user_enter_the_Password(String password) throws Throwable {
		signInPage.enterPasswordOnSignInPage(password);
	}

	@Then("^User should login and easypeasyforms dashboard should be displayed$")
	public void user_should_login_and_easypeasyforms_dashboard_should_be_displayed() throws Throwable {
		signInPage.confirmUserReachDashboardAfterSignIn();
	}
	
	@When("^User clicks on Forgot Password link$")
	public void user_clicks_on_Forgot_Password_link() throws Throwable {
	    signInPage.clickOnForgotPasswordLinkOnSignInPage();
	}

	@Then("^The user should be presented the Password Recovery pop-up$")
	public void the_user_should_be_presented_the_Password_Recovery_pop_up() throws Throwable {
	    signInPage.confirmPasswordRecoveryPopUpIsDisplayedOnSignInPage();
	}
	
	@And("^User enter the \"([^\"]*)\" Email Address in password recovery popup$")
	public void user_enter_the_Email_Address_in_password_recovery_popup(String email) throws Throwable {
		signInPage.enterEmailAddressInPasswordRecoveryPopUpTextbox(email);
	}

	@When("^User clicks on the Recover Password button on the pop-up$")
	public void user_clicks_on_the_Recover_Password_button_on_the_pop_up() throws Throwable {
		signInPage.clickOnRecoverPasswordButtonOnPasswordRecoveryPopUpOnSignInPage();
	}
	
	@Then("^The user should be presented the following \"([^\"]*)\" success alert$")
	public void the_user_should_be_presented_the_following_success_alert(String message) throws Throwable {
		Assert.assertEquals(signInPage.getSuccessMessageTextOnPasswordRecoveryPopUpOnSignInPage(), message);
	}
	
	@When("^User clicks on the Register link on signin page$")
	public void user_clicks_on_the_Register_link_on_signin_page() throws Throwable {
		signInPage.clickOnRegisterLinkOnSignInPage();
	}

	@Then("^The user should be redirect to the normal \"([^\"]*)\" signup page$")
	public void the_user_should_be_redirect_to_the_normal_signup_page(String signup) throws Throwable {
	    basePage.waitForSpecificPage(signup);
	    Assert.assertEquals(driver.getCurrentUrl(), signup);
	}
	
	@Then("^Remember checkbox status should be unchecked by default$")
	public void remember_checkbox_status_should_be_unchecked_by_default() throws Throwable {
		Assert.assertEquals(signInPage.rememberCheckboxOnSignInPageDefaultStatus(), false);
	}
	
	@And("^Verify Remember checkbox status$")
	public void verify_remember_checkbox_status() throws Throwable {
		signInPage.rememberCheckboxOnSignInPageStatus();
	}
	
	@When("^User clicks on the account icon on the dashboard$")
	public void user_clicks_on_the_account_icon_on_the_dashboard() throws Throwable {
		signInPage.clickOnAccountIconOnUserDashboard();
	}

	@And("^user clicks on the Logout link$")
	public void user_clicks_on_the_Logout_link() throws Throwable {
		signInPage.clickOnLogoutLinkOnUserDashboard();
	}

	@Then("^User should Logout and redirect on the \"([^\"]*)\" signin page$")
	public void user_should_Logout_and_redirect_on_the_signin_page(String signin) throws Throwable {
		basePage.waitForSpecificPage(signin);
	    Assert.assertEquals(driver.getCurrentUrl(), signin);
	}

	@And("^email textbox should be empty$")
	public void email_textbox_should_be_empty() throws Throwable {
		Assert.assertEquals(signInPage.verifyEmailAddressTextboxAfterLogout(), "");
	}
	
	@And("^email textbox should be \"([^\"]*)\"$")
	public void email_textbox_should_be(String email) throws Throwable {
	   Assert.assertEquals(signInPage.verifyEmailAddressTextboxAfterLogout(), email);
	}

}
