package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.BasePage;
import pageObjects.BlankFormEditorPage_Page;
import pageObjects.FeaturesPage_Page;
import pageObjects.HomePage_Page;
import pageObjects.PricingPage_Page;
import pageObjects.SignInPage_Page;
import pageObjects.SignUpPage_Page;
import pageObjects.UserDashboardPage_Page;

/**
 * @author Hardeep Aujla
 *
 */
public class DriverFactory {
	public static WebDriver driver;
	public static BasePage basePage;
	public static HomePage_Page homePage;
	public static FeaturesPage_Page featuresPage;
	public static PricingPage_Page pricingPage;
	public static SignInPage_Page signInPage;
	public static SignUpPage_Page signUpPage;
	public static UserDashboardPage_Page userDashboardPage;
	public static BlankFormEditorPage_Page blankFormEditorPage; 

	public WebDriver getDriver() {
		try {
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver(options);
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				if (null == driver) {
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
				}
				break;

			default:
				Assert.fail("The browser name in the config.properties file should be chrome, firefox or ie");
			}

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			basePage = PageFactory.initElements(driver, BasePage.class);
			homePage = PageFactory.initElements(driver, HomePage_Page.class);
			featuresPage = PageFactory.initElements(driver, FeaturesPage_Page.class);
			pricingPage = PageFactory.initElements(driver, PricingPage_Page.class);
			signInPage = PageFactory.initElements(driver, SignInPage_Page.class);
			signUpPage = PageFactory.initElements(driver, SignUpPage_Page.class);
			userDashboardPage = PageFactory.initElements(driver, UserDashboardPage_Page.class);
			blankFormEditorPage = PageFactory.initElements(driver, BlankFormEditorPage_Page.class);
		} catch (Exception e) {
			System.out.println("Unable to load browser! - Exception: " + e.getMessage());

		}
		return driver;
	}
}