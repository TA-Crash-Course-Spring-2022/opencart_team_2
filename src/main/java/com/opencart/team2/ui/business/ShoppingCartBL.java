package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.ShoppingCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartBL {
    private ShoppingCartPage shoppingCartPage;

    public ShoppingCartBL(){
        shoppingCartPage= new ShoppingCartPage();
    }

    public ShoppingCartBL clickProductImageButtons(int id) {
        shoppingCartPage.getImage(id).click();
        return this;
    }

    public ShoppingCartBL clickProductNameButtons(int id) {
        shoppingCartPage.getProductName(id).click();
        return this;
    }

    public ShoppingCartBL quantityNumberInput(int id, String text){
        WebElement input= shoppingCartPage.getQuantityNumberInput(id);
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public ShoppingCartBL clickUpdateButtons(int id) {
        shoppingCartPage.getQuantityUpdateButton(id).click();
        return this;
    }

    public ShoppingCartBL clickDeleteButtons(int id) {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-original-title='Remove']")));
        shoppingCartPage.getQuantityRemoveButton(id).click();
        return this;
    }

    public ShoppingCartBL clickCouponDropdown(){
        shoppingCartPage.getCouponDropdown().click();
        return this;
    }

    public ShoppingCartBL couponInput(String text){
        WebElement input= shoppingCartPage.getCouponInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public ShoppingCartBL clickCouponApply(){
        shoppingCartPage.getCouponApply().click();
        return this;
    }

    public ShoppingCartBL useCoupon(String coupon){
        clickCouponDropdown().couponInput(coupon).clickCouponApply();
        return this;
    }

    public ShoppingCartBL clickShippingDropdown(){
        shoppingCartPage.getShippingDropdown().click();
        return this;
    }

    public ShoppingCartBL selectShippingCountry(String value) {
        shoppingCartPage.getShippingCountry().selectByValue(value);
        return this;
    }

    public String getShippingCountry() {
        return shoppingCartPage.getShippingCountry().getFirstSelectedOption().getText();
    }

    public ShoppingCartBL selectShippingRegion(String value) {
        shoppingCartPage.getShippingRegion().selectByValue(value);
        return this;
    }

    public String getShippingRegion() {
        return shoppingCartPage.getShippingRegion().getFirstSelectedOption().getText();
    }

    public ShoppingCartBL inputShippingPostCode(String text){
        WebElement input= shoppingCartPage.getShippingPostCode();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public ShoppingCartBL clickShippingGetQuotes(){
        shoppingCartPage.getShippingGetQuotes().click();
        return this;
    }

    public ShoppingCartBL useShipping(String country, String region, String code){
        clickShippingDropdown().selectShippingCountry(country).selectShippingRegion(region).inputShippingPostCode(code);
        return this;
    }

    public ShoppingCartBL clickGiftCertificateDropdown(){
        shoppingCartPage.getGiftCertificateDropdown().click();
        return this;
    }

    public ShoppingCartBL giftCertificateInput(String text){
        WebElement input= shoppingCartPage.getGiftCertificateInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public ShoppingCartBL clickGiftCertificateApply(){
        shoppingCartPage.getGiftCertificateApply().click();
        return this;
    }

    public ShoppingCartBL useGift(String text){
        clickGiftCertificateDropdown().giftCertificateInput(text).clickGiftCertificateApply();
        return this;
    }

    public ShoppingCartBL clickContinueShoppingButton(){
        shoppingCartPage.getContinueShoppingButton().click();
        return this;
    }

    public ShoppingCartBL clickCheckoutButton(){
        shoppingCartPage.getCheckoutButton().click();
        return this;
    }

    public int getSizeText(){
         return shoppingCartPage.getProductName().size();
    }

    public MainPageBL shoppingCartPageToHeader () {
        shoppingCartPage.getShoppingCartPageToHeader();
        return new MainPageBL();
    }
}
