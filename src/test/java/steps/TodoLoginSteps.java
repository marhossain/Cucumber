package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BackgroundPage;
import page.ToDo_Page;
import util.Assertion;
import util.BrowserFactory;


public class TodoLoginSteps {
	WebDriver driver;
	ToDo_Page todoPage;
	BackgroundPage backgroundPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		todoPage = PageFactory.initElements(driver, ToDo_Page.class);
		backgroundPage = PageFactory.initElements(driver, BackgroundPage.class);
	}

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		
	}

	@When("^user click on the button$")
	public void user_click_on_the_button() throws InterruptedException {
		todoPage.todo();
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws InterruptedException {
		String expectedColor = "background-color: skyblue;";
		Assertion.contains("Sky Blue color displayed!", expectedColor, todoPage.getPageColor());
	}
	
	@Given("^Set White Background button exists$")
	public void set_White_Background_button_exists() throws InterruptedException {
		todoPage.todo();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws InterruptedException {
		String expectedColor = "background-color: white;";
		Assertion.contains("White color displayed!", expectedColor, todoPage.getPageColor());
	}
	

	@After
	public void afterRun() {
		todoPage.close();
	}
}