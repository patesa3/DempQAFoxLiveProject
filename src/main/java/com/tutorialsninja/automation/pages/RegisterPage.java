package com.tutorialsninja.automation.pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

import cucumber.api.DataTable;

public class RegisterPage {
	
	public RegisterPage(){
		
		PageFactory.initElements(Base.driver, this);
		
	}
	
	@FindBy(id="input-firstname")
	public static WebElement firstName;
		
	@FindBy(id="input-lastname")
	public static WebElement lastName;
		
	@FindBy(id="input-email")
	public static WebElement email;
		
	@FindBy(id="input-telephone")
	public static WebElement telephone;
		
	@FindBy(id="input-password")
	public static WebElement password;
		
	@FindBy(id="input-confirm")
	public static WebElement confirmPassword;
	
	@FindBy(name="agree")
	public static WebElement privacyPolicy;
	
	@FindBy(xpath="//input[contains(@value,'Continue')]")
	public static WebElement continueButton;
	
	
	@FindBy(linkText="Register")
	public static WebElement registerBreadCrumb;
	
	@FindBy(css="input[id='input-firstname']+div")
	public static WebElement firstNameWarning;
	
	@FindBy(css="input[id='input-lastname']+div")
	public static WebElement lastNameWarning;
	
	@FindBy(css="input[id='input-email']+div")
	public static WebElement emailWarning;
	
	@FindBy(css="input[id='input-telephone']+div")
	public static WebElement telephoneWarning;
	
	@FindBy(css="input[id='input-password']+div")
	public static WebElement passwordWarning;
	
	@FindBy(css="div[class$='alert-dismissible']")
	public static WebElement mainWarning;
	
	@FindBy(css="input[name='newsletter'][value='1']")
	public static WebElement yessToNewsletter;
		
	//create resusable methods
	//create object of same name of constructor  RegisterPage, to call constructor with PageFactory for initializing
	//webelements
	
public static void enterAllRegistrationDetails(DataTable dataTable, String detailType) throws InterruptedException {
		
		Map<String,String> map = dataTable.asMap(String.class,String.class);
		Elements.TypeText(RegisterPage.firstName,map.get("FirstName"));
		Thread.sleep(1000);
		Elements.TypeText(RegisterPage.lastName,map.get("LastName"));
		Thread.sleep(1000);
		//Elements.TypeText(RegisterPage.email,map.get("Email"));
		//Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+map.get("Email"));
		Thread.sleep(1000);
		Elements.TypeText(RegisterPage.telephone,map.get("Telephone"));
		Thread.sleep(1000);
		Elements.TypeText(RegisterPage.password,map.get("Password"));
		Thread.sleep(1000);
		Elements.TypeText(RegisterPage.confirmPassword,map.get("Password"));
		
		if(detailType.equalsIgnoreCase("duplicate"))
			Elements.TypeText(RegisterPage.email,map.get("Email"));
		else
			Elements.TypeText(RegisterPage.email,System.currentTimeMillis()+map.get("Email"));
		
	}




	
}



	 

