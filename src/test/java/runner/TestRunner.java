package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features", 
glue= {"stepDefinitions"},tags= "@smoke",monochrome=true,
plugin = {"json:target/cucumber.json"})
public class TestRunner {
	
}

