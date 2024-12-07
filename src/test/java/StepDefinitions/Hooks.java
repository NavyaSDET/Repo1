package StepDefinitions;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.TestInstance;

import Utilities.ConfigReader;


public class Hooks {

	private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();
public static String browser;
	public WebDriver driver;

	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		ConfigReader.loadConfig();
		//browser = ConfigReader.getBrowserType();
	}

	@Before
	public void deleteCookies() throws Exception {
		browser = "chrome";
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driverThreadLocal.set(driver);

		driver.manage().deleteAllCookies();
	}


	@AfterAll
	public static void closeDriver() {
		if (driverThreadLocal.get() != null) {
			driverThreadLocal.get().quit();
			driverThreadLocal.remove();
		}	}
	
	public static synchronized WebDriver getDriver() {
		return driverThreadLocal.get();
	}

}