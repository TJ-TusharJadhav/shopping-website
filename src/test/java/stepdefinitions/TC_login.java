package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testbase.BaseClass;

public class TC_login {
	

    @Given("user is login with valid email id and password")
    public void user_is_login_with_valid_email_id_and_password() {
    	BaseClass.setUp();  // This setup now initializes WebDriver and Login automatically
    	BaseClass.login.enterLoginEmail("standard_user");
    	BaseClass.login.enterLoginPassword("secret_sauce");
    	BaseClass.login.clickLoginButton();
        BaseClass.tearDown();
    }

    @Given("the website is open")
    public void the_website_is_open() {
        System.out.println("Website is open.");
        BaseClass.setUp(); 
    }

    @When("the user enters a valid email")
    public void the_user_enters_a_valid_email() {
        BaseClass.login.enterLoginEmail("standard_user");
    }

    @When("the user enters a valid password")
    public void the_user_enters_a_valid_password() {
        BaseClass.login.enterLoginPassword("secret_sauce");
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        BaseClass.login.clickLoginButton();
    }

    @Then("the dashboard should be displayed")
    public void the_dashboard_should_be_displayed() {
    	BaseClass.tearDown();
        // Add assertions to verify the dashboard is displayed
    }
}
