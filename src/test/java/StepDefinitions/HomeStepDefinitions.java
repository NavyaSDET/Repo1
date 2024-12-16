package StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.IntroductionPage;

public class HomeStepDefinitions {
	public WebDriver driver = Hooks.getDriver();

	public HomePage hp = new HomePage();
	public IntroductionPage ip = new IntroductionPage();

	@When("The user enter the DS_Algo Portal <URL>")
	public void the_user_enter_the_ds_algo_portal_url() {
		hp.openUrl();
	}

	@Then("The user should landed on the DS_Algo Get Started page with message You are at the right place")
	public void the_user_should_landed_on_the_ds_algo_get_started_page_with_message_you_are_at_the_right_place() {
		Assert.assertEquals(ip.getTextForElement(hp.contentHeader), "Preparing for the Interviews");
		Assert.assertEquals(ip.getTextForElement(hp.contentText), "You are at the right place");
		Assert.assertEquals(ip.getTextForElement(hp.getStartedButton), "Get Started");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getCssValue("background-color"),
				"rgba(0, 0, 255, 1)");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getCssValue("color"), "rgba(238, 238, 238, 1)");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getCssValue("font-size"), "18px");
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getSize().height, 51);
		Assert.assertEquals(ip.getElement(hp.getStartedButton).getSize().width, 122);
	}

}