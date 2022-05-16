package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.CheckoutPage;

public class CheckoutBL {
    private CheckoutPage checkoutPage;

    public CheckoutBL() {
        checkoutPage = new CheckoutPage();
    }

    public void firstNameButton() {
        checkoutPage.getFirstNameButton().click();
    }

    public void lastNameButton() {
        checkoutPage.getLastNameButton().click();
    }

    public void companyButton() {
        checkoutPage.getCompanyButton().click();
    }

    public void address1Button() {
        checkoutPage.getAddress1Button().click();
    }

    public void address2Button() {
        checkoutPage.getAddress2Button().click();
    }

    public void cityButton() {
        checkoutPage.getCityButton().click();
    }

    public void postCodeButton() {
        checkoutPage.getPostCodeButton().click();
    }

    public void countryButton() {
        checkoutPage.getCountryButton().click();
    }

    public void regionButton() {
        checkoutPage.getRegionButton().click();
    }

    public void continueButton() {
        checkoutPage.getContinueButton().click();
    }

    public void existingAddressButton(int id) {
        checkoutPage.getExistingAddressButton(id).click();
    }

    public void eddCommentsButton() {
        checkoutPage.getEddCommentsButton().click();
    }

    public void termsConditionsButton() {
        checkoutPage.getTermsConditionsButton().click();
    }

}
