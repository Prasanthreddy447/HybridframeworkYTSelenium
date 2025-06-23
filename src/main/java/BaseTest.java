import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    // WebDriver instance
    protected WebDriver driver;

    // Method to initialize the WebDriver and launch the browser
    public void setup() {
        // Set the path to the chromedriver executable (adjust based on your system)
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Instantiate the WebDriver
        driver = new ChromeDriver();
    }

    // Method to launch a URL
    public void launchURL(String url) {
        driver.get(url);
    }

    // Method to close the browser
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


class GoogleSearchTest extends BaseTest {

    public void openGoogle() {
        // Launch Google URL
        launchURL("https://www.google.com");

        // You can add additional actions here (like searching, clicking, etc.)
        System.out.println("Google page launched successfully!");
    }

    public static void main(String[] args) {
        // Create an instance of the GoogleSearchTest class
        GoogleSearchTest test = new GoogleSearchTest();

        // Set up the WebDriver and launch the browser
        test.setup();

        // Open Google page
        test.openGoogle();
        
        

        // Close the browser
        test.tearDown();
    }
}

