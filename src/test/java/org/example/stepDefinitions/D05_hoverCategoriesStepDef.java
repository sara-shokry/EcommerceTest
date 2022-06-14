package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.openqa.selenium.interactions.Actions;

public class D05_hoverCategoriesStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);

    @Given("Select Euro currency from the dropdown list")
    public void Select_Euro_currency(){
        homePage.selectEuro();
     }
     @Then("validate currency changed for each product")
     public void validateEuroPrice (){
        List<WebElement> productPricesList = homePage.productspriceList();

         for (int i = 0 ; i < productPricesList.size() ; i++){
             String price = productPricesList.get(i).getText();
             Assert.assertTrue(price.contains("€"));

         }

     }


}
