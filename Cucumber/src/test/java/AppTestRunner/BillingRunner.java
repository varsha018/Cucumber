package AppTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Run the TestRunner class as Run as JUnit Test...

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Billing.feature"},  //feature file path..
		glue = {"StepDefinition"}//step definition package
	
		
		)


public class BillingRunner {

}
