package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.ProductSearchPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.business.ShoppingCartBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCardUsingSearchTest extends TestRunner {

    @Test(description = "add product to card using search")

    private void addProductSearch() {
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

              new SearchFieldHeaderBL()
                      .inputProduct(provider.getProd2())
                      .confirmSearch();

              new ProductSearchPageBL()
                      .clickAddToCart(provider.getId1());
              Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));

             // new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable
               // (By.xpath("//div[@class='button-group']//button[contains(@onclick,'cart.add')]")));

              new HeaderPageBL()
                      .clickShoppingCartButton();

              new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable
                (By.xpath("//ul[@class='list-inline']//a[contains(@href, 'checkout/cart')]")));

              new ShoppingCartBL()
                      .clickDeleteButtons(provider.getId1())
                      .clickDeleteButtons(provider.getId2());
    }
}
