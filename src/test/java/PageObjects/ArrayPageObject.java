package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ArrayPageObject extends BaseClass {

	WebDriver ldriver;
	Logger log = LogManager.getLogger("ArrayPageObject.java");
	Actions a = new Actions(driver);
	
	public ArrayPageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arrayPython;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement arraylist;

	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperat;

	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement appArray;

	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement parcticeQues;

     //Parctice Question Element 
	@FindBy(xpath = "//a[text()='Search the array']")
	WebElement searchArray;
	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	WebElement maxConsOnes;
	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits' ]")
	WebElement evenNoDigits;
	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array' ]")
	WebElement sqSortedArray;
	@FindBy(xpath = "//a[text()='Try here>>>' ]")
    
	// Try Here Button
	WebElement tryHereBut;
	@FindBy(xpath = "//button[text()='Run']")
    
	// Run Button 
	WebElement runButton;
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signOutBut;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitBut;
	
	@FindBy(xpath="//input[@type='submit1']")
	WebElement submitBut1;
	
	
	public void SubmitButton() {
		submitBut.click();
	}
	
	public void ArrayPython() {
		//arrayPython.click();
a.moveToElement(arrayPython).click().build().perform();
	}

	public void SearchTheArray() {
	a.moveToElement(searchArray).click().build().perform();	
		//searchArray.click();
	}

	public void PracticeQuestion() {
		a.moveToElement(parcticeQues).click().build().perform();
		//parcticeQues.click();
	}

	public void ApplicationArray() {
		a.moveToElement(appArray).click().build().perform();	
		//appArray.click();
	}

	public void BasicOperation() {
		a.moveToElement(basicOperat).click().build().perform();	
		//basicOperat.click();
	}

	public void ArrayList() {
		a.moveToElement(arraylist).click().build().perform();	
		//arraylist.click();
	}

	public void MaxConsOnes() {
		a.moveToElement(maxConsOnes).click().build().perform();	
		//maxConsOnes.click();
	}

	public void EvenNoDigits() {
		a.moveToElement(evenNoDigits).click().build().perform();	
		//evenNoDigits.click();
	}

	public void SquareSortedArray() {
		a.moveToElement(sqSortedArray).click().build().perform();	
		//sqSortedArray.click();
	}

	public void RunButton() {
		submitBut.click();
	}
	
	public void RunButton1() {
		submitBut1.click();
	}

	public void TryHereButton() {
		tryHereBut.click();
	}

	public void SignoutBut() {
		signOutBut.click();
	}

}
