package org.example.stepdefs;

import EnumFactory.CollectionPageEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Collectionpagefactory {

    public WebDriver ldriver;


//    WebDriver ldriver;
//    public Collectionpagefactory() {
//        cdriver = pdriver;
//        PageFactory.initElements(pdriver, this);
//    }

//    private WebDriver driver;


    @FindBy(xpath = "//h2[@class='collections__heading']")
    WebElement Heading;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement Addcartbtn;

    @FindBy(xpath = "//button[@data-test='add-to-cart-sauce-labs-backpack']")
    WebElement cartbtn;


//    protected Boolean waitforelementtobeVisible(String locatorValue){
//        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds());
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
//
//    }

    public void validateHeading(Boolean expectedConditon) {
        String locator = CollectionPageEnum.XPATH_COLLECTION_HEADING.getValue();
        String errormsg = null;
        Boolean actualCondition;
        try {
            actualCondition = Boolean.valueOf(locator);
//            actualCondition= waitforelementtobeVisible(locator);
            if (actualCondition && expectedConditon) {
                System.out.println("Locator is  Visible");
            }
        } catch (Exception e) {
            System.out.println("Could not Validate Heading");
        }
    }

    public void verifyTextPresent() {
        String locator = CollectionPageEnum.XPATH_COLLECTION_HEADING.getValue();
//        driver.findElement(By.xpath("//div[@class='shopping_cart_container']")).isDisplayed();

        try {

            if (locator != null) {

                System.out.println("Locator is present on the home page");

            }
        } catch (Exception e) {
            System.out.println("Selenium Wiki test is not present on the home page");
        }
    }


//        public void Clickaddcartbtn() {
////        WebElement addToCartButton = ldriver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//            Addcartbtn.click();


}

//        public void Clickcartbtn() {
//            cartbtn.click();
//        }



