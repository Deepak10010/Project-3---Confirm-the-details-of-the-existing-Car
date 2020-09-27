package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.UsedCarsPageLocators;
import utils.SeleniumDriver;

public class UsedCarsPageActions {

	UsedCarsPageLocators usedcarspagelocators = null;
	
	public UsedCarsPageActions() {
		this.usedcarspagelocators = new UsedCarsPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedcarspagelocators);
	}
	
	public void ClickOnExistingCar() {

		usedcarspagelocators.BMW_Link.click();
	}
}