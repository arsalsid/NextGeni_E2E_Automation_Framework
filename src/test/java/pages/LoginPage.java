package pages;

import baseTest.DriverFactory;
import baseTest.PropertyReader;
import constants.LoginPageEnum;
import utils.Utilities;

import java.io.IOException;

public class LoginPage extends DriverFactory {

    public void verifyTitleOfPage(String expectedValue) {
        Utilities.AssertTitle(expectedValue);
    }

    //User login with empty testData
    public void loginWithEmptyUserNameAndEmptyPassword() throws IOException {
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_SIGNIN_BTN_LOCATOR.getLocator());
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_CONTINUE_BTN_LOCATOR.getLocator());
        String getHintText = PropertyReader.getInstance().readProperty("hintMessage");
        Utilities.validateText(LoginPageEnum.HINT_MSG_ON_EMPTY_LOGIN_LOCATOR.getLocator(),getHintText);
    }

    //User login with Invalid testData
    public void loginWithInvalidUserNameAndInvalidPassword() throws IOException, InterruptedException {
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_SIGNIN_BTN_LOCATOR.getLocator());
        String Username = PropertyReader.getInstance().readProperty("invalidEmail");
        Utilities.enterText(LoginPageEnum.ENTER_USERNAME_LOCATOR.getLocator(),Username);
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_CONTINUE_BTN_LOCATOR.getLocator());
        Utilities.toBeClickOnButton(LoginPageEnum.CLICK_ON_CONTINUE_BTN_LOCATOR.getLocator());
        String getErrorMessage = PropertyReader.getInstance().readProperty("failureErrorMessage");
        Utilities.validateText(LoginPageEnum.VALIDATE_MSG_ON_FAILURE_LOGIN_LOCATOR.getLocator(), getErrorMessage);
        String password = PropertyReader.getInstance().readProperty("invalidPassword");
        Utilities.enterText(LoginPageEnum.ENTER_PASSWORD_LOCATOR.getLocator(), password);
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_SIGNIN_SUBMIT_BTN_LOCATOR.getLocator());
    }

    //User login with Valid testData
    public void loginWithValidUserNameAndPassword() throws IOException {
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_SIGNIN_BTN_LOCATOR.getLocator());
        String Username = PropertyReader.getInstance().readProperty("email");
        Utilities.enterText(LoginPageEnum.ENTER_USERNAME_LOCATOR.getLocator(),Username);
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_CONTINUE_BTN_LOCATOR.getLocator());
        String password = PropertyReader.getInstance().readProperty("password");
        Utilities.enterText(LoginPageEnum.ENTER_PASSWORD_LOCATOR.getLocator(), password);
        Utilities.clickOnButton(LoginPageEnum.CLICK_ON_SIGNIN_SUBMIT_BTN_LOCATOR.getLocator());
        String getExpectedText = PropertyReader.getInstance().readProperty("expectedText");
        Utilities.validateText(LoginPageEnum.VALIDATE_TITLE_ON_SUCCESS_LOGIN_LOCATOR.getLocator(),getExpectedText);
    }
//    public void getValidateText(String expectedResult) throws Exception {
//    Utilities.validateText(LoginPageEnum.VALIDATE_TITLE_ON_SUCCESS_LOGIN_LOCATOR.getLocator(),expectedResult);
//    }

}
