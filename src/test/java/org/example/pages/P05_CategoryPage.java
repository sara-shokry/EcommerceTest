package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P05_CategoryPage {
    WebDriver driver;

    public P05_CategoryPage(WebDriver driver){
        this.driver = driver;

    }

    public WebElement pageTitlePOM(){

        return Hooks.driver.findElement(By.xpath("//*[@class=\"page-title\"]//h1[1]"));

    }

}
