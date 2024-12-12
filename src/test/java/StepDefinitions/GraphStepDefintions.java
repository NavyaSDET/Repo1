package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.GraphPage;
import PageObjects.IntroductionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GraphStepDefintions {
	WebDriver driver=Hooks.getDriver();

	public GraphPage gp = new GraphPage();
	public IntroductionPage ip =  new IntroductionPage();

	@When("The user clicks on Get Started link for graph")
	public void the_user_clicks_on_get_started_link_for_graph() {
		ip.clickOnGetStartedButtonOfGraph();
	}
	
	@Then("The user is on the graph details page")
	public void the_user_is_on_the_graph_details_page() {
		Assert.assertEquals(driver.findElement(gp.GraphDetail).getText(), "Graph"); 
		Assert.assertTrue(driver.findElement(gp.GraphDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/graph/");
		Assert.assertEquals(driver.findElement(gp.topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(driver.findElement(gp.topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(gp.TopicsCoveredOptions).isDisplayed());
	}
	
	@When("The user click on graph link in graph details page")
	public void the_user_click_on_graph_link_in_graph_details_page() {
	   gp.clickOnGraphLinkUnderGraphDetails();
	}

	@Then("the user is navigated to graph page under graph details")
	public void the_user_is_navigated_to_graph_page_under_graph_details() {
	    Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");
	}

	@Given("The user is on the graphs page under graph detials")
	public void the_user_is_on_the_graphs_page_under_graph_detials() {
	    gp.clickOnGraphLinkUnderGraphDetails();
	    Assert.assertEquals(driver.findElement(gp.graphText).getText(),"Graph");
	}

	@When("The user click on graph representations link")
	public void the_user_click_on_graph_representations_link() {
	    gp.clickonGraphRepresentations();
	}

	@Then("the user is navigated to graph representations page")
	public void the_user_is_navigated_to_graph_representations_page() {
	    Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
	}

	@Given("The user is on the graphs representations page")
	public void the_user_is_on_the_graphs_representations_page() {
	    gp.clickonGraphRepresentations();
	    Assert.assertEquals(driver.findElement(gp.graphRepresentationsText).getText(),"Graph Representations");
	}
}