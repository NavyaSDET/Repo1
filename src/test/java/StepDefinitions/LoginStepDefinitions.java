package StepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import PageObjects.HomePage;
import PageObjects.IntroductionPage;
import PageObjects.LoginPage;
import Utilities.ExcelReader;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.exc.InvalidFormatException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
	WebDriver driver = Hooks.getDriver();
	public LoginPage login = new LoginPage();
	public HomePage hp = new HomePage();
	public IntroductionPage ip = new IntroductionPage();

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() throws InterruptedException {
		System.out.println("The user is on the DS Algo signin page");
		hp.openUrl();
		hp.clickOnHomePageGetStartedButton();
		ip.clickOnSignInlink();
	}

	@When("The user clicks login button after leaving the username textbox and paswword textbox blank from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_blank(String sheetName,
			Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		login.loginValiduser(username, password);
	}

	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String expectedAlertMessage)
			throws InterruptedException {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		Assert.assertEquals(messageStr, expectedAlertMessage);
	}

	@When("The user clicks login button after entering the username and leaving password textbox blank from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_blank(String sheetName,
			Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		login.loginValiduser(username, password);
	}

	@Then("The error message {string} appears below Pwd textbox")
	public void the_error_message_appears_below_pwd_textbox(String expectedAlertMessage) throws InterruptedException {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		Assert.assertEquals(messageStr, expectedAlertMessage);
	}

	@When("The user clicks login button after entering only username from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_enteringusername_only(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		login.enterUsername(username);
		login.clicklogin();
	}

	@When("The user clicks login button after entering only password from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_entering_password_only(String sheetName, Integer rowNumber)
			throws InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String password = testdata.get(rowNumber).get("password");
		login.enterPassword(password);
		login.clicklogin();
	}

	@When("The user clicks login button after entering invalid username and invalid password from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_entering_invalid_and_invalid(String sheetName, Integer rowNumber)
			throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");

		login.loginValiduser(username, password);
	}

	@Then("The user should able to see an error message {string}.")
	public void the_user_should_able_to_see_an_error_message(String expectedWarningMessage) {
		Assert.assertEquals(driver.findElement(login.warningMessage).getText(), expectedWarningMessage);
	}

	@When("The user clicks login button after entering valid userName and invalid password from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_entering_valid_and_invalid(String sheetName, Integer rowNumber)
			throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		login.loginValiduser(username, password);
	}

	@When("The user clicks login button after entering valid userName and password from sheetname {string} and row {int}")
	public void the_user_clicks_login_button_after_entering_valid_and_valid(String sheetName, int rowNumber)
			throws InterruptedException, InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetName);
		String username = testdata.get(rowNumber).get("username");
		String password = testdata.get(rowNumber).get("password");
		login.loginValiduser(username, password);
	}

}
