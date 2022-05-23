package com.opencart.team2.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage{

    @FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
    private WebElement currencySelectButton;

    @FindBy(xpath = "//ul[@class='list-inline']//a[contains(@href, 'information/contact')]")
    private WebElement contactButton;

    @FindBy(xpath = "//ul[@class='list-inline']//a[@class='dropdown-toggle']")
    private WebElement accountSelectButton;

    @FindBy(xpath = "//ul[@class='list-inline']//li//a[contains(@href, 'account/register')]")
    private WebElement accountRegisterButton;

    @FindBy(xpath = "//ul[@class='list-inline']//li//a[contains(@href, 'account/login')]")
    private WebElement accountLoginButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/account')]")
    private WebElement accountMyAccountButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/order')]")
    private WebElement accountOrderHistoryButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/transaction')]")
    private WebElement accountTransactionsButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/download')]")
    private WebElement accountDownloadsButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(@href, 'account/logout')]")
    private WebElement accountLogoutButton;

    @FindBy(id = "wishlist-total")
    private WebElement wishListButton;

    @FindBy(xpath = "//ul[@class='list-inline']//a[contains(@href, 'checkout/cart')]")
    private WebElement shoppingCartButton;

    @FindBy(xpath = "//ul[@class='list-inline']//a[contains(@href, 'checkout/checkout')]")
    private WebElement checkoutButton;

    public MainPage() {
        super();
    }

    public WebElement getCurrencySelectButton() {
        return currencySelectButton;
    }
    
    public WebElement getCurrency(String name) {return driver.findElement(By.xpath("//button[contains(@class,'currency-select') and @name='"+ name +"']")); }

    public WebElement getContactButton() {
        return contactButton;
    }

    public WebElement getAccountSelectButton() {
        return accountSelectButton;
    }

    public WebElement getAccountLoginButton() {
        return accountLoginButton;
    }

    public WebElement getAccountRegisterButton() {
        return accountRegisterButton;
    }

    public WebElement getAccountMyAccountButton() {
        return accountMyAccountButton;
    }

    public WebElement getAccountOrderHistoryButton() {
        return accountOrderHistoryButton;
    }

    public WebElement getAccountTransactionsButton() {
        return accountTransactionsButton;
    }

    public WebElement getAccountDownloadsButton() {
        return accountDownloadsButton;
    }

    public WebElement getAccountLogoutButton() {
        return accountLogoutButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getShoppingCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartButton));
        return shoppingCartButton;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }
}
