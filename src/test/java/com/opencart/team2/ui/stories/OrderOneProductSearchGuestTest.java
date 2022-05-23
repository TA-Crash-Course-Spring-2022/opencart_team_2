package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderOneProductSearchGuestTest extends TestRunner {

    @Test()
    public void guestUserTest() {

        new Navigation()
                .navigateToMainPage();
        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd1())
                .confirmSearch()
                .clickAddToCart(provider.getId1());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new MainPageBL()
                .clickShoppingCartButton();
        int elSelected = new ShoppingCartBL()
                .getSizeText();
        Assert.assertEquals(elSelected, provider.getExpected1());
        new MainPageBL()
                .clickCheckoutButton()
                .clickAccountOptionsButton(provider.getId2())
                .clickContinueNewCustomerButton()
                .setGuestUser(provider.getFirstName(),
                        provider.getLastName(),
                        provider.getLoginEmail(),
                        provider.getPhone(),
                        provider.getCompany(),
                        provider.getAddress1(),
                        provider.getAddress2(),
                        provider.getCity(),
                        provider.getCode(),
                        provider.getCountry(),
                        provider.getRegion())
                .setDeliveryDetails(provider.getFirstName(),
                        provider.getLastName(),
                        provider.getCompany(),
                        provider.getAddress1(),
                        provider.getAddress2(),
                        provider.getCity(),
                        provider.getCode(),
                        provider.getCountry(),
                        provider.getRegion())
                .inputAddComment(provider.getComment())
                .clickDeliveryMethodContinueButton()
                .clickTermsConditionsButton()
                .clickPaymentContinueButton();
        int elemSelected = new CheckoutBL()
                .getQuantitySize();
        Assert.assertEquals(elemSelected, provider.getExpected1());
        new CheckoutBL()
                .clickConfirmOrderButton();
    }
}
