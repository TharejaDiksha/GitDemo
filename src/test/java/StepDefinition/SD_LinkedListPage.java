package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.ArrayPageObject;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.HomePageObject;
import PageObjects.LinkedListPageObject;
import io.cucumber.java.en.*;

public class SD_LinkedListPage extends BaseClass {
	Logger log = LogManager.getLogger("SD_LinkedListPage.java");
	ArrayPageObject apo = new ArrayPageObject(driver);
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	SoftAssert sa = new SoftAssert();
	HomePageObject hpo = new HomePageObject(driver);
	LinkedListPageObject llp = new LinkedListPageObject(driver);
	
	@Given("user is at Linked List page with {int} links")
	public void user_is_at_linked_list_page_with_links(Integer int1) {
	    String tittle = driver.getTitle();
	log.info("Linked List tittle :"+tittle);    
	}

	@When("user 	clicks on Introduction")
	public void user_clicks_on_introduction() {
	    llp.Introduction();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user redirected to Introduction page with {int} links")
	public void user_redirected_to_introduction_page_with_links(Integer int1) {
		 String tittle = driver.getTitle();
			log.info("Introduction tittle :"+tittle); 
	}

	@Given("user is at Introduction page with TryHere button")
	public void user_is_at_introduction_page_with_try_here_button() {
		String tittle = driver.getTitle();
		if (tittle.equalsIgnoreCase("Introduction"))
		{
		sa.assertTrue(true);
		log.info("Introduction tittle :"+tittle); 
		}else {
			sa.assertTrue(false);
			log.info("Introduction tittle is Incorrect"); 
		}
	}

	@When("user clicks on TryHere button on Introduction page")
	public void user_clicks_on_try_here_button_on_introduction_page() {
	    llp.TryHere();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user redirected to Introduction Assesment page")
	public void user_redirected_to_introduction_assesment_page() {
		String tittle = driver.getTitle();
		if (tittle.equalsIgnoreCase("Assesment"))
		{
		sa.assertTrue(true);
		log.info("Introduction Assesment page tittle :"+tittle); 
		}else {
			sa.assertTrue(false);
			log.info("Introduction Assesment page tittle is Incorrect"); 
		}
	}
	@Given("user is at Introduction Assesment page with run button")
	public void user_is_at_introduction_assesment_page_with_run_button() {
		log.info("User is at Introduction  Assesmentpage");   
	}

	@When("user enter python command in Editor box")
	public void user_enter_python_command_in_editor_box() {
		dsi.EditorBox();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("submit run button")
	public void submit_run_button() {
		llp.RunButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user navigate back to Introduction page")
	public void user_navigate_back_to_introduction_page() {
	    driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("user is at Introduction page")
	public void user_is_at_introduction_page() {
	 System.out.println("User is at Introduction page");  
	}

	@When("user click Creating Linked List")
	public void user_click_creating_linked_list() {
	    llp.CreateLinkedList();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Creating Linked List page")
	public void user_redirected_to_creating_linked_list_page() {
		String tittle = driver.getTitle();
		if (tittle.equalsIgnoreCase("Creating Linked List"))
		{
		sa.assertTrue(true);
		log.info("Creating Linked List page tittle :"+tittle); 
		}else {
			sa.assertTrue(false);
			log.info("Creating Linked List page tittle is Incorrect"); 
		}
	}

	@Given("user is at Creating Linked List page with TryHere button")
	public void user_is_at_creating_linked_list_page_with_try_here_button() {
		llp.TryHere();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		log.info("User is at Creating Linked List page"); 
	}

	@When("user enter python command in Editor box with run")
	public void user_enter_python_command_in_editor_box_with_run() {
	  // llp.LLEdibox();
		dsi.EditorBox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   llp.RunButton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	@Then("user navigate back to Creating Linked List page")
	public void user_navigate_back_to_creating_linked_list_page() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("user is at Creating Linked List page")
	public void user_is_at_creating_linked_list_page() {
	    log.info("User is at Creating Linked List page");
	}

	@When("user clicks at Deletion")
	public void user_clicks_at_deletion() {
	   llp.Deletion();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user redirected to Deletion page")
	public void user_redirected_to_deletion_page() {
		String tittle = driver.getTitle();
		if (tittle.equalsIgnoreCase("Deletion"))
		{
		sa.assertTrue(true);
		log.info("Deletion page tittle :"+tittle); 
		}else {
			sa.assertTrue(false);
			log.info("Deletion page tittle is Incorrect"); 
		}
	}
	@Given("user is at Deletion page with Tryhere button")
	public void user_is_at_deletion_page_with_tryhere_button() {
	  log.info("User is at Deletion page");
	}

	@When("user redirected to Assesment page with run button")
	public void user_redirected_to_assesment_page_with_run_button() {
	   llp.TryHere();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user enter Python code in editor box and click run button")
	public void user_enter_python_code_in_editor_box_and_click_run_button() {
	  dsi.EditorBox();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user naviagte back to Deletion page")
	public void user_naviagte_back_to_deletion_page() {
	   driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Given("user is at Deletion page")
	public void user_is_at_deletion_page() {
	  log.info("User is at Deletion page");
	}

	@When("user clicks Practice Questions")
	public void user_clicks_practice_questions() {
	   llp.PracticeQuestion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Then("user redirected to Practice Questions page")
	public void user_redirected_to_practice_questions_page() {
	    
	}

	@Then("user navigate back to Deletion page")
	public void user_navigate_back_to_deletion_page() {
	   driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user select Tree from DropDown")
	public void user_select_tree_from_drop_down() {
		hpo.DropDown();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hpo.DDTree();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
