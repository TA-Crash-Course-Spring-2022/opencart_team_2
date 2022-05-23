package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.EditAccountInfoPage;

public class EditAccountInfoPageBL {
    private EditAccountInfoPage editAccountInfoPage;

    public EditAccountInfoPageBL(){
        editAccountInfoPage= new EditAccountInfoPage();
    }

    public EditAccountInfoPageBL CancelChanges (String oldFirstName, String oldLastName, String oldEmail, String oldTelephone) {
        editAccountInfoPage.getFirstNameInput().clear();
        editAccountInfoPage.getFirstNameInput().sendKeys(oldFirstName);
        editAccountInfoPage.getLastNameInput().clear();
        editAccountInfoPage.getLastNameInput().sendKeys(oldLastName);
        editAccountInfoPage.getEmailInput().clear();
        editAccountInfoPage.getEmailInput().sendKeys(oldEmail);
        editAccountInfoPage.getTelephoneInput().clear();
        editAccountInfoPage.getTelephoneInput().sendKeys(oldTelephone);
        editAccountInfoPage.getContinueButton().click();
        return this;
    }

    public EditAccountInfoPageBL firstNameInput (String fName) {
        editAccountInfoPage.getFirstNameInput().clear();
        editAccountInfoPage.getFirstNameInput().sendKeys(fName);
        return this;
    }

    public EditAccountInfoPageBL lastNameInput (String lName) {
        editAccountInfoPage.getLastNameInput().clear();
        editAccountInfoPage.getLastNameInput().sendKeys(lName);
        return this;
    }

    public EditAccountInfoPageBL emailInput (String email) {
        editAccountInfoPage.getEmailInput().clear();
        editAccountInfoPage.getEmailInput().sendKeys(email);
        return this;
    }

    public EditAccountInfoPageBL telephoneInput (String phone) {
        editAccountInfoPage.getTelephoneInput().clear();
        editAccountInfoPage.getTelephoneInput().sendKeys(phone);
        return this;
    }

    public MyAccountBL backButton() {
        editAccountInfoPage.getBackButton().click();
        return new MyAccountBL();
    }

    public MyAccountBL clickContinueButton() {
        editAccountInfoPage.getContinueButton().click();
        return new MyAccountBL();
    }

    public MyAccountBL setUser (String lName, String  fName, String  email, String  phone){
        return firstNameInput(lName).lastNameInput(fName).emailInput(email).telephoneInput(phone).clickContinueButton();
    }
}
