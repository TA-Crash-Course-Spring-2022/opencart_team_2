package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddTwoProductsToCartTest extends TestRunner {

    @Test(description = "using home page")
    public void addCartTest() {

        new Navigation()
                .navigateToMainPage();
        new HomePageBL()
                .clickAddToCart(provider.getId2());
        Assert.assertTrue(new HomePageBL().getAlertText().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new HomePageBL()
                .clickAddToCart(provider.getId1());
        Assert.assertTrue(new HomePageBL().getAlertText().contains("Success: "));
        new MainPageBL()
                .clickShoppingCartButton();

        int elementSelected = new ShoppingCartBL().getSizeText();
        Assert.assertEquals(elementSelected, provider.getExpected2());
        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId2());
        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId1());
    }
}
