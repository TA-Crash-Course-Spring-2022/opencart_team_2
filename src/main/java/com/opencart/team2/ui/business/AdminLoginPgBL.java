package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminLoginPg;

public class AdminLoginPgBL {

    private AdminLoginPg adminLoginPg;

    public AdminLoginPgBL () {
        adminLoginPg = new AdminLoginPg();
    }

    public AdminLoginPgBL UsernameField (String username) {
        adminLoginPg.getUsernameField().clear();
        adminLoginPg.getUsernameField().sendKeys(username);
        return this;
    }

    public AdminLoginPgBL PasswordField (String password) {
        adminLoginPg.getPasswordField().clear();
        adminLoginPg.getPasswordField().sendKeys(password);
        return this;
    }

    public void LoginButton () {
        adminLoginPg.getLoginButton().click();
    }

    public void ForgottenPassword () {
        adminLoginPg.getForgottenPassword().click();
    }

    public AdminLoginPgBL EmailAddressFieldFP (String email) {
        adminLoginPg.getEmailAddressFieldFP().clear();
        adminLoginPg.getEmailAddressFieldFP().sendKeys(email);
        return this;
    }

    public void ResetButtonFP () {
        adminLoginPg.getResetButtonFP().click();
    }

    public void CancelButtonFP () {
        adminLoginPg.getCancelButtonFP().click();
    }

}
