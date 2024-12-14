package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.ArrayPage;
import PageObjects.IntroductionPage;
import Utilities.ExcelReader;

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

	@When("The user is on the practice questions page")
	public void the_user_click_on_the_practice_questions_link() {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
	}

	@Then("the user navigates to practice question page")
	public void the_user_navigates_to_practice_question_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/array/practice");
		Assert.assertTrue(driver.findElement(ap.searchTheArrayQuestion).isDisplayed());
	}

	@Then("the user should be redirected to practice question page for search the array")
	public void the_user_should_be_redirected_to_practice_question_page_for_search_the_array() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/1");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionPageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionPageHeader).getText(), "QUESTION");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionSubmitButton).isDisplayed());
		Assert.assertTrue(driver.findElement(ap.practiceQuestionRunButton).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionFirstLine).getText(), "Write a Python Program to check if an element is present in the input array.");
	}

	@Given("The user is on the Practice Questions page of Search array page")
	public void the_user_is_on_the_practice_questions_page_of_search_array_page() {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSearchArrayQuestionLink();
	}

	@When("The user enter python code in tryEditor page sheet {string} and row {int} for the Question and click on run button")
	public void the_user_enter_valid_python_code_in_try_editor_page_sheet_and_for_the_question_run_button(String sheetName, int rowNumber) throws InvalidFormatException, IOException, OpenXML4JException {
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnRunButton();
	}

	@When("The user enter python code in tryEditor page sheet {string} and row {int} for the Question and click on submit button")
	public void the_user_enter_valid_python_code_in_try_editor_page_sheet_and_for_the_question_submit_button(String sheetName, int rowNumber) throws InvalidFormatException, IOException, OpenXML4JException, InterruptedException {
		ap.enterPythonCode(sheetName, rowNumber);
		ap.clickOnSubmitButton();
	}

	@When("the user click on run button")
	public void the_user_click_on_run_button() {
		ap.clickOnRunButton();
	}

	@Then("the user should be presented with the Run result from sheet {string} and row {int}")
	public void the_user_should_be_presented_with_the_run_result(String sheetName, int rowNumber) throws InterruptedException, io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);

		String expectedOutput = testdata.get(rowNumber).get("Result");
		Assert.assertEquals(driver.findElement(ap.practiceQuestionOutPut).getText(), expectedOutput);
	}

	@When("the user click on The Search the array link")
	public void the_user_click_on_the_search_the_array_link() {
		ap.clickOnSearchArrayQuestionLink();
	}


	@When("the user click on The Max Consecutive Ones link")
	public void the_user_click_on_the_max_consecutive_ones_link() {
		ap.clickOnMaxConsecutiveQuestionLink();
	}

	@When("the user click on the even number question link")
	public void the_user_click_on_the_even_numbers_link() {
		ap.clickOnEvenNumbersQuestionLink();
	}

	@When("the user click on the sorted array link")
	public void the_user_click_on_the_sort_array_link() {
		ap.clickOnSortedArrayQuestionLink();
	}


	@Given("The user is on the Practice Questions page of Max Consecutive Ones")
	public void the_user_is_on_the_practice_questions_page_of_max_consecutive_ones() {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnMaxConsecutiveQuestionLink();
	}


	@Given("The user is on the Practice Questions page of Find Numbers with Even Number of Digits")
	public void the_user_is_on_the_practice_questions_page_of_find_numbers_with_even_number_of_digits() {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnEvenNumbersQuestionLink();	
	}


	@Given("The user is on the Practice Questions page of Squares of a Sorted Array")
	public void the_user_is_on_the_practice_questions_page_of_squares_of_a_sorted_array() {
		ap.clickOnArrayInPythonLink();
		ap.clickOnPracticeQuestionsLink();
		ap.clickOnSortedArrayQuestionLink();
	}
	
	@Then("the user should be redirected to practice question page for max consecutive ones")
	public void the_user_should_be_redirected_to_practice_question_page_for_max_consecutive_ones() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/2");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionPageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionPageHeader).getText(), "QUESTION");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionSubmitButton).isDisplayed());
		Assert.assertTrue(driver.findElement(ap.practiceQuestionRunButton).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionFirstLine).getText(), "Given a binary array nums, return the maximum number of consecutive 1's");
	}
	
	@Then("the user should be redirected to practice question page for even number of digits")
	public void the_user_should_be_redirected_to_practice_question_page_for_even_number_of_digits() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/3");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionPageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionPageHeader).getText(), "QUESTION");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionSubmitButton).isDisplayed());
		Assert.assertTrue(driver.findElement(ap.practiceQuestionRunButton).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionFirstLine).getText(), "Given an array nums of integers, return how many of them contain");
	}
	
	@Then("the user should be redirected to practice question page for sorted array")
	public void the_user_should_be_redirected_to_practice_question_page_for_sorted_array() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/question/4");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionPageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionPageHeader).getText(), "QUESTION");
		Assert.assertTrue(driver.findElement(ap.practiceQuestionSubmitButton).isDisplayed());
		Assert.assertTrue(driver.findElement(ap.practiceQuestionRunButton).isDisplayed());
		Assert.assertEquals(driver.findElement(ap.practiceQuestionFirstLine).getText(), "Given an integer array nums sorted in non-decreasing order,");
	}

}