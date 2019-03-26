package com.demoaut.newtours.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;

public class ValidateUserTest extends BaseTest {
	
	

	@Test
	public void userValidation() {
		Login lp = new Login(driver);
		lp.applicationLogin("mercury", "mercury");

		String expectedTitle = "Find a Flight: Mercury Tours";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	

}
