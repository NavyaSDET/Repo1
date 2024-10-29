package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSIntroductionDetails {

	@Given("The user should open the DS Algo Portal URL in any supported browser")
	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
		System.out.println("The user should open the DS Algo Portal URL in any supported browser");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		System.out.println("The user clicks the Get Started button");
	}

	@When("The user clicks the data structure dropdown arrow")
	public void the_user_clicks_the_data_structure_dropdown_arrow() {
		System.out.println("The user clicks the data structure dropdown arrow");
	}

	@Then("The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu")
	public void the_user_should_able_to_see_siz_options_arrays_linked_list_stack_queue_tree_graph_in_dropdown_menu() {
		System.out.println(
				"The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu");
	}

	@Given("The user is on the DS Introduction page")
	public void the_user_is_on_the_ds_introduction_page() {
		System.out.println("The user is on the DS Introduction page");
	}

	@When("The user clicks any Get Started buttons of data structures on the DS Introduction page")
	public void the_user_clicks_any_get_started_buttons_of_data_structures_on_the_ds_introduction_page() {
		System.out.println("The user clicks any Get Started buttons of data structures on the DS Introduction page");
	}

	@Then("The user should able to see an warning message You are not logged in")
	public void the_user_should_able_to_see_an_warning_message_you_are_not_logged_in() {
		System.out.println("The user should able to see an warning message You are not logged in");
	}

	@When("The user clicks Register link on the DS Introduction page")
	public void the_user_clicks_register_link_on_the_ds_introduction_page() {
		System.out.println("The user clicks Register link on the DS Introduction page");
	}

	@Then("The user should navigate to register page")
	public void the_user_should_navigate_to_register_page() {
		System.out.println("The user should navigate to register page");
	}

	@Given("The user is on the DS Introduction page as signedIn")
	public void the_user_is_on_the_ds_introduction_page_as_signed_in() {
		System.out.println("The user is on the DS Introduction page as signedIn");
	}

	@Then("The user should navigate to DS Intoduction details page")
	public void the_user_should_navigate_to_ds_intoduction_details_page() {
		System.out.println("The user should navigate to DS Intoduction details page");
	}

	@Then("User should see the timeComplexity link")
	public void user_should_see_the_time_complexity_link() {
		System.out.println("User should see the timeComplexity link");

	}

	@When("The user clicks the Time Complexity button")
	public void the_user_clicks_the_time_complexity_button() {
		  System.out.println("The user clicks the Time Complexity button");
	}

	@Then("User should navigate to Time Complexity page")
	public void user_should_navigate_to_time_complexity_page() {
		System.out.println("User should navigate to Time Complexity page");
	}

	@Then("User should see Practice Question link and try here")
	public void user_should_see_practice_question_link_and_try_here() {
		System.out.println("User should see Practice Question link and try here");
	}

	@When("User clicks Try here link")
	public void user_clicks_try_here_link() {
		System.out.println("User clicks Try here link");
	}

	@Then("User should navigate to tryEditor page")
	public void user_should_navigate_to_try_editor_page() {
		System.out.println("User should navigate to tryEditor page");
	}

	@Given("User is on Try Here page for time complexity")
	public void user_is_on_try_here_page_for_time_complexity() {
		System.out.println("User is on Try Here page for time complexity");
	}

	@When("The user write the invalid code in Editor")
	public void the_user_write_the_invalid_code_in_editor() {
		System.out.println("The user write the invalid code in Editor");
	}

	@When("Click the Run button")
	public void click_the_run_button() {
		System.out.println("Click the Run button");
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		System.out.println("The user should able to see an error message in alert window");
	}

	@Then("The user should not see any error message or alert")
	public void the_user_should_not_see_any_error_message_or_alert() {
		System.out.println("The user should not see any error message or alert");
	}

	@When("The user write the valid code in Editor")
	public void the_user_write_the_valid_code_in_editor() {
		System.out.println("The user write the valid code in Editor");
	}
	
}
