package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
    private WebElement MyAccountMainButton;

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    private WebElement UserLoginMainButton;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement UserEmailField;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement UserPasswordField;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElement UserLoginButton;

    public UserLoginPage () {
        super();
    }

    public WebElement getMyAccountMainButton() {
        return MyAccountMainButton;
    }

    public WebElement getUserLoginMainButton() {
        return UserLoginMainButton;
    }

    public WebElement getUserEmailField() {
        return UserEmailField;
    }

    public WebElement getUserPasswordField() {
        return UserPasswordField;
    }

    public WebElement getUserLoginButton() {
        return UserLoginButton;
    }

}
