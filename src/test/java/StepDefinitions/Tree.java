package StepDefinitions;

import org.testng.Assert;
import PageObjects.IntroductionPage;
import PageObjects.RegistrationPage;
import PageObjects.TreePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree {

	public RegistrationPage RGPage = new RegistrationPage();
	public IntroductionPage ip = new IntroductionPage();
	TreePage treePage = new TreePage();

	@When("User clicks on Get Started button from Tree panel")
	public void user_clicks_on_get_started_button_from_tree_panel() {
		treePage.clickTree_GetStartedBtn_HomePage();

	}

	@Then("The user is redirected to Tree page.")
	public void the_user_is_redirected_to_tree_page() {

		Assert.assertEquals(ip.getPageTitle(), "Tree");

	}

	@When("The user select Tree from the Data Structure dropdown menu")
	public void the_user_select_tree_from_the_data_structure_dropdown_menu() {

		treePage.clickDataStructures_DropDownBtn();
		treePage.click_Tree_FromDropDown();
	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {

		treePage.clickOverviewOfTrees();
	}

	@Then("The user is redirected to Overview of Trees page.")
	public void the_user_is_redirected_to_overview_of_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Overview of Trees");
	}

	@Given("The user is on the Overview of Trees page")
	public void the_user_is_on_the_overview_of_trees_page() {
		treePage.clickOverviewOfTrees();
	}

	@Given("The user is on the Editor page of Overview of Trees page")
	public void the_user_is_on_the_editor_page_of_overview_of_trees_page() {
		treePage.clickOverviewOfTrees();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Try Here button")
	public void the_user_clicks_try_here_button() {

		treePage.click_TryHereBtn_TreePage();
	}

	@Then("The user is redirected to a page having Editor and run button")
	public void the_user_is_redirected_to_a_page_having_editor_and_run_button() {

		Assert.assertEquals(ip.getPageTitle(), "Assessment");
		Assert.assertTrue(ip.validateElementDisplayed(treePage.runButton));

	}
	////////////////////////////////////////////////////////////// EDITOR ACTION- NO
	////////////////////////////////////////////////////////////// CODE, VALID CODE,
	////////////////////////////////////////////////////////////// INVALID CODE

	@When("The user writes no code inside editor window and clicks on Run button")
	public void the_user_writes_no_code_inside_editor_window_and_clicks_on_run_button() {

		treePage.writeInTryEditorWindow("");
	}

	@Then("Nothing happens to the Editor page and no error message is displayed")
	public void nothing_happens_to_the_editor_page_and_no_error_message_is_displayed() {

		Assert.assertEquals(ip.getTextForElement(treePage.consoleOutput), "");

	}

	@When("The user writes the valid python code and clicks on Run button")
	public void the_user_writes_the_valid_python_code_and_clicks_on_run_button() throws InterruptedException {

		treePage.writeInTryEditorWindow("print('hello')");
		Thread.sleep(30000);
	}

	@Then("The user is able to see the output inside the console.")
	public void the_user_is_able_to_see_the_output_inside_the_console() {

		// treePage.check_When_ValidCode_In_Editor("hello");
		Assert.assertEquals(ip.getTextForElement(treePage.consoleOutput), "hello");
	}

	@When("The user writes the invalid python code and clicks on Run button")
	public void the_user_writes_the_invalid_python_code_and_clicks_on_run_button() {
		treePage.writeInTryEditorWindow("printf(hello)");
	}

	@Then("The user see error msg in alert window")
	public void the_user_see_error_msg_in_alert_window() {

		String expectedErrorMessage = "NameError: name 'printf' is not defined on line 1";
		Assert.assertEquals(ip.getAlertText(), expectedErrorMessage);
	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {

		treePage.click_TreeDetails_Terminologies();
	}

	@Then("The user is redirected to Terminologies page")
	public void the_user_is_redirected_to_terminologies_page() {

		Assert.assertEquals(ip.getPageTitle(), "Terminologies");
	}

	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {

		treePage.clickTerminologies();

	}

	@Given("The user is on the Editor page of Terminologies page")
	public void the_user_is_on_the_Editor_page_of_terminologies_page() {

		treePage.clickTerminologies();
		treePage.click_TryHereBtn_TreePage();

	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {

		treePage.clickTypesOfTrees();
	}

	@When("The user clicks Types of Trees link from TerminologiesPage")
	public void the_user_clicks_types_of_trees_link_from_TerminologiesPage() {

		treePage.click_TreeDetails_TypesOfTrees();
	}

	@Then("The user is redirected to Types of Trees page.")
	public void the_user_is_redirected_to_types_of_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Types of Trees");
	}

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {

		treePage.clickTypesOfTrees();
	}

	@Given("The user is on the Editor Page of Types of Trees page")
	public void the_user_is_on_the_Editor_page_of_types_of_trees_page() {

		treePage.clickTypesOfTrees();
		treePage.click_TryHereBtn_TreePage();

	}

	@When("The user clicks Tree Traversals link")
	public void the_user_clicks_tree_traversals_link() {

		treePage.click_TreeDetails_TreeTraversals();
	}

	@Then("The user is redirected to Tree Traversals page")
	public void the_user_is_redirected_to_tree_traversals_page() {

		Assert.assertEquals(ip.getPageTitle(), "Tree Traversals");
	}

	@Given("The user is on the Tree Traversals page")
	public void the_user_is_on_the_tree_traversals_page() {

		treePage.clickTreeTraversals();

	}

	@Given("The user is on the Editor page of Tree Traversals page")
	public void the_user_is_on_the_Editor_page_of_tree_traversals_page() {

		treePage.clickTreeTraversals();
		treePage.click_TryHereBtn_TreePage();

	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {

		treePage.click_TreeDetails_Traversals_Illustration();
	}

	@Then("The user is redirected to Traversals-Illustration page")
	public void the_user_is_redirected_to_traversals_illustration_page() {

		Assert.assertEquals(ip.getPageTitle(), "Traversals-Illustration");
	}

	@Given("The user is on the Traversals-Illustration page")
	public void the_user_is_on_the_traversals_illustration_page() {

		treePage.clickTraversals_Illustration();
	}

	@Given("The user is on the Editor page of Traversals-Illustration page")
	public void the_user_is_on_the_Editor_page_of_traversals_illustration_page() {

		treePage.clickTraversals_Illustration();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Binary Trees link")
	public void the_user_clicks_binary_trees_link() {

		treePage.click_TreeDetails_BinaryTrees();
	}

	@Then("The user is redirected to Binary Trees page.")
	public void the_user_is_redirected_to_binary_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Binary Trees");
	}

	@Given("The user is on the Binary Trees page")
	public void the_user_is_on_the_binary_trees_page() {

		treePage.clickBinaryTrees();
	}

	@Given("The user is on the Editor page of Binary Trees page")
	public void the_user_is_on_the_Editor_page_of_binary_trees_page() {

		treePage.clickBinaryTrees();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Types of Binary Trees link")
	public void the_user_clicks_types_of_binary_trees_link() {

		treePage.click_TreeDetails_TypesOfBinaryTrees();

	}

	@Then("The user is redirected to Types of Binary Trees page.")
	public void the_user_is_redirected_to_types_of_binary_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Types of Binary Trees");
	}

	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {

		treePage.clickTypesOfBinaryTrees();

	}

	@Given("The user is on the Editor page of Types of Binary Trees page")
	public void the_user_is_on_the_Editor_page_of_types_of_binary_trees_page() {

		treePage.clickTypesOfBinaryTrees();
		treePage.click_TryHereBtn_TreePage();

	}

	@When("The user clicks Implementation in Python Trees link")
	public void the_user_clicks_implementation_in_python_trees_link() {

		treePage.click_TreeDetails_ImplementationInPython();
	}

	@Then("The user is redirected to Implementation in Python page.")
	public void the_user_is_redirected_to_implementation_in_python_page() {

		Assert.assertEquals(ip.getPageTitle(), "Implementation in Python");
	}

	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {

		treePage.clickImplementationInPython();
	}

	@Given("The user is on the editor page of Implementation in Python page")
	public void the_user_is_on_the_editor_page_of_implementation_in_python_page() {

		treePage.clickImplementationInPython();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {

		treePage.click_TreeDetails_BinaryTreeTraversals();
	}

	@Then("The user is redirected to Binary Tree Traversals page.")
	public void the_user_is_redirected_to_binary_tree_traversals_page() {

		Assert.assertEquals(ip.getPageTitle(), "Binary Tree Traversals");
	}

	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {

		treePage.clickBinaryTreeTraversals();

	}

	@Given("The user is on the editor page of Binary Tree Traversals page")
	public void the_user_is_on_the_editor_page_of_binary_tree_traversals_page() {

		treePage.clickBinaryTreeTraversals();
		treePage.click_TryHereBtn_TreePage();

	}

	@When("The user clicks Implementation of Binary Trees button")
	public void the_user_clicks_implementation_of_binary_trees_button() {

		treePage.click_TreeDetails_ImplementationOfBinaryTrees();
	}

	@Then("The user is redirected to Implementation of Binary Trees page.")
	public void the_user_is_redirected_to_implementation_of_binary_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Implementation of Binary Trees");
	}

	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {

		treePage.clickImplementationOfBinaryTrees();
	}

	@Given("The user is on the editor page of Implementation of Binary Trees page")
	public void the_user_is_on_the_editor_page_of_implementation_of_binary_trees_page() {

		treePage.clickImplementationOfBinaryTrees();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Applications of Binary trees link")
	public void the_user_clicks_applications_of_binary_trees_link() {

		treePage.click_TreeDetails_ApplicationsOfBinaryTrees();
	}

	@Then("The user is redirected to Applications of Binary trees page.")
	public void the_user_is_redirected_to_applications_of_binary_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Applications of Binary trees");
	}

	@Given("The user is on the Applications of Binary trees page")
	public void the_user_is_on_the_applications_of_binary_trees_page() {

		treePage.clickApplicationsOfBinaryTrees();
	}

	@Given("The user is on the editor page of Applications of Binary trees page")
	public void the_user_is_on_the_editor_page_of_applications_of_binary_trees_page() {

		treePage.clickApplicationsOfBinaryTrees();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Binary Search Trees link")
	public void the_user_clicks_binary_search_trees_link() {

		treePage.click_TreeDetails_BinarySearchTrees();
	}

	@Then("The user is redirected to Binary Search Trees page.")
	public void the_user_is_redirected_to_binary_search_trees_page() {

		Assert.assertEquals(ip.getPageTitle(), "Binary Search Trees");
	}

	@Given("The user is on the Binary Search Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {

		treePage.clickBinarySearchTrees();
	}

	@Given("The user is on the editor page of Binary Search Trees page")
	public void the_user_is_on_the_editor_page_of_binary_search_trees_page() {

		treePage.clickBinarySearchTrees();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Implementation Of BST link")
	public void the_user_clicks_implementation_of_bst_link() {

		treePage.click_TreeDetails_ImplementationOfBST();
	}

	@Then("The user is redirected to Implementation Of BST page.")
	public void the_user_is_redirected_to_implementation_of_bst_page() {

		Assert.assertEquals(ip.getPageTitle(), "Implementation Of BST");
	}

	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {

		treePage.clickImplementationOfBST();
	}

	@Given("The user is on the editor page of Implementation Of BST page")
	public void the_user_is_on_the_editor_page_of_implementation_of_bst_page() {

		treePage.clickImplementationOfBST();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {

		treePage.click_TreeDetails_PracticeQuestionsLink();
	}

	@Then("The user is redirected to Practice Questions page.")
	public void the_user_is_redirected_to_practice_questions_page() {

		Assert.assertEquals(ip.getPageTitle(), "Practice Questions");
	}

	@When("The user clicks the ok button in the alert window")
	public void the_user_clicks_the_ok_button_in_the_alert_window() {

		treePage.clickOnOKBtnFromEditorErrorAlert();
		Assert.assertTrue(treePage.consoleOutput.equals(true));
	}

}
