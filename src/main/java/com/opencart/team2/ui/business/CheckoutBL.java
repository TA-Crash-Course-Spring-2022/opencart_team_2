package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.CheckoutPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutBL {
    private CheckoutPage checkoutPage;

    public CheckoutBL() {
        checkoutPage = new CheckoutPage();
    }

    public CheckoutBL clickAccountOptionsButton(int id) {
        checkoutPage.getAccountOptionsButton(id).click();
        return this;
    }

    public CheckoutBL inputEmailLogin(String email) {
        checkoutPage.getEmailLoginInput().clear();
        checkoutPage.getEmailLoginInput().sendKeys(email);
        return this;
    }

    public CheckoutBL inputPasswordLogin(String password) {
        checkoutPage.getPasswordLoginInput().clear();
        checkoutPage.getPasswordLoginInput().sendKeys(password);
        return this;
    }

    public CheckoutBL clickForgottenLoginButton() {
        checkoutPage.getForgottenPasswordLoginButton().click();
        return this;
    }

    public CheckoutBL clickContinueLoginButton() {
        checkoutPage.getLoginButton().click();
        return this;
    }

    public CheckoutBL selectExistingAddress(String value) {
        checkoutPage.getExistingAddressSelect().selectByValue(value);
        return this;
    }

    public String getExistingAddressSelect() {
        return checkoutPage.getExistingAddressSelect().getFirstSelectedOption().getText();
    }

    public CheckoutBL selectShippingAddress(String value) {
        checkoutPage.getShippingAddressSelect().selectByValue(value);
        return this;
    }

    public String getShippingAddressSelect() {
        return checkoutPage.getShippingAddressSelect().getFirstSelectedOption().getText();
    }

    public CheckoutBL clickContinueNewCustomerButton() {
        checkoutPage.getContinueNewButton().click();
        return this;
    }

    public CheckoutBL clickBillingContinueButton() {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        checkoutPage.getBillingContinueButton().click();
        return this;
    }

    public CheckoutBL clickDeliveryDetailsContinueButton() {
        checkoutPage.getDeliveryDetailsContinueButton().click();
        return this;
    }

    public CheckoutBL clickDeliveryDetailsGuestContinueButton() {
        checkoutPage.getDeliveryDetailsGuestContinueButton().click();
        return this;
    }

    public CheckoutBL clickDeliveryDetailsRegisterContinueButton() {
        checkoutPage.getDeliveryDetailsRegisterContinueButton().click();
        return this;
    }

    public CheckoutBL clickDeliveryMethodContinueButton() {
        checkoutPage.getDeliveryMethodContinueButton().click();
        return this;
    }

    public CheckoutBL clickPaymentContinueButton() {
        checkoutPage.getPaymentContinueButton().click();
        return this;
    }

    public CheckoutBL clickRegisterContinueButton() {
        checkoutPage.getRegisterContinueButton().click();
        return this;
    }

    public CheckoutBL clickGuestContinueButton() {
        checkoutPage.getGuestContinueButton().click();
        return this;
    }

    public CheckoutBL inputEmail(String text) {
        checkoutPage.getEmailInput().clear();
        checkoutPage.getEmailInput().sendKeys(text);
        return this;
    }

    public CheckoutBL inputPhone(String text) {
        checkoutPage.getPhoneInput().clear();
        checkoutPage.getPhoneInput().sendKeys(text);
        return this;
    }

    public CheckoutBL inputFirstNameBilling(String text){
        WebElement input= checkoutPage.getFirstNameBillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputFirstNameDelivery(String text){
        WebElement input= checkoutPage.getFirstNameDeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputLastNameBilling(String text){
        WebElement input= checkoutPage.getLastNameBillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputLastNameDelivery(String text){
        WebElement input= checkoutPage.getLastNameDeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputCompanyBilling(String text){
        WebElement input= checkoutPage.getCompanyBillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputCompanyDelivery(String text){
        WebElement input= checkoutPage.getCompanyDeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputAddress1Billing(String text){
        WebElement input= checkoutPage.getAddress1BillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputAddress1Delivery(String text){
        WebElement input= checkoutPage.getAddress1DeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputAddress2Billing(String text){
        WebElement input= checkoutPage.getAddress2BillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputAddress2Delivery(String text){
        WebElement input= checkoutPage.getAddress2DeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputCityBilling(String text){
        WebElement input= checkoutPage.getCityBillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputCityDelivery(String text){
        WebElement input= checkoutPage.getCityDeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputPostCodeBilling(String text){
        WebElement input= checkoutPage.getPostCodeBillingInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputPostCodeDelivery(String text){
        WebElement input= checkoutPage.getPostCodeDeliveryInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL selectCountryBilling(String value) {
        checkoutPage.getCountryBillingSelect().selectByValue(value);
        return this;
    }

    public String getCountryBillingSelect() {
        return checkoutPage.getCountryBillingSelect().getFirstSelectedOption().getText();
    }

    public CheckoutBL selectCountryDelivery(String value) {
        checkoutPage.getCountryDeliverySelect().selectByValue(value);
        return this;
    }

    public String getCountryDeliverySelect() {
        return checkoutPage.getCountryDeliverySelect().getFirstSelectedOption().getText();
    }

    public CheckoutBL selectRegionBilling(String value) {
        checkoutPage.getRegionBillingSelect().selectByValue(value);
        return this;
    }

    public String getRegionBillingSelect() {
        return checkoutPage.getRegionBillingSelect().getFirstSelectedOption().getText();
    }

    public CheckoutBL selectRegionDelivery(String value) {
        checkoutPage.getRegionDeliverySelect().selectByValue(value);
        return this;
    }

    public String getRegionDeliverySelect() {
        return checkoutPage.getRegionDeliverySelect().getFirstSelectedOption().getText();
    }

    public CheckoutBL inputPassword(String text){
        WebElement input= checkoutPage.getPasswordInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL inputPasswordConfirm(String text){
        WebElement input= checkoutPage.getPasswordConfirmInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL clickCheckboxDeliveryButton() {
        checkoutPage.getCheckboxDeliveryButton().click();
        return this;
    }

    public CheckoutBL clickCheckboxNewsletterButton() {
        checkoutPage.getCheckboxNewsletterButton().click();
        return this;
    }

    public CheckoutBL clickCheckboxPrivacyButton() {
        checkoutPage.getCheckboxPrivacyButton().click();
        return this;
    }

    public CheckoutBL clickExistingAddressButton(int id) {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.name("payment_address")));
        checkoutPage.getExistingAddressButton(id).click();
        return this;
    }

    public CheckoutBL inputAddComment(String text) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement input= checkoutPage.getAddCommentInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public CheckoutBL clickTermsConditionsButton() {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='panel-body']//div[@class='buttons']//input[@name='agree']")));
        checkoutPage.getTermsConditionsButton().click();
        return this;
    }

    public CheckoutBL clickConfirmOrderButton() {
        checkoutPage.getConfirmOrderButton().click();
        return this;
    }

    public CheckoutBL clickProductNameButton(int id) {
        checkoutPage.getProductNameButton(id).click();
        return this;
    }

    public CheckoutBL getProductModelText(int id) {
        checkoutPage.getProductModelText(id).click();
        return this;
    }

    public CheckoutBL getProductQuantity(int id) {
        checkoutPage.getProductQuantityText(id).click();
        return this;
    }

    public String getSuccessOrder() {
        return checkoutPage.getSuccessOrder().getText();
    }

    public int getQuantitySize(){
        return checkoutPage.getProductQuantityText().size();
    }

    public CheckoutBL clickConfirmConfirm() {
        checkoutPage.getConfirmConfirm().click();
        return this;
    }

    public CheckoutBL setLoginedUser(String fName, String lName, String company, String address1, String address2, String city, String code,String country, String region){
        inputFirstNameBilling(fName).inputLastNameBilling(lName).inputCompanyBilling(company).inputAddress1Billing(address1).inputAddress2Billing(address2).inputCityBilling(city).inputPostCodeBilling(code).selectCountryBilling(country).selectRegionBilling(region).clickBillingContinueButton();
        return this;
    }

    public CheckoutBL setRegisterUser(String fName, String lName,String email, String phone, String newPass, String company, String address1, String address2, String city, String code,String country, String region){
        inputFirstNameBilling(fName).inputLastNameBilling(lName).inputEmail(email).inputPhone(phone).inputPassword(newPass).inputPasswordConfirm(newPass).inputCompanyBilling(company).inputAddress1Billing(address1).inputAddress2Billing(address2).inputCityBilling(city).inputPostCodeBilling(code).selectCountryBilling(country).selectRegionBilling(region).clickCheckboxNewsletterButton().clickCheckboxDeliveryButton().clickCheckboxPrivacyButton().clickRegisterContinueButton();
        return this;
    }

    public CheckoutBL setGuestUser(String fName, String lName,String email, String phone, String company, String address1, String address2, String city, String code,String country, String region){
        inputFirstNameBilling(fName).inputLastNameBilling(lName).inputEmail(email).inputPhone(phone).inputCompanyBilling(company).inputAddress1Billing(address1).inputAddress2Billing(address2).inputCityBilling(city).inputPostCodeBilling(code).selectCountryBilling(country).selectRegionBilling(region).clickCheckboxDeliveryButton().clickGuestContinueButton();
        return this;
    }

    public CheckoutBL setDeliveryDetails(String fName, String lName, String company, String address1, String address2, String city, String code,String country, String region) {
        inputFirstNameDelivery(fName).inputLastNameDelivery(lName).inputCompanyDelivery(company).inputAddress1Delivery(address1).inputAddress2Delivery(address2).inputCityDelivery(city).inputPostCodeDelivery(code).selectCountryDelivery(country).selectRegionDelivery(region).clickDeliveryDetailsGuestContinueButton();
        return this;
    }
}