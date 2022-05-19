package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.EditAccInfoAdminPG;

public class AdminEditAccInfoBL {

    private EditAccInfoAdminPG editAccInfoAdminPG;

    public AdminEditAccInfoBL() {
        editAccInfoAdminPG = new EditAccInfoAdminPG();
    }

    public AdminEditAccInfoBL UsernameField (String username) {
        editAccInfoAdminPG.getUsernameField().clear();
        editAccInfoAdminPG.getUsernameField().sendKeys(username);
        return this;
    }

    public AdminEditAccInfoBL FirstNameField (String firstname) {
        editAccInfoAdminPG.getFirstNameField().clear();
        editAccInfoAdminPG.getFirstNameField().sendKeys(firstname);
        return this;
    }

    public AdminEditAccInfoBL LastNameField (String lastname) {
        editAccInfoAdminPG.getLastNameField().clear();
        editAccInfoAdminPG.getLastNameField().sendKeys(lastname);
        return this;
    }

    public AdminEditAccInfoBL EmailField (String email) {
        editAccInfoAdminPG.getEmailField().clear();
        editAccInfoAdminPG.getEmailField().sendKeys(email);
        return this;
    }

    public AdminEditAccInfoBL PasswordField (String newPassword) {
        editAccInfoAdminPG.getPasswordField().clear();
        editAccInfoAdminPG.getPasswordField().sendKeys(newPassword);
        return this;
    }

    public AdminEditAccInfoBL ConfirmField (String confirmMessage) {
        editAccInfoAdminPG.getConfirmField().clear();
        editAccInfoAdminPG.getConfirmField().sendKeys(confirmMessage);
        return this;
    }

    public void SaveButton () {
        editAccInfoAdminPG.getSaveButton().click();
    }

    public void CancelButton () {
        editAccInfoAdminPG.getCancelButton().click();
    }

    public void ProfileButton () {
        editAccInfoAdminPG.getProfileButton().click();
    }

}
