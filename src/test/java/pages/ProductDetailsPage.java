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
        Utilities.waitForElementToBeClickable(ProductDetailsPageEnum.ADDTOCART_PRODUCT_DETAILS_BTN1.getLocator());
        Utilities.clickOnButton(ProductDetailsPageEnum.ADDTOCART_PRODUCT_DETAILS_BTN1.getLocator());
        String getExpectedCartMessage = PropertyReader.getInstance().readProperty("expectedTextCartAdded");
        Utilities.validateText(ProductDetailsPageEnum.ADDED_TO_CART_SUCESSFULLY.getLocator(), getExpectedCartMessage);

        Utilities.scrollDown(driver,200);
        Utilities.clickOnButton(ProductDetailsPageEnum.CLICK_ON_PRODUCT2.getLocator());
        String getExpectedPrice = PropertyReader.getInstance().readProperty("expectedPriceOf2ndProductDetails");
        Utilities.validateProduct(ProductDetailsPageEnum.VALIDATE_PRICE_OF_ITEM2_PRODUCT_DETAILS.getLocator(),getExpectedPrice);

  //      Utilities.waitForElementToBeClickable(ProductDetailsPageEnum.ADDTOCART_PRODUCT_DETAILS_BTN2.getLocator());
        Utilities.clickOnButton(ProductDetailsPageEnum.ADDTOCART_PRODUCT_DETAILS_BTN2.getLocator());

//        Utilities.waitForElementToBeClickable(ProductDetailsPageEnum.CLICK_ON_GOTO_CART_BTN.getLocator());
//        Utilities.clickOnButton(ProductDetailsPageEnum.CLICK_ON_GOTO_CART_BTN.getLocator());

    }
}
