package org.example.stepDefinitions;

import org.example.pages.P02_LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class D02_LoginStepDef {

    P02_LoginPage loginPage = new P02_LoginPage(Hooks.driver);

    @Given("user navigate to login page")
    public void navigate_to_login (){
        loginPage.loginLink().click();
     }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void enterValidRegistrationData(String email, String password){
    loginPage.loginSteps(email,password);
    }

    @And("user click on login button")
    public void click_login_button () throws InterruptedException {

        loginPage.passwordPOM().sendKeys(Keys.ENTER);
        Thread.sleep(4000);

    }
    @Then("user could loggedIn successfully and go to home page")
    public void success_login () throws InterruptedException {
        Assert.assertEquals("https://demo.nopcommerce.com/", Hooks.driver.getCurrentUrl());
        Assert.assertTrue("--------- Failed to login ----------",true);
    }
    @And("account tab is displayed")
    public void accountTabDisplayed() throws InterruptedException {
        Assert.assertTrue(loginPage.accountTab().isDisplayed());
        Assert.assertTrue("--------- Failed to display account tab ----------",true);
    }
}
