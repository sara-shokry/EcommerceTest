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
      //  registrationPage.registrationSteps(firstName,lastName,email);
        registrationPage.first_last_name(firstName,lastName);
        registrationPage.selectGender();
        registrationPage.select_date_of_birth();
        registrationPage.emailPOM().sendKeys("test5z8sd@gmail.com");

        registrationPage.passwordPOM().sendKeys("123456789");
        registrationPage.confirmPasswordPOM().sendKeys("123456789");
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


   String expectedColor = "";
   //String actualColor = registrationPage.resultPOM().getCssValue("color");


    }




}
