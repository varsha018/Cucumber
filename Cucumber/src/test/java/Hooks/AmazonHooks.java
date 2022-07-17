package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class AmazonHooks {
	
	
	
	@Before(order=2)
	public void setup(Scenario sc) {
		System.out.println("Start Browser");
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());
		
	}
	
	@Before(order=1)
	public void Env_setup() {
		System.out.println("SetUp Environment");
	}
	

	
	
	@After
	public void TearDown() {
		System.out.println("Close Browser");
	}
	

}
