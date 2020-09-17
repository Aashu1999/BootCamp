package com.testcases;

import org.testng.annotations.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import com.base_class.Library;
import org.apache.log4j.Logger;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reusablefunction.SeleniumUtility;

public class OrangeHrmLoginTestCase extends Library{
	
	OrangeHrmLoginPage lpage;
	SeleniumUtility seleniumUtil;
	
	
	@BeforeTest
	public void launchApp() {
		browserSetUp();
	}
	
	@Test
	public void Login() {
		lpage=new OrangeHrmLoginPage(driver);
		lpage.loginUser(properties.getProperty("username"),properties.getProperty("password"));
		Logger.getLogger("Browser Login Successfully");
	}
	
	@AfterTest
	public void close() throws InterruptedException {
		seleniumUtil= new SeleniumUtility(driver);
		seleniumUtil.to_take_screenshot("loginPage");
		driver.getTitle();
		tearDown();
	}

}
