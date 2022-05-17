package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.HeaderPage;

public class HeaderPageBL {
    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickCurrencySelectButton() {
        headerPage.getCurrencySelectButton().click();
        return this;
    }

    public String getCurrencySelect() {
        return headerPage.getCurrencySelectButton().getText();
    }

    public HeaderPageBL clickCurrency(String name) {
        headerPage.getCurrency(name).click();
        return this;
    }

    public HeaderPageBL selectCurrency(String name){
        clickCurrencySelectButton().clickCurrency(name);
        return this;
    }

    public void clickContactButton() {
        headerPage.getContactButton().click();
    }

    public HeaderPageBL clickAccountSelectButton() {
        headerPage.getAccountSelectButton().click();
        return this;
    }

    public MyAccountBL clickAccountMyAccountButton(){
        headerPage.getAccountMyAccountButton().click();
        return new MyAccountBL();
    }

    public SignUpPageBL clickAccountLoginButton(){
        headerPage.getAccountLoginButton().click();
        return new SignUpPageBL();
    }

    public SignUpPageBL selectLogin(){
        clickAccountSelectButton().clickAccountLoginButton();
        return new SignUpPageBL();
    }

    public SignUpPageBL selectLogout(){
        clickAccountSelectButton().clickAccountLogoutButton();
        return new SignUpPageBL();
    }

    public void clickAccountRegisterButton(){
        headerPage.getAccountRegisterButton().click();
    }

    public void clickAccountOrderButton(){
        headerPage.getAccountOrderHistoryButton().click();
    }

    public void clickAccountTransactionsButton(){
        headerPage.getAccountTransactionsButton().click();
    }

    public void clickAccountDownloadsButton(){
        headerPage.getAccountDownloadsButton().click();
    }

    public HeaderPageBL clickAccountLogoutButton(){
        headerPage.getAccountLogoutButton().click();
        return this;
    }

    public WishListPageBL clickWishListButton() {
        headerPage.getWishListButton().click();
        return new WishListPageBL();
    }

    public ShoppingCartBL clickShoppingCartButton() {
        headerPage.getShoppingCartButton().click();
        return new ShoppingCartBL();
    }

    public CheckoutBL clickCheckoutButton() {
        headerPage.getCheckoutButton().click();
        return new CheckoutBL();
    }
}
