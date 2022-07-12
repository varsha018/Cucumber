package StepDefinition;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


//Run this with Run as Configuration...

public class SearchSteps {
	
	Product prodct;
	Search search;
	
	

	@Given("^I have a search field on Amazon Page$")
	public void i_have_a_search_field_on_Amazon_Page() throws Throwable {
	   System.out.println("I am on Search page ..");
	}

	@When("^I search for a product with product name \"([^\"]*)\" and price (\\d+)$")
	public void i_search_for_a_product_with_product_name_and_price(String ProductName, int Price) throws Throwable {
	    System.out.println("The product is  : " + ProductName);
	    System.out.println("The price is  : " + Price);
	    
	    prodct = new Product(ProductName, Price);
	    
	    
	}

	@Then("^Product with name \"([^\"]*)\" should be displayed$")
	public void product_with_name_should_be_displayed(String ProductName) throws Throwable {
	    System.out.println("Product Name along with its Price should get displayed.");
	    
	    search = new Search();
	    String strname = search.ProductDisplay(prodct);
	    System.out.println("The displayed product is : " + strname);
	    
	}


	
	
	
	
}
