/**
 * 
 */
package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Hardeep Aujla
 *
 */
public class UserDashboardPage_Page extends BasePage {

	public UserDashboardPage_Page() throws IOException {
		super();
	}
	
	// ...................USER DASHBOARD PAGE LOCATORS....................//
		private @FindBy(id = "lemon_logo") WebElement Logo_Header_User_Dashboard_page;
		private @FindBy(id = "main_search") WebElement SearchBox_Header_User_Dashboard_page;
		private @FindBy(xpath = "//span[text()='form2']") WebElement List_Available_Form_User_Dashboard_page;
		private @FindBy(id = "toggle_notifications") WebElement Icon_Notifications_Header_User_Dashboard_page;
		private @FindBy(xpath = "//h4[contains(text(),'Notifications')]") WebElement Droplist_Notifications_Header_User_Dashboard_page;
		private @FindBy(id = "toggle_user_settings") WebElement Icon_User_Header_User_Dashboard_page;
		private @FindBy(xpath = "//h4[@class='name']") WebElement Droplist_User_Name_Header_User_Dashboard_page;
		private @FindBy(xpath = "//a[contains(text(),'My Account')]") WebElement Droplist_Link_MyAccount_Header_User_Dashboard_page;
		private @FindBy(xpath = "//a[contains(text(),'Logout')]") WebElement Droplist_Link_Logout_Header_User_Dashboard_page;
		private @FindBy(xpath = "//div[@class='ajs-message ajs-error ajs-visible']") WebElement Error_Message_On_Login_page;
		private @FindBy(id = "new_form_desktop") WebElement Button_NewForm_UserDashboard;
		private @FindBy(xpath = "//ul[@class='new_form_ddoptions']//em[contains(text(),'Blank Form')]") WebElement Link_BlankForm_UserDashboard;
		private @FindBy(xpath = "//div[@class='columns small-12']//input[@type='text']") WebElement Textbox_FormName_PopUp_On_UserDashboard;
		private @FindBy(id = "create-blank-form-button") WebElement Button_CreateForm_PopUP_UserDashboard;
		

	// ...................USER DASHBOARD PAGE ACTIONS....................//
		public void clickOnEasyPeasyFormsLogoOnUserDashboard() throws Exception {
			super.waitAndClickElement(Logo_Header_User_Dashboard_page);
		}
		
		public void enterTextInSearchboxOnUserDashboard(String sendKeys) throws Exception {
			super.waitUntilWebElementIsVisible(SearchBox_Header_User_Dashboard_page).sendKeys(sendKeys);
		}
		
		public String verifySearchedFormIsAvailableInMyForms() throws Exception {
			return super.waitUntilWebElementIsVisible(List_Available_Form_User_Dashboard_page).getText();
		}
		
		public void clickOnNotificationIconOnHeaderOfUserDashboard() throws Exception {
			super.waitAndClickElement(Icon_Notifications_Header_User_Dashboard_page);
		}
		
		public boolean verifyDroplistIsDisplayedWhenClickOnNotificationIconOnHeaderOfUserDashboard() throws Exception {
			return super.waitUntilWebElementIsVisible(Droplist_Notifications_Header_User_Dashboard_page).isDisplayed();
		}
		
		public void clickOnUserIconOnHeaderOfUserDashboard() throws Exception {
			super.waitAndClickElement(Icon_User_Header_User_Dashboard_page);
		}
		
		public String usernameShouldDisplayedWhenClickOnUserIconOnHeaderOfUserDashboard() {
			return super.waitUntilWebElementIsVisible(Droplist_User_Name_Header_User_Dashboard_page).getText();
		}
		
		public void clickOnMyAccountLinkOnHeaderOfUserDashboard() throws Exception {
			super.waitAndClickElement(Droplist_Link_MyAccount_Header_User_Dashboard_page);
		}
		
		public void clickOnLogoutLinkOnHeaderOfUserDashboard() throws Exception {
			super.waitAndClickElement(Droplist_Link_Logout_Header_User_Dashboard_page);
		}
		
		public void clickOnNewFormButtonOnUserDashboard() throws Exception {
			super.waitAndClickElement(Button_NewForm_UserDashboard);
		}
		
		public void clickOnBlankFormLinkOnUserDashboard() throws Exception {
			super.waitAndClickElement(Link_BlankForm_UserDashboard);
		}
		
		public void enterFormNameInTextboxPopUPOnUserDashboard(String name) throws Exception {
			super.waitUntilWebElementIsVisible(Textbox_FormName_PopUp_On_UserDashboard).sendKeys(name);
		}
		
		public void clickOnCreateFormButtonOnPopUpOnUserDashboard() throws Exception {
			super.waitAndClickElement(Button_CreateForm_PopUP_UserDashboard);
		}
}
