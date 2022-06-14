package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_LoginPage;
import org.example.pages.P03_HomePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class D03_currenciesStepDef {

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
