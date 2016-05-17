package com.acttitime.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class ScrrenshotCapture{

	
	public static void CaptureScreenshots(WebDriver driver) throws IOException
	{
		
			
	
		TakesScreenshot	tc=(TakesScreenshot)driver;
		
		File srcfile=tc.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(srcfile, new File("./screenshots/aaaaaaa.png"));
	}
}

