package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminCurrencyPage;
import org.openqa.selenium.WebDriver;

public class AdminCurrencyBL {
    private AdminCurrencyPage adminCurrencyPage;

    public AdminCurrencyBL(WebDriver driver) {
        adminCurrencyPage = new AdminCurrencyPage(driver);
    }

    public void checkboxButton() {
        adminCurrencyPage.getCheckboxButton().click();
    }

    public void checkbox1Button() {
        adminCurrencyPage.getCheckbox1Button().click();
    }

    public void checkbox2Button() {
        adminCurrencyPage.getCheckbox2Button().click();
    }

    public void checkbox3Button() {
        adminCurrencyPage.getCheckbox3Button().click();
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

    public void edit1Button() {
        adminCurrencyPage.getEdit1Button().click();
    }

    public void edit2Button() {
        adminCurrencyPage.getEdit2Button().click();
    }

    public void edit3Button() {
        adminCurrencyPage.getEdit3Button().click();
    }
}
