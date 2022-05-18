package com.opencart.team2.ui.navigation;

import com.opencart.team2.ui.driver.Driver;
import org.openqa.selenium.WebDriver;

public class Navigation {

    private static WebDriver driver;
    private final String localMainPageUrl="http://localhost/opencart/upload/";
    private final String localAdminMainPageUrl="http://localhost/opencart/upload/admin/";

    public Navigation(){ driver = Driver.DRIVERS.get();}

    public void navigateToUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void navigateToMainPage(){
        navigateToUrl(localMainPageUrl);
    }

    public void navigateToAdminMainPage(){
        navigateToUrl(localAdminMainPageUrl);
    }
}
