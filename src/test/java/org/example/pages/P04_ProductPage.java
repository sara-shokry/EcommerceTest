package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class P04_ProductPage {
    WebDriver driver;

    public P04_ProductPage(WebDriver driver){
        this.driver = driver;

    }

    public WebElement skuPOM(){

        return Hooks.driver.findElement(By.xpath("//*[@class=\"sku\"]//span[2]"));

    }

}
