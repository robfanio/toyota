package mortgageCal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject  {
	WebDriver driver;
	//--------ELEMENT LOCATORS---------//
	@FindBy(id = "lending") public WebElement lend;
	@FindBy(id="lending_mortcalc") public WebElement calc;
	
	
	//--------------------METHODS--------------//
	
	public void hoverLend() {
		Actions action = new Actions(driver);
		action.moveToElement(lend).perform();
		
	}
	
	
	public void clickCal() {
		calc.click();
	}
	
	
	
	
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
