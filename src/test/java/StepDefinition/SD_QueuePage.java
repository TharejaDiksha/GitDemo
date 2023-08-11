package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.HomePageObject;
import PageObjects.QueuePageObject;
import io.cucumber.java.en.*;

public class SD_QueuePage extends BaseClass {
	Logger log = LogManager.getLogger("SD_QueuePage.java");
	QueuePageObject qpo = new QueuePageObject(driver);
	HomePageObject hpo = new HomePageObject(driver);
	SoftAssert SA = new SoftAssert();
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	
	
	@Given("user is at Queue page with {int} Links")
	public void user_is_at_queue_page_with_links(Integer int1) {
	   String tittle = driver.getTitle();
	   log.info("Queue page Tittle is :"+tittle);
//	   if (tittle.equals("Queue")) {
//		   SA.assertTrue(true);
//		   log.info("Queue page Tittle is :"+tittle);
//	   }else
//	   { SA.assertTrue(false);
//	   log.info("Queue Page is not matched");
//	   }
	}

	@When("user click on Implementation of Queue in python")
	public void user_click_on_implementation_of_queue_in_python() {
		qpo.PythonQueue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation of Queue in python page with TryHere button")
	public void user_redirected_to_implementation_of_queue_in_python_page_with_try_here_button() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Implementation of Queue in Python")) {
			   SA.assertTrue(true);
			   log.info("Python Queue page Tittle is :"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Python Queue Page is not matched");
		   } 
	}

	@Then("user click on Try Here button on Implementation of Queue in python page")
	public void user_click_on_try_here_button_on_implementation_of_queue_in_python_page() {
	  qpo.TryHereBut();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation of Queue in Python Assesment page")
	public void user_redirected_to_implementation_of_queue_in_python_assesment_page() {
		String tittle = driver.getTitle();
		log.info("Python Queue Assesment page Tittle is :"+tittle);
//		   if (tittle.equals("Assesment")) {
//			   SA.assertTrue(true);
//			   log.info("Python Queue Assesment page Tittle is :"+tittle);
//		   }else
//		   { SA.assertTrue(false);
//		   log.info("Python Queue Assesment Page is not matched");
//		   } 
	}

	@Given("user is at Assesment page with editor box")
	public void user_is_at_assesment_page_with_editor_box() {
	  String tittle = driver.getCurrentUrl();
	  log.info("Python Queue Assesment Url:"+tittle);
	}

	@When("user enter Python command in editor box")
	public void user_enter_python_command_in_editor_box() {
	    dsi.EditorBox();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user click Run button Implementation of Queue")
	public void user_click_run_button_implementation_of_queue() {
	   qpo.RunBut();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Implementation of Queue in python page")
	public void user_navigate_back_to_implementation_of_queue_in_python_page() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is at Implementation of Queue in python page")
	public void user_is_at_implementation_of_queue_in_python_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Implementation of Queue in Python")) {
			   SA.assertTrue(true);
			   log.info("Python Queue page Tittle is :"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Python Queue Page is not matched");
		   } 
		}

	@When("user click Implementation using collections.deque")
	public void user_click_implementation_using_collections_deque() {
	qpo.deQueCollect();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation using collections.deque page")
	public void user_redirected_to_implementation_using_collections_deque_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Implementation using collections.deque")) {
			   SA.assertTrue(true);
			   log.info("Collection.deque page tittle is :"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Collection.deque Page tittle is not matched");
		   } 
	}

	@Then("user click TryHere button on Implementation using collections.deque page")
	public void user_click_try_here_button_on_implementation_using_collections_deque_page() {
	    qpo.TryHereBut();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation using collections.deque Assesment page")
	public void user_redirected_to_implementation_using_collections_deque_assesment_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Assesment")) {
			   SA.assertTrue(true);
			   log.info("Collection.deque Assesment page tittle is :"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Collection.deque Assesment page tittle is not matched");
		   } 
 	}

	@Given("user is at Implementation using collection Assesment page with editor box")
	public void user_is_at_implementation_using_collection_assesment_page_with_editor_box() {
	  String tittle = driver.getCurrentUrl();
	  log.info("Implementation using collection Assesment page URL"+tittle);
	}

	@When("user enter Python code in editor box")
	public void user_enter_python_code_in_editor_box() {
	   dsi.EditorBox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user click run button of Implementation using collection")
	public void user_click_run_button_of_implementation_using_collection() {
	 qpo.RunBut(); 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Implementation using collections.deque page")
	public void user_navigate_back_to_implementation_using_collections_deque_page() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is at Implementation using collections.deque page")
	public void user_is_at_implementation_using_collections_deque_page() {
	 String tittle = driver.getCurrentUrl();
	 log.info("Implementation using collections.deque"+tittle);
	}

	@When("user click Implementation using Array")
	public void user_click_implementation_using_array() {
	   qpo.ArrayImpl();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation using Array page")
	public void user_redirected_to_implementation_using_array_page() {
//		String tittle = driver.getTitle();
//		   if (tittle.equals("Implementation using Array")) {
//			   SA.assertTrue(true);
//			   log.info("Implementation using Array tittle is :"+tittle);
//		   }else
//		   { SA.assertTrue(false);
//		   log.info("Implementation using Array tittle is not matched");
//		   }   
	}

	@Then("user click TryHere button Implementation using Array page")
	public void user_click_try_here_button_implementation_using_array_page() {
	   qpo.TryHereBut();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Implementation using Array Assesment page")
	public void user_redirected_to_implementation_using_array_assesment_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Assesment")) {
			   SA.assertTrue(true);
			   log.info("Implementation using Array Assesment page:"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Implementation using Array Assesment page tittle is not matched");
		   }   
	}

	@Given("user is at Implementation using Array Assesment page with run button")
	public void user_is_at_implementation_using_array_assesment_page_with_run_button() {
	    String tittle = driver.getCurrentUrl();
	    log.info("Implementation using Array Assesment URL:"+tittle);
	}

	@When("user enter Python code")
	public void user_enter_python_code() {
	 dsi.EditorBox();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user click run button of Implementation using Array")
	public void user_click_run_button_of_implementation_using_array() {
	qpo.RunBut();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Implementation using Array page")
	public void user_navigate_back_to_implementation_using_array_page() {
	driver.navigate().back();   
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is at Implementation using Array page")
	public void user_is_at_implementation_using_array_page() {
	log.info("Implementation using Array page tittle"+driver.getTitle());  
	}

	@When("user click Queue Operations")
	public void user_click_queue_operations() {
	   qpo.QueueOperat();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to  Queue Operations page")
	public void user_redirected_to_queue_operations_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Queue Operations")) {
			   SA.assertTrue(true);
			   log.info("Queue Operations page tittle:"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Queue Operations page tittle is not matched");
		   }   
	}

	@Then("user click Try Here button Queue Operations page")
	public void user_click_try_here_button_queue_operations_page() {
	   qpo.TryHereBut();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Queue Operations Assesment page")
	public void user_redirected_to_queue_operations_assesment_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Assesment")) {
			   SA.assertTrue(true);
			   log.info("Queue Operations Assesment page tittle:"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Queue Operations Assesment page tittle is not matched");
		   }      
	}

	@Given("user is at Queue Operations Assesment page")
	public void user_is_at_queue_operations_assesment_page() {
	    String tittle = driver.getCurrentUrl();
	    log.info("Queue Operations Assesment page URL:"+tittle);
	}

	@When("user enter Python command and click run button")
	public void user_enter_python_command_and_click_run_button() {
	   dsi.EditorBox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Queue Operation page")
	public void user_navigate_back_to_queue_operation_page() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is at Queue Operation page")
	public void user_is_at_queue_operation_page() {
		String tittle = driver.getTitle();
		   if (tittle.equals("Queue Operation")) {
			   SA.assertTrue(true);
			   log.info("Queue Operations tittle:"+tittle);
		   }else
		   { SA.assertTrue(false);
		   log.info("Queue Operations tittle is not matched");
		   }      
	}

	@When("user click on Practice Question")
	public void user_click_on_practice_question() {
		qpo.PracticeQuestion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Practice Question page")
	public void user_redirected_to_practice_question_page() {
		log.info("Parctice Question2 URL"+driver.getCurrentUrl());
	}

	@Given("user is at Practice Question page")
	public void user_is_at_practice_question_page() {
	   String tittle = driver.getCurrentUrl();
	   log.info("Practice Question Page URL "+tittle);
	}

	@When("user navigate back to Queue Operation page after Practice Question")
	public void user_navigate_back_to_queue_operation_page_after_practice_question() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user click dropdown DataStructure and select Garph")
	public void user_click_dropdown_data_structure_and_select_garph() {
	    hpo.DropDown();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		hpo.DDGraph();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}
	
}
