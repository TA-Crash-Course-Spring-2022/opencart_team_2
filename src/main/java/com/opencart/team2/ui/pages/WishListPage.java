package com.opencart.team2.ui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
public class WishListPage extends BasePage {

    @FindBy (xpath = "//div[@id='content']//div[@class='table-responsive']//tbody//tr//td[@class='text-center']")
    private List <WebElement> Product_Image;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/product')]")
    private List<WebElement> Product_Name;

    @FindBy (xpath = "//div[@id='content']//table/tbody/tr/td[3]")
    private List<WebElement> Product_Model;

    @FindBy (xpath = "//div[@id='content']//table/tbody/tr/td[4]")
    private List<WebElement> Product_Stock;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//div[@class= 'price']")
    private List<WebElement> Product_Price;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//button[@class='btn btn-primary']")
    private List<WebElement> Product_AddToCard;

    @FindBy(xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'account/wishlist')]")
    private List<WebElement> Product_Remove;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div/a")
    private WebElement Continue;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[1]")
    private WebElement MyAccount;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[2]")
    private WebElement EditAccount;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[3]")
    private WebElement Password;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[4]")
    private WebElement AddressBook;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[5]")
    private WebElement WishList;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[6]")
    private WebElement OrderHistory;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[7]")
    private WebElement Downloads;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[8]")
    private WebElement RecurringPayments;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[9]")
    private WebElement RewardPoints;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[10]")
    private WebElement Returns;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[11]")
    private WebElement Transactions;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[12]")
    private WebElement Newsletter;

    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[13]")
    private WebElement Logout;

    public WishListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProduct_Name(int xpath) {
        return Product_Name.get(xpath);
    }

    public WebElement getProduct_Image (int xpath) {return Product_Image.get(xpath);}

    public WebElement getProduct_Model (int xpath) {return Product_Model.get(xpath);}

    public WebElement getProduct_Stock (int xpath) {return Product_Stock.get(xpath);}

    public WebElement getProduct_Price(int xpath) {
        return Product_Price.get(xpath);
    }

    public WebElement getProduct_AddToCard(int xpath) {
        return Product_AddToCard.get(xpath);
    }

    public WebElement getProduct_Remove(int xpath) {
        return Product_Remove.get(xpath);
    }

    public WebElement getContinue() {
        return Continue;
    }

    public WebElement getMyAccount () {
        return MyAccount;
    }

    public WebElement getPassword() {
        return Password;
    }

    public WebElement getAddressBook() {
        return AddressBook;
    }

    public WebElement getWishList() {
        return WishList;
    }

    public WebElement getOrderStory() {
        return OrderHistory;
    }

    public WebElement getDownloads() {
        return Downloads;
    }

    public WebElement getRecurringPayments() {
        return RecurringPayments;
    }

    public WebElement getRewardPoints() {
        return RewardPoints;
    }

    public WebElement getReturns () {
        return Returns;
    }

    public WebElement getTransactions() {
        return Transactions;
    }

    public WebElement getNewsletter() {
        return Newsletter;
    }

    public WebElement getLogout() {
        return Logout;
    }
}