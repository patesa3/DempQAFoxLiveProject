package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

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

	
	@FindBy(css = "input[type='text'][class='form-control input-lg']")
	public static WebElement searchBoxField;
	
	
	@FindBy(css = "button[type='button'][class='btn btn-default btn-lg']")
	public static WebElement searchbutton;
	
	@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'Shopping Cart')]")
	public static WebElement viewShoppingCart;
	
	public static void navigateTologinPage(){
		Elements.click(myAccountLink);
        Elements.click(login);
	  
	}
	
	public static void searchProduct() {
		Elements.TypeText(HeaderSection.searchBoxField, Base.reader.getProdut());
		Elements.click(HeaderSection.searchbutton);
		
	}
	
	public static void navigatetoShoppingCartPage(){
		
		 Elements.click(HeaderSection.viewShoppingCart);
		
	}
	

	
	
}
