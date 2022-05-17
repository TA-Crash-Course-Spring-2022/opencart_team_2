package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProdToWishListTest extends TestRunner {

    @Test(description = "add product to wish list")
    public void addWishList() {

        String inputEmail = "1@gmail.com";
        String inputPassword = "1111";
        String inputProduct = "mac";

        new Navigation().navigateToMainPage();
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton();
        new SearchFieldHeaderBL().inputProduct(inputProduct).confirmSearch();
        new ProductSearchPageBL().clickAddToWishListButton(1);
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new HeaderPageBL().clickWishListButton();
        int elSelected = new WishListPageBL().getSizeText();
        Assert.assertEquals(elSelected, 1);
        new WishListPageBL().removeButton(0);
    }
}

