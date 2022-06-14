package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class D04_searchStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);
    String keyWord = "";
    @Given("Select searchBox")
    public void Select_searchBox(){
        homePage.searchBoxPOM().click();
        homePage.searchBoxPOM().clear();
     }
     @When("^search for any product like \"(.*)\"$")
     public void addSearchWord(String keyWord){
        homePage.searchBoxPOM().sendKeys(keyWord);
        this.keyWord = keyWord;
     }
    @And("click search")
    public void clickSearch() throws InterruptedException  {
        homePage.searchBoxPOM().sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }
     @Then("verfiy url contains nopCommerce demo store. Search")
     public void validateSearchUrl ()throws InterruptedException {
        String actualURl =  Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualURl.contains("https://demo.nopcommerce.com/search"));
    }
    @And("verfiy search shows relevant results")
    public void verfiyShowResult(){
        List<WebElement> productTitleList = homePage.productTitleList();
        for ( int i=0; i <productTitleList.size() ; i++){
            String actualTitle = productTitleList.get(i).getText();
            System.out.println("acutal -------- "+ actualTitle);
            Assert.assertTrue(actualTitle.contains(keyWord));
        }


    }

}



