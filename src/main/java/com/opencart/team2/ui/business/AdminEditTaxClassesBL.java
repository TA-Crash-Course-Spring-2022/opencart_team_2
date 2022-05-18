package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminEditTaxClassesPG;

public class AdminEditTaxClassesBL {
    private AdminEditTaxClassesPG adminEditTaxClassesPG;

    public AdminEditTaxClassesBL () {
        adminEditTaxClassesPG = new AdminEditTaxClassesPG();
    }

    public void saveEditClass() {
        adminEditTaxClassesPG.getSaveEdit().click();
    }

    public void cancelEdit() {
        adminEditTaxClassesPG.getCancelEdit().click();
    }

    public AdminEditTaxClassesBL inputTaxClassTitle (String title) {
        adminEditTaxClassesPG.getTaxClassTitle().clear();
        adminEditTaxClassesPG.getTaxClassTitle().sendKeys(title);
        return this;
    }

    public AdminEditTaxClassesBL inputDescription (String description) {
        adminEditTaxClassesPG.getTaxClassDescription().clear();
        adminEditTaxClassesPG.getTaxClassDescription().sendKeys(description);
        return this;
    }

    public AdminEditTaxClassesBL selectTaxRate (String value) {
        adminEditTaxClassesPG.getTaxRate().selectByValue(value);
        return this;
    }

    public String getTaxRate() {
        return adminEditTaxClassesPG.getTaxRate().getFirstSelectedOption().getText();
    }

    public AdminEditTaxClassesBL selectTaxBaseOn (String value) {
        adminEditTaxClassesPG.getTaxBaseOn().selectByValue(value);
        return this;
    }
    public String getTaxBaseOn() {
        return
                adminEditTaxClassesPG.getTaxBaseOn().getFirstSelectedOption().getText();
    }

    public AdminEditTaxClassesBL inputPriority (String priority) {
        adminEditTaxClassesPG.getPriority().clear();
        adminEditTaxClassesPG.getPriority().sendKeys(priority);
        return this;
    }

    public void removeButton() {
        adminEditTaxClassesPG.getRemoveButton().click();
    }

    public void addRuleButton() {
        adminEditTaxClassesPG.getAddRule().click();
    }
}



