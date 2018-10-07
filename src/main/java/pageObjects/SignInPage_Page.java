package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

/**
 * @author Hardeep Aujla
 *
 */
public class SignInPage_Page extends BasePage {

	public SignInPage_Page() throws IOException {
		super();
	}

	// ...................APPLICATION SIGNIN PAGE LOCATORS....................//
	public @FindBy(xpath = "//a[@id='lemon_logo']") WebElement Logo_EasyPeasyForms_SignIn_Page;
	public @FindBy(xpath = "//input[@placeholder='Email Address']") WebElement Textbox_EmailAddress_SignIn_Page;
	public @FindBy(xpath = "//input[@placeholder='Password']") WebElement Textbox_Password_SignIn_Page;
	public @FindBy(xpath = "//div[@class='remember_checkbox']") WebElement Checkbox_Remember_SignIn_Page;
	public @FindBy(xpath = "//a[@href='javascript:void(0);'][contains(text(),'Forgot Password?')]") WebElement Link_ForgotPassword_SignIn_Page;
	public @FindBy(xpath = "//h5[@id='modalTitle']") WebElement Text_PasswordRecovery_PopUp_SignIn_Page;
	public @FindBy(xpath = "//input[@type='email']") WebElement Textbox_EmailAddress_PasswordRecovery_PopUp_SignIn_Page;
	public @FindBy(xpath = "//button[@id='reset_password']") WebElement Button_RecoverPassword_PopUp_SignIn_Page;
	public @FindBy(xpath = "//button[@id='login_button']") WebElement Button_Login_SignIn_Page;
	public @FindBy(xpath = "//strong[contains(text(),'Register')]") WebElement Link_Register_SignIn_Page;
	public @FindBy(xpath = "//div[@class='ajs-message ajs-error ajs-visible']") WebElement Error_Massege_SignIn_Page;
	public @FindBy(xpath = "//div[@class='ajs-message ajs-success ajs-visible']") WebElement Success_Massege_SignIn_Page;
	public @FindBy(xpath = "//h1[@id='page_title_heading']") WebElement Default_Group_Text_After_SignIn;
	public @FindBy(xpath = "//a[@id='toggle_user_settings']//i[@class='fa fa-user fa-1x']") WebElement Icon_Account_UserDashboard_After_SignIn;
	public @FindBy(xpath = "//a[contains(text(),'Logout')]") WebElement Link_LogOut_UserDashboard_After_SignIn;

	// ...................APPLICATION SIGNIN PAGE ACTIONS....................//
	public void clickOnEasyPeasyFormsLogoOnSignInPage() throws Exception {
		super.waitAndClickElement(Logo_EasyPeasyForms_SignIn_Page);
	}

	public void clickOnLoginButtonOnSignInPage() throws Exception {
		super.waitAndClickElement(Button_Login_SignIn_Page);
	}

	public String getErrorMessageTextOnSignInPage() throws Exception {
		return super.waitUntilWebElementIsVisible(Error_Massege_SignIn_Page).getText();
	}

	public void enterEmailAddressOnSignInPage(String email) throws Exception {
		if (email != "") {
			super.waitUntilWebElementIsVisible(Textbox_EmailAddress_SignIn_Page).sendKeys(email);
		}
	}

	public void enterPasswordOnSignInPage(String password) throws Exception {
		if (password != "") {
			super.waitUntilWebElementIsVisible(Textbox_Password_SignIn_Page).sendKeys(password);
		}
	}

	public void confirmUserReachDashboardAfterSignIn() throws Exception {
		super.waitUntilWebElementIsVisible(Default_Group_Text_After_SignIn).isDisplayed();

	}

	public void clickOnForgotPasswordLinkOnSignInPage() throws Exception {
		super.waitAndClickElement(Link_ForgotPassword_SignIn_Page);
	}

	public void confirmPasswordRecoveryPopUpIsDisplayedOnSignInPage() throws Exception {
		super.waitUntilWebElementIsVisible(Text_PasswordRecovery_PopUp_SignIn_Page).isDisplayed();
	}

	public void enterEmailAddressInPasswordRecoveryPopUpTextbox(String email) throws Exception {
		if (email != "") {
			super.waitUntilWebElementIsVisible(Textbox_EmailAddress_PasswordRecovery_PopUp_SignIn_Page).sendKeys(email);
		}
	}

	public void clickOnRecoverPasswordButtonOnPasswordRecoveryPopUpOnSignInPage() throws Exception {
		super.waitAndClickElement(Button_RecoverPassword_PopUp_SignIn_Page);
	}

	public String getSuccessMessageTextOnPasswordRecoveryPopUpOnSignInPage() throws Exception {
		return super.waitUntilWebElementIsVisible(Success_Massege_SignIn_Page).getText();
	}

	public void clickOnRegisterLinkOnSignInPage() throws Exception {
		super.waitAndClickElement(Link_Register_SignIn_Page);
	}

	public boolean rememberCheckboxOnSignInPageDefaultStatus() throws Exception {
		return waitUntilWebElementIsVisible(Checkbox_Remember_SignIn_Page).isSelected();
	}
	
	public void clickOnRememeberCheckboxOnSignInPage() throws Exception {
		super.waitAndClickElement(Checkbox_Remember_SignIn_Page);
	}

	public boolean rememberCheckboxOnSignInPageStatus() throws Exception {
		return waitUntilWebElementIsVisible(Checkbox_Remember_SignIn_Page).isSelected();
	}

	public void clickOnAccountIconOnUserDashboard() throws Exception {
		super.waitAndClickElement(Icon_Account_UserDashboard_After_SignIn);
	}

	public void clickOnLogoutLinkOnUserDashboard() throws Exception {
		super.waitAndClickElement(Link_LogOut_UserDashboard_After_SignIn);
	}

	public String verifyEmailAddressTextboxAfterLogout() throws Exception {
		String textbox = waitUntilWebElementIsVisible(Textbox_EmailAddress_SignIn_Page).getAttribute("value");
		return textbox;
	}

}
