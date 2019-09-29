package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BackgroundPage extends BasePage {

	WebDriver driver; 

	// Each page must have a constructor in order to invite the driver
	public BackgroundPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement BlueColor;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteColor;

	// Elements interaction methods
	public void waitForColor() {
		waitForElement(BlueColor, driver);
	}

	public boolean isBackGroundColorBlue() {
		try {
			waitForColor();
			return true;
		} 
		catch (Exception e) {
		}
		return false;
	}
}
