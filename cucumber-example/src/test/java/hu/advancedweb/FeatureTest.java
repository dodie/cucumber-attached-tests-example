package hu.advancedweb;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty"}, features = {"classpath:feature"})
public class FeatureTest {
	
}