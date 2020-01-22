package com.hrms.util;

public class Constants {
// bunlar property file da yapýldýðý için burdan kaldýrýlddý
//	public static final String HRMS_URL="http://166.62.36.207/Syntax_HRM/symfony/web/index.php/auth/login";
//	public static final String SYNTAX_PRACTICE_URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
//	public static final String BROWSER="chrome";
//	public static final String USERNAME="Admin";
	public static final String CHROME_DRIVER_PATH=System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";

	public static final String GECKO_DRIVER_PATH=System.getProperty("user.dir")+"\\drivers\\geckodriver.exe";
	 
	public static final int PAGE_LOAD_TIME=30;
	public static final int IMPLICIT_LOAD_TIME=10;
	public static final long EXPLICIT_LOAD_TIME = 30;
	public static final String CREDITENTIALS_FILEPATH=System.getProperty("user.dir")+"\\src\\test\\resources\\configs\\Configuration.properties";
	

	
}
