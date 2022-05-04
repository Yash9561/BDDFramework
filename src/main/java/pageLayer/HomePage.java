package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClass1;

public class HomePage extends BaseClass1 {
	
	
	@FindBy(xpath = "//span[contains(text(),'Stays')]")
	WebElement stays;
	
	@FindBy(xpath = "//span[contains(text(),'Flights')]")
	WebElement flights;
	
	@FindBy(xpath = "//span[contains(text(),'Flight+Hotel')]")
	WebElement hotels;
	
	@FindBy(xpath = "//span[contains(text(),'Car')]")
	WebElement carRentals;
	
	@FindBy(xpath = "//span[contains(text(),'Attractions')]")
	WebElement attraction;
	
	@FindBy(xpath = "//span[contains(text(),'Airport')]")
	WebElement airportTaxis;
	
	@FindBy(xpath = "//input[@name='ss']")
	WebElement place;
	
	@FindBy(xpath = "//span[@class='js-sb-submit-text']")
	WebElement searchButton;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkStaysLink() {
		stays.click();
	}
	public void searchplace(String city) {
		place.sendKeys(city);
		searchButton.click();
	}
	public void checkFlightsLink() {
		flights.click();
	}
	public void checkHotelLink() {
		hotels.click();
	}
	public void checkCarRentalLink() {
		carRentals.click();
	}
	public void checkAirportTaxiLink() {
		airportTaxis.click();
	}
	public void checkAttractionLink() {
		attraction.click();
	}
	
	
	
	
	

}
