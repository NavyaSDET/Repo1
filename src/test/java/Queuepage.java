import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Queuepage {
	public WebDriver driver;

	public Queuepage (WebDriver driver) {
		this.driver = driver;
	}

	By Queuepagetopics = By.cssSelector("a[href='implementation-lists']");
}
