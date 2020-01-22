package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.util.CommonMethods;
import com.hrms.util.ConfigsReader;


public class LeaveListPageTest extends CommonMethods{

	@Test(groups="regression")
	public void leaveLabelvalidation() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard=new DashboardPageElements();
		LeaveListPageElements leaveList=new LeaveListPageElements();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		jsClick(dashboard.leaveLnk);
		jsClick(dashboard.leaveList);
		Assert.assertTrue(leaveList.leaveListlbl.isDisplayed(), "Label is NOT displayed");
	}
}