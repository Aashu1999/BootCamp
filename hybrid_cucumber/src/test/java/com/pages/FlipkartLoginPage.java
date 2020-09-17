package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLoginPage {
	
public FlipkartLoginPage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
    @FindBy(xpath= "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
    WebElement usernameText;
    
    @FindBy(xpath= "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input") 
    WebElement passwordText;
    
    @FindBy(xpath= "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
    WebElement loginButton;
    
   
    
    public void loginUser(String flipkartUsername, String flipkartPassword) {
		this.usernameText.sendKeys(flipkartUsername);
		this.passwordText.sendKeys(flipkartPassword);
		this.loginButton.click();
		
	}
}


