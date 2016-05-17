package com.actitime.scripts;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.internal.Utils;

import com.actitime.pages.SignUpPage;
import com.acttitime.utility.ScrrenshotCapture;
@Listeners(com.actitime.scripts.CustomListeners.class)

public class ValidLogin {
	

	WebDriver driver;
	
	
	@Test
	
	public void testValid() throws IOException, InterruptedException
	{
	
	 driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	
	driver.manage().window().maximize();
SignUpPage sup=new SignUpPage(driver);
	
	sup.setFirstname();
	sup.setSurname();
	sup.setEmailAddress();
	sup.serConfirmEmailAddress();
	sup.setPassword();
	
	sup.selectBirthDay();
	sup.selectBirthMonth();
	sup.selectBirthYear();
	sup.selectGender();
	
	Thread.sleep(1000);
	sup.clickonCreateAccountBtn();
	
	
	


	}
	

}
