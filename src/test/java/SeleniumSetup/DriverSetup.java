package SeleniumSetup;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DriverSetup {

    protected static WebDriver driver;

    @Before
    public void initialize()
    {
       // System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//        driver = new ChromeDriver();
        //      driver.get("https://www.google.com");

        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

        // disable save password
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

    }

    @After
    public void closeBrowser()
    {
        driver.quit();
    }
}
