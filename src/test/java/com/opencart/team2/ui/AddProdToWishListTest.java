package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProdToWishListTest extends TestRunner {

    @Test(description = "add product to wish list")
    public void addWishList() {

        new Navigation().navigateToMainPage();
        new MainPageBL()
                .selectLogin()
                .inputLoginEmail(provider.getLoginEmail())
                .inputLoginPassword(provider.getLoginPassword())
                .continueLoginButton();
        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch();
        new ProductSearchPageBL()
                .clickAddToWishListButton(provider.getId2());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new MainPageBL()
                .clickWishListButton();
        int elementSelected = new WishListPageBL().getSizeText();
        Assert.assertEquals(elementSelected, provider.getExpected1());
        new WishListPageBL()
                .removeButton(provider.getId1());
    }
}

