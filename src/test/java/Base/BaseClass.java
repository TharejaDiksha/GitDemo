package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class BaseClass {

	Logger log = LogManager.getLogger("BaseClass.java");
	public static WebDriver driver;
	static ReadConfig config = new ReadConfig();
	
	public String baseurl = config.getApplicationURL();
	public String browser = config.getBrowserName();
	public String DDeditorBox = config.getEditorBox();
	//public String excelSheet = config.getExcelSheet();
	public static String screenshotdir = config.getscreenShotDir();
	//public static String screenshotdir = System.getProperty("user.dir")+"/Screenshots/";

	public void setUpDriver() {
		log.info("---------- Base Class - SetUpDriver Started ----------");

		log.info("Browser Type is: " + browser);
		log.info("Base URL is: " + baseurl);
		log.info("Screenshot Directory is: "+screenshotdir);



		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseurl);
		
		log.info("---------- Base Class - SetUpDriver Completed ----------");
	}

	public void tearDown() {
		log.info("---------- Base Class - teadDown Started ----------");
		driver.quit();
		log.info("---------- Base Class - teadDown Completed ----------");
	}
	
	public void captureScreenshot(WebDriver driver, String tName) throws IOException{
		log.info("Capturing Screenshot - "+tName);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(screenshotdir+tName+".png");
		FileUtils.copyFile(source, target);
		log.info("Screenshot taken - "+tName);
		
	}
}
