package PageObjects;


import org.testng.Assert;

import StepDefinitions.Hooks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ArrayPage {

	public WebDriver driver = Hooks.getDriver();
	public By arrayDetail=By.cssSelector("h4.bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions =By.cssSelector("a.list-group-item");
	public By arrayInPythonLink=By.cssSelector("a[href='arrays-in-python']");
	public By arraysInPythonText=By.cssSelector("strong .bg-secondary");

	public By arraysUsingListLink = By.cssSelector("a[href='arrays-using-list']");
	public By arraysUsingListText=By.cssSelector("strong .bg-secondary");
	public By basicOperationsInListLink = By.cssSelector("a[href=basic-operations-in-lists]");
	public By basicOperationsInListText=By.cssSelector("strong .bg-secondary");
	public By applicationsOfArrayLink = By.cssSelector("a[href='applications-of-array']");
	public By applicationsOfArrayText=By.cssSelector("strong .bg-secondary");
	public By practiceQuestionsLink=By.cssSelector("a[href='/array/practice']");
	public By practiceQuestion = By.cssSelector("a[href='/question/1']");


	  public By practiceQuestion1 = By.cssSelector("a[href='/question/1']"); 
	  public By practiceQuestion2 = By.cssSelector("a[href='/question/2']"); 
	  public By practiceQuestion3 = By.cssSelector("a[href='/question/3']"); 
	  public By practiceQuestion4 = By.cssSelector("a[href='/question/4']"); 
	  
	  public By practiceQuestionpage=By.cssSelector("div.container");
	  public By practiceQuestionSearchPage=By.cssSelector("div.CodeMirror-scroll");
	  public By practiceQuestionRunButton=By.cssSelector("button[type='button']");
	  public By practiceQuestionSubmitButton=By.cssSelector("input[type='submit']");
	  
	  
	public void validateUserIsOnArrayDetailPage(){
		Assert.assertEquals(driver.findElement(arrayDetail).getText(), "Array");
		Assert.assertTrue(driver.findElement(arrayDetail).isDisplayed());
		Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/array/");
		Assert.assertEquals(driver.findElement(topicsCovered).getText(),"Topics Covered");
		Assert.assertTrue(driver.findElement(topicsCovered).isDisplayed());
		Assert.assertTrue(driver.findElement(TopicsCoveredOptions).isDisplayed());
	}

	public void clickOnArrayInPythonLink() {
		driver.findElement(arrayInPythonLink).click();
	}

	public void clickOnArrayUsingListLink() {
		driver.findElement(arraysUsingListLink).click();
	}

	public void clickOnBasicOperationsLink() {
		driver.findElement(basicOperationsInListLink).click();
	}

	public void clickOnApplicationOfArrayLink() {
		driver.findElement(applicationsOfArrayLink).click();
	}

	public void validateUserIsOnArraysInPython() {
		Assert.assertEquals(driver.findElement(arraysInPythonText).getText(),"Arrays in Python");
	}

	public void validateUserIsOnArraysUsingList(){
		Assert.assertEquals(driver.findElement(arraysUsingListText).getText(),"Arrays Using List");
	}

	public void validateUserIsOnBasicOperationsInList() {
		Assert.assertEquals(driver.findElement(basicOperationsInListText).getText(),"Basic Operations in Lists");
	}

	public void validateUserIsOnApplicationsOfArray() {
		Assert.assertEquals(driver.findElement(applicationsOfArrayText).getText(),"Applications of Array");
	}

	public void clickOnPracticeQuestionsLink() {
		driver.findElement(practiceQuestionsLink).click();
	}
	

}