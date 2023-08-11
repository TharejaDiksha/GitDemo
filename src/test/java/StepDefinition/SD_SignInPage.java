package StepDefinition;


import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Base.BaseClass;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.SignInPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;	
import io.cucumber.java.en.When;
import utilities.ExcelDataDriven;

public class SD_SignInPage extends BaseClass{
	
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	Logger log = LogManager.getLogger("SD_SignInPage.java");
	ExcelDataDriven d = new ExcelDataDriven();
	ArrayList<String> data;
	SignInPageObject sp;
	
	@Given("User is in SignIn page")
	public void user_is_in_sign_in_page() throws Exception {
		sp = new SignInPageObject(driver);
	    String title = driver.getTitle();
	    System.out.println("The SignIn title before enter data:"+title);
	    
	    if (title.equalsIgnoreCase("Registration"))
	    {
	    	throw new Exception();
	    }
	    
		sp.SignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@When("user click on Login button with empty username")
	public void user_click_on_login_button_with_empty_username() throws IOException {
		//data = d.dataDriven("Signin1");
		
		sp.sendUserName("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("Alert error msg display-Please fill out this field")
	public void alert_error_msg_display_please_fill_out_this_field() throws IOException {
		
		Assert.fail();
		captureScreenshot(driver, "empty username");
	   
	}

	@When("user click on Login button with empty password")
	public void user_click_on_login_button_with_empty_password() throws IOException {
		data = d.dataDriven("Signin2");
		sp.sendUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.sendPassd("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	    }

	@Then("Then Alert error msg display-Please fill out this field")
	public void then_alert_error_msg_display_please_fill_out_this_field() throws IOException {
		Assert.fail();
		captureScreenshot(driver, "Signin2");
	    
	}

	@When("user enter invalid username and password")
	public void user_enter_invalid_username_and_password() throws IOException {
		data = d.dataDriven("Signin3");
		sp.sendUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.sendPassd(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		sp.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   }

	@Then("Message Dispaly - Invalid username and password")
	public void message_dispaly_invalid_username_and_password() throws IOException {
	   sp.alertSignIn();
		Assert.fail();
		captureScreenshot(driver, "Invalid username and password");
	}

	@When("user enter valid username and Invalid password")
	public void user_enter_valid_username_and_invalid_password() throws IOException {
		data = d.dataDriven("Signin4");
		sp.sendUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.sendPassd(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Assert.fail();
		captureScreenshot(driver, "valid username and Invalid password");
	 	}

	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() throws IOException {
		data = d.dataDriven("Signin3");
		sp.sendUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.sendPassd(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Assert.fail();
		captureScreenshot(driver, "Invalid username and Invalid password");
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws IOException {
		data = d.dataDriven("Signin");
		sp.sendUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.sendPassd(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sp.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}

	@Then("user redirected to Home page")
	public void user_redirected_to_home_page() {
	  String title = driver.getTitle();
	  log.info("The Page title after login :"+title);
	}

	@Then("Display message - You are logged in")
	public void display_message_you_are_logged_in() {
	    sp.alertSignIn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		// click on data structure on page 
//		dsi.DSIClickButton();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

}
