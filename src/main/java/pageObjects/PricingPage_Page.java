package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Hardeep Aujla
 *
 */
public class PricingPage_Page extends BasePage {

	public PricingPage_Page() throws IOException {
		super();
	}

	// ...................APPLICATION PRICING PAGE
	// LOCATORS....................//
	private @FindBy(xpath = "//a[@href='https://go.easypeasyforms.com/SignUpNow?pid=6401']") WebElement button_starter_pricing_page;
	private @FindBy(xpath = "//a[@href='https://go.easypeasyforms.com/SignUpNow?pid=6402']") WebElement button_professional_pricing_page;
	private @FindBy(xpath = "//a[@href='https://go.easypeasyforms.com/SignUpNow?pid=6403']") WebElement button_business_pricing_page;
	private @FindBy(xpath = "//a[@href='https://go.easypeasyforms.com/SignUpNow?pid=6404']") WebElement button_enterprise_pricing_page;

	// ...................APPLICATION PRICING PAGE ACTIONS....................//
	public void clickOnStarterGetStartedButtonOnPricingPage() throws Exception {
		super.waitAndClickElement(button_starter_pricing_page);
	}

	public void clickOnProfessionalGetStartedButtonOnPricingPage() throws Exception {
		super.waitAndClickElement(button_professional_pricing_page);
	}

	public void clickOnBusinessGetStartedButtonOnPricingPage() throws Exception {
		super.waitAndClickElement(button_business_pricing_page);
	}

	public void clickOnEnterpriseGetStartedButtonOnPricingPage() throws Exception {
		super.waitAndClickElement(button_enterprise_pricing_page);
	}

}
