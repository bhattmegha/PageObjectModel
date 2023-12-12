package com.ultimateqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ultimateqa.base.TestBase;

public class LoginPage extends TestBase{
	
	
	@FindBy(id = "user[email]")
	WebElement useremail;
	
	@FindBy(id = "user[password]")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(css = "a.form__forgot-password")
	WebElement forgotpassword;

	@FindBy(id = "user[remember_me]")
	WebElement Rememberme;
	
	@FindBy(css = ".sign-in__sign-up")
	WebElement Signup;
	
	//initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public String ValidateLoginOageTitle() {
		return driver.getTitle();
	}
	
	public void Login(String username, String pwd) {
		useremail.sendKeys(username);
		password.sendKeys(pwd );
		loginbtn.click();
		
	}
	
	public SignUpPage clickonCreateAccount() {
		Signup.click();
		return new SignUpPage();
	}
}
