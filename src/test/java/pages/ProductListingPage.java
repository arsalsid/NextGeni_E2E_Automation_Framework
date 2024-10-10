package pages;

import baseTest.DriverFactory;
import utils.Utilities;

public class ProductListingPage extends DriverFactory {

    public void verifyTitleOfProductPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }
}
