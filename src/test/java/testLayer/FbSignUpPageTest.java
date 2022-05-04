package testLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.FbBaseClass;
import junit.framework.Assert;
import pageLayer.FbSignUpPage;

public class FbSignUpPageTest extends FbBaseClass{
	
	FbSignUpPage fbsignupPage = new FbSignUpPage(driver);
	@BeforeClass
	public void setUp() {
		FbBaseClass.initialization();
	}
	
	@Test(priority=1)
	public void validateFirstnameDisplayed() {
		Assert.assertEquals(fbsignupPage.checkFirstnameDisplayed(), true);	
	}
	@Test(priority=2)
	public void validateFirstnameEnabled() {
		Assert.assertEquals(fbsignupPage.checkFirstnameEnabled(), true);	
	}
	@Test(priority=3)
	public void enterFirstnameData() {
		fbsignupPage.enterDataInFirstname("Yash");
		Assert.assertEquals(fbsignupPage.captureDataInFirstname(),"Yash");
	}
	
	
	
	@Test(priority=4)
	public void validateSurnameDisplayed() {
		Assert.assertEquals(fbsignupPage.checkSurnameDisplayed(), true);	
	}
	@Test(priority=5)
	public void validateSurnameEnabled() {
		Assert.assertEquals(fbsignupPage.checkSurnameEnabled(), true);	
	}
	@Test(priority=6)
	public void enterSurnameData() {
		fbsignupPage.enterDataInSurname("Jadhav");
		Assert.assertEquals(fbsignupPage.captureDataInSurname(),"Jadhav");
	}
	
	@Test(priority=7)
	public void validateEmailDisplayed() {
		Assert.assertEquals(fbsignupPage.checkEmailDisplayed(), true);	
	}
	@Test(priority=8)
	public void validateEmailEnabled() {
		Assert.assertEquals(fbsignupPage.checkEmailEnabled(), true);	
	}
	@Test(priority=9)
	public void enterEmailData() {
		fbsignupPage.enterDataInEmail("yash749@gmail.com");
		Assert.assertEquals(fbsignupPage.captureDataInEmail(),"yash749@gmail.com");
	}
	
	@Test(priority=10)
	public void validatepasswordDisplayed() {
		Assert.assertEquals(fbsignupPage.checkPasswordDisplayed(), true);	
	}
	@Test(priority=11)
	public void validatePasswordEnabled() {
		Assert.assertEquals(fbsignupPage.checkPasswordEnabled(), true);	
	}
	@Test(priority=12)
	public void enterPasswordData() {
		fbsignupPage.enterDataInPassword("Yash749");
	}
	
	
	@Test(priority=13)
	public void validatedayDropDownDisplayed() {
		Assert.assertEquals(fbsignupPage.checkdayDropDownDisplayed(), true);	
	}
	@Test(priority=14)
	public void validatedayDropDownEnabled() {
		Assert.assertEquals(fbsignupPage.checkdayDropDownEnabled(), true);	
	}
	@Test(priority=15)
	public void validateselectDayDropDownValue() {
		fbsignupPage.selectDayDropDownValue("10");
		Assert.assertEquals(fbsignupPage.getSelectedDayDropDownValue(), "10");
		Assert.assertEquals(fbsignupPage.countAllDayDropDownValue(), 31);
	}
	
	@Test(priority=16)
	public void validatemonthDropDownDisplayed() {
		Assert.assertEquals(fbsignupPage.checkmonthDropDownDisplayed(), true);	
	}
	@Test(priority=17)
	public void validatemonthDropDownEnabled() {
		Assert.assertEquals(fbsignupPage.checkmonthDropDownEnabled(), true);	
	}
	@Test(priority=18)
	public void validateselectmonthDropDownValue() {
		fbsignupPage.selectmonthDropDownValue("8");
		Assert.assertEquals(fbsignupPage.getSelectedmonthDropDownValue(), "Aug");
		Assert.assertEquals(fbsignupPage.countAllmonthDropDownValue(), 12);
	}
	
	@Test(priority=19)
	public void validateyearDropDownDisplayed() {
		Assert.assertEquals(fbsignupPage.checkyearDropDownDisplayed(), true);	
	}
	@Test(priority=20)
	public void validateyearDropDownEnabled() {
		Assert.assertEquals(fbsignupPage.checkyearDropDownEnabled(), true);	
	}
	@Test(priority=21)
	public void validateselectyearDropDownValue() {
		fbsignupPage.selectyearDropDownValue("1995");
		Assert.assertEquals(fbsignupPage.getSelectedyearDropDownValue(), "1995");
		Assert.assertEquals(fbsignupPage.countAllyearDropDownValue(), 118);
	}
	
	
	
	
	
	

}
