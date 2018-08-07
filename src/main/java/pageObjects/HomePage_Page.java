package pageObjects;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Page extends BasePage {

	// ...................APPLICATION HEADER LOCATORS....................//
	public @FindBy(xpath = "//li[@id='lemon_logo']/a[text() = 'Easy Peasy Lemon Squeezy Forms']") WebElement link_logo_header;
	public @FindBy(xpath = "//li[@id='menu-item-43']/a[text() = 'Features']") WebElement link_features_header;
	public @FindBy(xpath = "//li[@id='menu-item-42']/a[text() = 'Pricing']") WebElement link_pricing_header;
	public @FindBy(xpath = "//li[@id='menu-item-41']/a[text() = 'Support']") WebElement link_support_header;
	public @FindBy(xpath = "//a[contains(text(), 'Login') and @class= 'top_login buttons']") WebElement button_login_header;
	public @FindBy(xpath = "//a[contains(text(), 'Register') and @class='top_register buttons']") WebElement button_register_header;
	public @FindBy(xpath = "//a[@href='/blog']") WebElement link_blog_header;
	public @FindBy(xpath = "//span[contains(text(), 'Call Us')]") WebElement text_callUs_header;
	public @FindBy(xpath = "//*[contains(text(), '0800 111 106')]") WebElement text_0800111106_header;

	// ...................APPLICATION FOOTER LOCATORS....................//
	public @FindBy(xpath = "//ul[@id='menu-foot_links-1']/li[1]/a[text() = 'Home']") WebElement link_Home_footer;
	public @FindBy(xpath = "//ul[@id='menu-foot_links-1']/li[2]/a[text() = 'Features']") WebElement link_features_footer;
	public @FindBy(xpath = "//ul[@id='menu-foot_links-1']/li[3]/a[text() = 'Pricing']") WebElement link_pricing_footer;
	public @FindBy(xpath = "//ul[@id='menu-foot_links-1']/li[4]/a[text() = 'Support']") WebElement link_support_footer;
	public @FindBy(xpath = "//ul[@id='menu-foot_links-1']/li[5]/a[text() = 'Blog']") WebElement link_blog_footer;
	public @FindBy(xpath = "//div[@class = 'user_nav large-6 columns']/ul/li/a[text() = 'Login']") WebElement link_login_footer;
	public @FindBy(xpath = "//div[@class = 'user_nav large-6 columns']/ul/li/a[text() = 'Register']") WebElement link_register_footer;
	public @FindBy(xpath = "//a[@href='/about']") WebElement link_about_footer;
	public @FindBy(xpath = "//a[@href='/terms']") WebElement link_terms_of_use_footer;
	public @FindBy(xpath = "//a[@href='/privacy']") WebElement link_privacy_footer;
	public @FindBy(xpath = "//p[contains(text(),'Copyright © 2018 Easy Peasy Lemon Squeezy Forms.')]") WebElement link_copyright_trademark_footer;

	// ...................APPLICATION HOMEPAGE BODY
	// LOCATORS....................//
	public @FindBy(xpath = "//div[@id='teaser_content']/div/div/a") WebElement button_signup_body_first;
	public @FindBy(xpath = "//div[@id='second_content']/a") WebElement button_signup_body_second;
	public @FindBy(xpath = "//div[@id='paperless']/div/div/a") WebElement button_signup_body_third;
	public @FindBy(xpath = "//div[@id='bottom_signup']/div/div[2]/a") WebElement button_signup_body_fourth;

	// ...................APPLICATION HEADER ACTIONS....................//
	public HomePage_Page() throws IOException {
		super();
	}

	public void clickOnLogoOnHeader() throws Exception {
		super.waitAndClickElement(link_logo_header);
	}

	public void clickOnFeaturesLinkOnHeader() throws Exception {
		super.waitAndClickElement(link_features_header);
	}

	public void clickOnPricingLinkOnHeader() throws Exception {
		super.waitAndClickElement(link_pricing_header);
	}

	public void clickOnSupportLinkOnHeader() throws Exception {
		super.waitAndClickElement(link_support_header);
	}

	public void clickOnLoginButtonOnHeader() throws Exception {
		super.waitAndClickElement(button_login_header);
	}

	public void clickOnRegisterButtonOnHeader() throws Exception {
		super.waitAndClickElement(button_register_header);
	}

	public void clickOnBlogLinkOnHeader() throws Exception {
		super.waitAndClickElement(link_blog_header);
	}

	public String getTextFromCallUsOnHeader() {
		return super.waitUntilWebElementIsVisible(text_callUs_header).getText();
	}

	public String getTextFromContactNumberOnHeader() {
		return super.waitUntilWebElementIsVisible(text_0800111106_header).getText();
	}

	// ...................APPLICATION FOOTER ACTIONS....................//
	public void clickOnHomelinkOnFooter() throws Exception {
		super.waitAndClickElement(link_Home_footer);
	}

	public void clickOnFeaturesLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_features_footer);
	}

	public void clickOnPricingLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_pricing_footer);
	}

	public void clickOnSupportLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_support_footer);
	}

	public void clickOnBlogLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_blog_footer);
	}

	public void clickOnLoginLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_login_footer);
	}

	public void clickOnRegisterLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_register_footer);
	}

	public void clickOnAboutLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_about_footer);
	}

	public void clickOnTermsOfUseLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_terms_of_use_footer);
	}

	public void clickOnPrivacyLinkOnFooter() throws Exception {
		super.waitAndClickElement(link_privacy_footer);
	}

	public String getTextFromCopyrightTrademarkOnFooter() {
		return super.waitUntilWebElementIsVisible(link_copyright_trademark_footer).getText();
	}

	// ...................APPLICATION HOMEPAGE BODY
	// ACTIONS....................//
	public void clickOnFirstSignupButton() throws Exception {
		super.waitAndClickElement(button_signup_body_first);
	}

	public void clickOnSecondSignupButton() throws Exception {
		super.waitAndClickElement(button_signup_body_second);
	}

	public void clickOnThirdSignupButton() throws Exception {
		super.waitAndClickElement(button_signup_body_third);
	}

	public void clickOnFourthSignupButton() throws Exception {
		super.waitAndClickElement(button_signup_body_fourth);
	}
}
