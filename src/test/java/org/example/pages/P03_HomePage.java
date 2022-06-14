package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P03_HomePage {
    WebDriver driver;

    public P03_HomePage(WebDriver driver){
        this.driver = driver;

    }

    public void selectEuro(){
        WebElement menu =  Hooks.driver.findElement(By.name("customerCurrency"));
        Select select = new Select(menu);
        select.selectByIndex(1);
    }
    public List<WebElement> productspriceList()
    {

        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }
    public WebElement searchBoxPOM(){
        return Hooks.driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]"));
    }

    public List<WebElement> productTitleList(){
        return Hooks.driver.findElements(By.xpath("//*[@class=\"product-title\"]//a[1]"));

    }
}