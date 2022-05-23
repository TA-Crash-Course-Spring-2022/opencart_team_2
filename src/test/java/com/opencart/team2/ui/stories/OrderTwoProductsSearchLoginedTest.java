package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTwoProductsSearchLoginedTest extends TestRunner {

    @Test(description = "logined user without delivery info")
    public void noDelivery(){

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
                .clickAddToCart(provider.getId1());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new ProductSearchPageBL()
                .clickCloseButton();
        new ProductSearchPageBL()
                .clickAddToCart(provider.getId2());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new MainPageBL()
                .clickShoppingCartButton();
        int elSelected = new WishListPageBL()
                .getSizeText();
        Assert.assertEquals(elSelected, provider.getId3());
        new MainPageBL()
                .clickCheckoutButton()
                .clickExistingAddressButton(provider.getId2())
                .setLoginedUser(provider.getFirstName(),
                        provider.getLastName(),
                        provider.getCompany(),
                        provider.getAddress1(),
                        provider.getAddress2(),
                        provider.getCity(),
                        provider.getCode(),
                        provider.getCountry(),
                        provider.getRegion())
                .selectExistingAddress(provider.getExistingAddress1())
                .clickDeliveryDetailsContinueButton()
                .inputAddComment(provider.getComment())
                .clickDeliveryMethodContinueButton()
                .clickTermsConditionsButton()
                .clickPaymentContinueButton();
        int elemSelected = new CheckoutBL()
                .getQuantitySize();
        Assert.assertEquals(elemSelected, provider.getExpected2());
        new CheckoutBL()
                .clickConfirmOrderButton();
    }
}
