package constants;

public enum SearchProductEnum {
    ENTER_PRODUCT_ON_SEARCHBAR_LOCATOR("//input[@id='twotabsearchtextbox']"),
    CLICK_ON_SEARCH_BTN_LOCATOR("//input[@value='Go']"),
    VALIDATE_SEARCH_PRODUCT_LOCATOR("//span[text()='\"iPhone\"']"),
    VALIDATE_SEARCH_WATCH_PRODUCT_LOCATOR("//span[text()='\"smart watch\"']"),



    ;

    private String desc;

    SearchProductEnum(String description){
        this.desc = description;
    }
    public String getLocator(){
        return desc;
    }
}
