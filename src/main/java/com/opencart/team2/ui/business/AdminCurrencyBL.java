package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminCurrencyPage;
import org.openqa.selenium.WebDriver;

public class AdminCurrencyBL {
    private AdminCurrencyPage adminCurrencyPage;

    public AdminCurrencyBL() {
        adminCurrencyPage = new AdminCurrencyPage();
    }

    public void checkboxButton() {
        adminCurrencyPage.getCheckboxButton().click();
    }

    public AdminCurrencyBL clickCheckboxButton(int id) {
        adminCurrencyPage.getCheckbox(id).click();
        return this;
    }

    public int getCheckboxText(){
        return adminCurrencyPage.getCheckbox().size();
    }

    public AdminAddCurrencyBL clickAddButton(){
        adminCurrencyPage.getAddButton().click();
        return new AdminAddCurrencyBL();
    }

    public AdminCurrencyBL clickDeleteButton(){
        adminCurrencyPage.getDeleteButton().click();
        return this;
    }

    public AdminCurrencyBL clickRefreshButton(){
        adminCurrencyPage.getRefreshButton().click();
        return this;
    }

    public void currencyTitleButton() {
        adminCurrencyPage.getCurrencyTitleButton().click();
    }

    public void codeButton() {
        adminCurrencyPage.getCodeButton().click();
    }

    public void lastUpdatedButton() {
        adminCurrencyPage.getLastUpdatedButton().click();
    }
}
