package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseLayer.BaseClass;

public class LoginPage extends BaseClass{
	
	private By username=By.id("txtUsername");
	private By password=By.id("txtPassword");
	private By loginButton=By.id("btnLogin");
	private By forgotLink=By.xpath("//a[contains(text(),'Forgot')]");
	private By logo=By.xpath("//img[contains(@src,'logo')]");
	private By errorMessage=By.xpath("//span[@id='spanMessage']");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean checkUsernameDisplayed(){
		return driver.findElement(username).isDisplayed();
	}
	public boolean checkUsernameEnabled(){
		return driver.findElement(username).isEnabled();
	}
	public void enterDataInUsername(String value) {
		driver.findElement(username).sendKeys(value);
	}
	public String captureDataInUsername() {
		return driver.findElement(username).getAttribute("value");
	}
	public void clearDataInUsername() {
		driver.findElement(username).clear();
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
	
	
	public boolean checkLoginButtonDisplayed(){
		return driver.findElement(loginButton).isDisplayed();
	}
	public boolean checkLoginButtonEnabled(){
		return driver.findElement(loginButton).isEnabled();
	}
	public String captureLoginButtonValue() {
		return driver.findElement(loginButton).getAttribute("value");
	}
	public void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public boolean checkforgotLinkDisplayed(){
		return driver.findElement(forgotLink).isDisplayed();
	}
	public boolean checkforgotLinkEnabledStatus(){
		return driver.findElement(forgotLink).isEnabled();
	}
	public String captureforgotLink() {
		return driver.findElement(forgotLink).getText();
	}
	public void clickforgotLink() {
		driver.findElement(forgotLink).click();
	}
	
	
	public boolean checklogoDisplayed(){
		return driver.findElement(logo).isDisplayed();
	}
	
	
	public boolean checkerrorMessageDisplayed(){
		return driver.findElement(errorMessage).isDisplayed();
	}
	public String captureerrorMessageText() {
		return driver.findElement(errorMessage).getText();
	}
	
	
	
	
	

}
