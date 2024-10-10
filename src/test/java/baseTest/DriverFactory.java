package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import utils.Utilities;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

public class DriverFactory {
    public static WebDriver driver = null;

    @BeforeTest
    public void beforeTest() {
      Logger.getLogger("Before Test logs");
    }

    @BeforeClass
    public void launchBrowser() throws IOException, InterruptedException {
        String browser = PropertyReader.getInstance().readProperty("browser");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("incognito");

        if (browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver(option);
        }
        else if (browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        try { // for me
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Reporter.log("======Launch Browser======", true);
        String url = PropertyReader.getInstance().readProperty("URL");
        driver.get(url);
        Utilities.takeScreenshot(driver,"Initiating Website");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown() {
        Reporter.log("======Browser Closed======", true);
//        driver.quit();
//        driver = null;
    }
}
