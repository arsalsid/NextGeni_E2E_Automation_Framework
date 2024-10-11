package constants;

public enum ProductDetailsPageEnum {

    VALIDATE_PRICE_OF_ITEM1_PRODUCT_DETAILS("(//span[@class='a-price-whole'])[7]"),
    ADDTOCART_PRODUCT_DETAILS("//input[@id='add-to-cart-button']"),

    ;

    public String desc;

    ProductDetailsPageEnum(String description) {
        this.desc = description;
    }

    public  String getLocator() {
        return desc;
    }
}

