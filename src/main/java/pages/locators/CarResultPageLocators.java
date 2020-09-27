package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarResultPageLocators {
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'EDD369')]")
	public WebElement Number_Plate;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'163,794')]")
	public WebElement Kilometres;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Dark Blue, 4 door, Sedan')]")
	public WebElement Body;
	
	@FindBy(how=How.XPATH, using = "//li[4]//div[2]//span[1]")
	public WebElement Seats;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Petrol')]")
	public WebElement Fuel_Type;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'6 cylinder, 28')]")
	public WebElement Engine;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Tiptronic')]")
	public WebElement Transmission;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'5+ owners, Imported')]")
	public WebElement History;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Sep 2021')]")
	public WebElement Registration_expires;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'Jan 2021')]")
	public WebElement WOF_Expires;
	
	@FindBy(how=How.XPATH, using = "//span[contains(text(),'E46')]")
	public WebElement Model_detail;
	
	
}
