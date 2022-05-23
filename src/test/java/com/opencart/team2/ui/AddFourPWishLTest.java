package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HomePageBL;
import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class AddFourPWishLTest extends TestRunner {

    @Test
    public void Test() {

        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        new Navigation().navigateToMainPage();

        new HomePageBL().clickAddToWishListButton(0);
        Assert.assertTrue(new HomePageBL().alert().contains("Success: "));
        //new HomePageBL().clickAlertCloseButton();

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")));
        new HomePageBL().clickAddToWishListButton(1);
        Assert.assertTrue(new HomePageBL().alert().contains("Success: "));
        //new HomePageBL().clickAlertCloseButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")));
        new HomePageBL().clickAddToWishListButton(2);
        Assert.assertTrue(new HomePageBL().alert().contains("Success: "));
        new HomePageBL().clickAlertCloseButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")));
        new HomePageBL().clickAddToWishListButton(3);
        Assert.assertTrue(new HomePageBL().alert().contains("Success: "));
        new HomePageBL().clickAlertCloseButton();
    }
}
