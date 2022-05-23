package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderOneAsLUbyProductPGTest extends TestRunner {

    @Test
    public void Test() {

        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        new Navigation().navigateToMainPage();

        new HomePageBL().clickProductButtons(1);

        new ProductPageBL().clickAddToCart();
        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

        new HeaderPageBL().clickShoppingCartButton();

        new ShoppingCartBL().clickCheckoutButton();

        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("button-payment-address")));
        new CheckoutBL().clickBillingContinueButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("button-shipping-address")));
        new CheckoutBL().clickDeliveryDetailsContinueButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("button-shipping-method")));
        new CheckoutBL().clickDeliveryMethodContinueButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='panel-body']//div[@class='buttons']//input[@name='agree']")));
        new CheckoutBL().clickTermsConditionsButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("button-payment-method")));
        new CheckoutBL().clickPaymentContinueButton();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("button-confirm")));
        new CheckoutBL().clickConfirmOrderButton();

        Assert.assertEquals(new CheckoutBL().getSuccessOrder(), "Your order has been placed!");

        //Assert.assertTrue(new CheckoutBL().getSuccessOrder().contains("Your order has been placed!"));
    }
}
