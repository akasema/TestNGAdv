package com.testcases;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.LoginPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.util.CommonMethods;
import com.hrms.util.ConfigsReader;
import com.hrms.util.Constants;


public class LoginPageTest extends CommonMethods {
	// Test case to validate valid login
	@Test(groups="smoke")
	public void login() {
		ConfigsReader.readProperties(Constants.CREDITENTIALS_FILEPATH);
		LoginPage login = new LoginPage();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	/*
	 * Navigate to HRMS Enter uid leave password field blank click login verify
	 * "Password cannot be empty" text close browser
	 */
	@Test(groups="regression")
	public void negativeLogin() throws InterruptedException {
		LoginPageElements login = new LoginPageElements();
		
		sendText(login.username, "Admin");
		click(login.loginBtn);
		String expectedError = "Password cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expectedError, "Error message text is not matched");
		Thread.sleep(5000);
	}
}
