package testLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClassG;
import pageLayer.Google;

public class GoogleTest extends BaseClassG {
	
	
	@BeforeClass
	public void setup() {
		BaseClassG.initialization();
	}
	
	@Test
	public void validateSearchGoogle() {
		Google google = new Google();
		google.search("Selenium Testing");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
