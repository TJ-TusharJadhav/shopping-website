package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.BaseClass;

public class Login extends BaseClass {
    // Locate elements on the login page
    @FindBy(id = "user-name")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button") // Simplified selector using 'id'
    public WebElement loginButton;

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
}
