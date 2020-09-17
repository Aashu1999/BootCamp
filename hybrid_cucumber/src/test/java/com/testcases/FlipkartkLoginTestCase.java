package com.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base_class.Library;

import com.pages.FlipkartLoginPage;
import com.selenium_reusablefunction.SeleniumUtility;

public class FlipkartkLoginTestCase extends Library {
	
		
	FlipkartLoginPage  fpage;
		SeleniumUtility seleniumUtil;
		
		
		@BeforeTest
		public void launchApp() {
			browserSetUp();
		}
		
		@Test
		public void Login() {
			fpage=new FlipkartLoginPage  (driver);
			fpage.loginUser(properties.getProperty("flipkartUsername"),properties.getProperty("flipkartPassword"));
			Logger.getLogger("Browser Login Successfully");
		}
		
		@AfterTest
		public void close() throws InterruptedException {
			seleniumUtil= new SeleniumUtility(driver);
			seleniumUtil.getTitle();
			seleniumUtil.to_take_screenshot("loginPage1");
			tearDown();
		}

	}


