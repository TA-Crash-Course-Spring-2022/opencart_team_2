package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.WishListPage;

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

    public void addToCardButton(int id) {
        wishListPage.getProductAddToCard(id).click();
    }

    public void removeButton(int id) {
        wishListPage.getProductRemove(id).click();
    }

    public void continueButton() {
        wishListPage.getContinue().click();
    }
}
