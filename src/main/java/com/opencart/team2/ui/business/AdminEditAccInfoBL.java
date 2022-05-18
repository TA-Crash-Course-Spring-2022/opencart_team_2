package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.EditAccInfoPG;

public class AdminEditAccInfoBL {

    private EditAccInfoPG editAccInfoPG;

    public AdminEditAccInfoBL() {
        editAccInfoPG = new EditAccInfoPG();
    }

    public AdminEditAccInfoBL UsernameField (String username) {
        editAccInfoPG.getUsernameField().clear();
        editAccInfoPG.getUsernameField().sendKeys(username);
        return this;
    }

    public AdminEditAccInfoBL FirstNameField (String firstname) {
        editAccInfoPG.getFirstNameField().clear();
        editAccInfoPG.getFirstNameField().sendKeys(firstname);
        return this;
    }

    public AdminEditAccInfoBL LastNameField (String lastname) {
        editAccInfoPG.getLastNameField().clear();
        editAccInfoPG.getLastNameField().sendKeys(lastname);
        return this;
    }

    public AdminEditAccInfoBL EmailField (String email) {
        editAccInfoPG.getEmailField().clear();
        editAccInfoPG.getEmailField().sendKeys(email);
        return this;
    }

    public AdminEditAccInfoBL PasswordField (String newPassword) {
        editAccInfoPG.getPasswordField().clear();
        editAccInfoPG.getPasswordField().sendKeys(newPassword);
        return this;
    }

    public AdminEditAccInfoBL ConfirmField (String confirmMessage) {
        editAccInfoPG.getConfirmField().clear();
        editAccInfoPG.getConfirmField().sendKeys(confirmMessage);
        return this;
    }

    public void SaveButton () {
        editAccInfoPG.getSaveButton().click();
    }

    public void CancelButton () {
        editAccInfoPG.getCancelButton().click();
    }

    public void ProfileButton () {
        editAccInfoPG.getProfileButton().click();
    }

}
