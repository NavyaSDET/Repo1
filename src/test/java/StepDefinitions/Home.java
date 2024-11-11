package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class Home {

	public WebDriver driver;
	public HomePage hp;

	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}

	@Given("The user should be open the browser")
	public void the_user_should_be_open_the_browser() {	
		System.out.println("The user should be open the browser");

	}
	@When("The user enter the DS_Algo Portal <URL>")
	public void the_user_enter_the_ds_algo_portal_url() {
		driver.get("https://dsportalapp.herokuapp.com/");
		hp = new HomePage(driver);
		System.out.println("The user enter the DS_Algo Portal <URL>");
	}
	@Then("The user should landed on the DS_Algo Get Started page with message You are at the right place")
	public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message_you_are_at_the_right_place() {
		hp.validateHomePageHeader("Preparing for the Interviews");
		hp.validateHomePageText("You are at the right place");
		hp.validateHomePageGetStratedButton();
		System.out.println("The user should landed on the DS_Algo Get Started page with message You are at the right place");
	}
	
}
