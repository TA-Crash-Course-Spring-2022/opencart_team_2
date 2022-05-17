package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/edit')]")
    private WebElement editButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/password')]")
    private WebElement changePasswordButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/address')]")
    private WebElement modifyAddressButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/wishlist')]")
    private WebElement modifyWishListButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/order')]")
    private WebElement viewOrderButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/download')]")
    private WebElement downloadsButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/reward')]")
    private WebElement yourRewardButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/return')]")
    private WebElement viewReturnButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/transaction')]")
    private WebElement transactionsButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/recurring')]")
    private WebElement recurringButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/affiliate/add')]")
    private WebElement registerAffiliateButton;

    @FindBy(xpath = "//div[@class='row']//ul[@class='list-unstyled']//a[contains(@href, 'account/newsletter')]")
    private WebElement newsletterButton;

    @FindBy(id = "top")
    private WebElement myAccountToHeader;

    @FindBy(className = "alert")
    private WebElement alert;

    public MyAccountPage() {
        super();
    }

    public WebElement getMyAccountToHeader() {
        return myAccountToHeader;
    }

    public WebElement getAlert() {
        return alert;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public WebElement getChangePasswordButton() {
        return changePasswordButton;
    }

    public WebElement getModifyAddressButton() {
        return modifyAddressButton;
    }

    public WebElement getModifyWishListButton() {
        return modifyWishListButton;
    }

    public WebElement getViewOrderButton() {
        return viewOrderButton;
    }

    public WebElement getDownloadsButton() {
        return downloadsButton;
    }

    public WebElement getYourRewardButton() {
        return yourRewardButton;
    }

    public WebElement getViewReturnButton() {
        return viewReturnButton;
    }

    public WebElement getTransactionsButton() {
        return transactionsButton;
    }

    public WebElement getRecurringButton() {
        return recurringButton;
    }

    public WebElement getRegisterAffiliateButton() {
        return registerAffiliateButton;
    }

    public WebElement getNewsletterButton() {
        return newsletterButton;
    }


}
