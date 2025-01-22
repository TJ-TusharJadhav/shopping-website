package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testbase.BaseClass;

public class TC_login {
	
	@Given("valid login {string} {string}")
    public void valid_login(String username, String password) {
		BaseClass.setUp();
		BaseClass.login.enterLoginEmail(username);
		BaseClass.login.enterLoginPassword(password);
	    BaseClass.login.clickLoginButton();
        
    }
	
	@Given("I am on the Sauce Demo login page")
    public void iAmOnTheSauceDemoLoginPage() {
		BaseClass.setUp();
        
    }

    @When("I enter a valid username {string}")
    public void iEnterAValidUsername(String username) {
    	BaseClass.login.enterLoginEmail(username);
    }

    @When("I enter a valid password {string}")
    public void iEnterAValidPassword(String password) {
    	BaseClass.login.enterLoginPassword(password);
    }

    @When("I click the login button")
    public void iClickTheLoginButton() {
        BaseClass.login.clickLoginButton();
    }

    @Then("I should be redirected to the Products page")
    public void iShouldBeRedirectedToTheProductsPage() {
        
    }

    @Then("I should see the header {string}")
    public void iShouldSeeTheHeader(String header) {
    	BaseClass.login.check_header();
       
    }

    @When("I enter an invalid username {string}")
    public void iEnterAnInvalidUsername(String invalidUsername) {
        BaseClass.login.enterLoginEmail(invalidUsername);
    }

    @When("I enter an invalid password {string}")
    public void iEnterAnInvalidPassword(String invalidPassword) {
        BaseClass.login.enterLoginPassword(invalidPassword);
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String errorMessage) {
    	BaseClass.login.check_Invalid_error_message();
        
    }

//    @When("I click the 'Add to cart' button for the product {string}")
//    public void iClickTheAddToCartButtonForTheProduct(String productName) {
//        // Locate and click the "Add to cart" button for the given product
//    }
//
//    @Then("the cart icon should display a badge with {string}")
//    public void theCartIconShouldDisplayABadgeWith(String cartBadge) {
//        // Validate the cart badge
//    }
//
//    @Given("I have added {string} to the cart")
//    public void iHaveAddedToTheCart(String productName) {
//        // Step to ensure the product is already added to the cart
//    }
//
//    @When("I click the 'Remove' button for the product {string}")
//    public void iClickTheRemoveButtonForTheProduct(String productName) {
//        // Locate and click the "Remove" button for the product
//    }
//
//    @Then("the cart icon should not display any badge")
//    public void theCartIconShouldNotDisplayAnyBadge() {
//        // Validate that the cart icon has no badge
//    }
//
//    @Given("I have added {string} to the cart")
//    public void iHaveAddedProductToTheCart(String productName) {
//        // Step to ensure the product is already added to the cart
//    }
//
//    @When("I click the 'Checkout' button")
//    public void iClickTheCheckoutButton() {
//        // Locate and click the "Checkout" button
//    }
//
//    @When("I fill in the checkout information with {string} {string} {string}")
//    public void iFillInTheCheckoutInformationWith(String firstName, String lastName, String zipCode) {
//        // Locate fields and enter checkout details
//    }
//
//    @When("I click the 'Continue' button")
//    public void iClickTheContinueButton() {
//        // Locate and click the "Continue" button
//    }
//
//    @Then("I should see the 'Checkout: Overview' page")
//    public void iShouldSeeTheCheckoutOverviewPage() {
//        // Validate that the "Checkout: Overview" page is displayed
//    }
//
//    @When("I click the 'Finish' button")
//    public void iClickTheFinishButton() {
//        // Locate and click the "Finish" button
//    }
//
//    @Then("I should see the confirmation message {string}")
//    public void iShouldSeeTheConfirmationMessage(String confirmationMessage) {
//        // Validate the confirmation message
//    }
//
    @Given("I am logged in as {string} with password {string}")
    public void iAmLoggedInAsWithPassword(String username, String password) {
    	BaseClass.setUp();
		BaseClass.login.enterLoginEmail(username);
		BaseClass.login.enterLoginPassword(password);
	    BaseClass.login.clickLoginButton();
    }
    
    @Given("I am on the Products page")
    public void IamontheProductspage() {
    	
    }
//
//    @When("I click the menu button")
//    public void iClickTheMenuButton() {
//        // Locate and click the menu button
//    }
//
//    @When("I click the 'Logout' button")
//    public void iClickTheLogoutButton() {
//        // Locate and click the logout button
//    }
//
//    @Then("I should be redirected to the login page")
//    public void iShouldBeRedirectedToTheLoginPage() {
//        // Validate redirection to the login page
//    }


	
	
	

//    @Given("user is login with valid email id and password")
//    public void user_is_login_with_valid_email_id_and_password() {
//    	BaseClass.setUp();  // This setup now initializes WebDriver and Login automatically
//    	BaseClass.login.enterLoginEmail("standard_user");
//    	BaseClass.login.enterLoginPassword("secret_sauce");
//    	BaseClass.login.clickLoginButton();
//        BaseClass.tearDown();
//    }
//
//    @Given("the website is open")
//    public void the_website_is_open() {
//        System.out.println("Website is open.");
//        BaseClass.setUp(); 
//    }
//
//    @When("the user enters a valid email")
//    public void the_user_enters_a_valid_email() {
//        BaseClass.login.enterLoginEmail("standard_user");
//    }
//
//    @When("the user enters a valid password")
//    public void the_user_enters_a_valid_password() {
//        BaseClass.login.enterLoginPassword("secret_sauce");
//    }
//
//    @When("the user clicks the login button")
//    public void the_user_clicks_the_login_button() {
//        BaseClass.login.clickLoginButton();
//    }
//
//    @Then("the dashboard should be displayed")
//    public void the_dashboard_should_be_displayed() {
//    	BaseClass.tearDown();
//        // Add assertions to verify the dashboard is displayed
//    }
}
