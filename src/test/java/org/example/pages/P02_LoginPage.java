package org.example.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;

public class P02_LoginPage {

    WebDriver driver;
    public P02_LoginPage(WebDriver d){
    driver = d;

    }

    public WebElement emailPOM(){
        By email = By.id("Email");
        WebElement emailEle = Hooks.driver.findElement(email);
        return emailEle;
    }

    public WebElement passwordPOM(){
        By email = By.id("Password");
        WebElement ele = Hooks.driver.findElement(email);
        return ele;
    }

    public void loginSteps( String email , String password){
        emailPOM().clear();
        emailPOM().sendKeys(email);
        passwordPOM().clear();
        passwordPOM().sendKeys(password);
    }

    public WebElement loginLink(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));

    }
    public WebElement accountTab(){
        return Hooks.driver.findElement(By.cssSelector("a[class=\"ico-account\"]"));
    }
}
