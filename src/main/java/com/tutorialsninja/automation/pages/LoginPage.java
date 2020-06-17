package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class LoginPage {
	
	public LoginPage(){
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="input-email")
	public static WebElement emailField;
	
	@FindBy(id="input-password")
	public static WebElement passwordField;
	
	@FindBy(css="input[value='Login'][type='submit']")
	public static WebElement loginButton;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(linkText="Forgotten Password")
	public static WebElement forgotPassword;
	
	public static void doLogin(String email, String password ) throws InterruptedException{
		
		Elements.TypeText(LoginPage.emailField, email);
		Thread.sleep(1000);
		Elements.TypeText(LoginPage.passwordField, password);
		Thread.sleep(1000);
		Elements.click(LoginPage.loginButton);
		Thread.sleep(1000);
	}
	
	
	

}
