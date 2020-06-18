package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchResultPage;

import cucumber.api.java.en.*;
import org.junit.*;


public class Search {
	
	HeaderSection headerSection =new HeaderSection();
	SearchResultPage SearchResultPage = new SearchResultPage();
	
	@When("^I search for a product \"([^\"]*)\"$")
	public void i_search_for_a_product(String product)  {
		
		Elements.TypeText(HeaderSection.searchBoxField, product);
		Elements.click(HeaderSection.searchbutton);
	  
	}

	@SuppressWarnings("static-access")
	@Then("^I should see the product in the search resultsil address$")
	public void i_should_see_the_product_in_the_search_resultsil_address()  {
		
		Assert.assertTrue(Elements.isDisplayed(SearchResultPage.SamsungSyncMasterSerachResult));
	  

}
	
	@SuppressWarnings("static-access")
	@Then("^I should see the page displaying the message \"([^\"]*)\"$")
	public void i_should_see_the_page_displaying_the_message(String arg1) {
		
	Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.noResultMessage, "There is no product that matches the search criteria."));
	  
}
	
}
