package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.example.pages.P05_CategoryPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
         //clicking sign up
         WebDriverWait wait =  new WebDriverWait(Hooks.driver, Duration.ofSeconds(4));
         wait.until(ExpectedConditions.elementToBeClickable(homePage.computerCategoryPOM()));
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
