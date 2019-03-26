package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(name = "userName")
	@CacheLookup
	private WebElement user;

	@FindBy(name = "password")
	@CacheLookup
	private WebElement pass;

	@FindBy(name = "login")
	@CacheLookup
	private WebElement submit;

	@FindBy(linkText = "your destination")
	@CacheLookup
	private WebElement yourDestination;
	
	// WebElemnt of the Login class to be initialized on the driver
		public Login(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

	public void applicationLogin(String uesrName, String password) {
		user.sendKeys(uesrName);
		pass.sendKeys(password);
		submit.click();
	}

}
