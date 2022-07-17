package AppTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Order.feature"},  //feature file path..
		glue = {"StepDefinition"},//step definition package
		tags = "@All ",
		plugin = {"pretty",
				"json: target/Reports/report.json",
				"junit: target/Reports/report.xml"
				}
				
	//	publish = true
				)


public class OrderRunner {

}
