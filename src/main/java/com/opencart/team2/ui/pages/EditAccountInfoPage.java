package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountInfoPage extends BasePage{

    @FindBy(id = "input-firstname")
    private WebElement firstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInput;

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = "//a[@class='btn btn-default']")
    private WebElement backButton;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public EditAccountInfoPage() {
        super();
    }


    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getBackButton() {
        return backButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
