package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.CheckoutBL;
import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.ProductSearchPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderOneProductViaSearchLoginTest extends TestRunner {
    @Test (description = "to order one product via search as logined user")

    private void productOrderLoginedUsed() {
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
                .clickAddToCart(provider.getId1());
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));

        new HeaderPageBL()
                .clickCheckoutButton();

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable
               (By.xpath("//ul[@class='list-inline']//a[contains(@href, 'checkout/checkout')]")));

        new CheckoutBL()
                .clickExistingAddressButton(0)
                .clickBillingContinueButton()
                .clickDeliveryDetailsContinueButton()
                .inputAddComment(provider.getComment())
                .clickDeliveryMethodContinueButton()
                .clickTermsConditionsButton()
                .clickPaymentContinueButton();

        int elemSelected = new CheckoutBL()
                .getQuantitySize();
        Assert.assertEquals(elemSelected, 1);

        new CheckoutBL()
                .clickConfirmOrderButton();

        new HeaderPageBL()
                .clickShoppingCartButton()
                .clickDeleteButtons(0);

    }
}
