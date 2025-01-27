package testbase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
    public static WebDriver driver;

//    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.saucedemo.com/");
    }


   
//    	@After
        public void tearDown() {
            if (driver != null) {
                try {
                    // Check if the test failed
                    String testName = this.getClass().getSimpleName();
                    ScreenshotUtil.captureScreenshot(driver, testName);
                } catch (Exception e) {
                    System.out.println("Error capturing screenshot: " + e.getMessage());
                } finally {
                    // Always close the browser
                    driver.quit();
                }
            }
        }
    	public static WebDriver getDriver() {
            return driver;
        }

	
    
}
