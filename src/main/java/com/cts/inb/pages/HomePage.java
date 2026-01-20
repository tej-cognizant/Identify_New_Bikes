package com.cts.inb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class HomePage extends BasePage {
    private Actions actions;

    // Locators using @FindBy
    @FindBy(xpath = "//span[normalize-space()='NEW BIKES']")
    private WebElement newBikesTab;

    @FindBy(xpath = "//a[@data-track-label='nav-upcoming-bikes' and contains(text(),'Upcoming Bikes')]")
    private WebElement upcomingBikesLink;

    @FindBy(xpath = "//span[normalize-space()='MORE']")
    private WebElement moreMenu;

    @FindBy(xpath = "//a[@data-track-label='nav-used-car' and contains(text(),'Used Cars')]")
    private WebElement usedCarsLink;

    public HomePage(WebDriver driver) {
        super(driver);
        // Fill Code Here
    }

    public void hoverOnNewBikes() {
        // Fill Code Here
    }

    public void clickUpcomingBikes() throws InterruptedException {
        // Fill Code Here
    }

    public void hoverOnMoreMenu() throws InterruptedException {
        // Fill Code Here
    }

    public void clickUsedCars() throws InterruptedException {
        // Fill Code Here
    }
}
