package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddFourProdToCartSearchTest extends TestRunner{

    @Test(description = "using search")
    public void addCartTest() {
        new Navigation().navigateToMainPage();
        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch()
                .clickAddToCart(provider.getId1());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new ProductSearchPageBL()
                .clickAddToCart(provider.getId2());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new ProductSearchPageBL()
                .clickAddToCart(provider.getId3());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new ProductSearchPageBL()
                .clickAddToCart(provider.getId4());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new MainPageBL()
                .clickShoppingCartButton();
        int elementSelected = new ShoppingCartBL().getSizeText();
        Assert.assertEquals(elementSelected, provider.getExpected4());
        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId4());
        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId3());
        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId2());
        new ShoppingCartBL()
                .clickDeleteButtons(provider.getId1());
    }
}
