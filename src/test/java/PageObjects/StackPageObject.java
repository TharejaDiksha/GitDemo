package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class StackPageObject extends BaseClass {
	WebDriver ldriver;
	Logger log = LogManager.getLogger("StackPageObject.java");
	Actions a = new Actions(driver);
	public StackPageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()='Operations in Stack']")
	WebElement operatStack;
	@FindBy(xpath="//a[text()='Implementation']")
	WebElement implementation;
	@FindBy(xpath="//a[text()='Applications']")
	WebElement application;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement  practiceQu;
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHere;
	@FindBy(xpath="//button[text()='Run']")
	WebElement runBut;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutBut;
	
	public void OperationInStack() {
		a.moveToElement(operatStack).click().build().perform();
	}
	public void Implementation() {
		a.moveToElement(implementation).click().build().perform();
	}
	public void Application() {
		a.moveToElement(application).click().build().perform();
	}
	public void PracticeQuestion() {
		a.moveToElement(practiceQu).click().build().perform();
	}
	public void TryHereButton() {
		tryHere.click();
	}
	public void RunButton() {
		runBut.click();
	}
	public void signOutButton() {
		signOutBut.click();
	}
	
}
