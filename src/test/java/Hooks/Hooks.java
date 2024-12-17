package Hooks;

import org.apache.logging.log4j.LogManager;
import DriverManager.DriverManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import Utilities.ConfigReader;

public class Hooks {

	DriverManager driverManager = new DriverManager();
	public WebDriver driver;
	public static String browser;
	public static Scenario scenario;

	private static Logger logger = LogManager.getLogger(); // Log4j library class for logging purpose

	@BeforeAll
	public static void before() throws Throwable {
		// Get browser Type from config file
		ConfigReader.loadConfig();
		browser = ConfigReader.getBrowserType();
	}

	@Before
	public void beforeEachTest() throws Exception {
		driver = driverManager.intializeBrowser(browser);
	}

	@After(order = 0)
	public void closeDriver() {
		driverManager.closeDriver();
	}

	@After(order = 2)
	public void takeScreenshot(Scenario scenario) throws InterruptedException {

		if (scenario.isFailed()) {
			logger.error("======================  TEST CASE FAILED !! ======================", browser, scenario);
			;
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "screenshot");
			logger.info("======================  Screenshot is captured  ======================");
		}
	}

	@After(order = 1)
	public void logTheMessages() {
		logger.info("======================  Test Execution is completed!! ======================");
	}

}
