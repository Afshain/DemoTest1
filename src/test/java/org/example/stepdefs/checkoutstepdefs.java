package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class checkoutstepdefs {

    public WebDriver driver;
    public checkoutstepdefs checkoutpg;
    public loginpage logindp;




    @Given("click checkout cart button")
    public void clickCheckoutCartButton() {


    }

    @When("enter details of checkout")
    public void enterDetailsOfCheckout() {
    }

    @And("click checkout button")
    public void clickCheckoutButton() {
    }

    @Then("Logout the application")
    public void logoutTheApplication() {
    }
}
