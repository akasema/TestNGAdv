package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.BaseClass;

public class LeaveListPageElements {
	@FindBy(css="a.toggle.tiptip")
	public WebElement leaveListlbl;
	
	public LeaveListPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
}
}