package runer;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "./FeatureFile/login.feature",
	    glue = "stepdefinitions",
	    plugin = {"pretty", "html:target/cucumber-junit-reports.html"}
//	    ,tags = "@tag1"
		)

public class Junit {
}
