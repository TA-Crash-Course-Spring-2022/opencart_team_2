package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCompareAndWishTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());;

        new Navigation().navigateToMainPage();

        new HomePageBL().clickProductButtons(0);
        new ProductPageBL().clickCompareThisProduct();
        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/div[1]/div[2]/div[1]/button[1]")));
        new ProductPageBL().clickAddToWishList();
        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

        new SearchFieldHeaderBL().opencartHomePage();

        new HomePageBL().clickProductButtons(1);
        new ProductPageBL().clickCompareThisProduct();
        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='content']/div[1]/div[2]/div[1]/button[1]")));
        new ProductPageBL().clickAddToWishList();
        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));
    }
}
