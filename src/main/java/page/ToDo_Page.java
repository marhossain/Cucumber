package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class ToDo_Page {

	WebDriver driver;

	// Each page must have a constructor in order to invite the driver
	public ToDo_Page(WebDriver driver) {
		this.driver = driver;
	}

	// Elements Library
	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set SkyBlue Background')] ")
	WebElement BluebackgroundButton;
	@FindBy(how = How.XPATH, using = "//button[@type='button' and contains (text(),'Set White Background')] ")
	WebElement WhitebackgroundButton;

	// Elements interaction methods
	public void todo() throws InterruptedException {
		BluebackgroundButton.click();
//		Thread.sleep(5000);
		WhitebackgroundButton.click();
	}

	public String getPageColor() {
		return driver.getTitle();
	}

	public void close() {
		driver.close();
	}
}