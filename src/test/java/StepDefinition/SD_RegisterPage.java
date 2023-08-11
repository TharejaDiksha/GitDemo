package StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import Base.BaseClass;
import PageObjects.RegisterPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelDataDriven;

public class SD_RegisterPage extends BaseClass {

	Logger log = LogManager.getLogger("SD_RegisterPage.java");
	ExcelDataDriven d = new ExcelDataDriven();
	RegisterPageObject rp = new RegisterPageObject(driver);
	ArrayList<String> data;
	String title;

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		// rp=new RegisterPage(driver);
		title = driver.getTitle();
		System.out.println("Registration Page tittle is :" + title);
		Assert.assertEquals("Registration", title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user clicks Register Button")
	public void user_clicks_register_button() {
		rp.clickRegBut();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("Alert message display at username - Please fill out this field")
	public void alert_message_display_at_username_please_fill_out_this_field() {
//	     String alertMsg = driver.switchTo().alert().getText();
//	     System.out.println("The alert message  is :"+ alertMsg);
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user enter username")
	public void user_enter_username() throws IOException {
		data = d.dataDriven("Register1");
		rp.setUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(1));
	}

	@Then("Alert message dispaly at Password - Please fill out this field")
	public void alert_message_dispaly_at_password_please_fill_out_this_field() {
//		 String alertMsg = driver.switchTo().alert().getText();
//	     System.out.println("The alert message  is :"+ alertMsg);
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user enter username and passwaord")
	public void user_enter_username_and_passwaord() throws IOException {
		data = d.dataDriven("Register1");
		System.out.println("Index0:- " + data.get(1));
		System.out.println("Index1:- " + data.get(2));
		rp.setUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.setPassword(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Then("Alert message display at Password confirm - Please fill out this field")
	public void alert_message_display_at_password_confirm_please_fill_out_this_field() {
//		String alertMsg = driver.switchTo().alert().getText();
//	     System.out.println("The alert message  is :"+ alertMsg);
//	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user enter invalid password and passd confimation")
	public void user_enter_invalid_password_and_passd_confimation() throws IOException {
		data = d.dataDriven("Register2");
		System.out.println("Index00:- " + data.get(1));
		System.out.println("Index11:- " + data.get(2));
		rp.setUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.setPassword(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(1));
//		driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get(2));
	}

	@Then("Message should display an error message-password_mismatch-The two password fields didn’t match")
	public void message_should_display_an_error_message_password_mismatch_the_two_password_fields_didn_t_match() {
//		Alert alertMsg = driver.switchTo().alert();
//		 rp.msgDisplayWin();
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		 alertMsg.dismiss();// alert check you password 
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		 alertMsg.dismiss();//alert save and never password click
//		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user enter password with only numbers")
	public void user_enter_password_with_only_numbers() throws IOException {
		data = d.dataDriven("Register3");
		System.out.println("Index000:- " + data.get(1));
		System.out.println("Index111:- " + data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.setPassword(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(1));
		// driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get(2));
	}

	@Then("Alert message diplay - check password")
	public void alert_message_diplay_check_password() {
//		String alertMsg = driver.switchTo().alert().getText();
//	    System.out.println("The alert message  is :"+ alertMsg);
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@When("user enter correct username and password")
	public void user_enter_correct_username_and_password() throws IOException {
		data = d.dataDriven("Register1");
		// driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(1));
		// driver.findElement(By.xpath("//input[@name='password1']")).sendKeys(data.get(2));
		System.out.println("Index0000:- " + data.get(1));
		System.out.println("Index1111:- " + data.get(2));
		System.out.println("Index2222:- " + data.get(3));
		rp.setUserName(data.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.setPassword(data.get(2));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.setConfPassd(data.get(3));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rp.clickRegBut();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// rp.signOutBut();
	}

	@Then("user redirected to register homepage")
	public void user_redirected_to_register_homepage() {
		String title = driver.getTitle();
		System.out.println("The Page title is " + title);
		// Assert.assertEquals("NumpyNinja", title);
	}

	@Then("message display - New Account created.You are logged in as<username>")
	public void message_display_new_account_created_you_are_logged_in_as_username() throws Exception{
		String pageMsg = rp.msgDisplayWin();
		String successReg = "New Account Created. You are logged in as " + data.get(1);
		String title = driver.getTitle();
		System.out.println("Registration Page tittle is :" + title);
		// Assert.assertEquals("NumpyNinja", driver.getTitle());
		log.info("Page Message is: " + pageMsg);
		log.info("Success Message is: " + successReg);
//try
//{
		if (pageMsg.equalsIgnoreCase(successReg)) {
			log.info("Trying to click SignOut");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			rp.signOutBut();
		} else {
			log.info("Cannot SignOut");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			throw new Exception();
		}
//}catch (Exception e)
//{
//	//tearDown();
//}

	}
}
