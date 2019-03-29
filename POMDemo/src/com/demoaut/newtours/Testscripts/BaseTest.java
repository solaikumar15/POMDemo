package com.demoaut.newtours.Testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;

	@BeforeClass
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
//Absolutely Correct