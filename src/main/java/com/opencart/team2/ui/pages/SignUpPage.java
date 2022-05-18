package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends BasePage{

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    private WebElement registerContinueButton;

    @FindBy(id = "input-email")
    private WebElement emailLoginInput;

    @FindBy(id = "input-password")
    private WebElement passwordLoginInput;

    @FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']")
    private WebElement forgottenPasswordLoginButton;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement continueLoginButton;

    public SignUpPage() {
        super();
    }

    public WebElement getRegisterContinueButton() {
        return registerContinueButton;
    }

    public WebElement getEmailLoginInput() {
        return emailLoginInput;
    }

    public WebElement getPasswordLoginInput() {
        return passwordLoginInput;
    }

    public WebElement getForgottenPasswordLoginButton() {
        return forgottenPasswordLoginButton;
    }

    public WebElement getContinueLoginButton() {
        return continueLoginButton;
    }
}
