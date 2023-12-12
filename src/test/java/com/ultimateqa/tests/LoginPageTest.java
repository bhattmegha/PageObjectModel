package com.ultimateqa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ultimateqa.base.TestBase;
import com.ultimateqa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	
	public LoginPageTest() {
		super();   //calling super class i.e, Base class constructor
	}
	
	@BeforeMethod()
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		
		
	}
	
	
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String Title = loginPage.ValidateLoginOageTitle();
		Assert.assertEquals(Title, "Sign In - Ultimate QA");
	}
	
	@Test(priority=2)
	public void LoginTest() {
		loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
