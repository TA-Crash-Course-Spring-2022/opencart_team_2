package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderThreeProductsWishListTest extends TestRunner {

    @Test(description = "logined user wishlist")
    public void noInfo() {

        new Navigation()
                .navigateToMainPage();
        new MainPageBL()
                .selectLogin()
                .inputLoginEmail(provider.getLoginEmail())
                .inputLoginPassword(provider.getLoginPassword())
                .continueLoginButton();
        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch()
                .clickAddToWishListButton(provider.getId1());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new ProductSearchPageBL()
                .clickAddToWishListButton(provider.getId2());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new ProductSearchPageBL()
                .clickAddToWishListButton(provider.getId3());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));//stale element reference: element is not attached to the page document
        new ProductSearchPageBL()
                .clickCloseButton();
        new MainPageBL()
                .clickWishListButton();
        int elSelected = new WishListPageBL()
                .getSizeText();
        Assert.assertEquals(elSelected, provider.getExpected3());
        new WishListPageBL()
                .clickAddToCardButton(provider.getId3())
                .clickClose();
        new WishListPageBL()
                .clickAddToCardButton(provider.getId2())
                .clickClose();
        new WishListPageBL()
                .clickAddToCardButton(provider.getId1())
                .clickClose();
        new MainPageBL()
                .clickCheckoutButton()
                .clickBillingContinueButton()
                .selectExistingAddress(provider.getExistingAddress1())
                .clickDeliveryDetailsContinueButton()
                .inputAddComment(provider.getComment())
                .clickDeliveryMethodContinueButton()
                .clickTermsConditionsButton()
                .clickPaymentContinueButton();
        int elemSelected = new CheckoutBL()
                .getQuantitySize();
        Assert.assertEquals(elemSelected, provider.getExpected3());
        new CheckoutBL()
                .clickConfirmOrderButton();
    }
}
