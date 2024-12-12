package PageObjects;

import org.testng.Assert;

import StepDefinitions.Hooks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IntroductionPage {
	public WebDriver driver = Hooks.getDriver();


	public By NumpyNinja =  By.cssSelector("a[href='/home']");
	public By Datastructure = By.cssSelector("a.dropdown-toggle");
	public By DsDropdown = By.cssSelector("a.dropdown-item");

	public By cardBody = By.cssSelector("div.card-body");
	public By cardTitle = By.cssSelector("h5.card-title");
	public By cardText = By.cssSelector("p.card-text");
	public By getStartedButtonOnCard = By.cssSelector("a.btn-primary");
	public By signInButton=By.cssSelector("a[href='/login']");
	public By registerButton=By.cssSelector("a[href='/register']");
	public By warningMessage = By.cssSelector(".alert.alert-primary");
	public By userNameInputfield=By.cssSelector("input[name='username']");
	public By passWordNameInputField=By.cssSelector("input[name='password']");
	public By loginButton=By.cssSelector("input[type='submit']");
	public By displayQaChamps=By.cssSelector(".navbar-nav ul a:nth-child(2)");
	public By dataStructurePageHeader=By.cssSelector("h4.bg-secondary");
	public By dispalyTimeComplexity=By.cssSelector("a[href='time-complexity']");
	public By timeComplexityPage=By.cssSelector("strong .bg-secondary.text-white");
	public By practiceQuestionButton=By.cssSelector("a[href='/data-structures-introduction/practice']");
	public By tryHereButton=By.cssSelector("a[href='/tryEditor']");
	public By codeEditorPage=By.cssSelector("pre.codeMirror-line");
	public By codeInputField = By.cssSelector(".CodeMirror textarea");
	public By consoleOutput = By.cssSelector("#output");
	public By runButton=By.cssSelector("button[type='button']");
	public By arrayGetStartedBtn= By.cssSelector("a[href='array']");
	public By queueGetStartedBtn= By.cssSelector("a[href='queue']");
	public By stackGetStartedBtn= By.cssSelector("a[href='stack']");
	public By graphGetStartedBtn= By.cssSelector("a[href='graph']");

	public void validateUserIsOnIntroductionPage() {

		Assert.assertEquals(driver.findElement(NumpyNinja).getText(), "NumpyNinja"); 
		Assert.assertTrue(driver.findElement(cardBody).isDisplayed());
		Assert.assertTrue(driver.findElement(signInButton).isDisplayed());
		Assert.assertTrue(driver.findElement(registerButton).isDisplayed());
	}

	public void clickOnDataStructureDropdown() {
		driver.findElement(Datastructure).click();
		Assert.assertTrue(driver.findElement(DsDropdown).isDisplayed());
	}

	public void validateListInDataStructureDropDownMenu() {
		Assert.assertEquals(driver.findElements(DsDropdown).size(), 6);
		Assert.assertEquals(driver.findElements(DsDropdown).get(0).getText(), "Arrays");
		Assert.assertEquals(driver.findElements(DsDropdown).get(1).getText(), "Linked List");
		Assert.assertEquals(driver.findElements(DsDropdown).get(2).getText(), "Stack");
		Assert.assertEquals(driver.findElements(DsDropdown).get(3).getText(), "Queue");
		Assert.assertEquals(driver.findElements(DsDropdown).get(4).getText(), "Tree");
		Assert.assertEquals(driver.findElements(DsDropdown).get(5).getText(), "Graph");
	}

	public void clickOnDSIntroductionhomepage() {
		driver.findElements(getStartedButtonOnCard).get(0).click();
	}

	public void validateWarningMessageWhenNotLoggedIn() {
		Assert.assertTrue(driver.findElement(warningMessage).isDisplayed());
		Assert.assertEquals(driver.findElement(warningMessage).getText(), "You are not logged in");
		Assert.assertEquals(driver.findElements(warningMessage).size(), 1);
	}

	public void clickOnRegisterlink() {
		driver.findElement(registerButton).click();
	}
	
	public void clickOnSignInlink() {
		driver.findElement(signInButton).click();	
	}

	public void validateUserNavigatedToRegisterPage() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/register");
	}

	public void completeTheLOgin() {
		driver.findElement(signInButton).click();
		driver.findElement(userNameInputfield).sendKeys("qachamps3");
		driver.findElement(passWordNameInputField).sendKeys("Ninjatest@123");
		driver.findElement(loginButton).click();
		Assert.assertTrue(driver.findElement(displayQaChamps).isDisplayed());
	}

	public void clickOnGetStartedButtonOfDSIntroduction() {
		driver.findElements(getStartedButtonOnCard).get(0).click();
	}

	public void InvalidateUserisOnDSIntroductionAsSigne() {
		Assert.assertTrue(driver.findElement(dataStructurePageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(dataStructurePageHeader).getText(), "Data Structures-Introduction");
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/data-structures-introduction/");
		Assert.assertTrue(driver.findElement(displayQaChamps).isDisplayed());
	}
	
	public void validateUserisOnDSIntroduction() {
		Assert.assertTrue(driver.findElement(dataStructurePageHeader).isDisplayed());
		Assert.assertEquals(driver.findElement(dataStructurePageHeader).getText(), "Data Structures-Introduction");
		Assert.assertEquals(driver.getCurrentUrl(), "https://dsportalapp.herokuapp.com/data-structures-introduction/");
	}
	public void validateTimeComplexiButtonDisplayed() {
		Assert.assertTrue(driver.findElement(dispalyTimeComplexity).isDisplayed());
	}

	public void clickOnTimeComplexiButton() {
		driver.findElement(dispalyTimeComplexity).click();
	}

	public void validateTimeComplexitypage() {
		Assert.assertTrue(driver.findElement(timeComplexityPage).isDisplayed());
		Assert.assertEquals(driver.findElement(timeComplexityPage).getText(), "Time Complexity");
	}
	
	public void validateTryHereAndPracticeQuestionLinkDisplayed() {
		Assert.assertTrue(driver.findElement(tryHereButton).isDisplayed());
		Assert.assertEquals(driver.findElement(tryHereButton).getText(), "Try here>>>");
		Assert.assertTrue(driver.findElement(practiceQuestionButton).isDisplayed());
		Assert.assertEquals(driver.findElement(practiceQuestionButton).getText(), "Practice Questions");
	}

	public void clickOnTryHerebutton () {
		driver.findElement(tryHereButton).click();

	}

	public void codeTryEditorPage()  {
		Assert.assertTrue(driver.findElement(codeEditorPage).isDisplayed());
		Assert.assertTrue(driver.findElement(runButton).isDisplayed());
	}

	public void enterCodeInEditor(String codeText  )  {
		driver.findElement(codeInputField).sendKeys(codeText);
	}

	public void clickOnRunButton() {
		driver.findElement(runButton).click();
	}
	public void validateErrorMessageDisplayedOnAlert(String expectedErrorHeader, String expectedErrorMessage) {
		Alert alert= driver.switchTo().alert();
		String alertText=alert.getText();
		Assert.assertEquals(alertText, expectedErrorMessage);
		alert.accept();
	}

	public void clickOnGetStartedButtonOfArray() {
		driver.findElement(arrayGetStartedBtn).click();
	}

	public void clickOnGetStartedButtonOfQueue() {
		driver.findElement(queueGetStartedBtn).click();
	}

	public void clickOnGetStartedButtonOfStack() {
		driver.findElement(stackGetStartedBtn).click();			
	}
	
	public void clickOnGetStartedButtonOfGraph() {
		driver.findElement(graphGetStartedBtn).click();			
	}
	
	public void validateConsoleOutput(String expectedOuputText) {
		Assert.assertEquals(driver.findElement(consoleOutput).getText(), expectedOuputText);
	}

	public void validateNoConsoleOuput() {
		Assert.assertFalse(driver.findElement(consoleOutput).isDisplayed());
	}
}