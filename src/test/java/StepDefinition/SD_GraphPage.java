package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.GraphPageObject;
import PageObjects.HomePageObject;
import io.cucumber.java.en.*;

public class SD_GraphPage extends BaseClass {
	Logger log = LogManager.getLogger("SD_GraphPage.java");
	GraphPageObject gpo = new GraphPageObject(driver);
	SoftAssert SA = new SoftAssert();
	HomePageObject hpo = new HomePageObject(driver);
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	@Given("user is at Graph page {int} links")
	public void user_is_at_graph_page_links(Integer int1) {
	   String tittle = driver.getTitle();
	 if(tittle.equalsIgnoreCase("Graph")) {
		SA.assertTrue(true);
		log.info("Graph page tittle is :"+tittle);
	 }  else {
		 SA.assertTrue(false);
		 log.info("Graph page tittle is wrong");
	 }
	}

	@When("user clicks on Graph link")
	public void user_clicks_on_graph_link() {
	  gpo.GraphButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected on Graph Page with TryHere button")
	public void user_redirected_on_graph_page_with_try_here_button() {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Graph")) {
			SA.assertTrue(true);
			log.info("Link Graph page tittle is :"+tittle);
		 }  else {
			 SA.assertTrue(false);
			 log.info("Link Graph page tittle is wrong");} 
	}

	@Given("user is at Graph Page with {int} links")
	public void user_is_at_graph_page_with_links(Integer int1) {
	   String tittle = driver.getCurrentUrl();
	   log.info("The link Graph URL :"+tittle);
	}

	@When("user clicks Tryhere button")
	public void user_clicks_tryhere_button() {
	  gpo.TryHereButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@When("user redirected to Graph Assesment page")
	public void user_redirected_to_graph_assesment_page() {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Assesment")) {
			SA.assertTrue(true);
			log.info("Link Graph Assesment page tittle is :"+tittle);
	}}

	@Then("user enter Python Code in editor box")
	public void user_enter_python_code_in_editor_box() {
	   dsi.EditorBox();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}
	@Then("user Click run button")
	public void user_click_run_button() {
	   gpo.RunButton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Graph page")
	public void user_navigate_back_to_graph_page() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  	}

	@Given("user is at Graph page")
	public void user_is_at_graph_page() {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Graph")) {
			SA.assertTrue(true);
			log.info("Link Graph page tittle is :"+tittle);
		 }  else {
			 SA.assertTrue(false);
			 log.info("Link Graph page tittle is wrong");}
	}

	@When("user clicks Graph Representations link")
	public void user_clicks_graph_representations_link() {
	   gpo.GraphRepresentation();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Graph Representations page")
	public void user_redirected_to_graph_representations_page() {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Graph Representations")) {
			SA.assertTrue(true);
			log.info("Graph Representations page tittle is :"+tittle);
		 }  else {
			 SA.assertTrue(false);
			 log.info("Graph Representations page tittle is wrong");}
	}

	@Given("user is at Graph Representations page")
	public void user_is_at_graph_representations_page() {
	 String tittle = driver.getCurrentUrl();
	 log.info("Graph Representations URL :"+tittle);
	}

	@When("user click Tryhere Button on Graph Representations page")
	public void user_click_tryhere_button_on_graph_representations_page() {
	   gpo.TryHereButton();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Assesment Page")
	public void user_redirected_to_assesment_page() {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Assesment")) {
			SA.assertTrue(true);
			log.info("Graph Representations Assesment page tittle is :"+tittle);
			}
	}

	@Given("user is at Assesment Page with editor box and run button")
	public void user_is_at_assesment_page_with_editor_box_and_run_button() {
	   String tittle = driver.getCurrentUrl();
	   log.info("Graph Representation Assesemnet URL "+tittle);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user navigate back to Graph Representations page")
	public void user_navigate_back_to_graph_representations_page() {
	   driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Given("user is at Graph Representations page with {int} links")
	public void user_is_at_graph_representations_page_with_links(Integer int1) {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Graph Representations")) {
			SA.assertTrue(true);
			log.info("Graph Representations page tittle is :"+tittle);
		 }  else {
			 SA.assertTrue(false);
			 log.info("Graph Representations page tittle is wrong");}  
	}

	@When("user clicks Practice Question")
	public void user_clicks_practice_question() {
	    gpo.PracticeQuestion();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@When("user redirected to Practice Question Page")
	public void user_redirected_to_practice_question_page() {
		String tittle = driver.getTitle();
		 if(tittle.equalsIgnoreCase("Practice Question")) {
			SA.assertTrue(true);
			log.info("Practice Question page tittle is :"+tittle);
		 }  else {
			 SA.assertTrue(false);
			 log.info("Practice Question page tittle is wrong");}
	}

	@Then("user select Linked List from DropDown")
	public void user_select_linked_list_from_drop_down() {
	   driver.navigate().back();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   hpo.DropDown();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   hpo.DDLinkedLIst();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
}
