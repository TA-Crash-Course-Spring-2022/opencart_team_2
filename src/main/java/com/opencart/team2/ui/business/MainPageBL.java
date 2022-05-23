package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageBL {
    private MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public MainPageBL clickCurrencySelectButton() {
        mainPage.getCurrencySelectButton().click();
        return this;
    }

    public String getCurrencySelect() {
        return mainPage.getCurrencySelectButton().getText();
    }

    public MainPageBL clickCurrency(String name) {
        mainPage.getCurrency(name).click();
        return this;
    }

    public MainPageBL selectCurrency(String name){
        clickCurrencySelectButton().clickCurrency(name);
        return this;
    }

    public void clickContactButton() {
        mainPage.getContactButton().click();
    }

    public MainPageBL clickAccountSelectButton() {
        mainPage.getAccountSelectButton().click();
        return this;
    }

    public MyAccountBL clickAccountMyAccountButton(){
        mainPage.getAccountMyAccountButton().click();
        return new MyAccountBL();
    }

    public SignUpPageBL clickAccountLoginButton(){
        mainPage.getAccountLoginButton().click();
        return new SignUpPageBL();
    }

    public SignUpPageBL selectLogin(){
        clickAccountSelectButton().clickAccountLoginButton();
        return new SignUpPageBL();
    }

    public SignUpPageBL selectLogout(){
        clickAccountSelectButton().clickAccountLogoutButton();
        return new SignUpPageBL();
    }

    public void clickAccountRegisterButton(){
        mainPage.getAccountRegisterButton().click();
    }

    public void clickAccountOrderButton(){
        mainPage.getAccountOrderHistoryButton().click();
    }

    public void clickAccountTransactionsButton(){
        mainPage.getAccountTransactionsButton().click();
    }

    public void clickAccountDownloadsButton(){
        mainPage.getAccountDownloadsButton().click();
    }

    public MainPageBL clickAccountLogoutButton(){
        mainPage.getAccountLogoutButton().click();
        return this;
    }

    public WishListPageBL clickWishListButton() {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("wishlist-total")));
        mainPage.getWishListButton().click();
        return new WishListPageBL();
    }

    public ShoppingCartBL clickShoppingCartButton() {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']")));
        mainPage.getShoppingCartButton().click();
        return new ShoppingCartBL();
    }

    public CheckoutBL clickCheckoutButton() {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='list-inline']//a[contains(@href, 'checkout/checkout')]")));
        mainPage.getCheckoutButton().click();
        return new CheckoutBL();
    }
}
