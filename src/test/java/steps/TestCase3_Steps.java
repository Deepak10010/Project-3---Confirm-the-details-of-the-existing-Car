package steps;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.actions.CarBrowsePageActions;
import pages.actions.CarResultPageActions;
import pages.actions.CarsListPageActions;
import pages.actions.ExistingCarPageActions;
import pages.actions.TradeMeHomePageActions;
import pages.actions.UsedCarsPageActions;
import utils.SeleniumDriver;

public class TestCase3_Steps {
	CarBrowsePageActions carbrowsepageactions = new CarBrowsePageActions();
	TradeMeHomePageActions trademehomepageactions = new TradeMeHomePageActions();
	UsedCarsPageActions usedcarspageactions = new UsedCarsPageActions();
	ExistingCarPageActions existingcarpageactions = new ExistingCarPageActions();
	CarResultPageActions carresultpageactions = new CarResultPageActions();
	CarsListPageActions carslistpageactions = new CarsListPageActions();
	
	
	@Given("^I am on the Home Page \"([^\"]*)\"  of TradeMe website$")
	public void i_am_on_the_Home_Page_of_TradeMe_website(String websiteURL) throws Throwable {
		SeleniumDriver.openPage(websiteURL);
	}

	@When("^I move to Motors tab$")
	public void i_move_to_Motors_tab(DataTable arg1) throws Throwable {
	  
	}

	@And("^click on \"([^\"]*)\" tab$")
	public void click_on_tab(String arg1) throws Throwable {
		System.out.println("Click on 'Motors' tab ");
		trademehomepageactions.ClickOnMotorsLink();
	}

	@And("^The Page Title should be \"([^\"]*)\"$")
	public void the_Page_Title_should_be(String expectedTitle) throws Throwable {
		String actual_title = SeleniumDriver.getDriver().getTitle();
	    Assert.assertEquals(actual_title,expectedTitle);
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String arg1) throws Throwable {
		System.out.println("Click on Used Cars Link");
		carbrowsepageactions.ClickOnUsedCarsLink();
	}
	
	@And("^click on used cars result item$")
	public void click_on_used_cars_result_item() throws Throwable {
		System.out.println("Click on the existing car");
		carslistpageactions.ClickOnExistingCar();  
	}

	@And("^I should see that the make \"([^\"]*)\" exists$")
	public void i_should_see_that_the_make_exists(String arg1) throws Throwable {
		usedcarspageactions.ClickOnExistingCar();
	}
	
	@And("^click on the existing car$")
	public void click_on_the_existing_car() throws Throwable {
		System.out.println("Click on the result obtained");
		existingcarpageactions.ClickOnExistingCarLink();
		
		
	}
	@Then("^I should see the details of the existing car$")
	public void i_should_see_the_details_of_the_existing_car(DataTable testdata) throws Throwable {
		System.out.println("Car details Found");
		
		carresultpageactions.verify_Number_Plate();
		carresultpageactions.verify_kilometres();
		carresultpageactions.verify_body();
		carresultpageactions.verify_seats();
		carresultpageactions.verify_fuel_type();
		carresultpageactions.verify_Engine();
		carresultpageactions.verify_Transmission();
		carresultpageactions.verify_Car_History();
		carresultpageactions.verify_registration_expiry();
		carresultpageactions.verify_wof_expiry();
		carresultpageactions.verify_model_detail();
	}

}
