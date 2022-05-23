package com.opencart.team2.ui.business;
import com.opencart.team2.ui.pages.HomePage;

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

    public void clickProductPhotoButtons(int id) {homePage.getProductPhotoButtons(id).click();
    }

    public String alert() {
        return homePage.getHomePGAlert().getText();
    }

    public HomePageBL clickProductButtons(int id) {
        homePage.getProductButtons(id).click();
        return this;
    }

    public HomePageBL clickAddToCart(int id) {
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
}