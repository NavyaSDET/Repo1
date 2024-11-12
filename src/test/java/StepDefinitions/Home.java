package StepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;

public class Home {

	public WebDriver driver = Hooks.driver;
	public HomePage hp;

	
	@When("The user enter the DS_Algo Portal <URL>")
	public void the_user_enter_the_ds_algo_portal_url() {
		driver.get("https://dsportalapp.herokuapp.com/");
		hp = new HomePage(driver);
	}
	
	@Then("The user should landed on the DS_Algo Get Started page with message You are at the right place")
	public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message_you_are_at_the_right_place() {
		hp.validateHomePageHeader("Preparing for the Interviews");
		hp.validateHomePageText("You are at the right place");
		hp.validateHomePageGetStratedButton();
	}
	
}