package com.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.PageObjects.LoginPageObject;

public class TC001_LoginPage extends BaseClass {

	
	 LoginPageObject lp;
	
	@Parameters({"username","password"})
	@Test
	public void loginTest(String usernm, String passwd) throws InterruptedException  {

	    lp = new LoginPageObject(driver);
		Thread.sleep(3000);
		//WebDriverWait wait = new WebDriverWait()
		lp.setUsername(usernm);
		lp.setPassword(passwd);
		lp.clickButton();

	}

}
