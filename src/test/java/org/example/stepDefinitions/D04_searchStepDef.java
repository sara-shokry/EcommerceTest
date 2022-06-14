package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P04_ProductPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class D04_searchStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);
    P04_ProductPage productPage = new P04_ProductPage(Hooks.driver);
    String keyWord = "";
    String sku = "";
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
    public void verfiyShowResult() throws InterruptedException {
        List<WebElement> productTitleList = homePage.productTitleList();
        for (int i = 0; i < productTitleList.size(); i++) {
            String actualTitle = productTitleList.get(i).getText();
            Thread.sleep(2000);
            System.out.println("Current url -------- " + Hooks.driver.getCurrentUrl());
            Assert.assertTrue(actualTitle.contains(keyWord));
        }
    }

        @When("^search for any product sku \"(.*)\"$")
        public void addSearchSKU(String sku){
            homePage.searchBoxPOM().sendKeys(sku);
            this.sku = sku;
        }

    @Then("verfiy sku shown in each product list")
    public void verfiySKU() throws InterruptedException {
        List<WebElement> productTitleList = homePage.productTitleList();
        Assert.assertTrue(productTitleList.size() == 1);
//        for (int i = 0; i < productTitleList.size(); i++) {
//            // click on product title
//            productTitleList.get(i).click();
//            Thread.sleep(2000);
//            String acutalSKU = productPage.skuPOM().getText();
//            System.out.println("acutal sku -------- " + acutalSKU);
//            Assert.assertTrue(acutalSKU.contains(sku));
//        }
//| SCI_FAITHA |
//      | PPLE_CAM |
        productTitleList.get(0).click();
            Thread.sleep(2000);
        System.out.println("Current url -------- " + Hooks.driver.getCurrentUrl());
            String acutalSKU = productPage.skuPOM().getText();

            System.out.println("acutal sku -------- " + acutalSKU);
            Assert.assertTrue(acutalSKU.contains(sku));
    }



}



