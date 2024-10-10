package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.LandingPageEnum;
import utils.Utilities;

import java.io.IOException;

public class LandingPage extends DriverFactory {

    public void verifyTitleOfPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }
    public void searchProduct() throws IOException {
        String productItem = PropertyReader.getInstance().readProperty("product");
        Utilities.enterText(LandingPageEnum.ENTER_SEARCH_PRODUCT.getLocator(), productItem);
        Utilities.clickOnButton(LandingPageEnum.CLICK_ON_SEARCH_BTN.getLocator());
    }

}
