package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UberBooking {


	@Given("^User wants to travel in a luxurious car \"([^\"]*)\"$")
	public void user_wants_to_travel_in_a_luxurious_car(String arg1)  {
		System.out.println("Lamborgini se travel...Hurray!!!!!!!!!");

	}

	@When("^User searches for the car from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void user_searches_for_the_car_from_to(String arg1, String arg2)  {
		System.out.println("bangalore se Pune tak");

	}

	@Then("^User gets charged (\\d+)$")
	public void user_gets_charged_till_Pune(int arg1)  {
		System.out.println("charges are 10000");

	}

	@When("^User searches for the Car from \"([^\"]*)\" to \"([^\"]*)\"$")
	public void user_searches_for_the_Car_from_to(String arg1, String arg2)  {
		System.out.println("bangalore se delhi");

	}
	
	
	
	
	
}
