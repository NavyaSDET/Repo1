package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackPage {

	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
		
		System.out.println("User is on DS algo homepage ");
		
	}

	@When("The user clicks Get Started button below the Stack")
	public void the_user_clicks_get_started_button_below_the_stack() {
		System.out.println("User clicks Get Started button below the Stack");
		
	}

	@Then("The user should land in {string} page")
	public void the_user_should_land_in_page(String string) {
		System.out.println("User lands on stack");
		
	}

	@Given("The user is on the Stack Home Page")
	public void the_user_is_on_the_stack_home_page() {
		System.out.println("User is on stack home page");
		
	}

	@When("The user clicks on Operations in Stack link below Topics Covered")
	public void the_user_clicks_on_operations_in_stack_link_below_topics_covered() {
		System.out.println("User clicks on Operations in Stack link");
		
	}

	@Given("The user is in the Operations in Stack page")
	public void the_user_is_in_the_operations_in_stack_page() {
		System.out.println("User is in the Operations in Stack page");
		
	}

	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		System.out.println("User clicks on try here");
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		System.out.println("User is in the Operations in Stack page");
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		System.out.println("User clicks the Run Button without entering the code in the Editor");
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
		System.out.println("User clicks the Run Button without entering the code in the Editor");
	    
	}

	@Given("The user is on the tryEditor page")
	public void the_user_is_on_the_try_editor_page() {
		System.out.println("");
	    
	}

	@When("The User writes Valid python code")
	public void the_user_writes_valid_python_code() {
		System.out.println("The User writes Valid python code");
		}

	@When("click Run button")
	public void click_run_button() {
		System.out.println("click Run button");
	}

	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
		System.out.println("");
	}

	@When("the user writes invalid python code")
	public void the_user_writes_invalid_python_code() {
		System.out.println("the user writes invalid python code");
	}

	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
		System.out.println("User is able to see the error msg in pop up window");
	}

	@Given("The user is on the editor page withAlert error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message() {
		System.out.println("The user is on the editor page withAlert error message");
	}

	@When("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
		System.out.println("The user click the ok button in the alert window");
	}

	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() {
		System.out.println("The user is on the same page having Editor and Run butto");
	}

	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() {
		System.out.println("The user is in the Stack page after logged i");
	}

	@Then("The user should be directed to {string} Page")
	public void the_user_should_be_directed_to_page(String string) {
		System.out.println("The user should be directed to {string} Page");
	}

	@Given("The user is in the Implementation page")
	public void the_user_is_in_the_implementation_page() {
		System.out.println("The user is in the Implementation pag");
	}

	@Given("The user is on the editor page with Alert error message")
	public void the_user_is_on_the_editor_page_with_alert_error_message1() {
		System.out.println("The user is on the editor page with Alert error message");
	}

	@Given("The user is in the Applications page")
	public void the_user_is_in_the_applications_page() {
		System.out.println("The user is in the Applications pag");
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		System.out.println("The user should be redirected to {string} page");
	}




	}

