package PageObjects;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DataStructureIntroPageObject extends BaseClass 
{
	
	WebDriver ldriver;
	Actions a = new Actions(driver);
	Logger log = LogManager.getLogger("DataStructureIntroPageObject.java");
	
	
	public DataStructureIntroPageObject(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	// Data Structure
	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a")
	WebElement DSIClickBut;
	//Time Complexity
	@FindBy(xpath="//a[text()='Time Complexity']")
	WebElement timeComplexity; 
	// Practice Question
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQues;
	// Try Here Button
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHere;
	// Run Button 
	@FindBy(xpath="//button[text()='Run']")
	WebElement runButton;
	//editor box  
	@FindBy(xpath="//textarea[@tabindex='0']")
	//@FindBy(xpath="//div[@class='CodeMirror-scroll']")
	WebElement editorBox;
	
	
	public void EditorBox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//editorBox.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		editorBox.sendKeys(DDeditorBox);
	}
	public void DSIClickButton() {
		DSIClickBut.click();
	}
	
    public void DsTimeComplexity(){
    	timeComplexity.click();
	//a.moveToElement(timeComplexity).click().build().perform();
    }
    
    public void DsPracticeQues() {
    	practiceQues.click();	
	//a.moveToElement(practiceQues).click().build().perform();
    }
    
    public void DsTryHere() {
    	tryHere.click();
	}
    
    public void DsRunButton() {
    	runButton.click();
	}
}
