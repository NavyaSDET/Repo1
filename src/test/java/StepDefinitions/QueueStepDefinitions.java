package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import PageObjects.IntroductionPage;
import PageObjects.QueuePage;

public class QueueStepDefinitions {
	public QueuePage qp = new QueuePage();
	public IntroductionPage ip = new IntroductionPage();

	@When("The user clicks on Get started link for Queue")
	public void the_user_clicks_on_get_started_link_for_queue() {
		ip.clickOnGetStartedButtonOfQueue();
	}

	@Then("The user is on Queue Details page")
	public void the_user_is_on_queue_details_page() {
		Assert.assertEquals(ip.getTextForElement(qp.queuepage), "Queue");
		Assert.assertTrue(ip.validateElementDisplayed(qp.queuepage));
		Assert.assertEquals(ip.getCurrentUrl(), "https://dsportalapp.herokuapp.com/queue/");
		Assert.assertEquals(ip.getTextForElement(qp.topicsCovered), "Topics Covered");
		Assert.assertTrue(ip.validateElementDisplayed(qp.topicsCovered));
		Assert.assertTrue(ip.validateElementDisplayed(qp.TopicsCoveredOptions));
	}

	@When("The user clicks on Implementation of Queue python link")
	public void the_user_clicks_on_implementation_of_queue_python_link() {
		qp.clickOnImplementationOfQueueInPython();
	}

	@Then("The user is on the Implimentation of Queue in Python page")
	public void the_user_is_on_the_implimentation_of_queue_in_python_page() {
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementationOfQueueInPythonPage));
		Assert.assertEquals(ip.getTextForElement(qp.implementationOfQueueInPythonPage),
				"Implementation of Queue in Python");
	}

	@Given("The user on implementation Queue in python page")
	public void the_user_on_implementation_queue_in_python_page() {
		qp.clickOnImplementationOfQueueInPython();
	}

	@When("The user click on Implementation using collections.deque link")
	public void the_user_click_on_implementation_using_collections_deque_link() {
		qp.clickOnImplementationUsingCollectionsDeque();
	}

	@Then("the user is navigated to Queue in collections.deque")
	public void the_user_is_navigated_to_queue_in_collections_deque() {
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementaionUsingCollectionDequePage));
		Assert.assertEquals(ip.getTextForElement(qp.implementaionUsingCollectionDequePage),
				"Implementation using collections.deque");
	}

	@Given("The user on Implementation using collection.deque in python page")
	public void the_user_on_implementation_using_collection_deque_in_python_page() {
		qp.clickOnImplementationUsingCollectionsDeque();
	}

	@When("The user click on Queue Operations")
	public void the_user_click_on_queue_operations() {
		qp.clickOnQueueOperations();
	}

	@Then("the user is navigated to Queue Operations Page")
	public void the_user_is_navigated_to_queue_operations_page() {
		Assert.assertTrue(ip.validateElementDisplayed(qp.queueOperationsPage));
		Assert.assertEquals(ip.getTextForElement(qp.queueOperationsPage), "Queue Operations");
	}

	@Given("The user is on Queue Operations page")
	public void the_user_is_on_queue_operations_page() {
		qp.clickOnQueueOperations();
	}

	@When("The user click on Implementation using array link")
	public void the_user_click_on_implementation_using_array_link() {
		qp.clickOnImplementationUsingArray();
	}

	@Then("the user is navigated to Implementation using array page")
	public void the_user_is_navigated_to_implementation_using_array_page() {
		Assert.assertTrue(ip.validateElementDisplayed(qp.implementationUsingCollectionsArrayPage));
		Assert.assertEquals(ip.getTextForElement(qp.implementationUsingCollectionsArrayPage),
				"Implementation using array");
	}

	@Given("The user is on Implementation using array page")
	public void the_user_is_on_implementation_using_array_page() {
		qp.clickOnImplementationUsingArray();
	}

}