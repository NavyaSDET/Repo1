package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.IntroductionPage;
import pageObjects.QueuePage;

public class QueueDetails {
	public WebDriver driver = Hooks.driver;
	public QueuePage qp;
	public IntroductionPage ip;


	@When("The user clicks on Get started link for Queue")
	public void the_user_clicks_on_get_started_link_for_queue() {
		qp = new QueuePage(driver);
		ip = new IntroductionPage(driver);
		ip.clickOnGetStartedButtonOfQueue();
	}

	@Then("The user is on Queue Details page")
	public void the_user_is_on_queue_details_page() {
		qp.validateUserIsOnQueueDetailsPage();	
	}

	@When("The user clicks on Implementation of Queue python link")
	public void the_user_clicks_on_implementation_of_queue_python_link() {
		qp.clickOnImplementationOfQueueInPython();
	}

	@Then("The user is on the Implimentation of Queue in Python page")
	public void the_user_is_on_the_implimentation_of_queue_in_python_page() {
		qp.validateUserIsOnQueueInPythonPage();
		System.out.println("The user is on the Implimentation of Queue in Python page");
	}

	@Given("The user on implementation Queue in python page")
	public void the_user_on_implementation_queue_in_python_page() {
		qp.clickOnImplementationOfQueueInPython();
		qp.validateUserIsOnQueueInPythonPage();
		System.out.println("The user on implementation Queue in python page");
	}

	@Given("User is on Try Here page for Implementation of Queue in python")
	public void user_is_on_try_here_page_for_implementation_of_queue_in_python() {
		System.out.println("User is on Try Here page for Implementation of Queue in python");
	}

	@When("The user click on Implementation using collections.deque link")
	public void the_user_click_on_implementation_using_collections_deque_link() {
		qp.clickOnImplementationUsingCollectionsDeque();
		System.out.println("The user click on Implementation using collections.deque link");
	}

	@Then("the user is navigated to Queue in collections.deque")
	public void the_user_is_navigated_to_queue_in_collections_deque() {
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
		System.out.println("the user is navigated to Queue in collections.degue");
	}

	@Given("The user on Implementation using collection.deque in python page")
	public void the_user_on_implementation_using_collection_deque_in_python_page() {
		qp.clickOnImplementationUsingCollectionsDeque();
		qp.validateUserIsOnImplementationUsingCollectionsDequePage();
		System.out.println("The user on Implementation using collection.deque in python page");
	}

	@When("The user click on Queue Operations")
	public void the_user_click_on_queue_operations() {
		qp.clickOnQueueOperations();
	}

	@Then("the user is navigated to Queue Operations Page")
	public void the_user_is_navigated_to_queue_operations_page() {
		qp.validateUserIsOnQueueOperationsPage();
	}

	@Given("The user is on Queue Operations page")
	public void the_user_is_on_queue_operations_page() {
		qp.clickOnQueueOperations();
		qp.validateUserIsOnQueueOperationsPage();
	}

	@When("The user click on Implementation using array link")
	public void the_user_click_on_implementation_using_array_link() {
		qp.clickOnImplementationUsingArray();
	}
	
	@Then("the user is navigated to Implementation using array page")
	public void the_user_is_navigated_to_implementation_using_array_page() {
		qp.validateUserIsOnImplementationUsingArrayPage();
	}

	@Given("The user is on Implementation using array page")
	public void the_user_is_on_implementation_using_array_page() {
		qp.clickOnImplementationUsingArray();
		qp.validateUserIsOnImplementationUsingArrayPage();
	}
}
