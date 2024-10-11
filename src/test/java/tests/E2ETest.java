package tests;

import baseTest.DriverFactory;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.ProductDetailsPage;
import pages.ProductListingPage;
import utils.Utilities;
import java.lang.reflect.Method;
import static utils.extentReports.ExtentTestManager.startTest;


public class E2ETest extends DriverFactory {

    LandingPage landingPage = new LandingPage();
    ProductListingPage productListingPage = new ProductListingPage();
    ProductDetailsPage productDetails = new ProductDetailsPage();
    @Test(description = "Verify Title of landingPage", priority = 1)
    public void verifyTitleOfLandingPage(Method method) throws Exception {
        startTest(method.getName(), "Verify Title of landingPage");
        landingPage.verifyTitleOfPage("Amazon.com. Spend less. Smile more.");
        Utilities.takeScreenshot(driver,"LandingPage");
    }

    @Test(description = "User Enter the product item in a search bar", priority = 2)
    public void enterSearchItemOnLandingPage(Method method) throws Exception {
        startTest(method.getName(), "Enter Search Item on LandingPage");
        landingPage.searchProduct();
        Utilities.takeScreenshot(driver,"LandingPage");
//        Thread.sleep(10000);
    }

    @Test(description = "Verify Title of Product Page", priority = 3)
    public void verifyTitleOfProductPage(Method method) throws Exception {
        startTest(method.getName(), "Verify Title of ProductPage");
        productListingPage.verifyTitleOfProductPage("toys");
        Utilities.takeScreenshot(driver,"ProductPage");
    }

    @Test(description = "Select Products of Product Listing Page", priority = 4)
    public void selectProductsOfProductListingPage(Method method) throws Exception {
        startTest(method.getName(), "Select Products of ProductListingPage");
        productListingPage.selectProductItem();
        Utilities.takeScreenshot(driver,"ProductListingPage");
    }

    @Test(description = "Add to Cart Product Details Page", priority = 4)
    public void addToCartOnProductDetailsPage(Method method) throws Exception {
        startTest(method.getName(), "Add to Cart ProductDetailsPage");
        productDetails.AddToCartProduct();
        Utilities.takeScreenshot(driver,"ProductDetailsPage");
    }


//    @Test(description = "User login with empty credentials Testcase-001", priority = 2)
//    public void userLoginWithEmptyCredentials(Method method) throws Exception {
//        startTest(method.getName(), "User login with Empty credentials");
//        loginPage.loginWithEmptyUserNameAndEmptyPassword();
//        Utilities.takeScreenshot(driver,"User login with Empty credentials Testcase-001");
//    }
//    @Test(description = "User login with Invalid credentials Testcase-002", priority = 3)
//    public void userLoginWithInvalidCredentials(Method method) throws Exception {
//        startTest(method.getName(), "User login with Invalid credentials");
//        loginPage.loginWithInvalidUserNameAndInvalidPassword();
//        Utilities.takeScreenshot(driver,"User login with Invalid credentials Testcase-002");
//    }
//
//    @Test(description = "User login with valid credentials Testcase-003", priority = 4)ProductListingPageEnum
//    public void userLoginWithValidCredentials(Method method) throws Exception {
//        startTest(method.getName(), "User login with valid credentials");
//        loginPage.loginWithValidUserNameAndPassword();
//        Utilities.takeScreenshot(driver,"User login with valid credentials Testcase-003");
//
//    }
//
//    @Test(description = "User Search Various Products Testcase-004", priority = 4)
//    public void userSearchVariousProducts(Method method) throws Exception {
//        startTest(method.getName(), "User Search Various Products");
//        searchProduct.userSearchVariousProducts();
//        Utilities.takeScreenshot(driver,"User Search Various Products Testcase-004");
//
//    }
}
