package org.example.stepDefinitions;

import org.example.pages.P01_RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.Color;
public class D01_RegistrationStepDef {


    P01_RegistrationPage registrationPage = new P01_RegistrationPage(Hooks.driver);

    @Given("user navigate to registration page")
    public void navigate_to_registration (){

        registrationPage.registrationLink().click();
    }

    @When("^user enter valid data \"(.*)\" and \"(.*)\"$")
    public void enterValidRegistrationData(String firstName, String lastName){
        registrationPage.registrationSteps(firstName,lastName);
    }

    @And("user click on register button")
    public void click_registration_button () throws InterruptedException {
    registrationPage.registrationButtonPOM().click();
    Thread.sleep(3000);
    }
    @Then("user could registered successfully")
    public void success_registration (){
    String expectedResult = "Your registration completed";
    String actualResult = registrationPage.resultPOM().getText();
          Assert.assertEquals(expectedResult, actualResult);
          Assert.assertTrue("--------- Failed to register ----------",true);

   String expectedColor = "";
   //String actualColor = registrationPage.resultPOM().getCssValue("color");


    }




}
