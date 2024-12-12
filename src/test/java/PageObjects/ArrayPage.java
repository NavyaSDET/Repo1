package PageObjects;

import StepDefinitions.Hooks;
import Utilities.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class ArrayPage {

	public WebDriver driver = Hooks.getDriver();
	public By arrayDetail = By.cssSelector("h4.bg-secondary");
	public By topicsCovered = By.cssSelector("p.bg-secondary");
	public By TopicsCoveredOptions = By.cssSelector("a.list-group-item");
	public By arrayInPythonLink = By.cssSelector("a[href='arrays-in-python']");
	public By arraysInPythonText = By.cssSelector("strong .bg-secondary");

	public By arraysUsingListLink = By.cssSelector("a[href='arrays-using-list']");
	public By arraysUsingListText = By.cssSelector("strong .bg-secondary");
	public By basicOperationsInListLink = By.cssSelector("a[href=basic-operations-in-lists]");
	public By basicOperationsInListText = By.cssSelector("strong .bg-secondary");
	public By applicationsOfArrayLink = By.cssSelector("a[href='applications-of-array']");
	public By applicationsOfArrayText = By.cssSelector("strong .bg-secondary");
	public By practiceQuestionsLink = By.cssSelector("a[href='/array/practice']");
	public By practiceQuestion = By.cssSelector("a[href='/question/1']");

	public By searchTheArrayQuestion = By.cssSelector("a[href='/question/1']");
	public By maxConsecutiveOneQuestion = By.cssSelector("a[href='/question/2']");
	public By evenNumberQuestion = By.cssSelector("a[href='/question/3']");
	public By sortedArrayQuestion4 = By.cssSelector("a[href='/question/4']");

	public By practiceQuestionpage = By.cssSelector("div.container");
	public By practiceQuestionInput = By.cssSelector(".code-area textarea[tabindex=\"0\"]");
	public By practiceQuestionSearchPage = By.cssSelector("div.CodeMirror-scroll");
	public By practiceQuestionRunButton = By.cssSelector("button[type='button']");
	public By practiceQuestionSubmitButton = By.cssSelector("input[type='submit']");
	public By practiceQuestionOutPut = By.cssSelector("#output");

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

	public void clickOnPracticeQuestionsLink() {
		driver.findElement(practiceQuestionsLink).click();
	}

	public void clickOnSearchArrayQuestionLink() {
		driver.findElement(searchTheArrayQuestion).click();
	}

	public void clickOnMaxConsecutiveQuestionLink() {
		driver.findElement(maxConsecutiveOneQuestion).click();
	}
	
	public void clickOnEvenNumbersQuestionLink() {
		driver.findElement(evenNumberQuestion).click();
	}
	
	public void clickOnSortedArrayQuestionLink() {
		driver.findElement(sortedArrayQuestion4).click();
	}
	
	public void clickOnSubmitButton() {
		driver.findElement(practiceQuestionSubmitButton).click();
	}
	
	public void clickOnRunButton() {
		driver.findElement(practiceQuestionRunButton).click();
	}
	
	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException, OpenXML4JException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData("./src/test/resources/Excel/TestData.xlsx", sheetname);

		String code = testdata.get(rownumber).get("pythonCode");
		driver.findElement(practiceQuestionInput).sendKeys(code);

	}
	
}