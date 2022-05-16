package com.opencart.team2.ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    private static WebDriver webDriver;

    private Driver(){}

    public static void downloadWebDriver(){
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser(){
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser(){
        DRIVERS.get().close();
    }

}