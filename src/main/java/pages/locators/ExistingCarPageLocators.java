package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExistingCarPageLocators {

	@FindBy(how=How.XPATH, using = "//div[@class='tmm-search-card-list-view__title tmm-search-card-list-view__title--bold']")
	public WebElement Existing_Car_Model;
	
	
}
