package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarResultPageLocators;
import utils.SeleniumDriver;

public class CarResultPageActions {
	
	WebDriver driver=SeleniumDriver.getDriver(); 
 CarResultPageLocators carresultpagelocators = null;

public CarResultPageActions() {
	this.carresultpagelocators = new CarResultPageLocators();
	PageFactory.initElements(SeleniumDriver.getDriver(), carresultpagelocators);
}

public void verify_Number_Plate() {
	String car_result_numb_plate = driver.findElement(By.xpath("//span[contains(text(),'EDD369')]")).getText();
	System.out.println("Number Plate :" + car_result_numb_plate);
}

public void verify_kilometres() {
	String car_result_kilometers = driver.findElement(By.xpath("//span[contains(text(),'163,794')]")).getText();
	System.out.println("Kilometres : " + car_result_kilometers);
}

public void verify_body() {
	String car_result_body = driver.findElement(By.xpath("//span[contains(text(),'Dark Blue, 4 door, Sedan')]")).getText();
	System.out.println("Body : " + car_result_body);
}

public void verify_seats() {
	String car_result_seats = driver.findElement(By.xpath("//li[4]//div[2]//span[1]")).getText();
	System.out.println("Seats " + car_result_seats);
}

public void verify_fuel_type() {
	String car_result_fuel = driver.findElement(By.xpath("//span[contains(text(),'Petrol')]")).getText();
	System.out.println("Fuel " + car_result_fuel);
}

public void verify_Engine() {
	String car_result_engine = driver.findElement(By.xpath("//span[contains(text(),'6 cylinder, 28')]")).getText();
	System.out.println("Engine " + car_result_engine);
}

public void verify_Transmission() {
	String car_result_transmission = driver.findElement(By.xpath("//span[contains(text(),'Tiptronic')]")).getText();
	System.out.println("Transmission " + car_result_transmission);
}

public void verify_Car_History() {
	String car_result_history = driver.findElement(By.xpath("//span[contains(text(),'5+ owners, Imported')]")).getText();
	System.out.println("History " + car_result_history);
}

public void verify_registration_expiry() {
	String car_result_registration_expiry = driver.findElement(By.xpath("//span[contains(text(),'Sep 2021')]")).getText();
	System.out.println("Registration Expiry : " + car_result_registration_expiry);
}

public void verify_wof_expiry() {
	String car_result_wof_expiry = driver.findElement(By.xpath("//span[contains(text(),'Jan 2021')]")).getText();
	System.out.println("WOF Expiry : " + car_result_wof_expiry);
}

public void verify_model_detail() {
	String car_result_model_detail = driver.findElement(By.xpath("//span[contains(text(),'E46')]")).getText();
	System.out.println("Model Detail : " + car_result_model_detail);
}
}