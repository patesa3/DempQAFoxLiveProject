package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class HeaderSection {
	//below is constuctor
	//page Factory initialize element when every time pafge is invoked
	//This means==> this class element must initialized
	
	public HeaderSection(){
		
		PageFactory.initElements(Base.driver, this);
	}
	@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'My Account')]")  //pageFactory Annotation
	public static WebElement myAccountLink;
	
	@FindBy(linkText = "Register")
	public static WebElement register;
	
	@FindBy(linkText = "Login")
	public static WebElement login;
	
}
