package PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class DSAlgoPortalPageObject extends BaseClass{
	WebDriver ldriver;
	Logger log = LogManager.getLogger("DSAlgoPortalPageObject.java");
	
	public DSAlgoPortalPageObject(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//div[@class='content']/h1")
	WebElement lbl1;

	@FindBy(xpath = "//div[@class='content']/p")
	WebElement para;

	@FindBy(xpath = "//button[@class='btn']")
	WebElement btnGetStarted;

	public void ClickGetStarted() {
		System.out.println("In DSAlgoPortalPage" + ldriver);
		// Get Started button Click
		btnGetStarted.click();

	}

}
