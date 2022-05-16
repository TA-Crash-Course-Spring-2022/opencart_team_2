package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminTaxRatesPage;

public class AdminTaxRatesPageBL {
    private AdminTaxRatesPage adminTaxRatesPage;

    public AdminTaxRatesPageBL() {
        adminTaxRatesPage = new AdminTaxRatesPage();
    }

    public void clickAddNewButton() {
        adminTaxRatesPage.getAddNewButton().click();
    }

    public void clickDeleteButton() {
        adminTaxRatesPage.getDeleteButton().click();
    }

    public int getAmountTaxRates(){
        return adminTaxRatesPage.getTaxName().size();
    }

    public AdminTaxRatesPageBL clickCheckboxButton() {
        adminTaxRatesPage.getCheckboxButton().click();
        return this;
    }

    public AdminTaxRatesPageBL clickGeoZoneNameButton() {
        adminTaxRatesPage.getTaxNameButton().click();
        return this;
    }

    public AdminTaxRatesPageBL clickTypeButton() {
        adminTaxRatesPage.getTypeButton().click();
        return this;
    }

    public AdminTaxRatesPageBL clickGeoZoneButton() {
        adminTaxRatesPage.getGeoZoneButton().click();
        return this;
    }

    public String getTaxNameButtonText(int id) {
        return adminTaxRatesPage.getTaxName(id).getText();
    }

    public boolean isGeoZoneButtonClickable(){
        return adminTaxRatesPage.getGeoZoneButton().isEnabled();
    }

    public AdminTaxRatesPageBL clickDateAddedButton() {
        adminTaxRatesPage.getDateAddedButton().click();
        return this;
    }

    public AdminTaxRatesPageBL clickDateModifiedButton() {
        adminTaxRatesPage.getDateModifiedButton().click();
        return this;
    }

    public void clickEditButton(int id) {
        adminTaxRatesPage.getEditButton(id).click();
    }
}
