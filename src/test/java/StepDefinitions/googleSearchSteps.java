package StepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class googleSearchSteps {



	@Given("brower is open")
	public void brower_is_open() {
		
	System.out.println(" inside Step-browser is open");	
	}

	

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
	System.out.println("inside Step-user is on google search page");
	
	}

	@When("user enters a text in Search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("inside Step-user is on google search page");
	}
	@And("hits enter")
	public void hits_enter() {
	System.out.println(" inside-step-hits enter");	
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
System.out.println("inside Step- user is navigated to search results");





	}
}
