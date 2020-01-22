package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.util.CommonMethods;

import testbase.BaseClass;

public class AddEmployePage extends CommonMethods{
	
		@FindBy(xpath="//a[@id = 'menu_recruitment_viewRecruitmentModule']/b")
		public WebElement addEmp;
		
		@FindBy(linkText="PIM")
		public WebElement pim;
		
		@FindBy(linkText="Add Employee")
		public WebElement addEmployee;
		
		
		public AddEmployePage() throws InterruptedException {
			PageFactory.initElements(BaseClass.driver, this);
	 
			driver.findElement(By.xpath("//a[@id = 'menu_recruitment_viewRecruitmentModule']/b")).click();
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();		
		//add Employee
		driver.findElement(By.xpath("//input[@name='addCandidate[firstName]']")).sendKeys("Kadir");
		driver.findElement(By.xpath("//input[@name='addCandidate[lastName]']")).sendKeys("GOK");
		driver.findElement(By.xpath("//input[@name='addCandidate[email]']")).sendKeys("kadirgok1@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		 Thread.sleep(1000);
}
}