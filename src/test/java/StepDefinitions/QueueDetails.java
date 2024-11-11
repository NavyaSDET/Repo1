package StepDefinitions;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueDetails {
	
	@When("The user clicks on Get started link for Queue")
	public void the_user_clicks_on_get_started_link_for_queue() {
	
		//driver.findElement(By.xpath("//a[@href='queue']")).Click;
		
	   System.out.println("The user clicks on Get started link for Queue");
	}
	@Then("The user is on Queue Details page")
	public void the_user_is_on_queue_details_page() {
		
	//driver.findElement.(By.xapth("//a[@href='implementation-lists']")).click;
		 System.out.println("The user is on Queue Details page");
	}

	@Given("The user is on the Queue page")
	public void the_user_is_on_the_queue_page() {
		//driver.findElement(By.xpath("//a[@href='/tryEditor']")).Click;
		
		 System.out.println("The user is on the Queue page");
	}

	@When("The user clicks on Implementation of Queue python link")
	public void the_user_clicks_on_implementation_of_queue_python_link() {
		
		
	// driver.findElement(By.xapth("//button[@type='button']")).click;
		 System.out.println("The user clicks on Implementation of Queue python link");
	}

	@Then("The user is on the Implimentation of Queue in Python page")
	public void the_user_is_on_the_implimentation_of_queue_in_python_page() {
		 System.out.println("The user is on the Implimentation of Queue in Python page");
	}

	@Then("User is displayed with Try Here")
	public void user_is_displayed_with_try_here() {
		 System.out.println("User is displayed with Try Here");
	}

	@Given("The user on implementation Queue in python page")
	public void the_user_on_implementation_queue_in_python_page() {
		 System.out.println("The user on implementation Queue in python page");
	}

	@Given("User is on Try Here page for Implementation of Queue in python")
	public void user_is_on_try_here_page_for_implementation_of_queue_in_python() {
		 System.out.println("User is on Try Here page for Implementation of Queue in python");
	}

	@When("The user click on Implementation using collections.deque link")
	public void the_user_click_on_implementation_using_collections_deque_link() {
		 System.out.println("The user click on Implementation using collections.deque link");
	}

	@Then("the user is navigated to Queue in collections.degue")
	public void the_user_is_navigated_to_queue_in_collections_degue() {
		 System.out.println("the user is navigated to Queue in collections.degue");
	}

	@Given("The user on Implementation using collection.deque in python page")
	public void the_user_on_implementation_using_collection_deque_in_python_page() {
		 System.out.println("The user on Implementation using collection.deque in python page");
	}

	@Given("User is on Try Here page for Implementation using Qeue in collection.deque")
	public void user_is_on_try_here_page_for_implementation_using_qeue_in_collection_deque() {
		 System.out.println("User is on Try Here page for Implementation using Qeue in collection.deque");
	}

	@Given("User is on Try Here page for Implementation using collection.deque")
	public void user_is_on_try_here_page_for_implementation_using_collection_deque() {
		 System.out.println("User is on Try Here page for Implementation using collection.deque");
	}


	
}
