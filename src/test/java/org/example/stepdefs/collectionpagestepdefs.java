package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class collectionpagestepdefs {

    public WebDriver ldriver;
    public Collectionpagefactory collectionpg;



    @And("User able to see product heading")
    public void UserAbleToSeeProductHeading()  {

        collectionpg = new Collectionpagefactory();
        collectionpg.verifyTextPresent();

    }

    }



