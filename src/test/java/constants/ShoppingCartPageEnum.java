package constants;

public enum ShoppingCartPageEnum {

    ENTER_SEARCH_PRODUCT ("//input[@id='twotabsearchtextbox']"),
    CLICK_ON_SEARCH_BTN ("//input[@id='nav-search-submit-button']"),


    ;

    public String desc;
    ShoppingCartPageEnum(String description) {
        this.desc = description;
    }

    public  String getLocator() {
        return desc;
    }
}

