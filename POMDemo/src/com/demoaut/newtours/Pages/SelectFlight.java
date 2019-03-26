package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight {
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[7]/td[1]/input")
	@CacheLookup
	private WebElement departFlight;
	
	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(9) > td.frame_action_xrows > input[type='radio']")
	@CacheLookup
	private WebElement returnFlight;
	
	@FindBy(name="reserveFlights")
	@CacheLookup
	private WebElement submit;	
	
	// WebElemnt of the Login class to be initialized on the driver
		public SelectFlight(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
	
	public void fligtSelection(){
		departFlight.click();
		returnFlight.click();
		submit.click();
	}

}
