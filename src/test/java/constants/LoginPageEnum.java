package constants;

public enum LoginPageEnum {

    CLICK_ON_SIGNIN_BTN_LOCATOR("//span[text()='Hello, sign in']"),
    ENTER_USERNAME_LOCATOR("//input[@id='ap_email']"),
    ENTER_PASSWORD_LOCATOR("//input[@id='ap_password']"),
    CLICK_ON_CONTINUE_BTN_LOCATOR("//input[@id='continue']"),
    CLICK_ON_SIGNIN_SUBMIT_BTN_LOCATOR("//input[@id='signInSubmit']"),
    VALIDATE_TITLE_ON_SUCCESS_LOGIN_LOCATOR("//span[@id='nav-link-accountList-nav-line-1']"),
    VALIDATE_MSG_ON_FAILURE_LOGIN_LOCATOR("//div[@id='auth-error-message-box']//h4"),
    HINT_MSG_ON_EMPTY_LOGIN_LOCATOR("//div[contains(text(),'Enter your email or mobile phone number')]"),

    ;


    public String desc;

    LoginPageEnum(String description) {
        this.desc = description;
    }
    public String getLocator(){
        return desc;
    }
}
