package com.opencart.team2.ui.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccInfo extends BasePage {

    public EditAccInfo (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"input-username\"]")
    private WebElement UsernameField;

    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    private WebElement FirstNameField;

    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement LastNameField;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement EmailField;

    @FindBy(xpath = "//*[@id=\"thumb-image\"]")
    private WebElement ImageButton;

    @FindBy(xpath = "//*[@id=\"button-image\"]")
    private WebElement EditImageButton;

    @FindBy(xpath = "//*[@id=\"button-clear\"]")
    private WebElement DeleteImageButton;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement PasswordField;

    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    private WebElement ConfirmField;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    private WebElement SaveButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement CancelButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")
    private WebElement ProfileButton;

    public WebElement getUsernameField() {
        return UsernameField;
    }

    public WebElement getFirstNameField() {
        return FirstNameField;
    }

    public WebElement getLastNameField() {
        return LastNameField;
    }

    public WebElement getEmailField() {
        return EmailField;
    }

    public WebElement getImageButton() {
        return ImageButton;
    }

    public WebElement getEditImageButton() {
        return EditImageButton;
    }

    public WebElement getDeleteImageButton() {
        return DeleteImageButton;
    }

    public WebElement getPasswordField() {
        return PasswordField;
    }

    public WebElement getConfirmField() {
        return ConfirmField;
    }

    public WebElement getSaveButton() {
        return SaveButton;
    }

    public WebElement getCancelButton() {
        return CancelButton;
    }

    public WebElement getProfileButton() {
        return ProfileButton;
    }

}
