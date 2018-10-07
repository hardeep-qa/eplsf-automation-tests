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
public class BlankFormEditorPage_Page extends BasePage {

	public BlankFormEditorPage_Page() throws IOException {
		super();
	}

	// ...................BLANK FORM EDITOR PAGE LOCATOR....................//	
	public @FindBy(xpath = "//span[@class='btn_title truncate'][contains(text(),'Name')]") WebElement Button_Name_Blank_Form_Editor_page;
	public @FindBy(id = "form_content_wrapper") WebElement Blank_Form_Editor_Page;
	public @FindBy(xpath = "//span[@class='btn_title truncate'][contains(text(),'Option List')]") WebElement Button_OptionList_Blank_Form_Editor_page;

	// ...................BLANK FORM EDITOR PAGE ACTIONS....................//
	public void dragAndDropNameButtonToBlankForm() throws Exception {
		super.switchToWindow(2);
		super.dragAndDrop(Button_Name_Blank_Form_Editor_page, Blank_Form_Editor_Page);
		Thread.sleep(3000);
	}

	public void dragAndDropOptionListButtonToBlankForm() throws Exception {
		super.dragAndDrop(Button_OptionList_Blank_Form_Editor_page, Blank_Form_Editor_Page);
		Thread.sleep(3000);

	}
}
