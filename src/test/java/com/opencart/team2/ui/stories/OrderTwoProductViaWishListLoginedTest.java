package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTwoProductViaWishListLoginedTest extends TestRunner {
    @Test(description = "to order two product via wish list as logined user")

    private void productOrderViaWishList() {
        new Navigation().navigateToMainPage();

        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(provider.getLoginEmail())
                .passwordLoginInput(provider.getLoginPassword())
                .continueLoginButton();

        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch();

        new ProductSearchPageBL()
                .clickAddToWishListButton(0);

        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd2())
                .confirmSearch();

        new ProductSearchPageBL()
                .clickAddToWishListButton(0);

        new HeaderPageBL()
                .clickWishListButton();

        new WishListPageBL()
                .addToCardButton(0)
                .addToCardButton(1);

        new HeaderPageBL()
                .clickCheckoutButton();

        new CheckoutBL()
                .clickExistingAddressButton(0)
                .clickBillingContinueButton()
                .clickExistingAddressButton(0)
                .clickDeliveryDetailsContinueButton()
                .inputAddComment(provider.getComment())
                .clickDeliveryMethodContinueButton()
                .clickTermsConditionsButton()
                .clickPaymentContinueButton();

        int elemSelected = new CheckoutBL()
                .getQuantitySize();
        Assert.assertEquals(elemSelected, 2);

        new CheckoutBL()
                .clickConfirmOrderButton();

        new HeaderPageBL()
                .clickShoppingCartButton();

        new ShoppingCartBL()
                .clickDeleteButtons(0)
                .clickDeleteButtons(1);

    }
}
