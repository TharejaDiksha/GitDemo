package Hooks;

import java.io.ByteArrayInputStream;
import java.io.File;
import utilities.GetScreenshot;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
public class DSAlgoHooks extends BaseClass {
	Scenario scn;

	@Before("@driversetup")
	public void browserSetUp() throws IOException, InterruptedException
	{
		System.out.println("Before Hooks");
		setUpDriver();
		
	}
	
//	@After
//	public void browserTearDown() { 
//
//		System.out.println("After Hooks ");
//		tearDown();
//
//	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) throws IOException
	{
		if (scenario.isFailed())
		{
			//scenario.attach(GetScreenshot.getByteScreenshot(), "image/png", "Test");
			//Allure.addAttachment("Error Screenshot", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}
	}

}
