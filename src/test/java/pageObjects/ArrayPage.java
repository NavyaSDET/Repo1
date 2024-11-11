package pageObjects;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class ArrayPage {
	public WebDriver driver;

	public ArrayPage(WebDriver rdriver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
		
	}

		By arrayGetStartedBtn= By.cssSelector("a[href='array']");
		By arrayDetail=By.cssSelector("h4.bg-secondary");
		By topicsCovered = By.cssSelector("p.bg-secondary");
		By TopicsCoveredOptions =By.cssSelector("a.list-group-item");
		By clickOnArraysInPython=By.cssSelector("a[href='arrays-in-python']");
		By arraysInPythonText=By.cssSelector("strong .bg-secondary");

		By arraysUsingList = By.cssSelector("a[href='arrays-using-list']");	
		By arraysUsingListText=By.cssSelector("strong .bg-secondary");
        By basicOperationsInList = By.cssSelector("a[href=basic-operations-in-lists]");
        By basicOperationsInListText=By.cssSelector("strong .bg-secondary");
        By applicationsOfArray = By.cssSelector("a[href='applications-of-array']");
        By applicationsOfArrayText=By.cssSelector("strong .bg-secondary");
        
	public void clickOnGetStartedForArray() {
		driver.findElements(arrayGetStartedBtn).get(1).click();
		
	}
	public void validateUserIsOnArrayDetailPage(){
		
	Assert.assertEquals(driver.findElement(arrayDetail).getText(), "Array"); 
	Assert.assertTrue(driver.findElement(arrayDetail).isDisplayed());
	Assert.assertEquals(driver.getCurrentUrl(),"https://dsportalapp.herokuapp.com/array");
	Assert.assertEquals(driver.findElement(topicsCovered).getText(),"Topics Covered");	
	Assert.assertTrue(driver.findElement(topicsCovered).isDisplayed());
	Assert.assertTrue(driver.findElement(TopicsCoveredOptions).isDisplayed());
	
	}
	public void validateUserIsOnArraysInPython() {
   driver.findElement(clickOnArraysInPython).click();	
	Assert.assertEquals(driver.findElement(arraysInPythonText).getText(),"Arrays in Python");	
	}
 
	public void validateUserIsOnArraysUsingList(){	
	driver.findElement(arraysUsingList).click();
	Assert.assertEquals(driver.findElement(arraysUsingListText).getText(),"Arrays Using List");
	
	
	}	
	
	public void validateBasicOperationsInLIst1() {	
		driver.findElement(basicOperationsInList).click();
		Assert.assertEquals(driver.findElement(basicOperationsInListText).getText(),"Basic Operations in Lists");
	}	
	

	public void validateApplicationsOfArray() {	
		driver.findElement(applicationsOfArray).click();
		Assert.assertEquals(driver.findElement(applicationsOfArrayText).getText(),"Basic Operations in Lists");
	}	
}