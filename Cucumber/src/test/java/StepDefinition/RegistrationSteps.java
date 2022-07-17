package StepDefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {

	
	@Given("^User is on Registration Page$")
	public void user_is_on_Registration_Page() throws Throwable {
		System.out.println("user navigates to Registration Page");
	}

	@When("^User Enters the below data$")
	public void user_Enters_the_below_data(DataTable arg1) throws Throwable {
		
		List<List<String>> DataTable = arg1.asLists(String.class);
		
		for(List<String> e : DataTable) {
			System.out.println(e.get(0));
			System.out.println(e.get(2).toUpperCase());
		}

	}

	
	@When("^User Enters the below data with Column$")
	public void user_Enters_the_below_data_with_Column(DataTable arg1) throws Throwable {
		
		List<Map<String, String>> DataMap = arg1.asMaps(String.class, String.class);
		
	//	System.out.println(DataMap);
	//	System.out.println(DataMap.get(1).get("Field"));
		
		for(Map<String, String> e : DataMap) {
			System.out.println(e);
		}
	}
	
	
	
	@Then("^User registration should be successful$")
	public void user_registration_should_be_successful() throws Throwable {
		System.out.println("user successfully does the Registration");

	}
}
