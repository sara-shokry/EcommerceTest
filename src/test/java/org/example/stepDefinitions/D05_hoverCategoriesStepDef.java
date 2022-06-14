package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.example.pages.P05_CategoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.openqa.selenium.interactions.Actions;

public class D05_hoverCategoriesStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);
    P05_CategoryPage categoryPage =  new P05_CategoryPage(Hooks.driver);


    @Given("hover on categories")
    public void hover_on_category() throws InterruptedException {
        Actions  action = new Actions(Hooks.driver);
        action.moveToElement(homePage.computerCategoryPOM()).perform();
        Thread.sleep(2000);
     }
     @Then("user could select sub_Category if found")
     public void selectSubCategory () throws InterruptedException{
        //homePage.computerCategoryPOM().click();
        homePage.desktopSubCategoryPOM().click();
         Thread.sleep(2000);
     }
    @And("verfiy PageTitle to sub_category")
     public void verfiyPageTitle(){

        String actualTitle = categoryPage.pageTitlePOM().getText();
        actualTitle = actualTitle.toLowerCase().trim();
          Assert.assertTrue(actualTitle.contains("desktops"));
     }


}
