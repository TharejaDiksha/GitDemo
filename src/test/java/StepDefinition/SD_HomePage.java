package StepDefinition;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Base.BaseClass;
import PageObjects.HomePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_HomePage extends BaseClass {
	Logger log = LogManager.getLogger("SD_HomePage.java");
	HomePageObject homepage;

	@Given("User is in the home page")
	public void user_is_in_the_home_page() {
	  homepage = new HomePageObject(driver);
	  String HpTitle = driver.getTitle();
	  System.out.println("HomePage Tittle :"+HpTitle);
		}

	@When("The user clicks  Get Started button below the Data structures-Introduction")
	public void the_user_clicks_get_started_button_below_the_data_structures_introduction() {
		homepage.ClickDSGetStarted();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("It should alert the user with a message - You are not logged in")
	public void it_should_alert_the_user_with_a_message_you_are_not_logged_in() throws IOException {
		homepage.alertMsg();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("The user clicks Get Started button below the Array")
	public void the_user_clicks_get_started_button_below_the_array() {
	   homepage.ClickArrayGetStarted();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("The user selects any data structures item from the drop down without Sign in")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
	  homepage.DropDown();
	  homepage.ClickStackGetStarted();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
		homepage.RegButClick();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		String RegTitle = driver.getTitle();
		log.info(RegTitle);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("The user clicks Register")
	public void the_user_clicks_register() {
		homepage.SignButtClick();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		String SignInTitle = driver.getTitle();
		log.info(SignInTitle);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().back();
		
	}
}
