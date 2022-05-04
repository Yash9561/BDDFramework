package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import baseLayer.FbBaseClass;

public class FbSignUpPage extends FbBaseClass {
	
	private By Firstname = By.name("firstname");
	private By Surname = By.name("lastname");
	private By Email = By.name("reg_email__");
	private By password = By.name("reg_passwd__");
	private By day = By.name("birthday_day");
	private By month= By.name("birthday_month");
	private By year = By.name("birthday_year");
	private By gender = By.xpath("//label[text()='Male']");
	private By signUp = By.name("websubmit");
	private By accountLink = By.name("//a[contains(text(),'account')]");
	private By fbLogo = By.name("//img[contains(@class,'fbLogo')]");
	
	
	public FbSignUpPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkFirstnameDisplayed(){
		return driver.findElement(Firstname).isDisplayed();
	}
	public boolean checkFirstnameEnabled(){
		return driver.findElement(Firstname).isEnabled();
	}
	public void enterDataInFirstname(String value) {
		driver.findElement(Firstname).sendKeys(value);
	}
	public String captureDataInFirstname() {
		return driver.findElement(Firstname).getAttribute("value");
	}
	public void clearDataInFirstname() {
		driver.findElement(Firstname).clear();
	}
	
	
	public boolean checkSurnameDisplayed(){
		return driver.findElement(Surname).isDisplayed();
	}
	public boolean checkSurnameEnabled(){
		return driver.findElement(Surname).isEnabled();
	}
	public void enterDataInSurname(String value) {
		driver.findElement(Surname).sendKeys(value);
	}
	public String captureDataInSurname() {
		return driver.findElement(Surname).getAttribute("value");
	}
	public void clearDataInSurname() {
		driver.findElement(Surname).clear();
	}
	
	
	public boolean checkEmailDisplayed(){
		return driver.findElement(Email).isDisplayed();
	}
	public boolean checkEmailEnabled(){
		return driver.findElement(Email).isEnabled();
	}
	public void enterDataInEmail(String value) {
		driver.findElement(Email).sendKeys(value);
	}
	public String captureDataInEmail() {
		return driver.findElement(Email).getAttribute("value");
	}
	public void clearDataInEmail() {
		driver.findElement(Email).clear();
	}
	
	
	public boolean checkPasswordDisplayed(){
		return driver.findElement(password).isDisplayed();
	}
	public boolean checkPasswordEnabled(){
		return driver.findElement(password).isEnabled();
	}
	public void enterDataInPassword(String value) {
		driver.findElement(password).sendKeys(value);
	}
	public void clearDataInPassword() {
		driver.findElement(password).clear();
	}
	
	
	
	public boolean checkdayDropDownDisplayed(){
		return driver.findElement(day).isDisplayed();
	}
	public boolean checkdayDropDownEnabled(){
		return driver.findElement(day).isEnabled();
	}
	public void selectDayDropDownValue(String value) {
		new Select(driver.findElement(day)).selectByValue(value);
	}
	public String getSelectedDayDropDownValue() {
		return new Select(driver.findElement(day)).getFirstSelectedOption().getText();
	}
	public int countAllDayDropDownValue() {
		return new Select(driver.findElement(day)).getOptions().size();
	}
	
	
	public boolean checkmonthDropDownDisplayed(){
		return driver.findElement(month).isDisplayed();
	}
	public boolean checkmonthDropDownEnabled(){
		return driver.findElement(month).isEnabled();
	}
	public void selectmonthDropDownValue(String value) {
		new Select(driver.findElement(month)).selectByValue(value);
	}
	public String getSelectedmonthDropDownValue() {
		return new Select(driver.findElement(month)).getFirstSelectedOption().getText();
	}
	public int countAllmonthDropDownValue() {
		return new Select(driver.findElement(month)).getOptions().size();
	}
	

	
	public boolean checkyearDropDownDisplayed(){
		return driver.findElement(year).isDisplayed();
	}
	public boolean checkyearDropDownEnabled(){
		return driver.findElement(year).isEnabled();
	}
	public void selectyearDropDownValue(String value) {
		new Select(driver.findElement(year)).selectByValue(value);
	}
	public String getSelectedyearDropDownValue() {
		return new Select(driver.findElement(year)).getFirstSelectedOption().getText();
	}
	public int countAllyearDropDownValue() {
		return new Select(driver.findElement(year)).getOptions().size();
	}
	
	
	
	
	public boolean checksignUpDisplayed(){
		return driver.findElement(signUp).isDisplayed();
	}
	public boolean checksignUpEnabled(){
		return driver.findElement(signUp).isEnabled();
	}
	public String capturesignUpValue() {
		return driver.findElement(signUp).getAttribute("value");
	}
	public void clicksignUp() {
		driver.findElement(signUp).click();
	}
	
	public boolean checkaccountLinkDisplayed(){
		return driver.findElement(accountLink).isDisplayed();
	}
	public boolean checkaccountLinkEnabledStatus(){
		return driver.findElement(accountLink).isEnabled();
	}
	public String captureaccountLink() {
		return driver.findElement(accountLink).getText();
	}
	public void clickaccountLink() {
		driver.findElement(accountLink).click();
	}
	
	
	public boolean checkfbLogoDisplayed(){
		return driver.findElement(fbLogo).isDisplayed();
	}
	
	

}
