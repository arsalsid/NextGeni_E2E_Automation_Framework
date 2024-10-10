package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.SearchProductEnum;
import utils.Utilities;

import java.io.IOException;

public class SearchProductPage extends DriverFactory {

    //User going to search products on amazon search bar
    public void userSearchVariousProducts() throws IOException {
        Utilities.refreshPage();
        String getItem001 = PropertyReader.getInstance().readProperty("mobile");
        Utilities.enterText(SearchProductEnum.ENTER_PRODUCT_ON_SEARCHBAR_LOCATOR.getLocator(),getItem001);
        Utilities.clickOnButton(SearchProductEnum.CLICK_ON_SEARCH_BTN_LOCATOR.getLocator());
        String getExpectedText = PropertyReader.getInstance().readProperty("searchProductResult");
        Utilities.validateText(SearchProductEnum.VALIDATE_SEARCH_PRODUCT_LOCATOR.getLocator(),getExpectedText);

        Utilities.clickOnButton(SearchProductEnum.ENTER_PRODUCT_ON_SEARCHBAR_LOCATOR.getLocator());
        Utilities.clearSearchBar(SearchProductEnum.ENTER_PRODUCT_ON_SEARCHBAR_LOCATOR.getLocator());
       // Utilities.navigateBackToWindow();
        String getItem002 = PropertyReader.getInstance().readProperty("watches");
        Utilities.enterText(SearchProductEnum.ENTER_PRODUCT_ON_SEARCHBAR_LOCATOR.getLocator(), getItem002);
        Utilities.clickOnButton(SearchProductEnum.CLICK_ON_SEARCH_BTN_LOCATOR.getLocator());
        String getExpectedResult = PropertyReader.getInstance().readProperty("secondSearchProductResult");
        Utilities.validateText(SearchProductEnum.VALIDATE_SEARCH_WATCH_PRODUCT_LOCATOR.getLocator(),getExpectedResult);
    }
}
