package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.HomePageObject;
import PageObjects.StackPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_StackPage extends BaseClass {
	Logger log = LogManager.getLogger("SD_StackPage.java");
	SoftAssert SA = new SoftAssert();
	StackPageObject spo = new StackPageObject(driver);
	HomePageObject hpo = new HomePageObject(driver);
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	
	@Given("user is at home page with {int} link")
	public void user_is_at_home_page_with_link(Integer int1) {
	   String tittle = driver.getTitle();
	   if (tittle.equalsIgnoreCase("NumpyNinja")) {
		   SA.assertTrue(true);
		   log.info("User is at Home page before Click Stack");
	   }else {
		   SA.assertTrue(false);
	   }
	}
	
	@When("user clicks Getting Started Button under Stack")
	public void user_clicks_getting_started_button_under_stack() {
            hpo.ClickStackGetStarted();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Stack page")
	public void user_redirected_to_stack_page() {
		 String tittle = driver.getTitle();
		   if (tittle.equalsIgnoreCase("Stack")) {
			   SA.assertTrue(true);
			   log.info("User is at Stack page after Get Started Button");
		   }else {
			   SA.assertTrue(false);
			   log.info("Test Failed on Stack page");
		   }
	}

	@Given("user is at Stack Page")
	public void user_is_at_stack_page() {
	   String tittle = driver.getCurrentUrl();
	   log.info("The Stack URL is :" +tittle);
	}

	@When("user clicks Operations in Stack button")
	public void user_clicks_operations_in_stack_button() {
	   spo.OperationInStack();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Then("user redirected to Operation in Stack page")
	public void user_redirected_to_operation_in_stack_page() {
	   String tittle = driver.getTitle();
	   if (tittle.equals("Operations in Stack")) {
		   SA.assertTrue(true);
	   } log.info("Tittle on Operation in Stack page "+tittle);
	}

	@Then("user clicks Try Here button on Operation in Stack page and redirected to Assesment page")
	public void user_clicks_try_here_button_on_operation_in_stack_page_and_redirected_to_assesment_page() {
	    spo.TryHereButton();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is on Assessment page with Editor box and run button")
	public void user_is_on_assessment_page_with_editor_box_and_run_button() {
		 String tittle = driver.getTitle();
		   if (tittle.equals("Assesment")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Operation in Assesment:"+tittle);
	}

	@When("user enter Python Code in Editor box")
	public void user_enter_python_code_in_editor_box() {
	 dsi.EditorBox();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user enter  run button")
	public void user_enter_run_button() {
	  spo.RunButton(); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Operations in Stack")
	public void user_navigate_back_to_operations_in_stack() {
	   driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("user is in Operation in Stack with {int} links")
	public void user_is_in_operation_in_stack_with_links(Integer int1) {
		String tittle = driver.getTitle();
		if (tittle.equals("Operations in Stack")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Operation in Stack page after Run:"+tittle);
		}

	@When("user clicks on Implementation")
	public void user_clicks_on_implementation() {
    spo.Implementation();   
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation page withn Try here button")
	public void user_redirected_to_implementation_page_withn_try_here_button() {
		String tittle = driver.getTitle();
		if (tittle.equals("Implementation")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Implementation:"+tittle);
		}
	@Then("user clicks Try here button on Implementation page")
	public void user_clicks_try_here_button_on_implementation_page() {
		spo.TryHereButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 	}

	@Given("user is on Assessment page with Editor box")
	public void user_is_on_assessment_page_with_editor_box() {
		String tittle = driver.getTitle();
		if (tittle.equals("Assesment")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Implementation Assesment:"+tittle);  
	}

	@When("user enter Python Code in Editor box and enter Run Button")
	public void user_enter_python_code_in_editor_box_and_enter_run_button() {
    dsi.EditorBox();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	spo.RunButton();
   	}

	@Then("user navigate back to Implementaion page")
	public void user_navigate_back_to_implementaion_page() {
	 driver.navigate().back();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
	}

	@Given("user is in Implementaion page")
	public void user_is_in_implementaion_page() {
		String tittle = driver.getTitle();
		if (tittle.equals("Imlementation")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Implementation:"+tittle);  
	}

	@When("user clicks on Aplications")
	public void user_clicks_on_aplications() {
		spo.Application();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   	}

	@Then("user redirected to Application Page with Try here button")
	public void user_redirected_to_application_page_with_try_here_button() {
		String tittle = driver.getTitle();
		if (tittle.equals("Application")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Application with Try Button:"+tittle);    
	}

	@Then("user clicks TryHere button on Application page")
	public void user_clicks_try_here_button_on_application_page() {
	spo.TryHereButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));   
	}

	@Given("user is on Assessment page")
	public void user_is_on_assessment_page() {
		String tittle = driver.getTitle();
		if (tittle.equals("Assesment")) {
			   SA.assertTrue(true);
		   } log.info("Tittle on Application Assesment:"+tittle);  
	}  
	
	@When("user enter Python Code and click Run Button")
	public void user_enter_python_code_and_click_run_button() {
		dsi.EditorBox();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Application page")
	public void user_navigate_back_to_application_page() {
	   driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is on Application page")
	public void user_is_on_application_page() {
		String tittle = driver.getTitle();
		if (tittle.equals("Application")) {
			   SA.assertTrue(true);
		   } log.info("Application Page After navigate back from run:"+tittle);  
	}     

	@When("user click Practice Question")
	public void user_click_practice_question() {
	 spo.PracticeQuestion(); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user is at Practice Question Page")
	public void user_is_at_practice_question_page() {
		String tittle = driver.getTitle();
		if (tittle.equals("Practice Question")) {
			   SA.assertTrue(true);
		   }  log.info("Tittle of Practice Question:"+tittle);  
	}         

	@Then("user navigate back to Home Page-Numpy Ninja")
	public void user_navigate_back_to_home_page_numpy_ninja() {
	    driver.navigate().back();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    hpo.DropDown();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    hpo.DDQueue();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}