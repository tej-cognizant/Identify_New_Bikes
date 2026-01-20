package com.cts.inb.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        // Fill Code Here
    }

    public void scrollByPercentage(double percentage) throws InterruptedException {
        // Fill Code Here
    }

    public void scrollToTop() throws InterruptedException {
        // Fill Code Here
    }
}
