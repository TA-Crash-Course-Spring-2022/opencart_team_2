package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.ProductPageBL;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderTwoProductViaProdPageLoginedTest extends TestRunner {
    @Test(description = "to order two product via product page as logined user")

    private void productOrderViaProdPage() {
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
                .clickProductButtons(provider.getId1());

        new ProductPageBL()
                .addToCart();

        new SearchFieldHeaderBL()
                .inputProduct(provider.getProd2())
                .confirmSearch();

        new ProductSearchPageBL()
                .clickProductButtons(provider.getId1());
        new ProductPageBL()
                .addToCart();

        new HeaderPageBL()
                .clickCheckoutButton();

        new CheckoutBL()
                .clickExistingAddressButton(1)
                .inputFirstNameBilling(provider.getFirstName())
                .inputLastNameBilling(provider.getLastName())
                .inputCompanyBilling(provider.getCompany())
                .inputAddress1Billing(provider.getAddress1())
                .inputAddress2Billing(provider.getAddress2())
                .inputCityBilling(provider.getCity())
                .inputPostCodeBilling(provider.getPostCode())
                .selectCountryBilling(provider.getCountry())
                .selectRegionBilling(provider.getRegion())
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