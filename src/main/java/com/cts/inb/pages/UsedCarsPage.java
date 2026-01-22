package com.cts.inb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class UsedCarsPage extends BasePage {

    // Locators using @FindBy
    @FindBy(css = "li a[data-city_id='280']")
    private WebElement cityLink;

    public UsedCarsPage(WebDriver driver) {
        super(driver);
    }

    public void selectCity() throws InterruptedException {
        // Fill Code Here
    }

    public void displayUsedCars() {
        // Fill Code Here
    }
}
