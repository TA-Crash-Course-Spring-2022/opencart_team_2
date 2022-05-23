package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
    private WebElement lastContinueButton;

    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement> accountOptionsButton;

    @FindBy(id = "button-account")
    private WebElement continueNewCustomerButton;

    @FindBy(id = "input-email")
    private WebElement emailLoginInput;

    @FindBy(id = "input-password")
    private WebElement passwordLoginInput;

    @FindBy(xpath = "//a[normalize-space()='Forgotten Password']")
    private WebElement forgottenPasswordLoginButton;

    @FindBy(id = "button-login")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@id='shipping-existing']//select[@name='address_id']")
    private WebElement existingAddressSelect;

    @FindBy(xpath = "//div[@id='shipping-existing']//select[@name='address_id']")
    private WebElement shippingAddressSelect;

    @FindBy(id = "input-payment-firstname")
    private WebElement firstNameBillingInput;

    @FindBy(id = "input-shipping-firstname")
    private WebElement firstNameDeliveryInput;

    @FindBy(id = "input-payment-lastname")
    private WebElement lastNameBillingInput;

    @FindBy(id = "input-shipping-lastname")
    private WebElement lastNameDeliveryInput;

    @FindBy(id = "input-payment-email")
    private WebElement emailInput;

    @FindBy(id = "input-payment-telephone")
    private WebElement phoneInput;

    @FindBy(id = "input-payment-company")
    private WebElement companyBillingInput;

    @FindBy(id = "input-shipping-company")
    private WebElement companyDeliveryInput;

    @FindBy(id = "input-payment-address-1")
    private WebElement address1BillingInput;

    @FindBy(id = "input-shipping-address-1")
    private WebElement address1DeliveryInput;

    @FindBy(id = "input-payment-address-2")
    private WebElement address2BillingInput;

    @FindBy(id = "input-shipping-address-2")
    private WebElement address2DeliveryInput;

    @FindBy(id = "input-payment-city")
    private WebElement cityBillingInput;

    @FindBy(id = "input-shipping-city")
    private WebElement cityDeliveryInput;

    @FindBy(id = "input-payment-postcode")
    private WebElement postCodeBillingInput;

    @FindBy(id = "input-shipping-postcode")
    private WebElement postCodeDeliveryInput;

    @FindBy(id = "input-payment-country")
    private WebElement countryBillingSelect;

    @FindBy(id = "input-shipping-country")
    private WebElement countryDeliverySelect;

    @FindBy(id = "input-payment-zone")
    private WebElement regionBillingSelect;

    @FindBy(id = "input-shipping-zone")
    private WebElement regionDeliverySelect;

    @FindBy(id = "input-payment-password")
    private WebElement passwordInput;

    @FindBy(id = "input-payment-confirm")
    private WebElement passwordConfirmInput;

    @FindBy(xpath = "//input[@name='shipping_address']")
    private WebElement checkboxDeliveryButton;

    @FindBy(id = "newsletter")
    private WebElement checkboxNewsletterButton;

    @FindBy(xpath = "//input[@name='agree']")
    private WebElement checkboxPrivacyButton;

    @FindBy(id = "button-payment-address")
    private WebElement billingContinueButton;

    @FindBy(id = "button-shipping-address")
    private WebElement deliveryDetailsContinueButton;

    @FindBy(id = "button-guest-shipping")
    private WebElement deliveryDetailsGuestContinueButton;

    @FindBy(id = "button-register-shipping")
    private WebElement deliveryDetailsRegisterContinueButton;

    @FindBy(id = "button-shipping-method")
    private WebElement deliveryMethodContinueButton;

    @FindBy(id = "button-payment-method")
    private WebElement paymentContinueButton;

    @FindBy(id = "button-register")
    private WebElement registerContinueButton;

    @FindBy(id = "button-guest")
    private WebElement guestContinueButton;

    @FindBy(xpath = "//div[@class='panel-body']//div[@class='radio']//input[@name='payment_address']")
    private List<WebElement> existingAddressButton;

    @FindBy(xpath = "//div[@class='panel-body']//textarea[@name='comment']")
    private WebElement addCommentInput;

    @FindBy(xpath = "//div[@class='panel-body']//div[@class='buttons']//input[@name='agree']")
    private WebElement termsConditionsButton;

    @FindBy(id = "button-confirm")
    private WebElement confirmOrderButton;

    @FindBy(xpath = "//div[@class='panel panel-default']//tbody//a[contains(@href,'product/product&product_id=')]")
    private List<WebElement> productNameButton;

    @FindBy(xpath = "//div[@class='panel panel-default']//tbody//td[2]")
    private List<WebElement> productModelText;

    @FindBy(xpath = "//div[@class='panel panel-default']//tbody//td[3]")
    private List<WebElement> productQuantityText;

    @FindBy(xpath = "//*[@id=\"content\"]/h1")
    private WebElement checkAssert;

    public CheckoutPage() {
        super();
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

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAccountOptionsButton(int id) {
        return accountOptionsButton.get(id);
    }

    public WebElement getContinueNewButton() {
        return continueNewCustomerButton;
    }

    public Select getExistingAddressSelect() {
        return new Select(existingAddressSelect);
    }

    public Select getShippingAddressSelect() {
        return new Select(shippingAddressSelect);
    }

    public WebElement getFirstNameBillingInput() {
        return firstNameBillingInput;
    }

    public WebElement getFirstNameDeliveryInput() {
        return firstNameDeliveryInput;
    }

    public WebElement getLastNameBillingInput() {
        return lastNameBillingInput;
    }

    public WebElement getLastNameDeliveryInput() {
        return lastNameDeliveryInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getPhoneInput() {
        return phoneInput;
    }

    public WebElement getCompanyBillingInput() {
        return companyBillingInput;
    }

    public WebElement getCompanyDeliveryInput() {
        return companyDeliveryInput;
    }

    public WebElement getAddress1BillingInput() {
        return address1BillingInput;
    }

    public WebElement getAddress1DeliveryInput() {
        return address1DeliveryInput;
    }

    public WebElement getAddress2BillingInput() {
        return address2BillingInput;
    }

    public WebElement getAddress2DeliveryInput() {
        return address2DeliveryInput;
    }

    public WebElement getCityBillingInput() {
        return cityBillingInput;
    }

    public WebElement getCityDeliveryInput() {
        return cityDeliveryInput;
    }

    public WebElement getPostCodeBillingInput() {
        return postCodeBillingInput;
    }

    public WebElement getPostCodeDeliveryInput() {
        return postCodeDeliveryInput;
    }

    public Select getCountryBillingSelect() {
        return new Select(countryBillingSelect);
    }

    public Select getCountryDeliverySelect() {
        return new Select(countryDeliverySelect);
    }

    public Select getRegionBillingSelect() {
        return new Select(regionBillingSelect);
    }

    public Select getRegionDeliverySelect() {
        return new Select(regionDeliverySelect);
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getPasswordConfirmInput() {
        return passwordConfirmInput;
    }

    public WebElement getCheckboxNewsletterButton() {
        return checkboxNewsletterButton;
    }

    public WebElement getCheckboxDeliveryButton() {
        return checkboxDeliveryButton;
    }

    public WebElement getCheckboxPrivacyButton() {
        return checkboxPrivacyButton;
    }

    public WebElement getBillingContinueButton() {
        return billingContinueButton;
    }

    public WebElement getDeliveryDetailsContinueButton() {
        return deliveryDetailsContinueButton;
    }

    public WebElement getDeliveryDetailsGuestContinueButton() {
        return deliveryDetailsGuestContinueButton;
    }

    public WebElement getDeliveryDetailsRegisterContinueButton() {
        return deliveryDetailsRegisterContinueButton;
    }

    public WebElement getDeliveryMethodContinueButton() {
        return deliveryMethodContinueButton;
    }

    public WebElement getPaymentContinueButton() {
        return paymentContinueButton;
    }

    public WebElement getRegisterContinueButton() {
        return registerContinueButton;
    }

    public WebElement getGuestContinueButton() {
        return guestContinueButton;
    }

    public WebElement getExistingAddressButton(int id) {
        return existingAddressButton.get(id);
    }

    public WebElement getAddCommentInput() {
        return addCommentInput;
    }

    public WebElement getTermsConditionsButton() {
        return termsConditionsButton;
    }

    public WebElement getConfirmOrderButton() {
        return confirmOrderButton;
    }

    public WebElement getProductNameButton(int id) {
        return productNameButton.get(id);
    }

    public WebElement getProductModelText(int id) {
        return productModelText.get(id);
    }

    public WebElement getProductQuantityText(int id) {
        return productQuantityText.get(id);
    }

    public List<WebElement> getProductQuantityText() {return productQuantityText; }

    public WebElement getLastContinueButton() { return lastContinueButton; }

    public WebElement getCheckAssert() {return checkAssert;}
}
