package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.SignUpPage;

public class SignUpPageBL {
    private SignUpPage signUpPage;

    public SignUpPageBL(){
        signUpPage= new SignUpPage();
    }

    public SignUpPageBL registerContinueButton() {
        signUpPage.getRegisterContinueButton().click();
        return this;
    }

    public SignUpPageBL inputLoginEmail(String email) {
        signUpPage.getEmailLoginInput().clear();
        signUpPage.getEmailLoginInput().sendKeys(email);
        return this;
    }

    public SignUpPageBL inputLoginPassword(String password) {
        signUpPage.getPasswordLoginInput().clear();
        signUpPage.getPasswordLoginInput().sendKeys(password);
        return this;
    }

    public SignUpPageBL forgottenLoginButton() {
        signUpPage.getForgottenPasswordLoginButton().click();
        return this;
    }

    public MyAccountBL continueLoginButton() {
        signUpPage.getContinueLoginButton().click();
        return new MyAccountBL();
    }

}
