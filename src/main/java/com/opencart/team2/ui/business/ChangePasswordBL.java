package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.ChangePasswordPage;
import org.openqa.selenium.WebElement;

public class ChangePasswordBL {
    private ChangePasswordPage changePasswordPage;

    public ChangePasswordBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordBL inputPassword(String password) {
        WebElement input = changePasswordPage.getPasswordInput();
        input.clear();
        input.sendKeys(password);
        return this;
    }

    public ChangePasswordBL inputPasswordConfirm(String password) {
        WebElement input = changePasswordPage.getPasswordConfirmInput();
        input.clear();
        input.sendKeys(password);
        return this;
    }

    public ChangePasswordBL clearPassword() {
        changePasswordPage.getPasswordInput().clear();
        return this;
    }

    public ChangePasswordBL clearPasswordConfirm() {
        changePasswordPage.getPasswordConfirmInput().clear();
        return this;
    }

    public void clickContinueButton() {
        changePasswordPage.getContinueButton().click();
    }

    public void clickBackButton() {
        changePasswordPage.getBackButton().click();
    }
}
