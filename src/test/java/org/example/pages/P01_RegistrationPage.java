package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.support.ui.Select;


public class P01_RegistrationPage {
    WebDriver driver;

    public P01_RegistrationPage(WebDriver driver){
        this.driver = driver;

    }


    public WebElement firstnamePOM(){
        By firstName = By.id("FirstName");
        WebElement firstNameEle = Hooks.driver.findElement(firstName);
        return firstNameEle;
    }
    public WebElement lastNamePOM(){
        By firstName = By.id("LastName");
        WebElement ele = Hooks.driver.findElement(firstName);
        return ele;


    }
    public WebElement emailPOM(){
        By email = By.id("Email");
        WebElement ele = Hooks.driver.findElement(email);
        return ele;
    }

    public WebElement passwordPOM(){
        By email = By.id("Password");
        WebElement ele = Hooks.driver.findElement(email);
        return ele;
    }
    public WebElement confirmPasswordPOM(){
        By email = By.id("ConfirmPassword");
        WebElement ele = Hooks.driver.findElement(email);
        return ele;
    }
    public void selectGender()
    {
        Hooks.driver.findElement(By.id("gender-male")).click();
    }
    public void first_last_name(String firstname, String lastname)
    {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(firstname);
        Hooks.driver.findElement(By.id("LastName")).sendKeys(lastname);
    }
    public void your_password(String password, String confirmpassword)
    {
//        Hooks.driver.findElement(By.id("Password\")).sendKeys(password);
//        Hooks.driver.findElement(By.id(“ConfirmPassword”)).sendKeys(confirmpassword);
    }
    public WebElement registrationLink(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));
    }
    public void select_date_of_birth()
    {

        WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select select = new Select(birthDay);
        select.selectByIndex(10);

        WebElement birthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        select = new Select(birthMonth);
        select.selectByIndex(4);

        WebElement birthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1990");
    }

    public void registrationSteps(String firstname , String lastname){
        first_last_name(firstname,lastname);
        selectGender();
        select_date_of_birth();
        emailPOM().sendKeys("testxzxing123dfdsdfsdfsdfsdf@gmail.com");
        firstnamePOM().clear();
        firstnamePOM().sendKeys("lllllllll");
        passwordPOM().sendKeys("123456789");
        confirmPasswordPOM().sendKeys("123456789");

    }


    public WebElement registrationButtonPOM(){

        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement resultPOM(){
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}
