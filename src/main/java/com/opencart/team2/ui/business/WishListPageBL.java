package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.WishListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishListPageBL {
    private WishListPage wishListPage;

    public WishListPageBL() {
        wishListPage = new WishListPage();
    }

    public void productName(int id) {
        wishListPage.getProductName(id).click();
    }

    public int getSizeText() {
        return wishListPage.getProductStock().size();
    }

    public WishListPageBL clickAddToCardButton(int id) {
        wishListPage.getProductAddToCard(id).click();
        return this;
    }

    public WishListPageBL clickClose(){
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"account-wishlist\"]/div[1]/button")));
        wishListPage.getCloseButton().click();
        return this;
    }

    public void removeButton(int id) {
        wishListPage.getProductRemove(id).click();
    }

    public void continueButton() {
        wishListPage.getContinue().click();
    }
}
