package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		System.out.println("Inside Step-User is on Login Page");
	}

	@When("The user clicks login button after leaving the name2 textbox and ffdfdudfu textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_name2_textbox_and_ffdfdudfu_textbox_blank() {
		System.out.println("Inside Step- User enters invalid username,password & clicks on login");
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String string) {
	System.out.println("Inside step - Error message appears below Username");
	}

	@Given("The user is on the DS Algo Signin Page")
	public void the_user_is_on_the_ds_algo_signin_page() {
		System.out.println("Inside Step-User is on Login Page");
		}

	@When("The user clicks login button after leaving the qachamp3 textbox and Ninjatest@{int} textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_qachamp3_textbox_and_ninjatest_textbox_blank(Integer int1) {
		System.out.println("Inside Step- User enters valid username,password & clicks on login");
		}

	@Then("The user should land in Data Structure Home Page")
	public void the_user_should_land_in_data_structure_home_page() {
		System.out.println("Inside step - User is navigated to Homepage");
		}



}
