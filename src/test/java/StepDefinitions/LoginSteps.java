package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {




	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	System.out.println("Inside Step-user is on the login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	System.out.println("Inside Step -user Enters username and password");
	}

	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		
		System.out.println("Inside-Step-click on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		
	}










}
