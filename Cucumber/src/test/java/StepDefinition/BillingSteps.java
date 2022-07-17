package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BillingSteps {
	
	int BillingAmt;
	int TaxAmt;
	int FinalAmt;
	
	
	@Given("^User is on billing page$")
	public void user_is_on_billing_page() throws Throwable {
	  System.out.println("user is on BILLING PAGE...");
	}

	@When("^user enters BILLING AMOUNT (\\d+)$")
	public void user_enters_BILLING_AMOUNT(int BillingAmt) throws Throwable {
		
		this.BillingAmt = BillingAmt;
		System.out.println("billing amount is ===> " +this.BillingAmt  );
	    
	}

	@When("^user enters TAX AMOUNT (\\d+)$")
	public void user_enters_TAX_AMOUNT(int TaxAmt) throws Throwable {
		
		this.TaxAmt = TaxAmt;
		System.out.println("tax amount :  ===> " + this.TaxAmt);
	}

	@When("^user enters BILLING AMOUNT (\\d+)\\.(\\d+)$")
	public void user_enters_BILLING_AMOUNT(int arg1, int arg2) throws Throwable {
	System.out.println("this is floating point billing amount");
	}



	@When("^user clicks on Calculate button$")
	public void user_clicks_on_Calculate_button() throws Throwable {
	
	}

	@Then("^the final output which he receives is (\\d+)$")
	public void the_final_output_which_he_receives_is(int FinalAmt) throws Throwable {
			
		this.FinalAmt = this.BillingAmt + this.TaxAmt;
		
		System.out.println("Final amount is ===> " + this.FinalAmt); 
	}



	@Then("^the final output which he receives is (\\d+)\\.(\\d+)$")
	public void the_final_output_which_he_receives_is(int arg1, int arg2) throws Throwable {
		
		System.out.println("this is floating point result");
	}







}
