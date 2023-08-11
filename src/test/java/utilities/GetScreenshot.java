package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseClass;

public class GetScreenshot extends BaseClass {
	public static String getBase64Screenshot() throws IOException {

		String Base64StringScreenshot = "";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMYYYY_HHmmss");
		String sDate = sdf.format(date);
		FileUtils.copyFile(src, new File(screenshotdir + "image_" + sDate + ".png"));

		byte[] fileContent = FileUtils.readFileToByteArray(src);
		Base64StringScreenshot = "data:image/png;base64," + Base64.getEncoder().encodeToString(fileContent);
		return Base64StringScreenshot;

	}
	
	public static byte[] getByteScreenshot() throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent = FileUtils.readFileToByteArray(src);
		return fileContent;
		
	}

}
