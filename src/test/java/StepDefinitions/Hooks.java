package StepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import java.time.Duration;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.ConfigReader;

public class Hooks {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public WebDriver driver;
    public static String browser;
    public static Scenario scenario;

    private static Logger logger = LogManager.getLogger(); // Log4j library class for logging purpose

    @BeforeAll
    public static void before() throws Throwable {
        // Get browser Type from config file
        ConfigReader.loadConfig();
        // browser = ConfigReader.getBrowserType();
        browser = "chrome";
    }

    @Before
    public void intializeBrowser() throws Exception {
    	
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        threadDriver.set(driver);
        logger.info("======================  New Test Execution is STARTED!! ======================");
    }

    @After(order = 0)
    public static void closeDriver() {

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.remove();
        }
    }

    public static synchronized WebDriver getDriver() {
        return threadDriver.get();
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
