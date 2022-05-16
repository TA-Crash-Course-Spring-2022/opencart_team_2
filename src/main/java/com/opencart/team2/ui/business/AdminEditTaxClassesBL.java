package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminEditTaxClasses;

public class AdminEditTaxClassesBL {
    private AdminEditTaxClasses adminEditTaxClasses;

    public AdminEditTaxClassesBL () {
        adminEditTaxClasses = new AdminEditTaxClasses();
    }

    public void saveEditClass() {
        adminEditTaxClasses.getSaveEdit().click();
    }

    public void cancelEdit() {
        adminEditTaxClasses.getCancelEdit().click();
    }

    public AdminEditTaxClassesBL inputTaxClassTitle (String title) {
        adminEditTaxClasses.getTaxClassTitle().clear();
        adminEditTaxClasses.getTaxClassTitle().sendKeys(title);
        return this;
    }

    public AdminEditTaxClassesBL inputDescription (String description) {
        adminEditTaxClasses.getTaxClassDescription().clear();
        adminEditTaxClasses.getTaxClassDescription().sendKeys(description);
        return this;
    }

    public AdminEditTaxClassesBL selectTaxRate (String value) {
        adminEditTaxClasses.getTaxRate().selectByValue(value);
        return this;
    }

    public String getTaxRate() {
        return adminEditTaxClasses.getTaxRate().getFirstSelectedOption().getText();
    }

    public AdminEditTaxClassesBL selectTaxBaseOn (String value) {
        adminEditTaxClasses.getTaxBaseOn().selectByValue(value);
        return this;
    }
    public String getTaxBaseOn() {
        return
                adminEditTaxClasses.getTaxBaseOn().getFirstSelectedOption().getText();
    }

    public AdminEditTaxClassesBL inputPriority (String priority) {
        adminEditTaxClasses.getPriority().clear();
        adminEditTaxClasses.getPriority().sendKeys(priority);
        return this;
    }

    public void removeButton() {
        adminEditTaxClasses.getRemoveButton().click();
    }

    public void addRuleButton() {
        adminEditTaxClasses.getAddRule().click();
    }
}



