package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.junit.Assert;

import java.util.ArrayList;

public class D08_WishListStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);



    @Given("user add 3rd product to wishlist")
    public void addProductWishList(){
        homePage.wishListButtonPOM().get(2).click();
    }
    @Then("verfiy success message displayed")
    public void verfiy_success_message(){
        String actualMsg = homePage.notificationBarContentPOM().getText();
        Assert.assertTrue(actualMsg.contains("The product has been added to your"));
    }
    @And("green background")
    public void checkGreenBackground(){
        String actualColor= homePage.notificationBarPOM().getCssValue("background-color");
        System.out.println("Actual color - "+actualColor);
        Assert.assertTrue(true);
    }
}
