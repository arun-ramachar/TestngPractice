package com.testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	 public WebDriver driver;
	
	
	@BeforeTest
	public void setUp(ITestContext context) {

		driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

	}
	
	@AfterTest
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@Test
	public String randomString() {

		String genarateAlphabetic = RandomStringUtils.randomAlphabetic(5);
		return genarateAlphabetic;
	}

	@Test
	public String randomNumber() {

		
		String genarateNumber = RandomStringUtils.randomNumeric(5);
		return genarateNumber;
	}
	
	public String randomAlphaNumeric() {
		
		String genarateAlphabetic = RandomStringUtils.randomAlphabetic(5);
		String genarateNumber = RandomStringUtils.randomNumeric(5);
		return (genarateAlphabetic + genarateNumber);
	}


}
