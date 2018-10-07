/**
 * 
 */
package stepDefinitions.createNewPageSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import utils.DriverFactory;

/**
 * @author Hardeep Aujla
 *
 */
public class CreateNewPageSteps extends DriverFactory {
	
	String userDashboardWindow;

	@Given("^User clicks on New Form button$")
	public void user_clicks_on_New_Form_button() throws Throwable {
	    userDashboardPage.clickOnNewFormButtonOnUserDashboard();
	}

	@When("^User clicks on blank form link$")
	public void user_clicks_on_blank_form_link() throws Throwable {
	    userDashboardPage.clickOnBlankFormLinkOnUserDashboard();
	}

	@And("^User enters the form name \"([^\"]*)\" in textbox$")
	public void user_enters_the_form_name_in_textbox(String formName) throws Throwable {
	    userDashboardPage.enterFormNameInTextboxPopUPOnUserDashboard(formName);
	}

	@And("^clicks on the create form button$")
	public void clicks_on_the_create_form_button() throws Throwable {
		userDashboardWindow = driver.getWindowHandle();
	    userDashboardPage.clickOnCreateFormButtonOnPopUpOnUserDashboard();
	}

	@And("^User drag the name button and drop it in the form$")
	public void user_drag_the_name_button_and_drop_it_in_the_form() throws Throwable {
	   blankFormEditorPage.dragAndDropNameButtonToBlankForm();
	}

	@And("^User drag the option list button and drop it in the form$")
	public void user_drag_the_option_list_button_and_drop_it_in_the_form() throws Throwable {
		blankFormEditorPage.dragAndDropOptionListButtonToBlankForm();
	}
	
	
	// driver.switchTo().window(currentWindow)
}
