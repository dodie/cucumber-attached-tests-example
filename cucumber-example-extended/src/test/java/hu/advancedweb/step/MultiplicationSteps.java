package hu.advancedweb.step;

import cucumber.api.java.en.When;

public class MultiplicationSteps {
	@When("^I perform multiplication with (\\d+) and (\\d+)$")
	public void I_perform_addition_with_and(int arg1, int arg2) throws Throwable {
	    CommonSteps.calculator.performOperation("multiply", arg1, arg2);
	}
}
