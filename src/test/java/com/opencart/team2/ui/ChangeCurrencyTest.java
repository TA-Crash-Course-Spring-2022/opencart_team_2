package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ChangeCurrencyTest extends TestRunner{

    @Test(description = "change currency")

    private void changeCurrency() {
        new Navigation().navigateToMainPage();

        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(provider.getLoginEmail())
                .passwordLoginInput(provider.getLoginPassword())
                .continueLoginButton();

        new HeaderPageBL()
                .selectCurrency(provider.getNewCurrency());

        new WebDriverWait(driver, Duration.ofSeconds(10)).
         until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='pull-left']//div[@class='btn-group']//strong")));

        Assert.assertTrue(new HeaderPageBL().getAlert().contains("€"));
    }
}
