package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class AccountSucessPage {
	
	public AccountSucessPage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	
	@FindBy(xpath="//a[contains(.,'Success')]")
	public static WebElement sucessBreadCrumb;

   

}
