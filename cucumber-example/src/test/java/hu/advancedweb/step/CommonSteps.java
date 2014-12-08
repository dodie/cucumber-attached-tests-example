package hu.advancedweb.step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import hu.advancedweb.Calculator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps {
	
	public static Calculator calculator;
	
	@Given("^a Calculator$")
	public void a_Calculator() throws Throwable {
		calculator = new Calculator();
	}
	
	@Then("^I should get (\\d+)$")
	public void I_should_get(int arg1) throws Throwable {
		int result = calculator.getResult();
		assertThat(result, equalTo(arg1));
	}
}
