package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.CheckoutBL;
import com.opencart.team2.ui.business.MainPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderThreeProdPageTest extends TestRunner {
    @Test(description = "logined user productPage")
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
                .clickProductButtons(provider.getId1())
                .addToCart();
        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch()
                .clickProductButtons(provider.getId2())
                .addToCart();
        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch()
                .clickProductButtons(provider.getId3())
                .addToCart();
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
