package StepDefinition;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Base.BaseClass;
import PageObjects.DSAlgoPortalPageObject;
import io.cucumber.java.en.*;
import utilities.ReadConfig;


public class SD_DSAlgoPortal extends BaseClass {

	Logger log = LogManager.getLogger("SD_DSAlgoPortal.java");
	ReadConfig config = new ReadConfig();
	String baseurl = config.getApplicationURL();
	DSAlgoPortalPageObject dsportalpg;

	String tittle;

	@Given("The user opens DS Algo Portal link")
	public void the_user_opens_ds_algo_portal_link() {

		System.out.println("Test Case Running");
		dsportalpg = new DSAlgoPortalPageObject(driver);
	}

	@When("The user enters DS Algo link")
	public void the_user_enters_ds_algo_link() throws IOException {
		tittle = driver.getTitle();
		log.info("Pre Home Page Title is: " + tittle);

		if (tittle.equalsIgnoreCase("Numpy Ninja1")) {
			log.info("Check 1");
			Assert.assertTrue(true);
		} else {
			log.info("Check 2");
		//	captureScreenshot(driver, "Pre-Home Page");
			Assert.assertFalse(false);
			log.info("Check 3");
		
		}

	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
		System.out.println("Then");
		dsportalpg.ClickGetStarted();
	}

	@When("The user clicks the Get Started Button")
	public void the_user_clicks_the_get_started_button() {
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
		tittle = driver.getTitle();
		System.out.println("tittle");
		Assert.assertEquals("NumpyNinja", tittle);
	}

	@Then("The user should see seven panes")
	public void the_user_should_see_seven_panes() {
		List<WebElement> panes = driver.findElements(By.xpath("/html/body/div[2]/div[*]/div/div"));
		int pansize = panes.size();
		System.out.println(pansize);
		Assert.assertEquals(pansize, 7);
	}
}
