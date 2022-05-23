package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.ProductPage;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL () {
        productPage = new ProductPage ();
    }

    public ComparePageBL comparePage (int id) {
        productPage.getGoToComparePage(id).click();
        return new ComparePageBL();
    }

    public void clickAddToWishList() {
        productPage.getAddToWishList().click();
    }

    public ProductPageBL clickCompareThisProduct() {
        productPage.getCompareThisProduct().click();
        return this;
    }

    public void clickAddToCart() {
        productPage.getAddToCart().click();
    }

    public void addToCartOnSearch () {
        productPage.getAddToCartOnSearch().click();
    }

    public void reviewButton () {
        productPage.getReviewsButton().click();
    }

    public ProductPageBL reviewerName (String reviewerName) {
        productPage.getReviewsNameLine().click();
        productPage.getReviewsNameLine().sendKeys(reviewerName);
        return this;
    }

    public ProductPageBL reviewsReviewField (String reviewText) {
        productPage.getReviewsReviewField().click();
        productPage.getReviewsReviewField().sendKeys(reviewText);
        return this;
    }

    public String alert() {
        return productPage.getProductPGAlert().getText();
    }

    public void continueButton () {
        productPage.getContinueButton().click();
    }

    public ProductPageBL quantityField (String quantity) {
        productPage.getQuantityField().clear();
        productPage.getQuantityField().sendKeys(quantity);
        return this;
    }

    public void descriptionButton () {
        productPage.getDescriptionButton().click();
    }

}
