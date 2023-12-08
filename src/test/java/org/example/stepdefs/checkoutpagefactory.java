package org.example.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class checkoutpagefactory {

    WebDriver ldriver;

    public checkoutpagefactory(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
}