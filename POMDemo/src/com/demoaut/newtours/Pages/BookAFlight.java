package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	@FindBy(name="passFirst0")
	@CacheLookup
	private WebElement firstName;
	
	@FindBy(name="passLast0")
	@CacheLookup
	private WebElement lastName;
	
	@FindBy(name="creditnumber")
	@CacheLookup
	private WebElement cNumber;
	
	@FindBy(name="buyFlights")
	@CacheLookup
	private WebElement submit;	
	
	// WebElemnt of the Login class to be initialized on the driver
		public BookAFlight(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void flightBooking(String fName, String lName, String creditNumber){
		firstName.sendKeys(fName);
		lastName.sendKeys(lName);
		cNumber.sendKeys(creditNumber);
		submit.click();
	}

}
