package PageObjects;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	WebDriver driver = Hooks.getDriver();

	public By StackDetail = By.cssSelector("h4.bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions = By.cssSelector("a.list-group-item");

	public By operationsInStackLink = By.cssSelector("a[href='operations-in-stack']");
	public By operationsInStackText = By.cssSelector("strong .bg-secondary");

	public By implementaionLink = By.cssSelector("a[href='implementation']");
	public By implementaionText = By.cssSelector("strong .bg-secondary");

	public By ApplicationsLink = By.cssSelector("a[href='stack-applications']");
	public By ApplicationsText = By.cssSelector("strong .bg-secondary");

	public By practiceQuestionsLink = By.cssSelector("a[href='/graph/practice']");

	public void clickOnOperationsInStackLink() {
		driver.findElement(operationsInStackLink).click();
	}

	public void clickOnImplementationLink() {
		driver.findElement(implementaionLink).click();
	}

	public void clickOnApplicationsLink() {
		driver.findElement(ApplicationsLink).click();
	}
}