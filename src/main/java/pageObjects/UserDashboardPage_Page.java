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
		public @FindBy(id = "lemon_logo") WebElement Logo_Header_User_Dashboard_page;
		public @FindBy(id = "main_search") WebElement SearchBox_Header_User_Dashboard_page;
		public @FindBy(id = "toggle_notifications") WebElement Icon_Notifications_Header_User_Dashboard_page;
		public @FindBy(xpath = "//h4[contains(text(),'Notifications')]") WebElement Droplist_Notifications_Header_User_Dashboard_page;
		public @FindBy(id = "toggle_user_settings") WebElement Icon_User_Header_User_Dashboard_page;
		public @FindBy(xpath = "//h4[@class='name']") WebElement Droplist_User_Name_Header_User_Dashboard_page;
		public @FindBy(xpath = "//a[contains(text(),'My Account')]") WebElement Droplist_Link_MyAccount_Header_User_Dashboard_page;
		public @FindBy(xpath = "//a[contains(text(),'Logout')]") WebElement Droplist_Link_Logout_Header_User_Dashboard_page;


	// ...................USER DASHBOARD PAGE ACTIONS....................//
		public void clickOnEasyPeasyFormsLogoOnUserDashboard() throws Exception {
			super.waitAndClickElement(Logo_Header_User_Dashboard_page);
		}
		
		
}
