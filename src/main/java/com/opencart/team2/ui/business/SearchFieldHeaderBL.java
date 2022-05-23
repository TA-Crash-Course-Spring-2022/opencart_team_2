package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.SearchFieldHeaderPG;
import org.openqa.selenium.Keys;

public class SearchFieldHeaderBL {
    private SearchFieldHeaderPG searchFieldHeaderPG;

    public SearchFieldHeaderBL () {
            searchFieldHeaderPG = new SearchFieldHeaderPG();
        }

    public SearchFieldHeaderBL inputProduct (String productName) {
            searchFieldHeaderPG.getSearchLine().clear();
            searchFieldHeaderPG.getSearchLine().sendKeys(productName);
            return new SearchFieldHeaderBL();
    }
    public void confirmSearch () {
            searchFieldHeaderPG.getEnterButton().click();
    }

    public SearchFieldHeaderBL searchForProduct(String productName) {
        searchFieldHeaderPG.getSearchLine().clear();
        searchFieldHeaderPG.getSearchLine().sendKeys(productName);
        searchFieldHeaderPG.getSearchLine().sendKeys(Keys.ENTER);
        return this;
    }

    public void opencartHomePage () {
        searchFieldHeaderPG.getOpencartMainButton().click();
    }

    public SearchFieldHeaderBL headerOpenShoppingcart() {
        searchFieldHeaderPG.getShoppingcartHeaderButton().click();
        return new SearchFieldHeaderBL();
    }

    public SearchFieldHeaderBL productRemoveFromShoppingcart(int id) {
        searchFieldHeaderPG.getProductRemoveHeaderButton(id).click();
        return new SearchFieldHeaderBL();
    }

    public SearchFieldHeaderBL openProductPageFromShoppingcart(int id) {
        searchFieldHeaderPG.getButtonToProductPageByName(id).click();
        return new SearchFieldHeaderBL();
    }

    public ShoppingCartBL viewCartFromHeader() {
        searchFieldHeaderPG.getViewCartHeaderButton().click();
        return new ShoppingCartBL();
    }

    public CheckoutBL checkoutHeaderButton () {
        searchFieldHeaderPG.getCheckoutHeaderButton().click();
        return new CheckoutBL();
    }

}
