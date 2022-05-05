package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage {

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    private WebElement backButton;

    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement continueButton;


    public ChangePasswordPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
