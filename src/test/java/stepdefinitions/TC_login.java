package stepdefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testbase.BaseClass;

public class TC_login extends BaseClass {
	

    @Given("I am on the Sauce Demo login page")
    public void i_am_on_the_sauce_demo_login_page() {
    	setUp();
    }

    @When("I enter a valid username {string}")
    public void i_enter_a_valid_username(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @When("I enter a valid password {string}")
    public void i_enter_a_valid_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be redirected to the Products page")
    public void i_should_be_redirected_to_the_products_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", currentUrl);
    }

    @Then("I should see the header {string}")
    public void i_should_see_the_header(String expectedHeader) {
        String headerText = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(expectedHeader, headerText);
    }
    
    @When("I enter username {string}")
    public void I_enter_username(String username) {
    	driver.findElement(By.id("user-name")).sendKeys(username);
       
    }
    @When("I enter password {string}")
    public void I_enter_password(String password) {
    	driver.findElement(By.id("password")).sendKeys(password);
       
    }

    @Then("I should see an error message {string}")
    public void i_should_see_an_error_message(String expectedErrorMessage) {
    	   String actualErrorMessage = driver.findElement(By.xpath("//h3[@data-test='error']")).getText(); 
    	    Assert.assertEquals(expectedErrorMessage, actualErrorMessage); 

        
    }

    @Given("I am logged in as {string} with password {string}")
    public void i_am_logged_in_as_with_password(String username, String password) {
    	setUp();  // Initialize the WebDriver
        driver.findElement(By.id("user-name")).sendKeys(username);  
        driver.findElement(By.id("password")).sendKeys(password);  
        driver.findElement(By.id("login-button")).click(); 
    	
       
    }

    @Given("I am on the Products page")
    public void i_am_on_the_products_page() {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header_container\"]/div[2]/span")));
       
    }

    @When("I click the Add to cart button for the product {string} {string}")
    public void i_click_the_button_for_the_product(String productName, String productName1) {
    	String addToCartButtonXpath = "//*[@id=\"add-to-cart-"+productName+"\"]";
        driver.findElement(By.xpath(addToCartButtonXpath)).click();
        
        String addToCartButtonXpath1 = "//*[@id=\"add-to-cart-"+productName1+"\"]";
        driver.findElement(By.xpath(addToCartButtonXpath1)).click();
       
    }

    @Then("the cart icon should display a badge with {string}")
    public void the_cart_icon_should_display_a_badge_with(String expectedBadgeText) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement badgeElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("shopping_cart_badge")));
        String badgeText = badgeElement.getText();  
        Assert.assertEquals(badgeText, expectedBadgeText);  
       
    }

    @Given("I have added {string} to the cart")
    public void i_have_added_to_the_cart(String productName) {
    	setUp();  
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-"+productName+"\"]")).click();
    	
       
    }
    @Given("I am on the cart page")
    public void i_am_on_the_cart_page() {
    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
       
    }
    @When("I click the Remove button for the product {string}")
    public void i_click_the_RemoveButton (String removeProductName) {
    	String total = "//*[@id=\"shopping_cart_container\"]/a";
    	driver.findElement(By.xpath(total)).isDisplayed();
    	
    	String addToCartButtonXpath = "//*[@id=\"remove-"+removeProductName+"\"]"; 
        driver.findElement(By.xpath(addToCartButtonXpath)).click();
       
    }
    @When("I click the Checkout button")
    public void i_click_the_CheckoutButton() {
    	
    	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        
    }

    @Then("the cart icon should not display any badge")
    public void the_cart_icon_should_not_display_any_badge() {
    	
    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).isDisplayed();
        }

   @When("I fill in the checkout information with {string} {string} {string}")
    public void i_fill_in_the_checkout_information_with(String Fname, String Lname, String Pcode) {
	   driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(Fname);
	   driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(Lname);
	   driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(Pcode);
       
    }
   @When("I click the Continue button")
   public void I_click_the_Continue_button() {
   	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
       
   }
   
   @Then("I should see the Checkout: Overview page")
   public void i_should_see_the_checkout_overview_page() {
      
      Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText(), "Checkout: Overview");
   }
   @When("I click the Finish button")
   public void i_click_the_finish_button() {
	   driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
      
   }

    @Then("I should see the {string} page")
    public void i_should_see_the_page(String string) {
    	
        
    }

    @Then("I should see the confirmation message {string}")
    public void i_should_see_the_confirmation_message(String message) {
    	Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText(), message);
    	   
    	
        
    }

    @Given("I am logged in as {string} {string}")
    public void i_am_logged_in_as(String username, String password) {
    	setUp();  // Initialize the WebDriver
        driver.findElement(By.id("user-name")).sendKeys(username); 
        driver.findElement(By.id("password")).sendKeys(password); 
        driver.findElement(By.id("login-button")).click();  
        
    }

    @When("I click the menu button")
    public void i_click_the_menu_button() {
    	driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
       
    }
    
    @When("I click the Logout button")
    public void I_click_the_Logout_button() {
    	driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
       
    }

    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() {
    	String logoutURL= driver.getCurrentUrl();
    	Assert.assertEquals("https://www.saucedemo.com/", logoutURL);
        
    	}
   
}
