package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageObject extends BasePage {

	public LoginPageObject(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement button;

	
	public void setUsername(String user) {

		username.sendKeys(user);
	}

	public void setPassword(String passwd) {

		password.sendKeys(passwd);
	}

	public void clickButton() {

		button.click();
	}
}
