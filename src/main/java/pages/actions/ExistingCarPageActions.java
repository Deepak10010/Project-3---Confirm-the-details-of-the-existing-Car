package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.ExistingCarPageLocators;
import utils.SeleniumDriver;

public class ExistingCarPageActions {

	ExistingCarPageLocators existingcarpagelocators = null;
	
	public ExistingCarPageActions() {
		this.existingcarpagelocators = new ExistingCarPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), existingcarpagelocators);
		}
	
	public void ClickOnExistingCarLink() {
		existingcarpagelocators.Existing_Car_Model.click();
	}
	
}
