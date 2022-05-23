package com.opencart.team2.ui.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Driver {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    private static WebDriver driver;

    private Driver(){}

    public static void downloadWebDriver(String browser) {
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
        } else {
            WebDriverManager.operadriver().setup();
        }
    }

    public static void instanceWebBrowser(String browser) {
        if (browser.equals("chrome")) {
            driver = new ChromeDriver();
        } else {
            driver = new OperaDriver();
        }
        DRIVERS.set(driver);
    }

    public static void closeWebBrowser() { driver.quit();}

}
