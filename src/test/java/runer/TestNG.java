package runer;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "./FeatureFile/login.feature",
    glue = "stepdefinitions",               
    plugin = {"pretty","html:target/cucumber-TestNG-reports.html"}
//    ,dryRun = true
//    ,tags= "@tag2"
    )

public class TestNG extends AbstractTestNGCucumberTests {

}
