package com.actitime.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.scripts.CustomListeners.class)
public class OrangeHRM {
//browser open
@Test
public void  validateLogin()
{
	
	WebDriver dr=new FirefoxDriver();
	dr.get("http://opensource.demo.orangehrm.com");
	dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	dr.manage().window().maximize();
	dr.findElement(By.id("txtUsername")).clear();
	dr.findElement(By.id("txtUsername")).sendKeys("admin");
	dr.findElement(By.id("txtPassword")).sendKeys("admin");
	
	dr.findElement(By.id("btnLogin")).click();
	
	String actualWelcome= dr.findElement(By.id("welcome")).getText();
	System.out.println(actualWelcome);
	String expectedWelcome="Welcome Admin";
	Assert.assertEquals(actualWelcome, expectedWelcome);
}
	
	
	
}
