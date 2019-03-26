package com.demoaut.newtours.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightConfirmation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

public class BookTicketTest extends BaseTest{

//	WebDriver driver;
//
//	@BeforeTest
//	public void openbrowser() {
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://www.newtours.demoaut.com");
//	}

	@Test
	public void ticketBooking() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);

		lp.applicationLogin("mercury", "mercury");
		ff.findFlight();
		sf.fligtSelection();
		bf.flightBooking("Deepinder", "Bhatti", "12345");

		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = fc.getMessage().getText();
//		String actualMessage = driver
//				.findElement(By.cssSelector(
//						"body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)"))
//			.getText();
		Assert.assertEquals(actualMessage, expectedMessage);

	}

//	@AfterTest
//	public void closeBrowser() {
//		driver.close();
//	}

}
