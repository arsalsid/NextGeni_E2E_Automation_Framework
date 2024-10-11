package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.ProductDetailsPageEnum;
import constants.ProductListingPageEnum;
import utils.Utilities;

public class ProductDetailsPage extends DriverFactory {


    public void AddToCartProduct () throws Exception {

        String getExpectedResult = PropertyReader.getInstance().readProperty("expectedPriceOnProductDetails");
        Utilities.validateProduct(ProductDetailsPageEnum.VALIDATE_PRICE_OF_ITEM1_PRODUCT_DETAILS.getLocator(),getExpectedResult);
        Utilities.clickOnButton(ProductDetailsPageEnum.ADDTOCART_PRODUCT_DETAILS.getLocator());
        //driver.navigate().to();
    }
}
