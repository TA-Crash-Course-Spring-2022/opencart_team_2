package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.ProductSearchPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.business.WishListPageBL;
import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddTwoProdToWishListTest extends TestRunner {

    @Test(description = "add two products to wish list")
    public void addWishList() {

        String inputEmail = "2@gmail.com";
        String inputPassword = "2222";
        String inputProductM = "mac";
        String inputProductI = "iPhone";

        new Navigation().navigateToMainPage();
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton();
        new SearchFieldHeaderBL().inputProduct(inputProductM).confirmSearch();
        new ProductSearchPageBL().clickAddToWishListButton(0);
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new SearchFieldHeaderBL().inputProduct(inputProductI).confirmSearch();
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row']//div[@class='button-group']//button[@data-original-title='Add to Wish List']")));
        new ProductSearchPageBL().clickAddToWishListButton(0);
        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
        new HeaderPageBL().clickWishListButton();

        int elSelected = new WishListPageBL().getSizeText();
        Assert.assertEquals(elSelected, 2);
        new WishListPageBL().removeButton(0);
    }
}
