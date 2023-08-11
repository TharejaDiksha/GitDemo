package StepDefinition;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.asserts.SoftAssert;

import Base.BaseClass;
import PageObjects.DataStructureIntroPageObject;
import PageObjects.HomePageObject;
import PageObjects.LinkedListPageObject;
import PageObjects.TreePageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SD_TreePage extends BaseClass {
	Logger log = LogManager.getLogger("SD_TreePage.java");
	TreePageObject tpo = new TreePageObject(driver);
	HomePageObject hpo = new HomePageObject(driver);
	DataStructureIntroPageObject dsi = new DataStructureIntroPageObject(driver);
	SoftAssert SA= new SoftAssert();
	LinkedListPageObject llp = new LinkedListPageObject(driver);
	

@Given("user is at Tree page with {int} links")
public void user_is_at_tree_page_with_links(Integer int1) {
	  String tittle= driver.getTitle();
	  if(tittle.equalsIgnoreCase("Tree")) {
		  SA.assertTrue(true);
		  log.info("Tree page tittle is:"+tittle);
	  }else {
		  SA.assertTrue(false);
		  log.info("Tree page Tittle is Incorrect");
	  	}

}

@When("user clicks on Overview Of Tree")
public void user_clicks_on_overview_of_tree() {
tpo.TreeOverview();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Then("user redirected to Overview Of Tree page")
public void user_redirected_to_overview_of_tree_page() {
	  String tittle= driver.getTitle();
	  if(tittle.equalsIgnoreCase("Overview of Tree")) {
		  SA.assertTrue(true);
		  log.info("Tree page tittle is:"+tittle);
	  }else {
		  SA.assertTrue(false);
		  log.info("Tree page Tittle is Incorrect");
	  	}

}

@Given("user is at Overview Of Tree page with TRyHere button")
public void user_is_at_overview_of_tree_page_with_t_ry_here_button() {
      
}

@When("user clicks Tryhere button on Overview Of Tree page")
public void user_clicks_tryhere_button_on_overview_of_tree_page() {
tpo.TryHere();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Then("user redirected to Overview Of Tree Assesment page")
public void user_redirected_to_overview_of_tree_assesment_page() {

}

@Then("user enters Python code and click Runbutton")
public void user_enters_python_code_and_click_runbutton() {
dsi.EditorBox();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
tpo.RunButton();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Then("user navigate back to Overview Of Tree page")
public void user_navigate_back_to_overview_of_tree_page() {
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Given("user is at Overview Of Tree page")
public void user_is_at_overview_of_tree_page() {

}

@When("user click on Types of Trees")
public void user_click_on_types_of_trees() {
tpo.TreeTypes();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Then("user redirected to Types of Trees page")
public void user_redirected_to_types_of_trees_page() {
	  String tittle= driver.getTitle();
	  if(tittle.equalsIgnoreCase("Types of Trees")) {
		  SA.assertTrue(true);
		  log.info("Tree page tittle is:"+tittle);
	  }else {
		  SA.assertTrue(false);
		  log.info("Tree page Tittle is Incorrect");
	  	}

}

@Given("user is at Types of Trees page with tryhere button")
public void user_is_at_types_of_trees_page_with_tryhere_button() {

}

@When("user click Tryhere Button Types of Trees page")
public void user_click_tryhere_button_types_of_trees_page() {
tpo.TryHere();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Then("user redirected to Types of Trees Assesment page")
public void user_redirected_to_types_of_trees_assesment_page() {
   dsi.EditorBox();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Given("user is at Types of Trees Assesment page with TryHere button")
public void user_is_at_types_of_trees_assesment_page_with_try_here_button() {
   tpo.RunButton();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@When("user clicks Tryhere at Types of Trees page")
public void user_clicks_tryhere_at_types_of_trees_page() {
//tpo.TryHere();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Then("user redirected to TypesTree Assesment page")
public void user_redirected_to_types_tree_assesment_page() {

}
@Then("user enter Python command")
public void user_enter_python_command() {
//dsi.EditorBox();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Then("user navigate back to  Types of Trees page")
public void user_navigate_back_to_types_of_trees_page() {
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Given("user is at Types of Trees page")
public void user_is_at_types_of_trees_page() {

}

@When("user navigate back to Types of Trees page")
public void user_navigate_back_to_types_of_trees_page1() {
	tpo.PracticeQues();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@Then("user click Array from Dropdown")
public void user_click_array_from_dropdown() {
    hpo.DropDown();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    hpo.DDArray();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}
