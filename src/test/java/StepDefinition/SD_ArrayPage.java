package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.ArrayPageObject;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.HomePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_ArrayPage extends BaseClass {
	Logger log = LogManager.getLogger("SD_ArrayPage.java");
	ArrayPageObject apo = new ArrayPageObject(driver);
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	SoftAssert sa = new SoftAssert();
	HomePageObject hpo = new HomePageObject(driver);
	
	@Given("user is at Array page with {int} links")
	public void user_is_at_array_page_with_links(Integer int1) {
		String tittle = driver.getTitle();
		if (tittle.equals("Array")) {
			sa.assertTrue(true);
			log.info("Test passed");
			log.info("Array Page Tittle :"+tittle);
			}
	}
	@When("user click on Arrays in Python in Array")
	public void user_click_on_arrays_in_python_in_array() {
		apo.ArrayPython();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user is redirected to Arrays in Python page")
	public void user_is_redirected_to_arrays_in_python_page() {
		String tittle = driver.getTitle();
		if (tittle.equals("Arrays in Python")) {
		 log.info("User is at Array in Python Page"+tittle);
		 		}
	}
	@Given("user is at Arrays in Python Page")
	public void user_is_at_arrays_in_python_page() {
	    String tittle = driver.getCurrentUrl();
	    log.info("Array in Python Page URL:"+tittle);
	}
	@When("user click on Try Here Button on Array in Python page")
	public void user_click_on_try_here_button_on_array_in_python_page() {
		apo.TryHereButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("user redirected to Assesment Page with Editor text box")
	public void user_redirected_to_assesment_page_with_editor_text_box() {
		String tittle = driver.getTitle();
		if (tittle.equals("Assesment")) {
		 log.info("User is at Array in Python Assesment Page"+tittle);
		 sa.assertTrue(true);
		}
	}
	@Then("user enter Python Code and Click run Button")
	public void user_enter_python_code_and_click_run_button() {
	   dsi.EditorBox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user navigate back to Array in Python")
	public void user_navigate_back_to_array_in_python() {
	   driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("user is at Array in Python page with {int} links")
	public void user_is_at_array_in_python_page_with_links(Integer int1) {
		String tittle = driver.getTitle();
		if (tittle.equals("Arrays in Python")) {
			sa.assertTrue(true);
			log.info("Arrays in Python:"+tittle);
		}
	}
	@When("user click on Arrays using List in Array page")
	public void user_click_on_arrays_using_list_in_array_page() {
	 apo.ArrayList();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user is redirected to Arrays using List page")
	public void user_is_redirected_to_arrays_using_list_page() {
		log.info("User is Array using List Page");
	}
	@Given("user is at Arrays using List Page")
	public void user_is_at_arrays_using_list_page() {
	    String tittle = driver.getTitle();
	    log.info("Array using list page tittle :"+tittle);
	}
	@When("user click on Try Here Button in Array using List page")
	public void user_click_on_try_here_button_in_array_using_list_page() {
	    apo.TryHereButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  
	}
	@Then("user navigate to Array using List Assesment Page")
	public void user_navigate_to_array_using_list_assesment_page() {
		log.info("User is at Array using List Page");		 
	}
	@Then("user enter Python Code in Array using list and Click run Button")
	public void user_enter_python_code_in_array_using_list_and_click_run_button() {
	    dsi.EditorBox();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	}
	@Then("user navigate back to Array using List")
	public void user_navigate_back_to_array_using_list() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("user is at Array using List")
	public void user_is_at_array_using_list() {
	   log.info("User is at Array using list page ");
	}

	@When("user click on Basic Operations in List in array page")
	public void user_click_on_basic_operations_in_list_in_array_page() {
		apo.BasicOperation();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user is at Basic Operations in List page")
	public void user_is_at_basic_operations_in_Array() {
		 log.info("Basic Operations in List page ");
	}
	@Given("user is at Basic Operations in List Page")
	public void user_is_at_basic_operations_in_list_page() {
		String tittle = driver.getTitle();
		 log.info("Basic Operations in List page tittle :"+tittle);
	}
	@When("user click on Try Here Button -Basic operation")
	public void user_click_on_try_here_button_basic_operation() {
		apo.TryHereButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user navigate to Assesment Page with run button")
	public void user_navigate_to_assesment_page_with_run_button() {
		dsi.EditorBox();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user is at Basic Operations in List page with {int} links")
	public void user_is_at_basic_operations_in_list_page_with_links(Integer int1) {
	    driver.navigate().back();
	    log.info("User is at Basic Operation In list page ");
	}

	@Given("user is at Basic Operations list")
	public void user_is_at_basic_operations_list() {
		apo.PracticeQuestion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
	}

	@Then("user is at Practice Question page with {int} links")
	public void user_is_at_practice_question_page_with_links(Integer int1) {
		String tittle = driver.getTitle();
		log.info("Practice Question page tittle:"+tittle);
		}
	@Given("user is at Practice Question")
	public void user_is_at_practice_question() {
	 log.info("User is at Practice Question Page");
	}
	@When("user click on Search the array")
	public void user_click_on_search_the_array() {
		apo.SearchTheArray();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user redirected to Assesment page of SearchArray with Run and Submit button")
	public void user_redirected_to_assesment_page_of_search_array_with_run_and_submit_button() {
	log.info("User is Assesment page of SearchArray");
	}

	@Then("user enters Python code in Search Array and click run and submit button")
	public void user_enters_python_code_in_search_array_and_click_run_and_submit_button() {
		dsi.EditorBox();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		apo.RunButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user redirected to Practice Question")
	public void user_redirected_to_practice_question() {
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is at Practice Question with MaxCO")
	public void user_is_at_practice_question_with_max_co() {
	
	}

	@When("user click on Max Consecutive Ones")
	public void user_click_on_max_consecutive_ones() {
		apo.MaxConsOnes();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user is at Assesment page in MaxCO with Editor Text box with Run and Submit button")
	public void user_is_at_assesment_page_in_max_co_with_editor_text_box_with_run_and_submit_button() {
		dsi.EditorBox();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		log.info("Assesment page in MaxCO");
			}

	@Then("user enters Python code in MaxCO and run and click submit button")
	public void user_enters_python_code_in_max_co_and_run_and_click_submit_button() {
		try {
		apo.RunButton();
		}catch (Exception e)
		{
			driver.navigate().back();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   apo.SignoutBut();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
	}

	@Then("user click Signout  button")
	public void user_click_signout_button() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   apo.SignoutBut();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
