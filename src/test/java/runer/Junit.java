package runer;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "./FeatureFile/login.feature",
	    glue = "stepdefinitions", // Specify the package where step definitions are located
	    plugin = {"pretty", "html:target/cucumber-reports.html"}
	    ,tags = "@tag2"
		)

public class Junit {
}
