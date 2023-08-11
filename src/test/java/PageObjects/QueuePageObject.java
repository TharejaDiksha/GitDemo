package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class QueuePageObject extends BaseClass {
	WebDriver ldriver;
	Logger log = LogManager.getLogger("QueuePageObject.java");
	Actions a = new Actions(driver);
	public QueuePageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath ="//a[text()='Implementation of Queue in Python']")
	WebElement PythonQueue;
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	WebElement deQueCollect;
	@FindBy(xpath = "//a[text()='Implementation using array']")
	WebElement arrayImpl;
	@FindBy(xpath = "//a[text()='Queue Operations']")
	WebElement queueOperat;
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHereBut ;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQu ;
	@FindBy(xpath="//button[text()='Run']")
	WebElement runBut;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutBut; 
	
	public void PythonQueue(){
	a.moveToElement(PythonQueue).click().build().perform();
	}
	public void deQueCollect(){
		a.moveToElement(deQueCollect).click().build().perform();
	}
	public void ArrayImpl(){
	     arrayImpl.click();
		//a.moveToElement(arrayImpl).click().build().perform();	
	}
	public void QueueOperat(){
		a.moveToElement(queueOperat).click().build().perform();
	}
	
	public void PracticeQuestion(){
		try
		{
		a.moveToElement(practiceQu).click().build().perform();
		}catch(Exception e)
		{
			
		e.printStackTrace();
		}
	}
    public void TryHereBut(){
    	tryHereBut.click();
	}
	public void RunBut(){
		runBut.click();
	}
	public void SignOutBut(){
		signOutBut.click();
	}
	
	
}
