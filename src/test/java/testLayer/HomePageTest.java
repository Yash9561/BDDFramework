package testLayer;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass1;
import junit.framework.Assert;
import pageLayer.HomePage;

public class HomePageTest extends BaseClass1 {
	
    private HomePage homepage;
	
	@BeforeClass
	public void setUp() {
		BaseClass1.initialization();
	}
	@Test
	public void validatStayPage() {
		HomePage homepage = new HomePage();
		homepage.checkStaysLink();
		Assert.assertEquals(driver.getTitle().contains("Booking.com"),true);
	}
	@Test
	public void validateStaySearch() {
		homepage.searchplace("Mumbai");
		Assert.assertEquals(driver.getTitle().contains("Mumbai"), true);
	}
	@Test(priority=1)
	public void validaFlightPage() {
		HomePage homepage = new HomePage();
		homepage.checkFlightsLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("flights"),true);
	}
//	@Test(priority=3)
//	public void validaHotelPage() {
//		HomePage homepage = new HomePage();
//		homepage.checkHotelLink();
//		Assert.assertEquals(driver.getTitle().contains("Agoda"),true);
//	}
	@Test(priority=2)
	public void validateCarRentPage() {
		HomePage homepage = new HomePage();
		homepage.checkCarRentalLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("cars"),true);
	}
	
	@Test(priority=4)
	public void validaAttractionPage() {
		HomePage homepage = new HomePage();
		homepage.checkAttractionLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("attractions"),true);
	}
	@Test(priority=5)
	public void validaAirportTaxiPage() {
		HomePage homepage = new HomePage();
		homepage.checkAirportTaxiLink();
		Assert.assertEquals(driver.getCurrentUrl().contains("taxi"),true);
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
