package testbase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
    public static void captureScreenshot(WebDriver driver, String testName) {
        // Get current timestamp
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        // Create the screenshot file
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Define destination file path
        String destinationPath = "screenshots/" + testName + "_" + timestamp + ".png";
        try {
            // Save the screenshot to the destination
            FileUtils.copyFile(screenshot, new File(destinationPath));
            System.out.println("Screenshot saved at: " + destinationPath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }
    }
}
