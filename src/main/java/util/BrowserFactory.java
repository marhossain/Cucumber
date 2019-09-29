package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {

	// Global, usable by all methods
	static WebDriver driver;

	public static  WebDriver startBrowser() {
		// Setting properties for ChromeDriver
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		// Create ChromeDriver object, launch Chrome browser
		 WebDriver driver = new ChromeDriver();
		 
		// Create ChromeDriver object, launch Chrome browser
		driver.get("http://techfios.com/test/107/");
		return driver;
	}
}