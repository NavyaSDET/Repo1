package pageObjects;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Queuepage {
	
	

	public WebDriver qdriver;

	public class Queuepages {
		public WebDriver driver;

		public Queuepages (WebDriver driver) {
			this.driver = driver;
		}
		
		
			By queueGetStartedButton= By.cssSelector("a[href='queue']");
			By queuepage=By.cssSelector("h4.bg-secondary");
			By implementationOfQueueInPythonLink=By.cssSelector("a[href='implementation-lists']");
			By implementationOfQueueInPythonPage=By.cssSelector("h4.bg-secondary");
		    By implementationUsingCollectionsDequeLink=By.cssSelector("a[href='implementation-collections']");
		    By implementaionUsingCollectionDequePage=By.cssSelector("h4.bg-secondary");
		    
		    By implementationUsingArrayLink=By.cssSelector("a[href='Implementation-array']");

		    By implementationUsingCollectionsArrayPage=By.cssSelector("h4.bg-secondary");
		    By queueOperationsLink=By.cssSelector("a[href='QueueOp']");
		    By queueOperationsPage=By.cssSelector("h4.bg-secondary");
		    
		 
		
		
		public void  clickOnQueueGetStartedButton() {
	
		driver.findElement(queueGetStartedButton).click();
		
		}
		public void validateUserIsOnQueuePage() {
			
			Assert.assertEquals(driver.findElement(queuepage).getText(), "Queue"); 
			Assert.assertTrue(driver.findElement(queuepage).isDisplayed());
		}
		public void clickOnImplementationOfQueueInPython() {
			driver.findElement(implementationOfQueueInPythonLink).click();
			
			Assert.assertTrue(driver.findElement(implementationOfQueueInPythonPage).isDisplayed());
			Assert.assertEquals(driver.findElement(implementationOfQueueInPythonPage).getText(), "Implementation of Queue in Python");
		}

		public void clickOn() {
			driver.findElement(Datastructure).click();
			Assert.assertTrue(driver.findElement(DsDropdown).isDisplayed());
		}

		public void validateListInDataStructureDropDownMenu() {
		
		
		
		}
		
		
		}
		
	
		}	
}

