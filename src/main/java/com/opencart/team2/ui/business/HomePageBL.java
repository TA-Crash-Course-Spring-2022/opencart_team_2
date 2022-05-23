package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageBL {
    private HomePage homePage;

    public HomePageBL() {homePage = new HomePage();}

    public HomePageBL clickProductIphoneSlide() {
        homePage.getProductIphoneSlide().click();
        return this;
    }

    public HomePageBL clickProductMacbookSlide() {
        homePage.getProductMacbookSlide().click();
        return this;
    }

    public ProductPageBL clickProductPhotoButtons(int id) {
        homePage.getProductPhotoButtons(id).click();
        return new ProductPageBL();
    }

    public ProductPageBL clickProductButtons(int id) {
        homePage.getProductButtons(id).click();
        return new ProductPageBL();
    }

    public HomePageBL clickAddToCart(int id) {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group']//button[contains(@onclick,'cart.add')]")));
        homePage.getAddToCartButton(id).click();
        return this;
    }

    public HomePageBL clickAddToWishListButton(int id) {
        homePage.getAddToWishListButton(id).click();
        return this;
    }

    public HomePageBL clickCompareButton(int id) {
        homePage.getCompareButton(id).click();
        return this;
    }

    public String getAlertText() {
        return homePage.getAlertText().getText();
    }
}
