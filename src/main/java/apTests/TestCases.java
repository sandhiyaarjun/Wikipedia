
package apTests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import java.util.logging.Level;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.BrowserType;
///
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCases {
    RemoteWebDriver driver;

    public TestCases() throws MalformedURLException {
        System.out.println("Constructor: TestCases");

        final DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(BrowserType.CHROME);
        driver = new RemoteWebDriver(new URL("http://localhost:8082/wd/hub"), capabilities);


        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase01() {
        System.out.println("Start Test case: testCase01");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase01");
    }

    public void testCase02() {
        System.out.println("Start Test case: testCase02");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase02");
    }


    public void testCase03() {
        System.out.println("Start Test case: testCase03");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase03");
    }


    public void testCase04() {
        System.out.println("Start Test case: testCase04");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase04");
    }


    public void testCase05() {
        System.out.println("Start Test case: testCase05");
        driver.get("https://www.google.com");
        System.out.println("end Test case: testCase05");
    }

    public RemoteWebDriver getDriver(){
        return driver;
    }


}

