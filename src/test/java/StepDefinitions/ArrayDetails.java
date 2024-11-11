package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayDetails {
	@Given("The user is on the DS Introduction home page")
	public void the_user_is_on_the_ds_introduction_home_page() {
		ip.validateUserIsOnIntroductionPage();
		System.out.println("The user is on the DS Introduction home page");
	   
	}

	@When("The user clicks on Get Started link for array")
	public void the_user_clicks_on_get_started_link_for_array() {
	
		ip.arrayGetStartedBtn();
		System.out.println("The user clicks on Get Started link for array");
	}

	@Then("The user is on the array details page")
	public void the_user_is_on_the_array_details_page() {
		ip.arrayDetail();
		System.out.println("The user is on the array details page");
	}

	@Given("The user is on the Array page")
	public void the_user_is_on_the_array_page() {
		ip.arrayDetail();
		System.out.println("The user is on the Array page");
	}

	@When("The user click on Array in python link")
	public void the_user_click_on_array_in_python_link() {
		System.out.println("The user click on Array in python link");
	}

	@Then("the user is navigated to array in arrays in python")
	public void the_user_is_navigated_to_array_in_arrays_in_python() {
		System.out.println("the user is navigated to array in arrays in python");
	}

	@Given("The user is on the arrays in python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		System.out.println("The user is on the arrays in python page");
	}

	@When("The user click on Try here button")
	public void the_user_click_on_try_here_button() {
		System.out.println("The user click on Try here button");
	}

	@Then("The user is navigated to Try here page")
	public void the_user_is_navigated_to_try_here_page() {
	 System.out.println("The user is navigated to Try here page");
	}

	@Given("User is on Try Here page for arrays in python")
	public void user_is_on_try_here_page_for_arrays_in_python() {
		System.out.println("User is on Try Here page for arrays in python");
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		System.out.println("The user should able to see output in the console");
	}

	@When("The user click on Array using list link")
	public void the_user_click_on_array_using_list_link() {
		System.out.println("The user click on Array using list link");
	}

	@Then("the user is navigated to array in Array using list")
	public void the_user_is_navigated_to_array_in_array_using_list() {
		System.out.println("the user is navigated to array in Array using list");
	}

	@Given("The user is on the Array using list")
	public void the_user_is_on_the_array_using_list() {
		System.out.println("The user is on the Array using list");
	}

	@Given("User is on Try Here page for Array using list")
	public void user_is_on_try_here_page_for_array_using_list() {
		System.out.println("User is on Try Here page for Array using list");
	}

	@Given("The user is on the arryas page")
	public void the_user_is_on_the_arryas_page() {
		System.out.println("The user is on the arryas page");
	}

	@When("The user click on basic operations in lists")
	public void the_user_click_on_basic_operations_in_lists() {
		System.out.println("The user click on basic operations in lists");
	}

	@Then("the user is navigated to basic opertaions in lists")
	public void the_user_is_navigated_to_basic_opertaions_in_lists() {
		System.out.println("the user is navigated to basic opertaions in lists");
	}

	@Given("The user is on the Basic operations in lists")
	public void the_user_is_on_the_basic_operations_in_lists() {
		System.out.println("The user is on the Basic operations in lists");
	}

	@Given("User is on Try Here page for Basic operations in lists")
	public void user_is_on_try_here_page_for_basic_operations_in_lists() {
		System.out.println("User is on Try Here page for Basic operations in lists");
	}

	@When("The user click on applications of array link")
	public void the_user_click_on_applications_of_array_link() {
		System.out.println("The user click on applications of array link");
	}
	@Then("the user is navigated to applications of array")
	public void the_user_is_navigated_to_applications_of_array() {
		System.out.println("the user is navigated to applications of array");
	 	}

	@Given("The user is on the applications of array")
	public void the_user_is_on_the_applications_of_array() {
		System.out.println("The user is on the applications of array");
	}

	@Given("User is on Try Here page for applications of array")
	public void user_is_on_try_here_page_for_applications_of_array() {
		System.out.println("User is on Try Here page for applications of array");
	}

	@Given("the user is on the applications of arrays page")
	public void the_user_is_on_the_applications_of_arrays_page() {
		System.out.println("the user is on the applications of arrays page");
	}
	
	@When("the user click on the practice questions link")
	public void the_user_click_on_the_practice_questions_link() {
		System.out.println("the user click on the practice questions link");
	}
	    

	@Then("the user navigates to practice question page")
	public void the_user_navigates_to_practice_question_page() {
		System.out.println("the user navigates to practice question page");
	}

}
