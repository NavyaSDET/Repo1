package StepDefinitions;

import org.testng.Assert;

import PageObjects.LinkedListPage;
import PageObjects.RegistrationPage;
import PageObjects.TreePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList {

	public LinkedListPage LLPage = new LinkedListPage();
	public RegistrationPage RGPage;

	TreePage treePage = new TreePage();

	private static Logger logger = LogManager.getLogger(); // Log4j library class for logging purpose

	@Given("User clicks on Get Started button from Linked List panel")
	public void user_clicks_on_get_started_button_from_linked_list_panel() {
		// treePage = new TreePage(driver);

		RGPage = new RegistrationPage();
		LLPage = new LinkedListPage();
		LLPage.click_LL_GetStartedBtn_HomePage();
	}

	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {

		LLPage.click_LL_IntroductionPage();
	}

	@Given("The user is on the editor page of Introduction page")
	public void the_user_is_on_the_editor_page_of_introduction_page() {

		LLPage.click_LL_IntroductionPage();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks on Linked List from the Data Structure dropdown menu.")
	public void the_user_clicks_on_linked_list_from_the_data_structure_dropdown_menu() {

		// treePage = new TreePage(driver);
		treePage.clickDataStructures_DropDownBtn();
		LLPage.click_LinkedList_FromDropDown();
	}

	@Then("The user is redirected to Linked List page.")
	public void the_user_is_redirected_to_linked_list_page() {

		Assert.assertEquals(LLPage.getTitle(), "Linked List");
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {

		LLPage.click_LL_IntroductionPage();
	}

	@Then("The user is redirected to Introduction page.")
	public void the_user_is_redirected_to_introduction_page() {
		Assert.assertEquals(LLPage.getTitle(), "Introduction");
	}

	@When("The user clicks Creating Linked LIst link")
	public void the_user_clicks_creating_linked_l_ist_link() {
		LLPage.click_LL_Details_Creating_LinkedList();
	}

	@Then("The user is redirected to Creating Linked List page.")
	public void the_user_is_redirected_to_creating_linked_list_page() {
		Assert.assertEquals(LLPage.getTitle(), "Creating Linked LIst");
	}

	@Given("The user is on the Creating Linked LIst page")
	public void the_user_is_on_the_creating_linked_l_ist_page() {

		LLPage.click_LL_Creating_LinkedList();
	}

	@Given("The user is on the editor page of Creating Linked LIst page")
	public void the_user_is_on_the_editor_page_of_creating_linked_l_ist_page() {

		LLPage.click_LL_Creating_LinkedList();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {

		LLPage.click_LL_Details_Types_Of_LinkedList();
	}

	@Then("The user is directed to Types of Linked List page.")
	public void the_user_is_directed_to_types_of_linked_list_page() {

		Assert.assertEquals(LLPage.getTitle(), "Types of Linked List");
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {

		LLPage.click_LL_Types_Of_LinkedList();
	}

	@Given("The user is on the editor page of Types of Linked List page")
	public void the_user_is_on_the_editor_page_of_types_of_linked_list_page() {

		LLPage.click_LL_Types_Of_LinkedList();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {

		LLPage.click_LL_Details_Implement_Linked_List_In_Python();
	}

	@Then("The user is redirected to Implement Linked List in Python page.")
	public void the_user_is_redirected_to_implement_linked_list_in_python_page() {

		Assert.assertEquals(LLPage.getTitle(), "Implement Linked List in Python");
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {

		LLPage.click_LL_Implement_Linked_List_In_Python();
	}

	@Given("The user is on the editor page of Implement Linked List in Python page")
	public void the_user_is_on_the_editor_page_of_implement_linked_list_in_python_page() {

		LLPage.click_LL_Implement_Linked_List_In_Python();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {

		LLPage.click_LL_Details_Traversal();
	}

	@Then("The user is redirected to Traversal page.")
	public void the_user_is_redirected_to_traversal_page() {

		Assert.assertEquals(LLPage.getTitle(), "Traversal");
	}

	@Given("The user is on the Traversal page")
	public void the_user_is_on_the_traversal_page() {

		LLPage.click_LL_Traversal();

	}

	@Given("The user is on the editor page of Traversal page")
	public void the_user_is_on_the_editor_page_of_traversal_page() {

		LLPage.click_LL_Traversal();
		treePage.click_TryHereBtn_TreePage();

	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {

		LLPage.click_LL_Details_Insertion();
	}

	@Then("The user is redirected to Insertion page.")
	public void the_user_is_redirected_to_insertion_page() {

		Assert.assertEquals(LLPage.getTitle(), "Insertion");
	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {

		LLPage.click_LL_Insertion();
	}

	@Given("The user is on the editor page of Insertion page")
	public void the_user_is_on_the_editor_page_of_insertion_page() {

		LLPage.click_LL_Insertion();
		treePage.click_TryHereBtn_TreePage();
	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {

		LLPage.click_LL_Details_Deletion();
	}

	@Then("The user is redirected to Deletion page.")
	public void the_user_is_redirected_to_deletion_page() {

		Assert.assertEquals(LLPage.getTitle(), "Deletion");
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {

		LLPage.click_LL_Deletion();
	}

	@Given("The user is on the editor page of Deletion page")
	public void the_user_is_on_the_editor_page_of_deletion_page() {

		LLPage.click_LL_Deletion();
		treePage.click_TryHereBtn_TreePage();
	}

}