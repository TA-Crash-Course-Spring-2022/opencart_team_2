package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminLoginPg;

public class AdminLoginPgBL {

    private AdminLoginPg adminLoginPg;

    public AdminLoginPgBL () {
        adminLoginPg = new AdminLoginPg();
    }

    public AdminLoginPgBL inputUsernameAdmin(String usernameAdmin) {
        adminLoginPg.getUsernameField().clear();
        adminLoginPg.getUsernameField().sendKeys(usernameAdmin);
        return this;
    }

    public AdminLoginPgBL inputPasswordAdmin(String passwordAdmin) {
        adminLoginPg.getPasswordField().clear();
        adminLoginPg.getPasswordField().sendKeys(passwordAdmin);
        return this;
    }

    public void clickLoginAdminButton() {
        adminLoginPg.getLoginButton().click();
    }

    public void ForgottenPassword () {
        adminLoginPg.getForgottenPassword().click();
    }

    public AdminLoginPgBL inputEmailAdmin(String email) {
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
