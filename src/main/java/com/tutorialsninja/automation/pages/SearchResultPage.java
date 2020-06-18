package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class SearchResultPage {
	
	public SearchResultPage(){
	
	PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(linkText="Samsung SyncMaster 941BW")
	public static WebElement SamsungSyncMasterSerachResult;
	
	@FindBy(xpath = "//p[contains(.,'There is no product that matches the search criteria.')]")
	public static WebElement noResultMessage;
	
	@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md'][contains(.,'Add to Cart')]")
	public static WebElement firstAddToCartOption;
	
	public static void addFirstProductInTheSerachResultsToCart(){
		Elements.click(SearchResultPage.firstAddToCartOption);
		
	}
	
	
	

}
