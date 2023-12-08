package EnumFactory;

public enum CollectionPageEnum {

    XPATH_COLLECTION_HEADING("//div[@class='shopping_cart_container']"),
    XPATH_ADDCART_BUTTON("//button[@data-test='add-to-cart-sauce-labs-backpack']"),
    XPATH_CART_ICON("//button[@data-test='add-to-cart-sauce-labs-backpack']");


    private String pageVariables;

    private  CollectionPageEnum(String pageVariables){this.pageVariables = pageVariables;}

    public String getValue() {return this.pageVariables;}
}
