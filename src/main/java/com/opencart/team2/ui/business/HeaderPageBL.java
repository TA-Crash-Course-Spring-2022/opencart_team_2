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

    public void clickAccountMyAccountButton(){
        headerPage.getAccountMyAccountButton().click();
    }

    public void clickAccountLoginButton(){
        headerPage.getAccountLoginButton().click();
    }

    public void selectLogin(){
        clickAccountSelectButton().clickAccountLoginButton();
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

    public void clickWishListButton() {
        headerPage.getWishListButton().click();
    }

    public ShoppingCartBL clickShoppingCartButton() {
        headerPage.getShoppingCartButton().click();
        return new ShoppingCartBL();
    }

    public void clickCheckoutButton() {
        headerPage.getCheckoutButton().click();
    }
}
