package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
public class WishListPage extends BasePage {

    @FindBy (xpath = "//div[@id='content']//div[@class='table-responsive']//tbody//tr//td[@class='text-center']")
    private List <WebElement> productImage;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/product')]")
    private List<WebElement> productName;

    @FindBy (xpath = "//div[@id='content']//table/tbody/tr/td[3]")
    private List<WebElement> productModel;

    @FindBy (xpath = "//div[@id='content']//table/tbody/tr/td[4]")
    private List<WebElement> productStock;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//div[@class= 'price']")
    private List<WebElement> productPrice;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//button[@class='btn btn-primary']")
    private List<WebElement> productAddToCard;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'account/wishlist')]")
    private List<WebElement> productRemove;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/a")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[1]")
    private WebElement myAccount;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[2]")
    private WebElement editAccount;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[3]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[4]")
    private WebElement addressBook;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[5]")
    private WebElement wishList;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[6]")
    private WebElement orderHistory;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[7]")
    private WebElement downloads;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[8]")
    private WebElement recurringPayments;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[9]")
    private WebElement rewardPoints;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[10]")
    private WebElement returns;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[11]")
    private WebElement transactions;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[12]")
    private WebElement newsLetter;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
    private WebElement logOut;

    public WishListPage() {
        super();
    }

    public WebElement getProductName(int xpath) {
        return productName.get(xpath);
    }

    public WebElement getProductImage(int xpath) {return productImage.get(xpath);}

    public WebElement getProductModel(int xpath) {return productModel.get(xpath);}

    public WebElement getProductStock(int xpath) {return productStock.get(xpath);}

    public WebElement getProductPrice(int xpath) {
        return productPrice.get(xpath);
    }

    public WebElement getProductAddToCard(int xpath) {
        return productAddToCard.get(xpath);
    }

    public WebElement getProductRemove(int xpath) {
        return productRemove.get(xpath);
    }

    public WebElement getContinue() {return continueButton;}

    public WebElement getMyAccount() {
        return myAccount;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getAddressBook() {
        return addressBook;
    }

    public WebElement getWishList() {
        return wishList;
    }

    public WebElement getOrderStory() {
        return orderHistory;
    }

    public WebElement getDownloads() {
        return downloads;
    }

    public WebElement getRecurringPayments() {
        return recurringPayments;
    }

    public WebElement getRewardPoints() {
        return rewardPoints;
    }

    public WebElement getReturns() {
        return returns;
    }

    public WebElement getTransactions() {
        return transactions;
    }

    public WebElement getNewsletter() {
        return newsLetter;
    }

    public WebElement getLogout() {
        return logOut;
    }
}