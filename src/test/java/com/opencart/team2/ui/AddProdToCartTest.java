package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.ProductSearchPageBL;
import com.opencart.team2.ui.business.ShoppingCartBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProdToCartTest extends TestRunner{

    @Test(description = "sss")
    public void addCart(){
        new Navigation().navigateToMainPage();
        new ProductSearchPageBL().clickAddToWishListButton(0);
        new ProductSearchPageBL().clickAddToWishListButton(1);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Shopping Cart']")));
        new HeaderPageBL().clickShoppingCartButton();

        int elSelected = new ShoppingCartBL().getSizeText();
        Assert.assertEquals(elSelected, 2);
        new ShoppingCartBL().clickDeleteButtons(1);
    }

}
