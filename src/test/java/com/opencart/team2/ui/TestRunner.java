package com.opencart.team2.ui;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.utils.MainValuesProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.time.Duration;

public class TestRunner {
    protected WebDriver driver;
    protected MainValuesProvider provider;

    @BeforeSuite
    public void beforeSuite(){
        Driver.downloadWebDriver();
        try {
            provider= new MainValuesProvider();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    @BeforeMethod
    public void beforeMethod(){
        Driver.instanceWebBrowser();
        driver = Driver.DRIVERS.get();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void afterMethod(){
        Driver.closeBrowser();
    }
}
