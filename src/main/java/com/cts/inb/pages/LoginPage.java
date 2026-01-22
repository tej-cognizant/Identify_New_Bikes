package com.cts.inb.pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class LoginPage extends BasePage {

    // Locators using @FindBy
    @FindBy(id = "des_lIcon")
    //Fill code here
    private WebElement loginIcon;

    @FindBy(className = "googleSignIn")
    private WebElement googleSignInButton;

    @FindBy(id = "identifierId")
    private WebElement emailInput;

    @FindBy(xpath = "//button//span[text()='Next']")
    private WebElement nextButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginIcon() throws InterruptedException {
        // Fill Code Here
    }

    public void clickGoogleSignIn() throws InterruptedException {
        // Fill Code Here
    }

    public void switchToGoogleLoginWindow() {
        // Fill Code Here
    }

    public void enterEmail(String email) throws InterruptedException {
        // Fill Code Here
    }

    public void clickNext() {
        // Fill Code Here
    }

    public void takeScreenshot(String filePath) {
        // Fill Code Here
    }
}
