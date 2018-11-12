/**
 * 
 */
package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;

/**
 * @author Hardeep Aujla
 *
 */
public class SignUpPage_Page extends BasePage {

	public SignUpPage_Page() throws IOException {
		super();
	}

	// ...................APPLICATION SIGNIN PAGE LOCATORS....................//
	private @FindBy(id = "lemon_logo") WebElement Logo_EasyPeasyForms_SignUp_Page;
	private @FindBy(xpath = "//input[@placeholder='Your Name']") WebElement Textbox_Name_SignUp_Page;
	private @FindBy(xpath = "//input[@placeholder='Email Address']") WebElement Textbox_EmailAddress_SignUp_Page;
	private @FindBy(xpath = "//input[@placeholder='Password']") WebElement Textbox_Password_SignUp_Page;
	private @FindBy(xpath = "//input[@placeholder='Confirm Password']") WebElement Textbox_ConfirmPassword_SignUp_Page;
	private @FindBy(xpath = "//select[@data-link='{:Culture trigger=true:}']") WebElement Dropdown_Location_SignUp_Page;
	private @FindBy(id = "sign_up_button") WebElement Button_SignUp_SignUp_Page;
	private @FindBy(xpath = "//a[contains(@href, 'SignIn')]") WebElement Link_LogIn_SignUp_Page;
	private @FindBy(xpath = "//div[@class='ajs-message ajs-error ajs-visible']") WebElement Error_Massege_SignUp_Page;
	private @FindBy(xpath = "//a[contains(text(),'If this is you, click here to log in.')]") WebElement Link_Navigate_To_LogIn_Page_SignUp_Page;
	
	// ...................APPLICATION SIGNIN PAGE ACTIONS....................//
	public void clickOnEasyPeasyFormsLogoOnSignUpPage() throws Exception {
		super.waitAndClickElement(Logo_EasyPeasyForms_SignUp_Page);
	}

	public void enterNameOnSignUpPage(String name) throws Exception {
		if (name != "") {
			super.waitUntilWebElementIsVisible(Textbox_Name_SignUp_Page).sendKeys(name);
		}
	}

	public void enterEmailAddressOnSignUpPage(String email) throws Exception {
		if (email != "") {
			super.waitUntilWebElementIsVisible(Textbox_EmailAddress_SignUp_Page).sendKeys(email);
		}
	}

	public void enterPasswordOnSignUpPage(String password) throws Exception {
		if (password != "") {
			super.waitUntilWebElementIsVisible(Textbox_Password_SignUp_Page).sendKeys(password);
		}
	}

	public void enterConfirmPasswordOnSignUpPage(String confirmPassword) throws Exception {
		if (confirmPassword != "") {
			super.waitUntilWebElementIsVisible(Textbox_ConfirmPassword_SignUp_Page).sendKeys(confirmPassword);
		}
	}

	public void clickOnSignUpButtonOnSignUpPage() throws Exception {
		super.waitAndClickElement(Button_SignUp_SignUp_Page);
	}
	
	public void clickOnLoginLinkOnSignUpPage() throws Exception {
		super.waitAndClickElement(Link_LogIn_SignUp_Page);
	}
	
	public String getErrorMessageTextOnSignUpPage() throws Exception {
		return super.waitUntilWebElementIsVisible(Error_Massege_SignUp_Page).getText();
	}
	
	public String getAlreadyExistingAccountWarningMessageTextOnSignUpPage() throws Exception {
		return super.waitUntilWebElementIsVisible(Link_Navigate_To_LogIn_Page_SignUp_Page).getText();
	}
	
	public void selectLocationFromDropdownOnSignUpPage(String location) throws Exception {
//		Select select = new Select(super.waitUntilWebElementIsVisible(Dropdown_Location_SignUp_Page));
//		select.selectByVisibleText(location);
		super.selectFromDropdown(Dropdown_Location_SignUp_Page, location);
	}
	
	public void clickOnTheLinkOnErrorMessageOnSignInPage() throws Exception {
		super.waitAndClickElement(Link_Navigate_To_LogIn_Page_SignUp_Page);
	}
}
