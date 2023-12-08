package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class loginpagestepdef {

    public  WebDriver driver;
    public loginpage loginpg;
    public Collectionpagefactory collectionpg;

    public void setup(){
        driver = new ChromeDriver();
    }





        @Given("I am On the Login Page")
        public void iAmOnTheLoginPage() {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver","C:\\Users\\afshain.mukhtar\\Downloads\\chromedriver-win64.zip\\chromedriver-win64/chromedriver");
        driver.get("https://www.saucedemo.com/");
            loginpg = new loginpage(driver);

    }

    @Given("I have entered the right Username and password")
    public void iHaveEnteredTheRightUsernameAndPassword() {
        loginpg.enterEmail("standard_user");
        loginpg.enterPassword("secret_sauce");

    }

    @When("The user clicks on login button")
    public void theUserClicksOnLoginButton() throws InterruptedException {
        loginpg.ClickLoginButton();
//        collectionpg = new Collectionpagefactory(driver);
//        collectionpg.verifyTextPresent();
    }

    @Then("Then I should be Logged in successfully")
    public void thenIShouldBeLoggedInSuccessfully() {
    }

    @Given("I have not entered username or password or entered the invalid email or password")
    public void iHaveNotEnteredUsernameOrPasswordOrEnteredTheInvalidEmailOrPassword() {
    }

    @When("The user clicks on the login button")
    public void theUserClicksOnTheLoginButton() {
    }

    @Then("User should be able to see the proper error message")
    public void userShouldBeAbleToSeeTheProperErrorMessage() {
    }

    @Given("User clicks on forgot password link")
    public void userClicksOnForgotPasswordLink() {
    }

    @Then("user should be directed to the password reset page")
    public void userShouldBeDirectedToThePasswordResetPage() {
    }

    @And("User able to see product heading in loginstepdef")
    public void userAbleToSeeProductHeadingInLoginstepdef() {
//        collectionpg = new Collectionpagefactory(driver);
          collectionpg.verifyTextPresent();
    }

    @When("user click on the add to cart button in loginstepdef")
    public void userClickOnTheAddToCartButtonInLoginstepdef() throws InterruptedException {
//        collectionpg = new Collectionpagefactory();
           loginpg.Clickaddcartbtn();

    }
    @Then("add another product in the cart")
    public void addAnotherProductInTheCart() {
        loginpg.addanothercart();


    }

    @Then("User able to click the cart icon in loginstepdef")
    public void userAbleToClickTheCartIconInLoginstepdef() {
//        collectionpg = new Collectionpagefactory();

    }
    @And("user click on the add to cart button")
    public void userClickOnTheAddToCartButton() throws InterruptedException {
        loginpg.Clickaddcartbtn();
//        loginpg.Clickaddcartbtn();
//        System.out.println("68768");
    }

    @Then("User able to click the cart icon")
    public void userAbleToClickTheCartIcon() throws InterruptedException {
            loginpg.Clickcartbtn();
    }

    @And("Select price high to low")
    public void selectPriceHighToLow() {
            loginpg.setselectdrop();


    }

    @And("select the value")
    public void selectTheValue() {
            loginpg.setselectvalue();
    }

    @Then("verify the price of the item")
    public void verifyThePriceOfTheItem() throws InterruptedException {
////            loginpg = new loginpage();
            loginpg.verifyproductprice();


    }


    @Then("remove cart item")
    public void removeCartItem() {
            loginpg.removecart();
        }

    @And("click on checkout")
    public void clickOnCheckout() throws InterruptedException {
            loginpg.chkoutbtn();


    }

    @And("add details of checkout")
    public void addDetailsOfCheckout() {
        loginpg.addfname();
        loginpg.addLname();
        loginpg.addPcode();

    }


    @And("click on continue")
    public void clickOnContinue() {
            loginpg.clickcont();
    }

    @And("click on finish")
    public void clickOnFinish() throws InterruptedException {
            loginpg.clickfns();

    }

    @And("Validate the order is successfully completed")
    public void validateTheOrderIsSuccessfullyCompleted() throws InterruptedException {
            loginpg.setThnkmsg();
            loginpg.setClickMenu();


    }

    @And("click on logout button")
    public void clickOnLogoutButton() throws InterruptedException {
            Thread.sleep(2000);
            loginpg.setLoginBtn();

    }

    @And("Verify the link after logout action")
    public void verifyTheLinkAfterLogoutAction() throws InterruptedException {
            loginpg.logoutlinkchk();
//            System.out.println(geturllogout);
        Thread.sleep(4000);

    }

    @And("Verify the Toast count")
    public void verifyTheToastCount() throws InterruptedException {
            loginpg.chktoast();

    }

    @And("Verify Toast is empty")
    public void verifyToastIsEmpty() throws InterruptedException {
        loginpg.batchempty();


    }

    @And("Check XL sheet")
    public void checkXLSheet() throws IOException {
        loginpg.getdata();

//        Thread.sleep(4000);
//        driver.close();

    }

    @And("Add multiple products in the cart")
    public void addMultipleProductsInTheCart() {
        loginpg.batchempty1();
    }

}
