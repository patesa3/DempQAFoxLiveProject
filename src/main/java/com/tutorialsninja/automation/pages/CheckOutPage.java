package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckOutPage {
	
	public CheckOutPage(){
		
		PageFactory.initElements(Base.driver, this);
	}
	
	//@FindBy(id="button-payment-address")
	//public static WebElement continueButtonOfBillingDetailsSection;
	
	@FindBy(css="input#button-payment-address")
	public static WebElement continueButtonOfBillingDetailsSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonOfDeliveryDetailSection;
	
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtonOfDeliveryMethosSections;
	
	@FindBy(name="agree")
	public static WebElement termsAndConditionsCheckbox;

	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonOfPaymentMethodSection;
	
	@FindBy(id="button-cinfirm")
	public static WebElement confirmOrderButton;
	
	public static void placeAndOrder(){
		
		Elements.click(CheckOutPage.continueButtonOfBillingDetailsSection);
		Elements.click(CheckOutPage.continueButtonOfDeliveryDetailSection);
		Elements.click(CheckOutPage.continueButtonOfDeliveryMethosSections);
		Elements.click(CheckOutPage.termsAndConditionsCheckbox);
		Elements.click(CheckOutPage.continueButtonOfPaymentMethodSection);
		Elements.click(CheckOutPage.confirmOrderButton);
	}
}
