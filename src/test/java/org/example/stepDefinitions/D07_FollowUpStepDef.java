package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_HomePage;
import org.example.pages.P05_CategoryPage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class D07_FollowUpStepDef {

    P03_HomePage homePage = new P03_HomePage(Hooks.driver);
    String fbLink= "";
    String rrsLink = "";
    String twitterLink = "";


    @Given("user click on facebook")
    public void user_click_FB() throws InterruptedException {

        homePage.facebookPOM().click();
     }

    @And("switch to the next tab")
    public void switchTab(){
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
    }

     @Then("^verfiy the facebook url \"(.*)\"$")
    public void verfiyFBLink(String fbUrl){
        String actualURl = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualURl.contains(fbUrl));
        Hooks.driver.close();
     }

    @Given("user click on twitter")
    public void user_click_twitter() {

        homePage.twitterPOM().click();
    }

    @Then("^verfiy the twitter url \"(.*)\"$")
    public void verfiyTwitterLink(String twitterUrl){
        String actualURl = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualURl.contains(twitterUrl));
        Hooks.driver.close();
    }
    @Given("user click on rss")
    public void rrs() throws InterruptedException {

        homePage.rrsPOM().click();
    }
    @Then("^verfiy the rss url \"(.*)\"$")
    public void verfiyRRSLink(String rrsUrl){
        String actualURl = Hooks.driver.getCurrentUrl();
        Assert.assertTrue(actualURl.contains(rrsUrl));
        Hooks.driver.close();
    }
}
