package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class DSIntroductionDetails {

	public HomePage hp = new HomePage();
	public IntroductionPage ip = new IntroductionPage();

	@Given("The user should open the DS Algo Portal URL in any supported browser")
	public void the_user_should_open_the_ds_algo_portal_url_in_any_supported_browser() {
		hp.openUrl();
	}

	@Then("The user should land in Data Structure Introduction Page with register and Sign in links")
	public void the_user_should_land_in_data_structure_introduction_page_with_register_and_sign_in_links() {
		Assert.assertEquals(ip.getTextForElement(ip.NumpyNinja), "NumpyNinja");
		Assert.assertTrue(ip.validateElementDisplayed(ip.cardBody));
		Assert.assertTrue(ip.validateElementDisplayed(ip.signInButton));
		Assert.assertTrue(ip.validateElementDisplayed(ip.registerButton));
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		hp.clickOnHomePageGetStartedButton();
	}

	@When("The user clicks the data structure dropdown arrow")
	public void the_user_clicks_the_data_structure_dropdown_arrow() {
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnDataStructureDropDown();
	}

	@Then("The user should able to see siz options Arrays Linked,List,Stack,Queue,Tree,Graph in dropdown menu")
	public void the_user_should_able_to_see_siz_options_arrays_linked_list_stack_queue_tree_graph_in_dropdown_menu() {
		Assert.assertEquals(ip.getElementSize(ip.DsDropdown), 6);
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown,0), "Arrays");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown,1), "Linked List");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown,2), "Stack");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown,3), "Queue");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown,4), "Tree");
		Assert.assertEquals(ip.getTextForArrayElements(ip.DsDropdown,5), "Graph");
	}

	@Given("The user is on the DS Introduction page")
	public void the_user_is_on_the_ds_introduction_page() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
	}

	@When("The user clicks any Get Started buttons of data structures on the DS Introduction page")
	public void the_user_clicks_any_get_started_buttons_of_data_structures_on_the_ds_introduction_page() {
		ip.clickOnDSIntroductionhomepage();
	}

	@Then("The user should able to see an warning message You are not logged in")
	public void the_user_should_able_to_see_an_warning_message_you_are_not_logged_in() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.warningMessage));
		Assert.assertEquals(ip.getTextForElement(ip.warningMessage), "You are not logged in");
		Assert.assertEquals(ip.getElementSize(ip.warningMessage), 1);

	}

	@When("The user clicks Register link on the DS Introduction page")
	public void the_user_clicks_register_link_on_the_ds_introduction_page() {
		ip.clickOnRegisterlink();
	}

	@Then("The user should navigate to register page")
	public void the_user_should_navigate_to_register_page() {
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/register");

	}

	@Given("The user is on the DS Introduction page as signedIn")
	public void the_user_is_on_the_ds_introduction_page_as_signed_in() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
	}

	@Then("user lands on the home page as signedIn")
	public void user_lands_on_the_home_page_as_signed_in() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.NumpyNinja));
		Assert.assertTrue(ip.validateElementDisplayed(ip.arrayGetStartedBtn));
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/home");
		Assert.assertTrue(ip.validateElementDisplayed(ip.displayQaChamps));
	}

	@When("The user clicks the Get Started button of DS Introduction")
	public void the_user_clicks_the_get_started_button_of_ds_introduction() {
		ip.clickOnGetStartedButtonOfDSIntroduction();
	}

	@Then("The user should navigate to DS Intoduction details page")
	public void the_user_should_navigate_to_ds_intoduction_details_page() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.dataStructurePageHeader));
		Assert.assertEquals(ip.getTextForElement(ip.dataStructurePageHeader), "Data Structures-Introduction");
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/data-structures-introduction/");
		Assert.assertTrue(ip.validateElementDisplayed(ip.dispalyTimeComplexity));
	}

	@Then("User should see the timeComplexity link")
	public void user_should_see_the_time_complexity_link() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.dispalyTimeComplexity));
	}

	@When("The user clicks the Time Complexity button")
	public void the_user_clicks_the_time_complexity_button() {
		ip.clickOnGetStartedButtonOfDSIntroduction();
		ip.clickOnTimeComplexiButton();
	}

	@Then("User should navigate to Time Complexity page")
	public void user_should_navigate_to_time_complexity_page() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.timeComplexityPage));
		Assert.assertEquals(ip.getTextForElement(ip.timeComplexityPage), "Time Complexity");
		Assert.assertTrue(ip.validateElementDisplayed(ip.tryHereButton));
		Assert.assertEquals(ip.getTextForElement(ip.tryHereButton), "Try here>>>");
		Assert.assertTrue(ip.validateElementDisplayed(ip.practiceQuestionButton));
		Assert.assertEquals(ip.getTextForElement(ip.practiceQuestionButton), "Practice Questions");
	}

	@Then(" User clicks on Get Started button from Tree panel")
	public void user_clicks_on_get_started_button_from_tree_panel() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.timeComplexityPage));
		Assert.assertEquals(ip.getTextForElement(ip.timeComplexityPage), "Time Complexity");
	}

	@When("User clicks Try here link")
	public void user_clicks_try_here_link() {
		ip.clickOnTryHerebutton();
	}

	@When("User clicks Try here link of time complexity page")
	public void user_clicks_try_here_link_of_time_complexity_page() {
		ip.clickOnGetStartedButtonOfDSIntroduction();
		ip.clickOnTimeComplexiButton();
		ip.clickOnTryHerebutton();
	}

	@When("User is on try here page of time complexity as signedIn")
	public void user_is_on_try_here_page_of_time_complexity_as_signedIn() {
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.completeTheLOgin();
		ip.clickOnGetStartedButtonOfDSIntroduction();
		ip.clickOnTimeComplexiButton();
	}

	@Then("User should navigate to tryEditor page")
	public void user_should_navigate_to_try_editor_page() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.codeEditorPage));
		Assert.assertTrue(ip.validateElementDisplayed(ip.runButton));
	}

	@Then("User should see Practice Question link and try here")
	public void user_should_see_practice_question_link_and_try_here() {
		Assert.assertTrue(ip.validateElementDisplayed(ip.tryHereButton));
		Assert.assertEquals(ip.getTextForElement(ip.tryHereButton), "Try here>>>");
		Assert.assertTrue(ip.validateElementDisplayed(ip.practiceQuestionButton));
		Assert.assertEquals(ip.getTextForElement(ip.practiceQuestionButton), "Practice Questions");
	}

	@When("The user write the invalid code in Editor")
	public void the_user_write_the_invalid_code_in_editor() {
		ip.enterCodeInEditor("ABC");
	}

	@When("Click the Run button")
	public void click_the_run_button() {
		ip.clickOnRunButton();
	}

	@When("User writes invalid code and clicks run button")
	public void user_writes_invalid_code_and_clicks_run_button() {
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("ABC");
		ip.clickOnRunButton();
	}

	@When("User clicks on run button with empty code")
	public void user_clicks_on_run_button_with_empty_code () {
		ip.clickOnTryHerebutton();
		ip.clickOnRunButton();
	}

	@When("User writes valid code and clicks run button")
	public void user_writes_valid_code_and_clicks_run_button() {
		ip.clickOnTryHerebutton();
		ip.enterCodeInEditor("print(\"hello\")");
		ip.clickOnRunButton();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		Assert.assertEquals(ip.getAlertText(), "NameError: name 'ABC' is not defined on line 1");
	}
	
	@Then("The user should see an alert error message as {string}")
	public void the_user_should_see_an_alert_error_message(String expectedAlertMessage) {
		Assert.assertEquals(ip.getAlertText(), expectedAlertMessage);
	}

	@Then("The user should not see any error message or alert")
	public void the_user_should_not_see_any_error_message_or_alert() {
		Assert.assertFalse(ip.validateElementDisplayed(ip.consoleOutput));
	}

	@When("The user write the valid code in Editor")
	public void the_user_write_the_valid_code_in_editor() {
		ip.enterCodeInEditor("print(\"hello\")");
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		Assert.assertEquals(ip.getTextForElement(ip.consoleOutput), "hello");
	}

}