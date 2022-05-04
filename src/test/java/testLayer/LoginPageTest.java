package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	 LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		BaseClass.initialization();
	}
	@Test(priority=1)
	public void validateLogo() {
		Assert.assertEquals(loginPage.checklogoDisplayed(), true);
	}
	@Test(priority=2)
	public void validateTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	@Test(priority=3)
	public void validateurl() {
		Assert.assertEquals(driver.getCurrentUrl().contains("login"), true);
	}
	@Test(priority=4)
	public void validateDisplayedStatusUsername() {
		Assert.assertEquals(loginPage.checkUsernameDisplayed(),true);
	}
	@Test(priority=5)
	public void validateEnabledStatusUsername() {
		Assert.assertEquals(loginPage.checkUsernameEnabled(),true);
	}
	@Test(priority=6)
	public void clearUsernameData() {
		loginPage.clearDataInUsername();
	}
	@Test(priority=7)
	public void validateEnterDataUsername() {
		loginPage.enterDataInUsername("Admin");
		Assert.assertEquals(loginPage.captureDataInUsername(),"Admin");
	}
	
	@Test(priority=8)
	public void validateDisplayedStatusPassword() {
		Assert.assertEquals(loginPage.checkPasswordDisplayed(),true);
	}
	@Test(priority=9)
	public void validateEnabledStatusPassword() {
		Assert.assertEquals(loginPage.checkPasswordEnabled(),true);
	}
	@Test(priority=10)
	public void clearPasswordData() {
		loginPage.clearDataInPassword();
	}
	@Test(priority=11)
	public void validateEnterDataPassword() {
		loginPage.enterDataInPassword("admin123");
	}
	@Test(priority=12)
	public void validateDisplayedStatusLoginButton() {
		Assert.assertEquals(loginPage.checkLoginButtonDisplayed(),true);
	}
	@Test(priority=13)
	public void validateEnabledStatusLoginButton() {
		Assert.assertEquals(loginPage.checkLoginButtonEnabled(),true);
	}
	@Test(priority=14)
	public void validateLoginButtonLoginButtonValue() {
		Assert.assertEquals(loginPage.captureLoginButtonValue(), "LOGIN");
	}
	@Test(priority=15)
	public void clickOnLoginButton() {
		loginPage.clickLoginButton();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

}
