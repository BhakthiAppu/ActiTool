package com.actitime.scripts;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners  extends ValidLogin implements ITestListener{


	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	String d=dateFormat.format(date);
	
	
	@Override
	public void onFinish(ITestContext result) {
	
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result
			) {	
	try
	{
		System.out.println("The test case execution of "
				+result.getName()+ "is Failed");
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Robot r=new Robot();
		Rectangle screnRect=new Rectangle(d);
		BufferedImage img=r.createScreenCapture(screnRect);
		ImageIO.write(img,"jpg", new File("./screenshots/"+d+".jpg"));
		
		
	}
catch(Exception e)
{
}
	
}
	
	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The test case execution of "
				+result.getName()+ "is Started");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		try
		{
			String a=arg0.getName();
			System.out.println("Passed");

			TakesScreenshot	tc=(TakesScreenshot)driver;
			
			File srcfile=tc.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(srcfile, new File("./screenshots/"+arg0.getName()+".png"));
					
			
		}
	catch(Exception e)
	{
	}
		
		
	}

}
