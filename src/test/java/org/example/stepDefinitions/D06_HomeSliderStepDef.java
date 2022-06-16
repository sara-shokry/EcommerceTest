package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.example.pages.P05_CategoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class D06_HomeSliderStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);
    P05_CategoryPage categoryPage =  new P05_CategoryPage(Hooks.driver);


    @Given("Select first slide")
    public void select_first_Slide() throws InterruptedException {
       WebElement slide= homePage.sliderNavigation(1);
       slide.click();
     }
     @Then("^verfiy first link \"(.*)\"$")
     public void verfiyFirstSlideLink (String firstLink) throws InterruptedException{
         String actualURl =  Hooks.driver.getCurrentUrl();
         Assert.assertTrue(actualURl.contains(firstLink));

     }
    @Given("Select second slide")
    public void select_second_Slide() throws InterruptedException {
        WebElement slide= homePage.sliderNavigation(2);
        slide.click();
    }
    @Then("^verfiy second link \"(.*)\"$")
    public void verfiySecondSlideLink (String secondLink) throws InterruptedException{
        String actualURl =  Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualURl.contains(secondLink));
    }


}
