package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;


public class RegisterPageObject extends BaseClass {
	
	public WebDriver ldriver;
	Logger log = LogManager.getLogger("RegisterPageObject.java");
	
	public RegisterPageObject(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		}

	@FindBy(xpath = "	//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password1']")
	WebElement password;

	@FindBy(xpath = "//input[@name='password2']")
	WebElement confPassd;

	@FindBy(xpath = "//input[@value='Register']")
	WebElement regBut;
	
	@FindBy(xpath ="//div[@class='alert alert-primary']")
	WebElement msgDisplay;
	
	@FindBy(xpath="//a[@href='/logout']")
	WebElement signOut;

	public void signOutBut() {
		signOut.click();
	}
		
	public String msgDisplayWin() {
	String text = msgDisplay.getText();
	System.out.println("Text is "+text);
	return text;
	}
	
	public void setUserName(String inputUser) {
		userName.clear();
		userName.sendKeys(inputUser);

	}

	public void setPassword(String passwd) {
		password.clear();
		password.sendKeys(passwd);
	}

	public void setConfPassd(String passwd2) {
		confPassd.clear();
		confPassd.sendKeys(passwd2);
	}
	public void clickRegBut() {
		regBut.click();
	}

}
