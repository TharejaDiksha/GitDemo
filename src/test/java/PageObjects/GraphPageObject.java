package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class GraphPageObject extends BaseClass {
	WebDriver ldriver;
	Logger log = LogManager.getLogger("GraphPageObject.java");
	Actions a = new Actions(driver);
	
	public GraphPageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='graph']")
	//@FindBy(xpath="//a[text()='Graph']")
	WebElement graphBut;
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHere;
	@FindBy(xpath="//button[text()='Run']")
	WebElement runBut;
	@FindBy(xpath="//a[text()='Graph Representations']")
	WebElement graphRepresent;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQu;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutBut;
	
	public void GraphButton() {
		a.moveToElement(graphBut).click().build().perform();
	}
	public void TryHereButton() {
		tryHere.click();
	}
	public void RunButton() {
		runBut.click();
	}
	public void GraphRepresentation() {
		a.moveToElement(graphRepresent).click().build().perform();
	}
	public void PracticeQuestion() {
		a.moveToElement(practiceQu).click().build().perform();
	}
	public void SignOutButton() {
		signOutBut.click();
	}
	
}
