package com.cts.inb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UpcomingBikes extends BasePage {

    // Locators using @FindBy
    @FindBy(css = "[data-track-label='upcoming-bikes-under-2-lakhs']")
    private WebElement bikesUnder2LakhsLink;

    @FindBy(xpath = "//div[@class='ht-20' and contains(text(),'Yamaha')]")
    private WebElement yamahaLink;

    public UpcomingBikes(WebDriver driver) {
        super(driver);
    }

    public void clickBikesUnder2Lakhs() throws InterruptedException {
        // Fill Code Here
    }

    public void clickYamahaBrand() throws InterruptedException {
        // Fill Code Here
    }
}
