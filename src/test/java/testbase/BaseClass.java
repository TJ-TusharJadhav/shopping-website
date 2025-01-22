package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import locators.Login;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static Login login;  // Declaring the login object as public static

    @Before
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
        
        login = new Login();  // Ensuring that the login instance is created after driver initialization
    }

    @After
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
