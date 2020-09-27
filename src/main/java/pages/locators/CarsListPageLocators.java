package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsListPageLocators {
	@FindBy(how=How.XPATH, using = "//a[contains(text(),'BMW')]")
	public WebElement Cars_List_Page_result;
	
	
}
