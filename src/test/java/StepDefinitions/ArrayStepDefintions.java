package StepDefinitions;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.ArrayPage;
import PageObjects.IntroductionPage;

public class ArrayStepDefintions {
	public WebDriver driver = Hooks.getDriver();

	public ArrayPage ap = new ArrayPage();
	public IntroductionPage ip = new IntroductionPage();

	@When("The user clicks on Get Started link for array")
	public void the_user_clicks_on_get_started_link_for_array() {
		ip.clickOnGetStartedButtonOfArray();
		Assert.assertEquals(driver.findElement(ap.arrayDetail).getText(), "Array");
	}

	@Then("The user is on the array details page")
	public void the_user_is_on_the_array_details_page() {
		Assert.assertEquals(driver.findElement(ap.arrayDetail).getText(), "Array");
		Assert.assertTrue(driver.findElement(ap.arrayDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/array/");
		Assert.assertEquals(driver.findElement(ap.topicsCovered).getText(), "Topics Covered");
		Assert.assertTrue(driver.findElement(ap.topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(ap.TopicsCoveredOptions).isDisplayed());
	}

	@When("The user click on Array in python link")
	public void the_user_click_on_array_in_python_link() {
		ap.clickOnArrayInPythonLink();
	}

	@Then("the user is navigated to array in arrays in python")
	public void the_user_is_navigated_to_array_in_arrays_in_python() {
		Assert.assertEquals(driver.findElement(ap.arraysInPythonText).getText(), "Arrays in Python");
	}

	@Given("The user is on the arrays in python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		ap.clickOnArrayInPythonLink();
		Assert.assertEquals(driver.findElement(ap.arraysInPythonText).getText(), "Arrays in Python");
	}

	@When("The user click on Array using list link")
	public void the_user_click_on_array_using_list_link() {
		ap.clickOnArrayUsingListLink();
	}

	@Then("the user is navigated to array in Array using list")
	public void the_user_is_navigated_to_array_in_array_using_list() {
		Assert.assertEquals(driver.findElement(ap.arraysUsingListText).getText(), "Arrays Using List");
	}

	@Given("The user is on the Array using list")
	public void the_user_is_on_the_array_using_list() {
		ap.clickOnArrayUsingListLink();
		Assert.assertEquals(driver.findElement(ap.arraysUsingListText).getText(), "Arrays Using List");
	}

	@When("The user click on basic operations in lists")
	public void the_user_click_on_basic_operations_in_lists() {
		ap.clickOnBasicOperationsLink();
	}

	@Then("the user is navigated to basic opertaions in lists")
	public void the_user_is_navigated_to_basic_opertaions_in_lists() {
		Assert.assertEquals(driver.findElement(ap.basicOperationsInListText).getText(), "Basic Operations in Lists");
	}

	@Given("The user is on the Basic operations in lists")
	public void the_user_is_on_the_basic_operations_in_lists() {
		ap.clickOnBasicOperationsLink();
		Assert.assertEquals(driver.findElement(ap.basicOperationsInListText).getText(), "Basic Operations in Lists");
	}

	@When("The user click on applications of array link")
	public void the_user_click_on_applications_of_array_link() {
		ap.clickOnApplicationOfArrayLink();
	}

	@Then("the user is navigated to applications of array")
	public void the_user_is_navigated_to_applications_of_array() {
		Assert.assertEquals(driver.findElement(ap.applicationsOfArrayText).getText(), "Applications of Array");
	}

	@Given("The user is on the applications of array")
	public void the_user_is_on_the_applications_of_array() {
		ap.clickOnApplicationOfArrayLink();
		Assert.assertEquals(driver.findElement(ap.applicationsOfArrayText).getText(), "Applications of Array");
	}

	@When("the user click on the practice questions link")
	public void the_user_click_on_the_practice_questions_link() {
		ap.clickOnPracticeQuestionsLink();
	}

	@Then("the user navigates to practice question page")
	public void the_user_navigates_to_practice_question_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/array/practice");
		Assert.assertTrue(driver.findElement(ap.searchTheArrayQuestion).isDisplayed());
	}

	@Given("The user is on the Practice Questions page of Search array page")
	public void the_user_is_on_the_practice_questions_page_of_search_array_page() {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSearchArrayQuestionLink();
	}

	@When("The user enter valid python code in tryEditor page sheet {string} and {int} for the Question")
	public void the_user_enter_valid_python_code_in_try_editor_page_sheet_and_for_the_question(String sheetName, int rowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		ap.enterPythonCode(sheetName, rowNumber);
	}

	@When("the user click on run button")
	public void the_user_click_on_run_button() {
		ap.clickOnRunButton();
	}

	@Then("the user should be presented with the Run result {string}")
	public void the_user_should_be_presented_with_the_run_result(String expectedOutput) {
		Assert.assertEquals(driver.findElement(ap.practiceQuestionOutPut).getText(), expectedOutput);
	}

	@When("the user click on submit button")
	public void the_user_click_on_submit_button() {
		System.out.println("the user click on submit button");
	}

	@Then("the user should be presented with successful submission message")
	public void the_user_should_be_presented_with_successful_submission_message() {
		System.out.println("the user should be presented with successful submission message");

	}

	@Then("the user should be presented with error message as syntaxError: bad input on line {int}")
	public void the_user_should_be_presented_with_error_message_as_syntax_error_bad_input_on_line(Integer int1) {
		System.out.println("the user should be presented with error message as syntaxError: bad input on line {int}");
	}

	@Given("The user is on Practice Question page")
	public void the_user_is_on_practice_question_page() {
		System.out.println("The user is on Practice Question page");
	}

	@When("the user click on The Max Consecutive Ones link")
	public void the_user_click_on_the_max_consecutive_ones_link() {
		ap.clickOnMaxConsecutiveQuestionLink();
	}

	@Then("the user should be redirected to  practice question page contains an tryEditor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_practice_question_page_contains_an_try_editor_with_run_and_submit_buttons() {
		System.out.println(
				"the user should be redirected to  practice question page contains an tryEditor with Run and Submit buttons");
	}

	@Given("The user is on the Practice Questions page of Max Consecutive Ones")
	public void the_user_is_on_the_practice_questions_page_of_max_consecutive_ones() {
		System.out.println("The user is on the Practice Questions page of Max Consecutive Ones");
	}

	@When("the user click on The Find Numbers with Even Number of Digits link")
	public void the_user_click_on_the_find_numbers_with_even_number_of_digits_link() {
		ap.clickOnEvenNumbersQuestionLink();
	}

	@Given("The user is on the Practice Questions page of Find Numbers with Even Number of Digits")
	public void the_user_is_on_the_practice_questions_page_of_find_numbers_with_even_number_of_digits() {
		System.out.println("The user is on the Practice Questions page of Find Numbers with Even Number of Digits");
	}

	@Given("The user is on Practice Question page Squares of a Sorted Array")
	public void the_user_is_on_practice_question_page_squares_of_a_sorted_array() {
		System.out.println("The user is on Practice Question page Squares of a Sorted Array");

	}

	@Given("The user is on the Practice Questions page of Squares of a Sorted Array")
	public void the_user_is_on_the_practice_questions_page_of_squares_of_a_sorted_array() {
		System.out.println("The user is on the Practice Questions page of Squares of a Sorted Array");

	}

}