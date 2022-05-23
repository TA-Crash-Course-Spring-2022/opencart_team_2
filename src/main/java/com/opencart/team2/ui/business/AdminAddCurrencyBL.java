package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminAddCurrencyPg;

public class AdminAddCurrencyBL {

    private AdminAddCurrencyPg adminAddCurrencyPg;

    public AdminAddCurrencyBL () {adminAddCurrencyPg = new AdminAddCurrencyPg(); }

    public AdminAddCurrencyBL inputCurrencyTitle (String currencyTitle) {
        adminAddCurrencyPg.getCurrencyTitleField().clear();
        adminAddCurrencyPg.getCurrencyTitleField().sendKeys(currencyTitle);
        return this;
    }

    public AdminAddCurrencyBL inputCode (String currencyCode) {
        adminAddCurrencyPg.getCodeField().clear();
        adminAddCurrencyPg.getCodeField().sendKeys(currencyCode);
        return this;
    }

    public AdminAddCurrencyBL inputSymbolLeft (String symbolLeft) {
        adminAddCurrencyPg.getSymbolLeftField().clear();
        adminAddCurrencyPg.getSymbolLeftField().sendKeys(symbolLeft);
        return this;
    }

    public AdminAddCurrencyBL inputSymbolRight (String symbolRight) {
        adminAddCurrencyPg.getSymbolRightField().clear();
        adminAddCurrencyPg.getSymbolRightField().sendKeys(symbolRight);
        return this;
    }

    public AdminAddCurrencyBL inputDecimalPlaces (String decimalPlaces) {
        adminAddCurrencyPg.getDecimalPlacesField().clear();
        adminAddCurrencyPg.getDecimalPlacesField().sendKeys(decimalPlaces);
        return this;
    }

    public AdminAddCurrencyBL inputValue (String value) {
        adminAddCurrencyPg.getValueField().clear();
        adminAddCurrencyPg.getValueField().sendKeys(value);
        return this;
    }

    public AdminAddCurrencyBL selectStatus(String value){
        adminAddCurrencyPg.getStatusMenu().selectByValue(value);
        return this;
    }

    public String getStatus() {
        return adminAddCurrencyPg.getStatusMenu().getFirstSelectedOption().getText();
    }


    public AdminCurrencyBL clickSaveButton () {
        adminAddCurrencyPg.getSaveButton().click();
        return new AdminCurrencyBL();
    }

    public AdminCurrencyBL clickCancelButton () {
        adminAddCurrencyPg.getCancelButton().click();
        return new AdminCurrencyBL();
    }

    public AdminAddCurrencyBL setCurrency(String title, String code, String left, String tight, String decimal, String value, String status){
        inputCurrencyTitle(title).inputCode(code).inputSymbolLeft(left).inputSymbolRight(tight).inputDecimalPlaces(decimal).inputValue(value).selectStatus(status).clickSaveButton();
    return this;
    }

    public AdminCurrencyBL AdminCurrenciesPageButton () {
        adminAddCurrencyPg.getAdminCurrenciesPageButton().click();
        return new AdminCurrencyBL();
    }

}
