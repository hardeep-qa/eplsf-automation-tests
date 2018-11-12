package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Hardeep Aujla
 *
 */
public class BlankFormEditorPage_Page extends BasePage {

	public BlankFormEditorPage_Page() throws IOException {
		super();
	}

	// ...................BLANK FORM EDITOR PAGE LOCATOR....................//
	private @FindBy(xpath = "//span[contains(text(), 'Name')]/parent::a") WebElement Button_Name_Blank_Form_Editor_page;
	private @FindBy(id = "form_content_wrapper") WebElement Blank_Form_Editor_Page;
	private @FindBy(xpath = "//span[contains(text(), 'Option List')]/parent::a") WebElement Button_OptionList_Blank_Form_Editor_page;
	private @FindBy(xpath = "//span[contains(text(), 'Image Upload')]/parent::a") WebElement Button_ImageUpload_Blank_Form_Editor_page;
	private @FindBy(xpath = "//ul[@class='menu_for_selected drop_links']/li/a/i[@onclick='DeleteForms()']") WebElement Icon_Delete_On_Blank_Form_Editor_page;

	// ...................BLANK FORM EDITOR PAGE ACTIONS....................//
	public void dragAndDropNameButtonToBlankForm() throws Exception {
		super.switchToWindow(2);
		super.dragAndDrop(Button_Name_Blank_Form_Editor_page, Blank_Form_Editor_Page);
	}

	public void dragAndDropOptionListButtonToBlankForm() throws Exception {
		super.dragAndDrop(Button_OptionList_Blank_Form_Editor_page, Blank_Form_Editor_Page);
	}
	
	public void dragAndDropImageUploadButtonToBlankForm() throws Exception {
		super.dragAndDrop(Button_ImageUpload_Blank_Form_Editor_page, Blank_Form_Editor_Page);
	}
	
	public void isFormAvailableInTheList(String formName) {
		super.waitUntilWebElementIsVisible(driver.findElement(By.xpath("//span[contains(text(), '"+formName+"')]")));
	}
	
	public void checkTheCheckboxOfDummyForm(String formName) throws Exception {
		super.waitAndClickElement(driver.findElement(By.xpath("//span[contains(text(), "+formName+")]/parent::a/preceding-sibling::span/i")));
	}
	
	public void clickOnDeleteIconToDeleteDummyForm() throws Exception {
		super.waitAndClickElement(Icon_Delete_On_Blank_Form_Editor_page);
	}
}
