package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;

public class HomePageObject extends BaseClass {

public WebDriver ldriver;
Logger log = LogManager.getLogger("HomePageObject.java");
Actions a = new Actions(driver);
public HomePageObject(WebDriver rdriver)

{
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
	}

@FindBy(xpath="//a[text()='Arrays']")
WebElement DDArray;
@FindBy(xpath="//a[text()='Tree']")
WebElement DDTree;
@FindBy(xpath="//a[text()='Graph']")
WebElement DDGraph;
@FindBy(xpath="//a[text()='Linked List']")
WebElement DDLinkedlist;
@FindBy(xpath="//a[text()='Queue']")
WebElement DDQueue;
// drop down
@FindBy(xpath= "//a[text()='Data Structures']")
WebElement DST;
// Register
@FindBy(xpath= "//a[text()=' Register ']")
WebElement registerBut;
// sign in 
@FindBy(xpath= "//a[text()='Sign in']")
WebElement signBut;
// data structure -introduction Get started Button 
@FindBy(xpath= "//h5[text()='Data Structures-Introduction']/..//a")
WebElement dataStructStartBut;
// array get started Button 
@FindBy(xpath= "//h5[text()='Array']/..//a")
WebElement arrayStartBut;
//Linked list Get started Button 
@FindBy(xpath= "//h5[text()='Linked List']/..//a")
WebElement linkedListStartBut;
// Stack Get started Button 
@FindBy(xpath = "//h5[text()='Stack']/../a[text()='Get Started']")
//@FindBy(xpath= "//h5[text()='Stack']/..//a")
WebElement stackStartBut;
//Queue Get started Button
@FindBy(xpath = "//h5[text()='Queue']/..//a")
WebElement queueStartBut;
// Tree Get started Button
@FindBy(xpath = "//h5[text()='Tree']/..//a")
WebElement treeStartBut;
// Graph Get started Button 
@FindBy(xpath ="//h5[text()='Graph']/..//a")
WebElement graphStartBut;
@FindBy(xpath = "//div[@role='alert']")
WebElement alertMsg;
@FindBy(xpath="//a[text()='Data Structures']")
WebElement dropDown;

public void DDArray() {
a.moveToElement(DDArray).click().build().perform();
}
public void DDTree() {
a.moveToElement(DDTree).click().build().perform();
}
public void DDGraph() {
	a.moveToElement(DDGraph).click().build().perform();
}
public void DDLinkedLIst() {
	a.moveToElement(DDLinkedlist).click().build().perform();
}
public void DDQueue() {
	a.moveToElement(DDQueue).click().build().perform();
}
public void DropDown() {
	
  a.moveToElement(dropDown).click().build().perform();
 	}
public void alertMsg() {
	String A = alertMsg.getText();
	System.out.println(A);
    }
public void DSButClick() {
	DST.click();
	}
public void RegButClick() {
	registerBut.click();
	}
public void SignButtClick() {
	signBut.click();
	}
public void ClickDSGetStarted() {
dataStructStartBut.click();
	}
public void ClickArrayGetStarted() {
	arrayStartBut.click();
	}
public void ClickLinkedlistGetStarted() {
	linkedListStartBut.click();
	}
public void ClickStackGetStarted() {
	stackStartBut.click();
	}
public void ClickQueueGetStarted() {
	queueStartBut.click();
	}
public void ClickTreeGetStarted() {
	treeStartBut.click();
	}
public void ClickGraphGetStarted() {
	graphStartBut.click();
	}

}
