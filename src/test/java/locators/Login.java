package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import testbase.BaseClass;

public class Login extends BaseClass {
    // Locate elements on the login page
    @FindBy(id = "user-name")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span") 
    public WebElement header;
    
    @FindBy(id = "login-button") 
    public WebElement loginButton;
    
    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]") 
    public WebElement invalid_error_message;

    // Constructor to initialize the page elements
    public Login() {
        PageFactory.initElements(driver, this);
    }

    // Method to enter login email
    public void enterLoginEmail(String username) {
        email.sendKeys(username);
    }

    // Method to enter login password
    public void enterLoginPassword(String pass) {
        password.sendKeys(pass);
    }

    // Method to click the login button
    public void clickLoginButton() {
        loginButton.click();
    }
    
 // Method to click the login button
    public void check_header() {
    	String Actual = header.getText();
    	String Expected = "Products";
    	Assert.assertEquals(Actual, Expected);
    }
    
    public void check_Invalid_error_message() {
    	String Actual = invalid_error_message.getText();
    	String Expected = "Epic sadface: Username and password do not match any user in this service";
    	Assert.assertEquals(Actual, Expected);
    }
}
