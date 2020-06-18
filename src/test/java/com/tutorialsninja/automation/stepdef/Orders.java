package com.tutorialsninja.automation.stepdef;

import org.testng.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckOutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrdersuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orders {
	
	HeaderSection headerSection =new HeaderSection();
	LoginPage loginPage = new LoginPage();
	SearchResultPage searchResultPage =new SearchResultPage();
	ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
	CheckOutPage  checkOutPage  = new CheckOutPage();
	OrdersuccessPage  ordersuccessPage = new OrdersuccessPage();
	
	@Given("^I login to the application$")
	public void i_login_to_the_application()  {
		
		Browser.openingApplicationURL();
		HeaderSection.navigateTologinPage();
		LoginPage.doLogin();
	  
	}

	@When("^I add any product to Bag and checkout$")
	public void i_add_any_product_to_Bag_and_checkout()  {
		HeaderSection.searchProduct();
		SearchResultPage.addFirstProductInTheSerachResultsToCart();
	    HeaderSection.navigatetoShoppingCartPage();
	    ShoppingCartPage.navigateToCheckoutPage();
	  
	   
	}

	@And("^I place an order$")
	public void i_place_an_order() {
		
	CheckOutPage.placeAndOrder();
	}

	@Then("^I should see that the order is placed successfully$")
	public void i_should_see_that_the_order_is_placed_successfully()  {
		
		Waits.waitUntilElementLocated(10, OrdersuccessPage.successBreadCrumb);
		
		Assert.assertTrue(Elements.isDisplayed(OrdersuccessPage.successBreadCrumb));
	   
	}


}
