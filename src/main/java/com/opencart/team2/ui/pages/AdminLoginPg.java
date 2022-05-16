package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPg extends BasePage {

    @FindBy(xpath = "//*[@id='input-username']")
    private WebElement UsernameField;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[2]/span/a")
    private WebElement ForgottenPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")
    private WebElement LoginButton;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement EmailAddressFieldFP;

    @FindBy(xpath = "//*[@id='content']/div/div/div/div/div[2]/form/div[2]/button)")
    private WebElement ResetButtonFP;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[2]/a")
    private WebElement CancelButtonFP;

    public AdminLoginPg () {
        super();
    }

    public WebElement getUsernameField() {
        return UsernameField;
    }

    public WebElement getPasswordField() {
        return PasswordField;
    }

    public WebElement getForgottenPassword() {
        return ForgottenPassword;
    }

    public WebElement getLoginButton() {
        return LoginButton;
    }

    public WebElement getEmailAddressFieldFP() { return EmailAddressFieldFP; }

    public WebElement getResetButtonFP() {
        return ResetButtonFP;
    }

    public WebElement getCancelButtonFP() {
        return CancelButtonFP;
    }
}
