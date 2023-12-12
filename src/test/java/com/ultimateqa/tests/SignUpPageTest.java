package com.ultimateqa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ultimateqa.base.TestBase;
import com.ultimateqa.pages.LoginPage;
import com.ultimateqa.pages.SignUpPage;
import com.ultimateqa.util.TestUtil;

public class SignUpPageTest extends TestBase{
	
	LoginPage loginPage;
	SignUpPage SignUpPage;
	String sheetName = "Sheet1";
	
	public SignUpPageTest() {
		super();   //calling super class i.e, Base class constructor
	}
	
	@BeforeMethod()
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
		loginPage.clickonCreateAccount();
		
		SignUpPage = new SignUpPage();
		
	}
		
	@Test(priority = 1)
	public void SignUpPageTestTitle() {
		String title = SignUpPage.VerifySignUpPageTitle();
		Assert.assertEquals(title, "Create a new account - Ultimate QA");
	}
	
	
	@DataProvider
	public Object[][] getTestData() {
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority =2, dataProvider = "getTestData")
	public void SignupTest(String NameFirst, String NameLast, String EmailAddress, String Pass ) {
		
		//SignUpPage.SignUp(prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Email"), prop.getProperty("Password"));
		SignUpPage.SignUp(NameFirst, NameLast, EmailAddress, Pass); //taking data from excel and not hardcoding it.
	}

	@AfterTest()
	public void teardown() {
		driver.quit();
	}
		
	}
	


