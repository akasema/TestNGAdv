package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmployePage;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.util.CommonMethods;

/**
 * Sprint 5
US 16767: As an admin I should be able to add an employee 

TC: Add Employee
Step 1. navigate to the application
Step 2: login into the application
Step 3: navigate to add employee page
Step 4: add employee by providing fname. mname, lname
Step 5: verify employee has been added successfully
 * @author kadir
 *
 */
public class HwTestPages extends CommonMethods{
	
	@Test(groups="regression")
	public void verifyEmployee() throws InterruptedException {
		LoginPageElements login =new LoginPageElements();
		sendText(login.username,"Admin");
		sendText(login.password, "Syntax@123");
		click(login.loginBtn);
		
		AddEmployePage addEmpl=new AddEmployePage();
	click(addEmpl.addEmp);
	click(addEmpl.pim);
		
		
	
}
}