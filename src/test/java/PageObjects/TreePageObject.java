package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class TreePageObject extends BaseClass {
	WebDriver ldriver;
	Logger log = LogManager.getLogger("TreePageObject.java");
	Actions a = new Actions(driver);
	public TreePageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()='Overview of Trees']")
	WebElement treeOverview;
	@FindBy(xpath="//a[text()='Terminologies']")
	WebElement termino;
	@FindBy(xpath="//a[text()='Types of Trees']")
	WebElement treeTypes;
	@FindBy(xpath="//a[text()='Tree Traversals']")
	WebElement treeTraversal;
	@FindBy(xpath="//a[text()='Traversals-Illustration']")
	WebElement illustTraversal;
	@FindBy(xpath="//a[text()='Binary Trees']")
	WebElement binaryTree;
	@FindBy(xpath="//a[text()='Types of Binary Trees']")
	WebElement binaryTreeTypes;
	@FindBy(xpath="//a[text()='Implementation in Python']")
	WebElement pythonImpl;
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")
	WebElement traversalBT;
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']")
	WebElement implementBT;
	@FindBy(xpath="//a[text()='Applications of Binary trees']")
	WebElement appBT;
	@FindBy(xpath="//a[text()='Binary Search Trees']")
	WebElement searchBT;
	@FindBy(xpath="//a[text()='Implementation Of BST']")
	WebElement implementBST;
//	@FindBy(xpath="//a[text()='Practice Questions']")
//	WebElement practiceQu;
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement tryHere;
	@FindBy(xpath="//button[text()='Run']")
	WebElement runButt;
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOutBut;
	
	
	public void TreeOverview() {
		a.moveToElement(treeOverview).click().build().perform();
	}
	public void Terminologies() {
		a.moveToElement(termino).click().build().perform();
	}
	public void TreeTypes() {
		a.moveToElement(treeTypes).click().build().perform();
	}
	public void TreeTraversal() {
		a.moveToElement(treeTraversal).click().build().perform();
	}
	public void IllustTraversal() {
		a.moveToElement(illustTraversal).click().build().perform();
	}
	public void BinaryTree() {
		a.moveToElement(binaryTree).click().build().perform();
	}
	public void BinaryTreeTypes() {
		a.moveToElement(binaryTreeTypes).click().build().perform();
	}
	public void PythonImplmenet() {
		a.moveToElement(pythonImpl).click().build().perform();
	}
	public void TraversalBT() {
		a.moveToElement(traversalBT).click().build().perform();
	}
	public void ImplementBT() {
		a.moveToElement(implementBST).click().build().perform();
	}
	public void ApplicationBT() {
		a.moveToElement(appBT).click().build().perform();
	}
	public void SearchBT() {
		a.moveToElement(searchBT).click().build().perform();
	}
	public void ImplementBST() {
		a.moveToElement(implementBST).click().build().perform();
	}
	public void PracticeQues() {
		//a.moveToElement(practiceQu).click().build().perform();
	}
	public void TryHere() {
		tryHere.click();
	}
	public void RunButton() {
		runButt.click();
	}
	public void SignOutButton() {
		signOutBut.click();
	}
}
