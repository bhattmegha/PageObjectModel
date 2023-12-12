package com.ultimateqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ultimateqa.base.TestBase;

public class SignUpPage extends TestBase{
	
	@FindBy(id = "user[first_name]")
	WebElement FName;
	
	@FindBy(id = "user[last_name]")
	WebElement LName;
	
	@FindBy(id ="user[email]")
	WebElement mail;
	
	@FindBy(id = "user[password]")
	WebElement Pass;
	
	@FindBy(id ="user[terms]")
	WebElement checkbox;
	
	@FindBy(css = ".button.button-primary.g-recaptcha")
	WebElement Signupbutton;
	
	
	//initializing page objects
		public SignUpPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		//Actions to be performed on this page
		
		public String VerifySignUpPageTitle() {
		return	driver.getTitle();
		}
		
		
		public void SignUp(String FirstName, String LastName, String Email, String Password) {
			FName.sendKeys(FirstName);
			LName.sendKeys(LastName);
			mail.sendKeys(Email);
			Pass.sendKeys(Password);
			checkbox.click();
			Signupbutton.click();
		}
		
		
}
