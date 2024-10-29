package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Home {

@Given("The user should be open the browser")
public void the_user_should_be_open_the_browser() {
	System.out.println("The user should be open the browser");
   
}
@When("The user enter the DS_Algo Portal <URL>")
public void the_user_enter_the_ds_algo_portal_url() {
	System.out.println("The user enter the DS_Algo Portal <URL>");
}
@Then("The user should landed on the DS_Algo Get Started page with message You are at the right place")
public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message_you_are_at_the_right_place() {
	System.out.println("The user should landed on the DS_Algo Get Started page with message You are at the right place");
}
@Then("The user should land in Data Structure Introduction Page with register and Sign in links")
public void the_user_should_land_in_data_structure_introduction_page_with_register_and_sign_in_links() {
	System.out.println("The user should land in Data Structure Introduction Page with register and Sign in links");

}

}
