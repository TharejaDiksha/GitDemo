package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.HomePageObject;
import io.cucumber.java.en.*;

public class SD_DataStructureIntro extends BaseClass {
	Logger log = LogManager.getLogger("SD_DataStructureIntro.java");
	SoftAssert sa= new SoftAssert();
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	HomePageObject homepage = new HomePageObject(driver);
	
	@Given("User is at Home Page")
	public void user_is_at_home_page() {
	String Tittle = driver.getTitle();
	log.info("Tittle before click GetStarted button below DSI:" +Tittle);
	}

	@When("user click Get Started Button below DataStructure-Introduction")
	public void user_click_get_started_button_below_data_structure_introduction() {
		dsi.DSIClickButton(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user is at DataStructure-Introduction Page")
	public void user_is_at_data_structure_introduction_page1() {
	String Tittle = driver.getTitle();
	log.info("Tittle After click GetStarted button below DSI:" +Tittle);
	}

	@Given("user is at DataStructure-Introduction Page with 2 links")
	public void user_is_at_data_structure_introduction_page() {
	 String Tittle = driver.getTitle();
	 if(Tittle.equalsIgnoreCase("Data Structures-Introduction")) {
		
		 //sa.assertTrue(true);
		 log.info("Test Passed");
		 Assert.assertTrue(true);
	 }else {
		// sa.assertTrue(false);
		 log.info("Test Failed");
		 Assert.assertTrue(false);
	 }
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user click Time Complexity Button")
	public void user_click_time_complexity_button() {
		dsi.DsTimeComplexity();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	}

	@Then("user redirected to Time Complexity Of DataStructure-Introduction")
	public void user_redirected_to_time_complexity_of_data_structure_introduction() {
	   String Tittle = driver.getTitle();
	   if (Tittle.equals("Time Complexity1")){
	   sa.assertTrue(true);
	   log.info("Test passed -  User is on Time Complexity Page");
	   }else {
		   sa.assertTrue(false);
		   log.info("Page tittle is not Time Complexity");
	   }
	 }

	@Given("user is at Time Complexity page")
	public void user_is_at_time_complexity_page() {
	   String tittle = driver.getCurrentUrl();
	   log.info("Current URL is "+tittle);
	}

	@When("user click Practice Question button")
	public void user_click_practice_question_button() {
	 dsi.DsPracticeQues();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	}

	@Then("user Redirected to Practice Question page")
	public void user_redirected_to_practice_question_page() {
		String tittle = driver.getTitle();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    log.info("Page tittle is :"+tittle);
	   // driver.navigate().back();
	}

	@Then("user navigate back to Time Complexity page")
	public void user_navigate_back_to_time_complexity_page() {
		String tittle = driver.getTitle(); 
		if(tittle.equals("Practice Questions")){
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}  else {
		sa.assertTrue(false);
		}
		}
	@When("user click on Try Here Button")
	public void user_click_on_try_here_button() {
		dsi.DsTryHere();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@Then("user redirected to Assesment page with Run Button to test")
	public void user_redirected_to_assesment_page_with_run_button_to_test() {
		dsi.EditorBox();
		dsi.DsRunButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	}

	@Then("user navigate back to Data Structure Home page")
	public void user_navigate_back_to_data_structure_home_page() {
		driver.navigate().back(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().back(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//homepage.ClickArrayGetStarted();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	   
	}

}
