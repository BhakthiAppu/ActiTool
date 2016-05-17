package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {

	@FindBy(name="firstname")
	WebElement fName;
	
	@FindBy(name="lastname")
	WebElement sName;
	
	@FindBy(name="reg_email__")
	WebElement emailAdrrs;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement confirmEmailAddrs;
	
	@FindBy(name="reg_passwd__")
	WebElement pwd;
	
	@FindBy(id="day")
	WebElement dobday;
	
	@FindBy(id="month")
	WebElement dobmonth;
	
	@FindBy(id="year")
	WebElement dobyear;
	
	@FindBy(xpath="//label[contains(text(),'Female')]")
	WebElement gender;
	
	@FindBy(xpath="//button[contains(text(),'Create an account')]")
	WebElement createbtn;
	
	
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void setFirstname()
	{
		fName.sendKeys("Shree");
	}
	
	
	public void setSurname()
	{
		sName.sendKeys("Jain");
	}
	
	public void setEmailAddress()
	{
		emailAdrrs.sendKeys("shree@gmail.com");
	}
	
	public void serConfirmEmailAddress()
	{
		confirmEmailAddrs.sendKeys("shree@gmail.com");
	}
	
	
	
	
	public void setPassword()
	{
		pwd.sendKeys("nammaBangalore");
	}
	
	public void selectBirthDay()
	{
		Select se=new Select(dobday);
		
		se.selectByVisibleText("7");
	}
	
	public void selectBirthMonth()
	{
		Select se=new Select(dobmonth);
		
		se.selectByVisibleText("Jan");
	}
	public void selectBirthYear()
	{
		Select se=new Select(dobyear);
		
		se.selectByVisibleText("1987");
	}
	public void selectGender()
	{
		gender.click();
	}
	
	public void clickonCreateAccountBtn()
	{
		createbtn.click();
	}
}
