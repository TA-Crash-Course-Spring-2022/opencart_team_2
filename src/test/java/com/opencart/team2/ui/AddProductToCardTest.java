package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.HomePageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.business.ShoppingCartBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCardTest extends TestRunner {
    @Test(description = "add product to card")

    private void addProductToCard() {
        new Navigation().navigateToMainPage();

        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(provider.getLoginEmail())
                .passwordLoginInput(provider.getLoginPassword())
                .continueLoginButton();

        new SearchFieldHeaderBL()
                .opencartHomePage();

        new HomePageBL()
                .clickAddToCart(provider.getId2());
        Assert.assertTrue(new HomePageBL().alert().contains("Success: "));

        new HeaderPageBL()
                .clickShoppingCartButton();

        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId1());
    }
}