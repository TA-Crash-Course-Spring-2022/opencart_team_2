package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.EditAccountInfoPage;
import com.opencart.team2.utils.MainValuesProvider;

public class EditAccountInfoPageBL {
    private EditAccountInfoPage editAccountInfoPage;

    public EditAccountInfoPageBL(){
        editAccountInfoPage= new EditAccountInfoPage();
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

    public MyAccountBL continueButton() {
        editAccountInfoPage.getContinueButton().click();
        return new MyAccountBL();
    }

    public MyAccountBL setUser (String lName, String  fName, String  email, String  phone){
        return firstNameInput(lName).lastNameInput(fName).emailInput(email).telephoneInput(phone).continueButton();
    }
}
