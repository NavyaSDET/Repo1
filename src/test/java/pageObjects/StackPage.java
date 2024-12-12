package PageObjects;

import org.testng.Assert;

import StepDefinitions.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StackPage {
	public WebDriver driver = Hooks.getDriver();

	public By StackDetail=By.cssSelector("h4.bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions =By.cssSelector("a.list-group-item");

	public By operationsInStackLink=By.cssSelector("a[href='operations-in-stack']");
	public By operationsInStackText=By.cssSelector("strong .bg-secondary");

	public By implementaionLink= By.cssSelector("a[href='implementation']");
	public By implementaionText=By.cssSelector("strong .bg-secondary");

	public By ApplicationsLink=By.cssSelector("a[href='stack-applications']");
	public By ApplicationsText=By.cssSelector("strong .bg-secondary");

	public By practiceQuestionsLink=By.cssSelector("a[href='/graph/practice']");

	public void validateUserIsOnStackDetailPage(){
		Assert.assertEquals(driver.findElement(StackDetail).getText(), "Stack"); 
		Assert.assertTrue(driver.findElement(StackDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/stack/");
		Assert.assertEquals(driver.findElement(topicsCovered).getText(),"Topics Covered");	
		Assert.assertTrue(driver.findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnOperationsInStackLink() {
		driver.findElement(operationsInStackLink).click();
	}

	public void clickOnImplementationLink(){
		driver.findElement(implementaionLink).click();
	}
	
	public void clickOnApplicationsLink() {
		driver.findElement(ApplicationsLink).click();	
	}

	public void validateUserIsOnoperationsInStackText() {
		Assert.assertEquals(driver.findElement(operationsInStackText).getText(),"Operations in Stack");	
	}

	public void validateUserIsOnimplementaionText () {	
		Assert.assertEquals(driver.findElement( implementaionText).getText(),"Implementation");
	}	

	public void validateUserIsOnApplicationsText() {
		Assert.assertEquals(driver.findElement(ApplicationsText).getText(),"Applications");	
	}
	
	public void validateUserIsOnPracticeQuestionsPage() {
		Assert.assertEquals(driver.getCurrentUrl() ,"https://dsportalapp.herokuapp.com/Stack/practice");
		//Assert.assertTrue(driver.findElement(practiceQuestion1).isDisplayed());
	}

}