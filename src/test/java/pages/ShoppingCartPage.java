package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import utils.Utilities;

import java.io.IOException;

public class ShoppingCartPage extends DriverFactory{

    public void verifyTitleOfPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }
    public void navigateBackToLandingPage() throws IOException {
        String url = PropertyReader.getInstance().readProperty("URL");
        driver.get(url);
    }
}
