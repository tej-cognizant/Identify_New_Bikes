package com.cts.inb.tests;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.cts.inb.pages.HomePage;
import com.cts.inb.pages.LoginPage;
import com.cts.inb.pages.UpcomingBikes;
import com.cts.inb.pages.UsedCarsPage;
import com.cts.inb.pages.YamahaBikes;
import com.cts.inb.utils.ExtentReportManager;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    protected UpcomingBikes upcomingBikesPage;
    protected YamahaBikes yamahaBikesPage;
    protected UsedCarsPage usedCarsPage;
    protected LoginPage loginPage;

    @BeforeSuite
    public void setupReport() {
        // Fill Code Here
    }

    @BeforeMethod
    public void setup() {
        // Fill Code Here
    }

    @AfterMethod
    public void tearDown() {
        // Fill Code Here
    }

    @AfterSuite
    public void tearDownReport() {
        // Fill Code Here
    }
}
