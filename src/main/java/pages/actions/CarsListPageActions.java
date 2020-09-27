package pages.actions;

import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsListPageLocators;
import utils.SeleniumDriver;

public class CarsListPageActions {

	CarsListPageLocators carslistpagelocators = null;
	
	public CarsListPageActions() {
		this.carslistpagelocators = new CarsListPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carslistpagelocators);
	}
	
	public void ClickOnExistingCar() {
		System.out.println("Existing car found");
		carslistpagelocators.Cars_List_Page_result.click();
		
	}
	
	
	
}
