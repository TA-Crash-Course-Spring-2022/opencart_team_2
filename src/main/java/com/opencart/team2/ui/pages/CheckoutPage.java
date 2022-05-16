package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy(id = "input-payment-firstname")
    private WebElement firstNameButton;

    @FindBy(id = "input-payment-lastname")
    private WebElement lastNameButton;

    @FindBy(id = "input-payment-company")
    private WebElement companyButton;

    @FindBy(id = "input-payment-address-1")
    private WebElement address1Button;

    @FindBy(id = "input-payment-address-2")
    private WebElement address2Button;

    @FindBy(id = "input-payment-city")
    private WebElement cityButton;

    @FindBy(id = "input-payment-postcode")
    private WebElement postCodeButton;

    @FindBy(id = "input-payment-country")
    private WebElement countryButton;

    @FindBy(id = "input-payment-zone")
    private WebElement regionButton;

    @FindBy(id = "button-payment-address")
    private WebElement continueButton;

    @FindBy(xpath = "//div[@class='panel-body']//div[@class='radio']//input[@name='payment_address']")
    private List<WebElement> existingAddressButton;

    @FindBy(xpath = "//div[@class='panel-body']//textarea[@name='comment']")
    private WebElement eddCommentsButton;

    @FindBy(xpath = "//div[@class='panel-body']//div[@class='buttons']//input[@name='agree']")
    private WebElement termsConditionsButton;

    public CheckoutPage() {
        super();
    }

    public WebElement getFirstNameButton() {
        return firstNameButton;
    }

    public WebElement getLastNameButton() {
        return lastNameButton;
    }

    public WebElement getCompanyButton() {
        return companyButton;
    }

    public WebElement getAddress1Button() {
        return address1Button;
    }

    public WebElement getAddress2Button() {
        return address2Button;
    }

    public WebElement getCityButton() {
        return cityButton;
    }

    public WebElement getPostCodeButton() {
        return postCodeButton;
    }

    public WebElement getCountryButton() {
        return countryButton;
    }

    public WebElement getRegionButton() {
        return regionButton;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }

    public WebElement getExistingAddressButton(int id) {
        return existingAddressButton.get(id);
    }

    public WebElement getEddCommentsButton() {
        return eddCommentsButton;
    }

    public WebElement getTermsConditionsButton() {
        return termsConditionsButton;
    }


}
