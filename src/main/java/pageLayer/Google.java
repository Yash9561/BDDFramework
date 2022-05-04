package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLayer.BaseClassG;

public class Google extends BaseClassG{
	
	
	@FindBy(xpath = "//input[@title='Search']")
	WebElement searchBox;
	
	@FindBy(name = "btnK")
	WebElement searchButton;
	
	
	public Google() {
		PageFactory.initElements(driver, this);
	}
	
	public void search(String value) {
		searchBox.sendKeys(value);
		searchButton.click();
	}

}
