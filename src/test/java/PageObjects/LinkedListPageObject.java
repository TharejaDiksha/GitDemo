package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LinkedListPageObject extends BaseClass {
	WebDriver ldriver;
	Logger log = LogManager.getLogger("LinkedListPageObject.java");
    Actions a = new Actions(driver);
	public LinkedListPageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[text()='Introduction']")
	WebElement intro;
	@FindBy(xpath ="//a[text()='Creating Linked LIst']")
	WebElement createLL;
	@FindBy(xpath ="//a[text()='Types of Linked List']")
	WebElement typesOfLL;
	@FindBy(xpath="//a[text()='Implement Linked List in Python']")
	WebElement pythonLL;
	@FindBy(xpath ="//a[text()='Traversal']")
	WebElement traversal;
	@FindBy(xpath ="//a[text()='Insertion']")
	WebElement insertion;
	@FindBy(xpath = "//a[text()='Deletion']")
	WebElement deletion;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutBut;
	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement tryHere;
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBut;
	@FindBy(xpath ="//a[text()='Practice Questions']")
	WebElement PracticeQu;
	
	
	public void Introduction(){
		a.moveToElement(intro).click().build().perform();
	}
	public void CreateLinkedList(){
		a.moveToElement(createLL).click().build().perform();
	}
	public void TypesOfLinkedlistL(){
		a.moveToElement(typesOfLL).click().build().perform();
	}
	public void PythonLinkedListL(){
		a.moveToElement(pythonLL).click().build().perform();
	}
	public void Traversal(){
		a.moveToElement(traversal).click().build().perform();
	}
	public void Insertion(){
		a.moveToElement(insertion).click().build().perform();
	}
	public void Deletion(){
		a.moveToElement(deletion).click().build().perform();
	}
	public void SignOutBut(){
		signOutBut.click();
	}
	public void TryHere(){
		tryHere.click();
	}
	public void RunButton(){
		runBut.click();
	}
	public void PracticeQuestion(){
		a.moveToElement(PracticeQu).click().build().perform();
	}

}
