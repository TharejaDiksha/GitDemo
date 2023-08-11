package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SignInPageObject extends BaseClass {

	public WebDriver ldriver;
	Logger log = LogManager.getLogger("SignInPageObject.java");

	public SignInPageObject(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//a[text()='Sign in']")
	WebElement signInBut;
	@FindBy(xpath = "//input[@id='id_username']")
	WebElement signInUserName;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement signInPassd;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement signInClick;
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement alertMsg;
	
	public void SignInButton() {
		signInBut.click();
	}
	public void alertSignIn() {
		String signMsg = alertMsg.getText();
		log.info(signMsg);

	}

	public void sendUserName(String uName) {
		   signInUserName.clear();
           signInUserName.sendKeys(uName);
	}

	public void sendPassd(String password1) {
		signInPassd.clear();
		signInPassd.sendKeys(password1);

	}

	public void clickLogin() {
		signInClick.click();
	}
}
