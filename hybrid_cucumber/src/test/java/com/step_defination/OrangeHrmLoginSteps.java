package com.step_defination;

import org.apache.log4j.Logger;

import com.base_class.Library;
import com.pages.OrangeHrmLoginPage;
import com.selenium_reusablefunction.SeleniumUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHrmLoginSteps extends Library{
	
	OrangeHrmLoginPage lpage;
	SeleniumUtility seleniumUtil;
	
	@Given("to Launch the Browser and Navigate to Url")
	public void to_Launch_the_Browser_and_Navigate_to_Url() {
	    browserSetUp();
	   Logger.getLogger("Browser Launches");
	}

	@When("To Enter Username and Pasword")
	public void to_Enter_Username_and_Pasword() {
		lpage=new OrangeHrmLoginPage(driver);
		lpage.loginUser(properties.getProperty("username"),properties.getProperty("password"));
		 Logger.getLogger("Enter Username and Password");
	}

	@Then("to click the Submit button")
	public void to_click_the_Submit_button() {
		lpage.submit();
		 Logger.getLogger("Login Button Clicked");
	}

	@Then("to Take the Screenshot and get Title")
	public void to_Take_the_Screenshot_and_get_Title() {
		seleniumUtil= new SeleniumUtility(driver);
		seleniumUtil.getTitle();
		seleniumUtil.to_take_screenshot("loginPage");
		 Logger.getLogger("Take Screenshot of Login Page and Title Printed in Console");
	}

	@Then("to Close the Browser")
	public void to_Close_the_Browser() {
	    tearDown();
	    Logger.getLogger("Closing Browser");
	}




}
