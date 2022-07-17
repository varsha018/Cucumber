package AppTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeature/Uber.feature"},  //feature file path..
		glue = {"StepDefinition"},//step definition package
		tags = "@All ",
		plugin = {"pretty"}
				)


public class UberRunner {






}
