package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps {
	WebDriver driver = null;
	LoginPage login;


	//@Before
	public void setup() {
		driver = new ChromeDriver();
	}

	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() throws InterruptedException {
		System.out.println("The user is on the DS Algo signin page");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		login = new LoginPage(driver);

		driver.navigate().to("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		//driver.findElement(By.cssSelector("button.navbar-toggler")).click();
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();

	}

	@When("The user clicks login button after leaving the {string} textbox and {string} textbox blank")
	public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_blank(String userName, String password) throws InterruptedException {
		login.loginValiduser(userName, password);
	}

	@SuppressWarnings("deprecation")
	@Then("The error message {string} appears below Username textbox")
	public void the_error_message_appears_below_username_textbox(String string) throws InterruptedException {
		login.validateAlertMessage(string);
	}

	@When("The user clicks login button after entering the {string} and leaves {string} textbox blank")
	public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_blank(String userName, String password) throws InterruptedException {
		login.loginValiduser(userName, password);
	}

	@Then("The error message {string} appears below Pwd textbox")
	public void the_error_message_appears_below_pwd_textbox(String string) throws InterruptedException {
		login.validateAlertMessage(string);
	}

	@When("The user clicks login button after entering the {string} only")
	public void the_user_clicks_login_button_after_entering_the_only(String string) {
		login.enterUsername(string);
		login.clicklogin();
	}

	@When("The user clicks login button after entering invalid {string} and invalid {string}")
	public void the_user_clicks_login_button_after_entering_invalid_and_invalid(String string, String string2) throws InterruptedException {
		login.loginValiduser(string, string2);
	}
<<<<<<< HEAD


	@Then("The user should able to see an error message {string}.")
	public void the_user_should_able_to_see_an_error_message(String string) {
		login.validaterrormessage(string);

		System.out.println("User sees error message ");
	}

	@When("The user clicks login button after entering valid {string} and invalid {string}")
	public void the_user_clicks_login_button_after_entering_valid_and_invalid(String userName, String password) throws InterruptedException {
		login.loginValiduser(userName, password);
	}

	@When("The user clicks login button after entering valid {string} and valid {string}")
	public void the_user_clicks_login_button_after_entering_valid_and_valid(String userName, String password) throws InterruptedException {
		login.loginValiduser(userName, password);
	}


	@Then("The user should land in Data Structure Home Page")
	public void the_user_should_land_in_data_structure_home_page() {
		System.out.println("User lands on data structure homepage ");

	}





=======
>>>>>>> 990a941843e0d6936563cff5d74748873e9f40eb
}
